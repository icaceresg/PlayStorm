/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Observer;

/**
 *
 * @author AdriiM_
 */
public class Money {

    private Observer observer = new Observer() {
    };
    private int actualmoney;

    public int getMoney() {
        return actualmoney;
    }

    public void setMoney(int actualmoney) {
        this.actualmoney = actualmoney;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        observer.Update();
    }

}
