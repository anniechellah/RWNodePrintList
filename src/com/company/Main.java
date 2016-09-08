package com.company;

public class Main {

    public static void main(String[] args) {
        PrintListService printListObj = new PrintListService();
        Node node = printListObj.buildList(8);
        printListObj.printList();
        printListObj.printListInReverse();

    }
}
