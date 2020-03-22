package com.connectme.ui.repository;

import com.connectme.ui.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {RepositoryDetailActivityModule.class})
public interface RepositoryDetailActivityComponent {

    void inject(RepositoryDetailActivity activity);
}
