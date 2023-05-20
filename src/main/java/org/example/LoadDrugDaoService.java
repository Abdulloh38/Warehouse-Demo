package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadDrugDaoService {

    public static List<Drugs> loadInventory() {
        List<Drugs> inventory = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/org/example/DrugDao.csv"))) {
            String line = reader.readLine(); // skip header row

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                String category = fields[2];
                double price = Double.parseDouble(fields[3]);
                int quantity = Integer.parseInt(fields[4]);
                Drugs drugs = new Drugs(id, name, category, price, quantity);
                inventory.add(drugs);
            }
        } catch (IOException e) {
            System.err.println("Error reading DrugDao.csv file: " + e.getMessage());
        }

        return inventory;
    }

}
