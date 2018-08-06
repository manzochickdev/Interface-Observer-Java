/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoobserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author manzo
 */
public class Broadcaster implements Subject {

    private String s;
    private ArrayList<Observer> listObserver;
    
    public Broadcaster(){
        listObserver = new ArrayList<Observer>();
    }
    
    @Override
    public void addObserver(Observer o) {
        listObserver.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        listObserver.remove(listObserver.indexOf(o));
    }

    @Override
    public void notifyChange() {
        for(Observer o : listObserver){
            o.update(s);
        }
    }
    
    void setSring(String s){
        this.s = s;
        notifyChange();
    }
    
    
}
