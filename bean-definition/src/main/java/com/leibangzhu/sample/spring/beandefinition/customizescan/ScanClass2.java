package com.leibangzhu.sample.spring.beandefinition.customizescan;

@CustomizeComponent
public class ScanClass2 {
    public void sayHello(String name){
        System.out.println("hello, " + name);
    }
}
