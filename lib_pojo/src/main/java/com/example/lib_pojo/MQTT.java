package com.example.lib_pojo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MQTT {
    @Inject
    public MQTT() {
        System.out.println(this);
    }

    public void connect(){
        System.out.println("connected!");
    }
}
