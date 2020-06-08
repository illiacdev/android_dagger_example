package com.example.lib_pojo;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

public class MQTT2 {
    private final String name;

    @Inject
    public MQTT2(
            @Named("name")
            String name) {
        this.name = name;
        System.out.println(this + name);
//        System.out.println(name);
    }

    public void connect(){
        System.out.println("connected!");
    }
}
