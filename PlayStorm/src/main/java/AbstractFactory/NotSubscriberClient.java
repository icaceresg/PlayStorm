/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author jorge
 */
public class NotSubscriberClient implements Client {

    private String name;
    private boolean par;

    public NotSubscriberClient(boolean par) {
        this.par = par;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public boolean isPar() {
        return par;
    }

    public void setPar(boolean par) {
        this.par = par;
    }

}
