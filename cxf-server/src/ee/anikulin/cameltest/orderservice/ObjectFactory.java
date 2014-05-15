
package ee.anikulin.cameltest.orderservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.anikulin.cameltest.orderservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderRequest_QNAME = new QName("http://anikulin.ee/cameltest/orderService", "OrderRequest");
    private final static QName _ResultCode_QNAME = new QName("http://anikulin.ee/cameltest/orderService", "resultCode");
    private final static QName _OrderResponse_QNAME = new QName("http://anikulin.ee/cameltest/orderService", "OrderResponse");
    private final static QName _Amount_QNAME = new QName("http://anikulin.ee/cameltest/orderService", "amount");
    private final static QName _CustomerName_QNAME = new QName("http://anikulin.ee/cameltest/orderService", "customerName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.anikulin.cameltest.orderservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderResponseType }
     * 
     */
    public OrderResponseType createOrderResponseType() {
        return new OrderResponseType();
    }

    /**
     * Create an instance of {@link OrderRequestType }
     * 
     */
    public OrderRequestType createOrderRequestType() {
        return new OrderRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://anikulin.ee/cameltest/orderService", name = "OrderRequest")
    public JAXBElement<OrderRequestType> createOrderRequest(OrderRequestType value) {
        return new JAXBElement<OrderRequestType>(_OrderRequest_QNAME, OrderRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://anikulin.ee/cameltest/orderService", name = "resultCode")
    public JAXBElement<String> createResultCode(String value) {
        return new JAXBElement<String>(_ResultCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://anikulin.ee/cameltest/orderService", name = "OrderResponse")
    public JAXBElement<OrderResponseType> createOrderResponse(OrderResponseType value) {
        return new JAXBElement<OrderResponseType>(_OrderResponse_QNAME, OrderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://anikulin.ee/cameltest/orderService", name = "amount")
    public JAXBElement<Integer> createAmount(Integer value) {
        return new JAXBElement<Integer>(_Amount_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://anikulin.ee/cameltest/orderService", name = "customerName")
    public JAXBElement<String> createCustomerName(String value) {
        return new JAXBElement<String>(_CustomerName_QNAME, String.class, null, value);
    }

}
