package ee.anikulin.cameltest.cxfsrv;

import ee.anikulin.cameltest.orderservice.OrderEndpointImpl;
import ee.anikulin.cameltest.orderservice.OrderRequestType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 14.05.14
 */
@Component
public class OrderServiceRouteBuilder extends RouteBuilder {
  @Autowired OrderProcessor orderProcessor;

  @Override
  public void configure() throws Exception {
    from("cxf:bean:orderEndpoint").
        to("log:WS_EXECUTED?level=INFO").
        process( orderProcessor );
  }

}
