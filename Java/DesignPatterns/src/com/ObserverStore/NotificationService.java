package com.ObserverStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ObserverStore.enums.Event;

public class NotificationService {
    
    private final Map<Event, List<EventListener>> customers;

    public NotificationService() {
        this.customers = new HashMap<>();
        // For each enum, is created an array of event listeners
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void subscribe(Event eventType, EventListener listener) {
        customers.get(eventType).add(listener);
    }
    
    public void unsubscribe(Event eventType, EventListener listener) {
        customers.get(eventType).remove(listener);
    }

    public void notifyCustomers(Event eventType, String eventDescription) {
        customers.get(eventType).forEach(listener -> listener.update(eventType, eventDescription));
    }


}
