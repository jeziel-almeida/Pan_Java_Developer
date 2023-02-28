package com.ObserverStore;

import static com.ObserverStore.enums.Event.*;

public class Store {
    
    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newItemPromotion(String eventDescription) {
        notificationService.notifyCustomers(NEW_ITEM, eventDescription);
    }

    public void salePromotion(String eventDescription) {
        notificationService.notifyCustomers(SALE, eventDescription);
    }

    public NotificationService getService() {
        return this.notificationService;
    }
}
