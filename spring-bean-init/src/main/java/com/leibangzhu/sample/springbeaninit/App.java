package com.leibangzhu.sample.springbeaninit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String... strings) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        System.out.println("Spring container started and is ready");
        RarelyUsedBean bean = context.getBean(RarelyUsedBean.class);
        bean.doSomething();
    }
}
