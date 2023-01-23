/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Strategy;

/**
 *
 * @author jorge
 */
public class Game {

    private String name;
    private String category;
    private double price;

    /**
     *
     * @param name
     * @param category
     * @param price
     */
    public Game(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }
}
