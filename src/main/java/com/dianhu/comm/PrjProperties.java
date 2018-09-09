package com.dianhu.comm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Time : 18-8-29 下午11:29
 * Author : hcy
 * Description :
 */
@Component
public class PrjProperties {

    @Value("${com.dianhu.title}")
    private String title;

    @Value("${com.dianhu.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
