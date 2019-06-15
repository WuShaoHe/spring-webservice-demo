package vip.wush.cxf.webservice.rest.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/6/14 17:57
 */

@XmlRootElement(name = "User")
//@XmlAccessorType(XmlAccessType.FIELD)
public class User {

    private String nickName;

    private String name;


    public User() {
    }

    public User(String nickName, String name) {
        this.nickName = nickName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
