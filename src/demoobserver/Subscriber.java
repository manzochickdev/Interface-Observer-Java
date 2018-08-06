/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoobserver;

/**
 *
 * @author manzo
 */
public class Subscriber implements Observer {
    private String name;
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String s) {
        System.out.println(name + s);
    }
    
}
