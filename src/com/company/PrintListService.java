package com.company;

/**
 * Creaed by Annie Theogaraj on 08/09/16.
 */

public class PrintListService{
    Node head;
    Node tail;

    public PrintListService(){
        Node head = null;
        Node tail = null;
    }

    public Node buildList(int size){

        for(int i=0;i<size;i++){

            this.head = addNodeLast(new Node("node"+i));
            System.out.println("Value of head: "+this.head.getName());
        }
        return this.head;
    }

    public Node addNodeLast(Node node){

        if(this.head == null){
            this.head = node;
            this.tail = node;

        }
        else{

            this.tail.setNext(node);
            this.tail = node;

        }
        return this.head;

    }


    public void printList(){

        RWNode current = this.head;

       while(current.getNext() != null){

           System.out.println("Node name "+current.getName());
           current = current.getNext();
       }

    }

    public void printListInReverse(){

        RWNode current = this.head;

        reversePrint(current);
    }

    public void reversePrint(RWNode node){

        if(node.getNext() != null){

            reversePrint(node.getNext());
            System.out.println("In reverse: "+node.getName());
        }else{
            System.out.println("In reverse: "+node.getName());
        }

    }

}
