package com.example.lib_pojo;

import javax.inject.Named;

import dagger.Binds;
import dagger.Provides;

@dagger.Module
public class MyModule {
   /* @Provides
    MQTT mqtt(){
        return new MQTT();
    }*/

    @Provides
    @Named("name")
    String name() {
        return "illiac";
    }




}
