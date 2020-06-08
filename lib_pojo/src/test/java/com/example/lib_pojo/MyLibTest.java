package com.example.lib_pojo;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import javax.inject.Inject;

import static org.mockito.Mockito.when;

public class MyLibTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
//    MyLib myLib = new MyLib();
    MyLib myLib;

    @Test
    public void testF1() throws Exception {
        when(myLib.f1()).thenReturn("replaceMeWithExpectedResult");
        String result = myLib.f1();
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }


    class Env extends EnvInject{
//        @Inject
//        MQTT mqtt;

    }

    @Test
    public void name() {
//        DaggerEnv daggerEnv = new DaggerEnv();
//        daggerEnv.mqtt.connect();
        MyComponent myComponent = DaggerMyComponent.create();
//        MQTT mqtt = myComponent.MQTT();
//        mqtt.connect();

        Env env = new Env();
        myComponent.inject(env);
        env.mqtt.connect();

        myComponent.MQTT().connect();
        myComponent.MQTT2().connect();

        myComponent.REPO().save();

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme