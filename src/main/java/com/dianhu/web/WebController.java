package com.dianhu.web;

import com.dianhu.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Time : 18-8-29 下午9:41
 * Author : hcy
 * Description :
 */
@RestController
public class WebController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(defaultValue = "Hcy001") String name){
        return "Hello World "+name;
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setName("小明");
        user.setAge(12);
        user.setPass("123456");
        return user;
    }

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users=new ArrayList<User>();
        User user1=new User();
        user1.setName("neo");
        user1.setAge(30);
        user1.setPass("neo123");
        users.add(user1);
        User user2=new User();
        user2.setName("小明");
        user2.setAge(12);
        user2.setPass("123456");
        users.add(user2);
        return users;
    }

    @GetMapping(value = "get/{name}")
    public User get(@PathVariable String name) {
        User user=new User();
        user.setName(name);
        user.setAge(12);
        user.setPass("123456");
        return user;
    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user:"+user);
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode() + "-" + error.getDefaultMessage());
            }
        }
    }

}
