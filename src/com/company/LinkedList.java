package com.company;

public class LinkedList {
    Node Head;
    private int size = 0;
    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(Head == null){
            Head = newnode;
            return;
        }
        newnode.next = Head;
        Head = newnode;
    }

    void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(Head == null){
            Head = newnode;
            return;
        }

        Node currentNode = Head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newnode;
    }

    void deleteFirst(){
        if(Head == null){
            System.out.println("The list is empty");
            return;
        }
        Head.next = Head;
        size--;
    }

    void deleteLast(){
        if(Head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;

        if(Head.next == null)
            Head = null;

        Node secondLastNode = Head;
        Node lastNode = Head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    int getSize(){
        return size;
    }

    void print(){
        if(Head == null){
            System.out.println("The list is empty");
            return;
        }

        Node currentNode = Head;
        System.out.print("The Linked List is : ");
        while(currentNode != null){
            System.out.println(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[]args){


        //Code doesn;t work. Time wasted. LOL .


        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(34);
        ll.deleteFirst();
        ll.deleteLast();
        System.out.println("The list is " + ll.getSize() + " size long");
        //ll.print();
    }
}
