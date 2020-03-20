package com.connectme.data.network;

import com.connectme.data.network.model.User;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    private User mUser;

    public UserModule(User user) {
        mUser = user;
    }

    @UserScope
    @Provides
    public User provideUser() {
        return mUser;
    }
}
