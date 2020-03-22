package com.connectme.data.network;

import com.connectme.ui.repository.RepositoriesListActivityComponent;
import com.connectme.ui.repository.RepositoriesListActivityModule;
import com.connectme.ui.repository.RepositoryDetailActivityComponent;
import com.connectme.ui.repository.RepositoryDetailActivityModule;

import dagger.Subcomponent;

@UserScope
@Subcomponent(modules = {UserModule.class})
public interface UserComponent {

    RepositoriesListActivityComponent plus(RepositoriesListActivityModule module);

    RepositoryDetailActivityComponent plus(RepositoryDetailActivityModule module);
}
