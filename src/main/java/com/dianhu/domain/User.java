package com.dianhu.domain;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * Time : 18-8-29 下午10:08
 * Author : hcy
 * Description :
 */
public class User {
    @NotEmpty(message="姓名不能为空")
    private String name;
    @Max(value = 100, message = "年龄不能大于 100 岁")
    @Min(value= 18 ,message= "必须年满 18 岁！" )
    private int age;
    @NotEmpty(message="密码不能为空")
    @Length(min=6,message="密码长度不能小于 6 位")
    private String pass;

    public User() {}
    public User(String name,String pass){
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
