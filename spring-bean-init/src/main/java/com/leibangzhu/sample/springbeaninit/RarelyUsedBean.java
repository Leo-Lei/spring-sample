package com.leibangzhu.sample.springbeaninit;

import javax.annotation.PostConstruct;

public class RarelyUsedBean {
    @PostConstruct
    private void initialize() {
        System.out.println("RarelyUsedBean initializing");
    }

    public void doSomething() {
        System.out.println("RarelyUsedBean method being called");
    }
}
