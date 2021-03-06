package ee.anikulin.cameltest.orderservice;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-15T12:57:43.778+03:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "OrderEndpointService", 
                  wsdlLocation = "src/orderEndpoint.wsdl",
                  targetNamespace = "http://anikulin.ee/cameltest/orderService") 
public class OrderEndpointService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://anikulin.ee/cameltest/orderService", "OrderEndpointService");
    public final static QName OrderService = new QName("http://anikulin.ee/cameltest/orderService", "OrderService");
    static {
        URL url = OrderEndpointService.class.getResource("src/orderEndpoint.wsdl");
        if (url == null) {
            url = OrderEndpointService.class.getClassLoader().getResource("src/orderEndpoint.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(OrderEndpointService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "src/orderEndpoint.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public OrderEndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderEndpointService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OrderEndpointService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OrderEndpointService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OrderEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns OrderEndpoint
     */
    @WebEndpoint(name = "OrderService")
    public OrderEndpoint getOrderService() {
        return super.getPort(OrderService, OrderEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderEndpoint
     */
    @WebEndpoint(name = "OrderService")
    public OrderEndpoint getOrderService(WebServiceFeature... features) {
        return super.getPort(OrderService, OrderEndpoint.class, features);
    }

}
