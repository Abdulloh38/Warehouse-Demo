package org.example;

import java.util.List;

public class SearchDrugsService {

    static void searchDrugs(List<Drugs> inventory, String parameter, String value, List<Drugs> results) {
        for (Drugs drugs : inventory) {
            switch (parameter) {
                case "id":
                    if (drugs.getId() == Integer.parseInt(value)) {
                        results.add(drugs);
                    }
                    break;
                case "name":
                    if (drugs.getName().toLowerCase().contains(value)) {
                        results.add(drugs);
                    }
                    break;
                case "category":
                    if (drugs.getCategory().toLowerCase().contains(value)) {
                        results.add(drugs);
                    }
                    break;
                case "price":
                    if (drugs.getPrice() == Double.parseDouble(value)) {
                        results.add(drugs);
                    }
                    break;
                case "quantity":
                    if (drugs.getQuantity() == Integer.parseInt(value)) {
                        results.add(drugs);
                    }
                    break;
                default:
                    System.out.println("Invalid search parameter.");
                    return;
            }
        }
        if (results.isEmpty()) {
            System.out.println("No products found.");
            return;
        }
        System.out.println("Search results:");
        for (Drugs drugs : results) {
            System.out.println(drugs);
        }
    }
}
