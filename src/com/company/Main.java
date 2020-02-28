package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(34);
        list.insert(15);

        list.insertAt(2,7);
        list.insertAtStart(24);
        list.delete(1);

        list.show();


    }
}
