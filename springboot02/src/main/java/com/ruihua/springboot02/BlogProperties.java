package com.ruihua.springboot02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="mrbird")//如果属性较多，可用此注解代替@Value
public class BlogProperties {

    private String name;

    private String title;

    private String wholetitle;

    public String getWholetitle() {
        return wholetitle;
    }

    public void setWholetitle(String wholetitle) {
        this.wholetitle = wholetitle;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }
}
