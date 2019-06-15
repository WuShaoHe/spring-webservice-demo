package webservice;



import webservice.server.SayHelloImpl;

import javax.xml.ws.Endpoint;

/**
 * @ClassName: Server
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/6/14 01:27
 */

public class Server {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8088/hello", new SayHelloImpl());

        System.out.println("publish success");
    }

}
