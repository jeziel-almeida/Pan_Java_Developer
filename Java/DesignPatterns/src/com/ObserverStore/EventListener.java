package com.ObserverStore;

import com.ObserverStore.enums.Event;

public interface EventListener {

    void update(Event eventType, String eventDescription);
}
