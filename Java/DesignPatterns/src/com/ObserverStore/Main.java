package com.ObserverStore;

import static com.ObserverStore.enums.Event.*;

public class Main {
    public static void main(String[] args) {
        
        var store = new Store();

        var anorak = new MobileAppListener("Anorak");

        store.getService().subscribe(NEW_ITEM, anorak);
        store.getService().subscribe(SALE, new EmailMsgListener("anorak@like.com"));
        store.getService().subscribe(SALE, new MobileAppListener("Karona"));
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("wadewatts@like.com"));

        System.out.println();
        store.newItemPromotion("ToothBrush");
        System.out.println();
        store.salePromotion("10% OFF on Medicine");
        
        store.getService().unsubscribe(NEW_ITEM, anorak);

        System.out.println();
        store.newItemPromotion("Phone charger");
    }
}
