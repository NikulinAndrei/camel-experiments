package ee.anikulin.cameltest.cxfsrv;

import ee.anikulin.cameltest.orderservice.OrderEndpointImpl;
import ee.anikulin.cameltest.orderservice.OrderRequestType;
import ee.anikulin.cameltest.orderservice.OrderResponseType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Created with IntelliJ IDEA.
* User: AndreiN
* Date: 15.05.14
*/
@Component
class OrderProcessor implements Processor {
  @Autowired
  OrderEndpointImpl service;

  @Override
  public void process(Exchange exchange) throws Exception {
    MessageContentsList msg = (MessageContentsList)exchange.getIn().getBody();

    OrderResponseType resp = service.order((OrderRequestType) msg.get(0));
    exchange.getIn().setBody( resp );
  }
}
