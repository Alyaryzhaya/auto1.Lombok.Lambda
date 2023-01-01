package ru.netology.lekcii.util;

import ru.netology.lekcii.model.PurchaseItem;

import java.util.Comparator;

public class PriceAskComparator implements Comparator<PurchaseItem> {
    @Override
    public int compare(PurchaseItem o1, PurchaseItem o2) {
        return o1.getItemPrice() - o2.getItemPrice();
    }
}
