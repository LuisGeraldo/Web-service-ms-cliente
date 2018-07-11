
package webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CrudMateriaWebService", targetNamespace = "http://webservicecrud/", wsdlLocation = "http://localhost:8080/WebServicesSP/CrudMateriaWebService?wsdl")
public class CrudMateriaWebService_Service
    extends Service
{

    private final static URL CRUDMATERIAWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException CRUDMATERIAWEBSERVICE_EXCEPTION;
    private final static QName CRUDMATERIAWEBSERVICE_QNAME = new QName("http://webservicecrud/", "CrudMateriaWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebServicesSP/CrudMateriaWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CRUDMATERIAWEBSERVICE_WSDL_LOCATION = url;
        CRUDMATERIAWEBSERVICE_EXCEPTION = e;
    }

    public CrudMateriaWebService_Service() {
        super(__getWsdlLocation(), CRUDMATERIAWEBSERVICE_QNAME);
    }

    public CrudMateriaWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CRUDMATERIAWEBSERVICE_QNAME, features);
    }

    public CrudMateriaWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, CRUDMATERIAWEBSERVICE_QNAME);
    }

    public CrudMateriaWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CRUDMATERIAWEBSERVICE_QNAME, features);
    }

    public CrudMateriaWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CrudMateriaWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CrudMateriaWebService
     */
    @WebEndpoint(name = "CrudMateriaWebServicePort")
    public CrudMateriaWebService getCrudMateriaWebServicePort() {
        return super.getPort(new QName("http://webservicecrud/", "CrudMateriaWebServicePort"), CrudMateriaWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CrudMateriaWebService
     */
    @WebEndpoint(name = "CrudMateriaWebServicePort")
    public CrudMateriaWebService getCrudMateriaWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservicecrud/", "CrudMateriaWebServicePort"), CrudMateriaWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CRUDMATERIAWEBSERVICE_EXCEPTION!= null) {
            throw CRUDMATERIAWEBSERVICE_EXCEPTION;
        }
        return CRUDMATERIAWEBSERVICE_WSDL_LOCATION;
    }

}
