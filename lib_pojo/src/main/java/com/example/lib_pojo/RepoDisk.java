package com.example.lib_pojo;

import javax.inject.Inject;

public class RepoDisk implements Repo {
    @Inject
    public RepoDisk() {
    }

    @Override
    public void save() {
        System.out.println("save");

    }

    @Override
    public void load() {
        System.out.println("load");

    }
}
