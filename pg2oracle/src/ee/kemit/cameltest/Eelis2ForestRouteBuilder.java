package ee.kemit.cameltest;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.apache.camel.LoggingLevel.*;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 22.04.14
 */
@Component
class Eelis2ForestRouteBuilder extends RouteBuilder{
  @Autowired SdoDAO sdoDAO;

  private static final String STEP_2_ROUTE = "direct:QUERY_EELIS";
  private static final String STEP_3_ROUTE = "direct:INSERT_2FOREST";


  @Override
  public void configure() throws Exception {
    from("quartz2:EELIS_2_FOREST?cron=0+*+*+*+*+?").
        log(INFO, "STARTING").
        transacted().
        to("targetSql:delete from EELIS_DATA").
        log(INFO, "Delete executed ${header.CamelSqlUpdateCount}").
        to(STEP_2_ROUTE);

    // STEP2: query from Eelis and insert to Target
    from(STEP_2_ROUTE).
        to("eelisSql:{{sql.queryEelis}}").
        log(INFO, "Eelis query returned  ${header.CamelSqlRowCount}").
        to(STEP_3_ROUTE);

    // STEP2: insert to Forest
    from(STEP_3_ROUTE).
        onCompletion().
        log(INFO, "DONE").end().
        transacted().
        log(DEBUG, "Inserting to Forest ${header.CamelSqlRowCount}").
        split(body()).
          stopOnException().
          convertBodyTo(SpatialData.class).
          log(DEBUG, "Split map ${body}").
          bean(sdoDAO, "insert");

  }
}
