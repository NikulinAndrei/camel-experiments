
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ee.anikulin.cameltest.orderservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-15T12:57:43.706+03:00
 * Generated source version: 2.7.11
 */

@Service
public class OrderEndpointImpl implements OrderEndpoint {

  private static final Logger LOG = LoggerFactory.getLogger(OrderEndpointImpl.class.getName());

  private static AtomicInteger count = new AtomicInteger(0);

  /* (non-Javadoc)
   * @see ee.anikulin.cameltest.orderservice.OrderEndpoint#order(ee.anikulin.cameltest.orderservice.OrderRequestType  parameters )*
   */
  public ee.anikulin.cameltest.orderservice.OrderResponseType order(OrderRequestType parameters) {
    LOG.info("Executing operation ordercwith params {}", parameters);

    OrderResponseType _return = new OrderResponseType();
    _return.setOrderNr(count.incrementAndGet());
    _return.setDetails("Your order of " + parameters.getItem() + " is processed");

    return _return;

  }

}
