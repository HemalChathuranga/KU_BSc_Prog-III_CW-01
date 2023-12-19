
package Tooth_Care_Appoinment_Management_System;

/**
 *
 * @author Hemal Chathuranga
 */
public class LinkedList {
    
    Node head;
    Node tail;
    int index;
    
   //Adding new Node into end of the list(tail). 
   public void insert(String userID, String password){
       Node node = new Node();
       node.userID = userID;
       node.password = password;
       node.next = null;
       
       if(head == null){
           head = node;
       }
       else{
           
           Node n = head;
           
           while(n.next != null){
               n = n.next;  
           }
           
           n.next = node;
           
       }   
   }
   
    //Adding new Node into the start of the list(head). 
    public void insertAtStart(String userID, String password){
        Node node = new Node();
        node.userID = userID;
        node.password = password;
        node.next = null;
        
        if(head == null){
            head = node;
        }
        else{            
            node.next = head;
            head = node;
        
        }
    }
    
    //Adding new Node into user epecific index in the list.
    public void insertAt(int index, String userID, String password){
        Node node = new Node();
        node.userID = userID;
        node.password = password;
        node.next = null;
        this.index = index;
        
        if(this.index == 0){
            this.insertAtStart(userID, password);
        }
        else{
        Node n = head;
        
        for(int i=0; i<index-1; i++){
            
            n = n.next;
        }
        
        node.next = n.next;
        n.next = node;
        }
    }
    
    //Delete the Node of user epecific index in the list.
    public void deleteAt(int index){
        
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            
            for(int i=0; i<index-1; i++){
                
                n = n.next;
            }
            
            n1 = n.next;
            n.next = n1.next;
        }
        
    }
   
    //Print the full list.
    public void show(){
       Node node = head;
       
       while(node.next != null){
           
           System.out.println(node.userID + " " + node.password);
           node = node.next;
       }
       System.out.println(node.userID + " " + node.password);
    }
    
    //Size of the Linked List.
    public int size(){
        
        Node node = head;
        int listSize = 0;
            
        if(head == null){
            return 0;
        }
        else{
            while(node.next != null){
                node = node.next;
                listSize++;
            }
            return (listSize+1);
        }
        
    }
    
    
    public Node search(Node node){
        
        Node curNode = head;
        
        while(curNode.next != null){
            if((curNode.userID.equals(node.userID)) && (curNode.password.equals(node.password))){ 
                return curNode;
            }
            curNode = curNode.next;
        }
        if((curNode.next == null) && (curNode.userID.equals(node.userID)) && (curNode.password.equals(node.password))){
            return curNode;
        }
        else{
            return null;
        }
    }
}
