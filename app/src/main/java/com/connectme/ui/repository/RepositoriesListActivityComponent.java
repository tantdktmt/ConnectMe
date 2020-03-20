package com.connectme.ui.repository;

import com.connectme.ui.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {RepositoriesListActivityModule.class})
public interface RepositoriesListActivityComponent {

    public void inject(RepositoriesListActivity activity);
}
