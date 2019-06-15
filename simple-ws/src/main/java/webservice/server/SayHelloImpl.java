package webservice.server;


import javax.jws.WebService;

/**
 * @ClassName: SayHelloImpl
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/6/14 10:58
 */

@WebService
public class SayHelloImpl implements ISayHello {

    @Override
    public String sayHello(String name) {
        System.out.println("call sayHello()");
        return "Hello ,"+name+",I'am Webservice";
    }
}
