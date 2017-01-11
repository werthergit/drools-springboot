package com.xu.drools.bean;


import java.io.Serializable;

public class Person implements Serializable, BaseBean {

    private static final long serialVersionUID = 1L;

    private Integer age;

    private String name;

    private String desc;

    public Person(Integer age, String name, String desc) {
        this.age = age;
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String getOut() {
        return "{\"age\"=" + age + ",\"desc\"=" + desc + "}";
    }
}