package com.example.lib_pojo;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Component;

@Singleton
@Component(modules = {MyModule.class,RepoModule.class})
public interface MyComponent {

    MQTT MQTT();
    MQTT2 MQTT2();

    Repo REPO();
    void inject(EnvInject target);

}
