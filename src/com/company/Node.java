package com.company;

/**
 * Created by Annie Theogaraj on 08/09/16.
 */

public class Node implements RWNode{
    public String name="";
    public RWNode next;

    public Node(String name){
        this.name = name;
        this.next = null;
    }

    public String getName(){
        return this.name;
    }

    public RWNode getNext(){
        return this.next;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNext(RWNode next){
        this.next = next;
    }
}

