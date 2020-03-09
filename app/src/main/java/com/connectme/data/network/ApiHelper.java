package com.connectme.data.network;

import com.connectme.data.network.model.Event;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by HP on 8/21/2017.
 */
public interface ApiHelper {

    Single<List<Event>> getSchedules();
}
