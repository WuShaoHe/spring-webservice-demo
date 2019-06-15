package vip.wush.cxf.webservice;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import vip.wush.cxf.webservice.rest.HelloServiceImpl;
import vip.wush.cxf.webservice.wsdl.SayHelloImpl;



/**
 * @ClassName: Server
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/6/14 17:10
 */

@SpringBootApplication
public class Server {

    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

    @Bean
    public ServletRegistrationBean dispatcherServlet() {
//        return new ServletRegistrationBean(new CXFServlet()); //默认： services/*
        return new ServletRegistrationBean(new CXFServlet(), "/*");
    }


    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus bus(){
        SpringBus bus=new SpringBus();
        return  bus;
    }


    //RESTful services
    @Bean
    public org.apache.cxf.endpoint.Server restServer() {
        JAXRSServerFactoryBean bean = new JAXRSServerFactoryBean();
        bean.setBus(bus());
        bean.setAddress("/rest");
//        bean.setServiceBeans(Arrays.asList(new HelloServiceImpl()));//如果有多个服务，这里可以接收List
        bean.setServiceBean(new HelloServiceImpl());
        bean.setProvider(new JacksonJsonProvider());  //json
        return bean.create();
    }

    //SOAP services
    @Bean
    public org.apache.cxf.endpoint.Server wsdlServer2() {
        JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
        bean.setBus(bus());
        bean.setAddress("/soap");
//        bean.setServiceBeans(Arrays.asList(new SayHelloImpl()));//如果有多个服务，这里可以接收List
        bean.setServiceBean(new SayHelloImpl());
        return bean.create();
    }

//    @Autowired
//    ISayHello iSayHello;
//
//    @Bean
//    public Endpoint wsdlServer() {
//        Endpoint endpoint = new EndpointImpl(bus(), iSayHello);
//        endpoint.publish("/soap");
//        return endpoint;
//    }

}
