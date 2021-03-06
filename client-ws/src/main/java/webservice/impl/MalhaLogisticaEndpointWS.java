
package webservice.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MalhaLogisticaEndpointWS", targetNamespace = "http://impl.webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MalhaLogisticaEndpointWS {


    /**
     * 
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "save", targetNamespace = "http://impl.webservice/", className = "webservice.impl.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://impl.webservice/", className = "webservice.impl.SaveResponse")
    @Action(input = "http://impl.webservice/MalhaLogisticaEndpointWS/saveRequest", output = "http://impl.webservice/MalhaLogisticaEndpointWS/saveResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://impl.webservice/MalhaLogisticaEndpointWS/save/Fault/Exception")
    })
    public void save(
        @WebParam(name = "arg0", targetNamespace = "")
        MalhaLogistica arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<webservice.impl.MalhaLogistica>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://impl.webservice/", className = "webservice.impl.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://impl.webservice/", className = "webservice.impl.FindAllResponse")
    @Action(input = "http://impl.webservice/MalhaLogisticaEndpointWS/findAllRequest", output = "http://impl.webservice/MalhaLogisticaEndpointWS/findAllResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://impl.webservice/MalhaLogisticaEndpointWS/findAll/Fault/Exception")
    })
    public List<MalhaLogistica> findAll()
        throws Exception_Exception
    ;

}
