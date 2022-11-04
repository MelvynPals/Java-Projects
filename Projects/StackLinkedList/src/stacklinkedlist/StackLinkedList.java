/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacklinkedlist;
import javax.swing.JOptionPane;

//last in first out
/**
 *
 * @author M&J
 */
public class StackLinkedList extends NodeLinkedList {
     public StackLinkedList(){
        super();
    } 
    
    public void push(Node n){
        insert(n);
    }
    
    public Node pop(){
        Node n = delete(getSize()-1);
        return n;
    }
    
    public void top(){
        if (getSize() == 0){
            JOptionPane.showMessageDialog(null, "Let's try adding elements shall we?");
        } else {
            Node n = getNode(getSize()-1);
            JOptionPane.showMessageDialog(null, n);
        }
    }
    
    public void makeEmpty(){
       clear();
    }
    
    public void isEmpty(){
        if(getSize() == 0){
            JOptionPane.showMessageDialog(null, "Stack is empty!");
        }else{
            JOptionPane.showMessageDialog(null, "Stack is loaded!");
        }
    }
}
