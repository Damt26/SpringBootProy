package com.damt.SpringBootProy.bean;

public class BeanWithPropertiesImplement implements BeanWithProperties{
    private String name, lastname;

    public BeanWithPropertiesImplement(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String function() {
        return name + "-" + lastname;
    }
}
