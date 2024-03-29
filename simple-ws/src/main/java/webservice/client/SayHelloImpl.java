
package webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SayHelloImpl", targetNamespace = "http://server.webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SayHelloImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://server.webservice/", className = "webservice.client.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://server.webservice/", className = "webservice.client.SayHelloResponse")
    @Action(input = "http://server.webservice/SayHelloImpl/sayHelloRequest", output = "http://server.webservice/SayHelloImpl/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
