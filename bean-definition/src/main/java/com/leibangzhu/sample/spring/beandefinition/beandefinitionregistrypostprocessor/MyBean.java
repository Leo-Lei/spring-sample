package com.leibangzhu.sample.spring.beandefinition.beandefinitionregistrypostprocessor;

public class MyBean {
    private String strProp;

    public void setStrProp (String strProp) {
        this.strProp = strProp;
    }

    public void doSomething () {
        System.out.println("from MyBean:  " + strProp);
    }
}