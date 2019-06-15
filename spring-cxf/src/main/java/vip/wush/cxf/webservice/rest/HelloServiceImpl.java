package vip.wush.cxf.webservice.rest;

import org.springframework.stereotype.Service;
import vip.wush.cxf.webservice.rest.bean.User;

import java.util.Map;

/**
 * @ClassName: HelloService
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/6/14 15:20
 */

@Service
public class HelloServiceImpl implements HelloService{


    @Override
    public String sayHello(String name) {
        return "hello: " + name + "I'm webservice rest";
    }

    @Override
    public Object getUser() {
        User[] users = new User[]{
                new User("a", "张三"),
                new User("b", "李四"),
                new User("c", "王五"),
                new User("d", "赵六"),
        };
        return users;
    }

    @Override
    public String add(User user) {
        System.out.println("添加成功！"+ user);
        return "操作成功";
    }
}
