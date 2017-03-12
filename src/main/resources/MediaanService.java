
package main.resources;

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
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "mediaanService", targetNamespace = "http://www.mediaanservice.org/mediaanservice", wsdlLocation = "file:/D:/Java_IntelliJ/PowerService/src/main/resources/MediaanService.wsdl")
public class MediaanService
    extends Service
{

    private final static URL MEDIAANSERVICE_WSDL_LOCATION;
    private final static WebServiceException MEDIAANSERVICE_EXCEPTION;
    private final static QName MEDIAANSERVICE_QNAME = new QName("http://www.mediaanservice.org/mediaanservice", "mediaanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Java_IntelliJ/PowerService/src/main/resources/MediaanService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEDIAANSERVICE_WSDL_LOCATION = url;
        MEDIAANSERVICE_EXCEPTION = e;
    }

    public MediaanService() {
        super(__getWsdlLocation(), MEDIAANSERVICE_QNAME);
    }

    public MediaanService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MEDIAANSERVICE_QNAME, features);
    }

    public MediaanService(URL wsdlLocation) {
        super(wsdlLocation, MEDIAANSERVICE_QNAME);
    }

    public MediaanService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MEDIAANSERVICE_QNAME, features);
    }

    public MediaanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MediaanService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MediaanServiceInterface
     */
    @WebEndpoint(name = "WS-Port")
    public MediaanServiceInterface getWSPort() {
        return super.getPort(new QName("http://www.mediaanservice.org/mediaanservice", "WS-Port"), MediaanServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MediaanServiceInterface
     */
    @WebEndpoint(name = "WS-Port")
    public MediaanServiceInterface getWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.mediaanservice.org/mediaanservice", "WS-Port"), MediaanServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEDIAANSERVICE_EXCEPTION!= null) {
            throw MEDIAANSERVICE_EXCEPTION;
        }
        return MEDIAANSERVICE_WSDL_LOCATION;
    }

}