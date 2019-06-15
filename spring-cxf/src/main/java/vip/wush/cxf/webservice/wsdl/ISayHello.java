package vip.wush.cxf.webservice.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @ClassName: SayHello
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/6/14 10:57
 */
@WebService
public interface ISayHello {

    @WebMethod
    String sayHello(@WebParam(name = "name") String name);

}
