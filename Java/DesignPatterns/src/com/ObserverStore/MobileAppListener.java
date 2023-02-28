package com.ObserverStore;

import com.ObserverStore.enums.Event;

public class MobileAppListener implements EventListener {

    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update(Event eventType, String eventDescription) {
        // Actually send the push notification
        System.out.println("["+eventDescription+"]" + " -> push notification sent to: " + username + " concerning " + eventType);
    }
    
}
