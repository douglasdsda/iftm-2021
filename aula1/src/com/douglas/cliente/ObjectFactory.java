
package com.douglas.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.douglas.cliente package. 
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

    private final static QName _GetNomeResponse_QNAME = new QName("http://douglas.com/", "getNomeResponse");
    private final static QName _Calcula_QNAME = new QName("http://douglas.com/", "calcula");
    private final static QName _CalculaResponse_QNAME = new QName("http://douglas.com/", "calculaResponse");
    private final static QName _GetNome_QNAME = new QName("http://douglas.com/", "getNome");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.douglas.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNomeResponse }
     * 
     */
    public GetNomeResponse createGetNomeResponse() {
        return new GetNomeResponse();
    }

    /**
     * Create an instance of {@link CalculaResponse }
     * 
     */
    public CalculaResponse createCalculaResponse() {
        return new CalculaResponse();
    }

    /**
     * Create an instance of {@link Calcula }
     * 
     */
    public Calcula createCalcula() {
        return new Calcula();
    }

    /**
     * Create an instance of {@link GetNome }
     * 
     */
    public GetNome createGetNome() {
        return new GetNome();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://douglas.com/", name = "getNomeResponse")
    public JAXBElement<GetNomeResponse> createGetNomeResponse(GetNomeResponse value) {
        return new JAXBElement<GetNomeResponse>(_GetNomeResponse_QNAME, GetNomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://douglas.com/", name = "calcula")
    public JAXBElement<Calcula> createCalcula(Calcula value) {
        return new JAXBElement<Calcula>(_Calcula_QNAME, Calcula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://douglas.com/", name = "calculaResponse")
    public JAXBElement<CalculaResponse> createCalculaResponse(CalculaResponse value) {
        return new JAXBElement<CalculaResponse>(_CalculaResponse_QNAME, CalculaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://douglas.com/", name = "getNome")
    public JAXBElement<GetNome> createGetNome(GetNome value) {
        return new JAXBElement<GetNome>(_GetNome_QNAME, GetNome.class, null, value);
    }

}
