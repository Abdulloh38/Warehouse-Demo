package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListDrugsService {

    static void listDrug(String order, List<Drugs> drugs) {
        List<Drugs> sorted = new ArrayList<>(drugs);
        switch (order) {
            case "id":
                Collections.sort(sorted, Comparator.comparingInt(Drugs::getId));
                break;
            case "name":
                Collections.sort(sorted, Comparator.comparing(Drugs::getName));
                break;
            case "category":
                Collections.sort(sorted, Comparator.comparing(Drugs::getCategory));
                break;
            case "price":
                Collections.sort(sorted, Comparator.comparingDouble(Drugs::getPrice));
                break;
            case "quantity":
                Collections.sort(sorted, Comparator.comparingInt(Drugs::getQuantity));
                break;
            default:
                System.out.println("Invalid sort order.");
                return;
        }
        System.out.println("Product list:");
        for (Drugs drug : sorted) {
            System.out.println(drug);
        }
    }
}
