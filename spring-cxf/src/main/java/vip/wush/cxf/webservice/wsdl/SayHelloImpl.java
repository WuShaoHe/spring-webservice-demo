package vip.wush.cxf.webservice.wsdl;


import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @ClassName: SayHelloImpl
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/6/14 10:58
 */

@WebService
@Service
public class SayHelloImpl implements ISayHello {

    @Override
    public String sayHello(String name) {
        System.out.println("call sayHello()");
        return "Hello ,"+name+",I'am Webservice wsdl";
    }
}
