package com.connectme.data.network;

import com.connectme.ui.repository.RepositoriesListActivityComponent;
import com.connectme.ui.repository.RepositoriesListActivityModule;

import dagger.Subcomponent;

@UserScope
@Subcomponent(modules = {UserModule.class})
public interface UserComponent {

    RepositoriesListActivityComponent plus(RepositoriesListActivityModule repositoriesListActivityModule);
}
