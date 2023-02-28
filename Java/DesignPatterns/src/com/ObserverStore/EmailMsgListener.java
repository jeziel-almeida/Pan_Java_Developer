package com.ObserverStore;

import com.ObserverStore.enums.Event;

public class EmailMsgListener implements EventListener {
    
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    } 

    @Override
    public void update(Event eventType, String eventDescription) {
        // Actually send the mail
        System.out.println("["+eventDescription+"]" + " -> email sent to: " + email + " concerning " + eventType);
    }
}
