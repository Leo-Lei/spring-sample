package com.leibangzhu.sample.spring.beandefinition.customizescan;

public class SimpleHelloService implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
