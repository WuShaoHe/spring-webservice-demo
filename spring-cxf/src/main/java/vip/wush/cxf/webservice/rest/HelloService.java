package vip.wush.cxf.webservice.rest;

import vip.wush.cxf.webservice.rest.bean.User;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @ClassName: HelloService
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/6/14 15:20
 */
@WebService
@Path(value = "/hello")
//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_HTML}) //{"application/json", "application/xml", "text/html"}
public interface HelloService {


    @GET
    @Path(value = "/say")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_HTML})
    String sayHello(@QueryParam(value = "name") String name);

    @GET
    @Path(value = "/get")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    Object getUser();

    @POST
    @Path(value = "/add")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_HTML})
    String add(User user);

}
