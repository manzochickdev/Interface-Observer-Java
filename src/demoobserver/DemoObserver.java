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
public class DemoObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Broadcaster broadcaster = new Broadcaster();
        broadcaster.addObserver(new Subscriber("A"));
        broadcaster.addObserver(new Subscriber("B"));
        
        broadcaster.setSring("Hello World");
    }
    
}
