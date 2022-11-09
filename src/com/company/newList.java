package com.company;

public class newList {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    newList insert(newList list , int data){
        Node newnode = new Node(data);
        if(list.head == null)
            list.head = newnode;
        else{
            Node lastnode = list.head;
            while (lastnode.next != null){
                lastnode = lastnode.next;
            }
            lastnode.next = newnode;
        }
        return list;
    }

    void print(newList list){
        Node current = list.head;
        System.out.println("The list is : ");
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("NULL");
    }

    newList delete(newList list, int data){
        Node current = list.head;
        Node previous = null;

        if(current.data == data && current.next != null){
            list.head = current.next;
            return list;
        }

        while(current != null && current.data != data){
            previous = current;
            current = current.next;
        }

        if(current != null)
            previous.next = current.next;
        else
            System.out.println("The data is not in the list");

        return list;
    }

    int middlenode(newList list){
        Node left = list.head;
        Node right = list.head;

        while (right != null && right.next != null){
            left = left.next;
            right = right.next.next;
        }
        return left.data;
    }

    newList deleteNthnode(newList list, int n){
        Node left = list.head;
        Node right = list.head;

        for(int i=0;i<n;i++){
            if (right.next == null) {
                if (i == n - 1)
                    list.head = list.head.next;
                return list;
            }
            right = right.next;
        }

        while(right.next != null){
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return list;
    }

    public static void main(String [] args){
        newList list = new newList();
        list  = list.insert(list,12);
        list  = list.insert(list,13);
        list  = list.insert(list,122);
        list  = list.insert(list,123);
        list  = list.insert(list,132);
        list  = list.insert(list,131);
       // list.print(list);
        //list = list.delete(list,12);
       // System.out.println(list.middlenode(list));
        list = list.deleteNthnode(list , 1 );
        list.print(list);
    }

}
