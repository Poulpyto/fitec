
package webservice;

import java.util.List;
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
@WebService(name = "BanqueService", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param mt
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionED")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionED", targetNamespace = "http://webservice/", className = "webservice.ConversionED")
    @ResponseWrapper(localName = "ConversionEDResponse", targetNamespace = "http://webservice/", className = "webservice.ConversionEDResponse")
    @Action(input = "http://webservice/BanqueService/ConversionEDRequest", output = "http://webservice/BanqueService/ConversionEDResponse")
    public double conversionED(
        @WebParam(name = "mt", targetNamespace = "")
        double mt);

    /**
     * 
     * @param code
     * @return
     *     returns webservice.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getonecompte", targetNamespace = "http://webservice/", className = "webservice.Getonecompte")
    @ResponseWrapper(localName = "getonecompteResponse", targetNamespace = "http://webservice/", className = "webservice.GetonecompteResponse")
    @Action(input = "http://webservice/BanqueService/getonecompteRequest", output = "http://webservice/BanqueService/getonecompteResponse")
    public Compte getonecompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getallcompte", targetNamespace = "http://webservice/", className = "webservice.Getallcompte")
    @ResponseWrapper(localName = "getallcompteResponse", targetNamespace = "http://webservice/", className = "webservice.GetallcompteResponse")
    @Action(input = "http://webservice/BanqueService/getallcompteRequest", output = "http://webservice/BanqueService/getallcompteResponse")
    public List<Compte> getallcompte();

}
