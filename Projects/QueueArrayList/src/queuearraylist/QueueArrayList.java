/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queuearraylist;
import javax.swing.JOptionPane;

//first in first out
/**
 *
 * @author M&J
 */
public class QueueArrayList extends NodeListArray{
    public QueueArrayList(){
        super();
    } 
    
    public void enqueue(Node n){
        add(n);
    }
    
    public void dequeue(){
        delete(0);
    }
    
    public void clear(){
        MakeEmpty();
    }
    
    public void IsEmpty(){
        if (getSize() == 0){
            JOptionPane.showMessageDialog(null, "The Queue is empty!");
        } else {
            JOptionPane.showMessageDialog(null, "The Queue is not empty!");
        }
    }
}
