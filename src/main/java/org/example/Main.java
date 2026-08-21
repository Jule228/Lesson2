package org.example;

public class Main {
    public static void main(String[] args) {
        // Задание 1 и 2: товары
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.09.2024",
                "Apple Inc.", "USA", 6999, false);
        productsArray[2] = new Product("Xiaomi 14", "10.11.2023",
                "Xiaomi Corp.", "China", 3299, false);
        productsArray[3] = new Product("Sony WH-1000XM5", "20.05.2022",
                "Sony Corp.", "Japan", 1899, true);
        productsArray[4] = new Product("Dell XPS 13", "05.01.2024",
                "Dell Technologies", "USA", 8999, false);

        for (Product p : productsArray) {
            p.printInfo();
        }

        // Задание 3: аттракционы
        Park.Attraction[] attractions = new Park.Attraction[3];
        attractions[0] = new Park.Attraction("Американские горки", "10:00-20:00", 500);
        attractions[1] = new Park.Attraction("Колесо обозрения", "09:00-22:00", 300);
        attractions[2] = new Park.Attraction("Комната страха", "12:00-23:00", 400);

        for (Park.Attraction a : attractions) {
            a.printInfo();
        }
    }
}