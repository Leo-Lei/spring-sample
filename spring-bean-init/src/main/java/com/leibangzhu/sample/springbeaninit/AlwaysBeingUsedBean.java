package com.leibangzhu.sample.springbeaninit;

import javax.annotation.PostConstruct;

public class AlwaysBeingUsedBean {

    public AlwaysBeingUsedBean(){
        System.out.println("AlwaysBeingUsedBean construct ...");
    }



    @PostConstruct
    public void init() {
        System.out.println("AlwaysBeingUsedBean initializing");
    }
}
