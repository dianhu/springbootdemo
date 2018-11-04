package com.dianhu.comm;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Time : 18-11-4 下午4:47
 * Author : hcy
 * Description :
 */
@Component
@ConfigurationProperties(prefix = "com.dianhu")
public class ConfigProp {
    private String title;

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
