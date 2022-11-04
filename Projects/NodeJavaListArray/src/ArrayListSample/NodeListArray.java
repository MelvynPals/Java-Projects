/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListSample;

/**
 *
 * @author Melvyn John S. Paleguin
 */
public class NodeListArray {
    
    private int size; //number of elements
    private int defaultSize=10;
    private Node []nodeList;
    
    NodeListArray(){
        nodeList = new Node[defaultSize];
        size=0;
    }
    
    public NodeListArray(int s){
        defaultSize=s;
        nodeList=new Node[defaultSize];
        size=0;
    }

        // Insert new element at the end of the list
    public void add(Node n){
        add(size,n);
    }
    
    // Get specific value at specific index
    public Node getNode(int idx){
        return nodeList[idx];
    }
    
    //display or printlist
    public Node[] PrintList() {
        return nodeList;
    }
    
    //MakeEmpty - clear the node list
    public void MakeEmpty() {
        nodeList = new Node[defaultSize];
    }
    
    //Insert a new element in a index
    public void add(int idx, Node n){ 
        if (size == (defaultSize)){
            System.out.println("Array overflow.");  
        } 
        else if (idx < size){
            for (int i=size; i>idx; i--)
                nodeList[i]=nodeList[i-1];
            nodeList[idx]=n;
            size++;
            } 
        else {
            nodeList[size] = n;
            size++;
        }
    }

    //Delete an element in a index
    public Node remove(String id){
        Node removeItem = null;
        int idx;
        for(int i = 0; i < nodeList.length; i++) {
            if (id.equals(nodeList[i].getID())) {
                removeItem = nodeList[i];
                idx = i;
                for(int j = idx; j < this.defaultSize-1 ; j++) {
                    nodeList[j] = nodeList[j+1];
                }
                size--;
                return removeItem;
            }
        }
        return removeItem;
    }

    //Next element of the given id
    public String Next(String id){
        String temp = "unable to be found.";
        for (int i = 0; i < nodeList.length; i++){
            if (nodeList[i] == null) {
                return temp;
            }
            if (id.equals(nodeList[i].getID())) {
                temp = nodeList[i+1].toString();
                return temp;
            } 
        } return temp;
    } 
    
     //Previous element of the given id
    public String Previous(String id) {
        String temp = "unable to be found.";
        for(int i = 0; i < nodeList.length; i++) {
            if (nodeList[i] == null) {
                return temp;
            }
            if (id.equals(nodeList[i].getID())) {
                temp = nodeList[i-1].toString();
                return temp;
            }
        } return temp;
    }    

    //Find the element of an Array
    public String Find(String id){
        String temp = "Cannot find id, please try again";
        for(int i = 0; i < nodeList.length; i++) {
            if (nodeList[i] == null) {
                return temp;
            }
            else if (id.equals(nodeList[i].getID())) {
                temp = nodeList[i].toString();
                return temp;
            }
        }
        return temp;
    }
    
    public int getSize(){
        return size;
    }
       
}
