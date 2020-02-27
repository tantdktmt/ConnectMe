package com.connectme.data.network;

import com.connectme.core.DataLayerException;
import com.connectme.schedule.domain.model.Event;

import java.util.List;

/**
 * Created by HP on 8/21/2017.
 */
public interface NetworkDataSource {

    List<Event> getSchedule() throws DataLayerException;
}
