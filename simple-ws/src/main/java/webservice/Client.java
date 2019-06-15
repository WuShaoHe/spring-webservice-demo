package webservice;


import webservice.client.SayHelloImpl;
import webservice.client.SayHelloImplService;

/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/6/14 11:01
 */

public class Client {

    public static void main(String[] args) {
        SayHelloImplService sayHelloImplService = new SayHelloImplService();

        SayHelloImpl sayHello = sayHelloImplService.getSayHelloImplPort();

        System.out.println(sayHello.sayHello("wush"));

    }
}
