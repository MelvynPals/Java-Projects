/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodelinkedlink;

/**
 *
 * @author Melvyn Pals
 */
public class Node{
    
    public String ID;
    public String Name;
    public Node next;
    public Node prev;
    
    Node(){
        ID="";
        Name="";
        prev=null;
        next=null;
    }
    
    Node (String strID, String strName, Node n, Node p){
        ID=strID;
        Name=strName;
        next = n;
        prev = p;
    }
    Node (String strID, String strName){
        ID=strID;
        Name=strName;
        next = null;
        prev = null;
    }
    
    public void setData(String ID, String Name){
        this.ID = ID;
        this.Name = Name;
    }
    
    public void changeName(String strName){
        Name=strName;
    }
    
    public String toString(){
        return "ID: "+ID+ "  " +"Name: "+Name+"\n";
    }
    
    public void setNext(Node n){
        next=n;
    }
    
    public void setPrevious(Node p){
        prev=p;
    }
    
    public Node getNext(){
        return next;
    }
    
    public Node getPrevious(){
        return prev;
    }
}
