package com.dianhu.bean;

/**
 * Time : 18-9-15 上午9:49
 * Author : hcy
 * Description :
 */
public class Hello {
    private String content;

    public String getContent() {
        System.out.println("-------do getContent()--------");
        return content;
    }

    public void setContent(String content) {
        System.out.println("-------do setContent()--------");
        this.content = content;
    }
}
