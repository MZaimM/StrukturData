/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendahuluanlinkedlist;

/**
 *
 * @author USER
 */

class LinkedList{
    private Link first;
    private Link last;
    public LinkedList(){
        first=null;
        last= null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void insertFirst(int Data){
        Link newLink=new Link(Data);
        /*if (isEmpty()) {
            last=newLink;
        }else{
            first.previous=newLink;
        }*/
        newLink.next=first;
        first=newLink;
    }
    /*public void insertLast(int Data){
        Link newLink= new Link(Data);
      
        newLink.previous=last;
        last=newLink;
    }*/
    public void insertLast(int Data){
        Link newLink= new Link(Data);
        newLink.next=null;
        Link temp=first;
        
        while (temp.next != null) {            
            temp=temp.next;
        }
        temp.next=newLink;
    }
    public Link deleteFirst(){
        Link temp=first;
        first=first.next;
        return temp;
    }
    
    /*public Link deleteLast(){
        Link temp=last;
        if (first.next == null) {
            first = null;
        }else{
            last.previous.next=null;
        }
        last=last.previous;
        return temp;
    }*/
    public void deleteLast(){
        Link current= null;
        for (current = this.first; current.next.next != null; current=current.next){
          
        }
        current.next=null;
    }
    public Link find(int key){
        Link current=first;
        while(current.Data != key){
            if (current.next == null) {
                return null;
            }else{
                current=current.next;
            }
        }
        return current;
    }
    
    public Link delete(int key){
        Link current=first;
        Link previous=first;
        while(current.Data != key){
            if (current.next == null) {
                return null;
            }else{
                previous=current;
                current=current.next;
            }
        }
        if (current == first) {
            first=first.next;
        }else{
            previous.next=current.next;
        }
        return current;
    }
    
    public void displayList(){
        System.out.println("List(first-->last):");
        Link current=first;
        while(current != null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
        
}


    
