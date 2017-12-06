package com.leibangzhu.sample.springbeaninit;

import javax.annotation.PostConstruct;

public class AlwaysBeingUsedBean {
    @PostConstruct
    public void init() {
        System.out.println("AlwaysBeingUsedBean initializing");
    }
}
