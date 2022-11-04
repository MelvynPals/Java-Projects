/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stacklinkedlist;

/**
 *
 * @author Melvyn Pals
 */
public class NodeLinkedList {
    private Node beginMarker;
    private Node endMarker;
    private int size;
    
    NodeLinkedList(){
        beginMarker = new Node();
        endMarker = new Node(null,null,null,beginMarker);
        beginMarker.setNext(endMarker);
        size = 0;
    }
    
    public void insert(int index, Node nodeNew){
        if(index < 0 || index > size) {
            System.out.println("Out of bounds.");
            return;
        }

        int counter=0;
        Node nNav = beginMarker; 

        while(counter < index && nNav.getNext() != endMarker){
            nNav = nNav.getNext();
            counter++;            
        }

        Node temp=nNav.getNext();

        nodeNew.setNext(temp);
        nodeNew.setPrevious(nNav);
        temp.setPrevious(nodeNew);
        nNav.setNext(nodeNew);
        size++;
    }
    
    public void insert(Node newNode){
        insert(size,newNode);
    }
        
    public void clear(){
        beginMarker = new Node();
        endMarker = new Node(null, null, null, beginMarker);
        beginMarker.setNext(endMarker);
        size = 0;
    }
    
    public void clearAt(int idx){
        Node nNav = beginMarker.getNext();
        if(beginMarker == null || idx < 0){
            return;
        }
        
        for(int i = 0; nNav != null && i < idx; i++){
            nNav = nNav.getNext();
        }
        
        if(nNav == null){
            return;
        }
        
        //delete(nNav);
    }
    
    public Node delete(int value){
        Node tempVal = getNode(value);
        Node tempVal2 = tempVal.getPrevious();
        Node tempVal3 = tempVal.getNext();
        
        tempVal2.setNext(tempVal.getNext());
        tempVal3.setPrevious(tempVal.getPrevious());
        
        size--;
        return tempVal;
    }
    
    public Node nextEl(int idx){
        Node nNav = beginMarker.getNext();
        int count = 0;
        
            while(count != idx){
                nNav = nNav.getNext();
                count++;
            }
            
            if(count == idx){
                nNav = nNav.getNext();
                count++;
            }
            
            return nNav;
    }
    
    public Node prevEl(int idx){
        Node nNav = beginMarker.getNext();
        int count = 0;
        
            while(count != idx){
                nNav = nNav.getNext();
                count++;
            }
            
            if(count == idx){
                nNav = nNav.getPrevious();
                count++;
            }
            
            return nNav;
    }
    
    public String PrintList(){
        String NodeListStr="";
        Node nNav = beginMarker;
        
        while (nNav.getNext() != endMarker){
            nNav = nNav.getNext();
            NodeListStr += nNav.toString();
        }
        
        System.out.println(NodeListStr);
        return NodeListStr;
    }
    
    public Node getNode1(int index){
           if (index < 0 || index > size) {
            System.out.println("Out of bounds.");
            return null;
        }
        
        int counter=0;
        Node nNav = beginMarker; 
       
        while (counter < index && nNav.getNext() != endMarker){
             nNav = nNav.getNext();
            counter++;            
        }
        return nNav;
    }
    
    public Node getNode(int idx){
        return getNode (idx,0,size);
    
    }
    
    private Node getNode(int idx, int lower, int upper){
        Node p;
        
        if (idx < lower || idx > upper)
            throw new IndexOutOfBoundsException();
        if (idx < size/2){
            p = beginMarker.getNext();
            for(int i=0; i< idx; i++)
                p = p.getNext();
        }
        else{
            p = endMarker;
            for (int i=size; i> idx; i--)
                p = p.getPrevious();
        }
        return p;
    }
      
    public int getSize(){
        return size;
    }
}

