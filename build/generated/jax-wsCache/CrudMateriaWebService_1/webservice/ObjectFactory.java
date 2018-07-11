
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _Buscar_QNAME = new QName("http://webservicecrud/", "Buscar");
    private final static QName _Crear_QNAME = new QName("http://webservicecrud/", "Crear");
    private final static QName _BorrarResponse_QNAME = new QName("http://webservicecrud/", "BorrarResponse");
    private final static QName _Actualizar_QNAME = new QName("http://webservicecrud/", "Actualizar");
    private final static QName _CrearResponse_QNAME = new QName("http://webservicecrud/", "CrearResponse");
    private final static QName _ActualizarResponse_QNAME = new QName("http://webservicecrud/", "ActualizarResponse");
    private final static QName _BuscarResponse_QNAME = new QName("http://webservicecrud/", "BuscarResponse");
    private final static QName _Borrar_QNAME = new QName("http://webservicecrud/", "Borrar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BorrarResponse }
     * 
     */
    public BorrarResponse createBorrarResponse() {
        return new BorrarResponse();
    }

    /**
     * Create an instance of {@link Buscar }
     * 
     */
    public Buscar createBuscar() {
        return new Buscar();
    }

    /**
     * Create an instance of {@link Crear }
     * 
     */
    public Crear createCrear() {
        return new Crear();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link CrearResponse }
     * 
     */
    public CrearResponse createCrearResponse() {
        return new CrearResponse();
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link Borrar }
     * 
     */
    public Borrar createBorrar() {
        return new Borrar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicecrud/", name = "Buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Crear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicecrud/", name = "Crear")
    public JAXBElement<Crear> createCrear(Crear value) {
        return new JAXBElement<Crear>(_Crear_QNAME, Crear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicecrud/", name = "BorrarResponse")
    public JAXBElement<BorrarResponse> createBorrarResponse(BorrarResponse value) {
        return new JAXBElement<BorrarResponse>(_BorrarResponse_QNAME, BorrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicecrud/", name = "Actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicecrud/", name = "CrearResponse")
    public JAXBElement<CrearResponse> createCrearResponse(CrearResponse value) {
        return new JAXBElement<CrearResponse>(_CrearResponse_QNAME, CrearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicecrud/", name = "ActualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicecrud/", name = "BuscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Borrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicecrud/", name = "Borrar")
    public JAXBElement<Borrar> createBorrar(Borrar value) {
        return new JAXBElement<Borrar>(_Borrar_QNAME, Borrar.class, null, value);
    }

}
