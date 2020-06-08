package com.example.lib_pojo;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class RepoModule {
    @Binds
    abstract Repo REPO(RepoDisk repoDisk);
}
