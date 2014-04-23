package ee.kemit.cameltest;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 22.04.14
 */
@Component
class Eelis2ForestRouteBuilder extends RouteBuilder{

  private static final String STEP_2_ROUTE = "direct:CLEANUP_FINISHED";

  @Override
  public void configure() throws Exception {
    //STEP1: CLEANUP target DB
    from("timer://timer1?period=6000s").
        transacted().
        to("targetSql:delete from EELIS_DATA").
        to(STEP_2_ROUTE);

    // STEP2: query from Eelis and insert to Target
    from(STEP_2_ROUTE).
        to( "eelisSql:{{sql.queryEelis}}" ).
        transacted().
        to("save2ForestService");
  }
}
