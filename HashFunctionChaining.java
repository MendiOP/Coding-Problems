package com;

import java.util.ArrayList;
import java.util.LinkedList;

        /* Implementation of Chaining in hashing */

class MyHashChaining
{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    MyHashChaining(int b)
    {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i=0; i<b; i++)
            table.add(new LinkedList<Integer>());
    }
    void insert(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).add(k);
    }
    boolean search(Integer k)
    {
        int i = k % BUCKET;
        return table.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).remove(k);
    }
}

public class HashFunctionChaining {

        public static void main(String[] args)
        {
            MyHashChaining mh = new MyHashChaining(7);
            mh.insert(10);
            mh.insert(20);
            mh.insert(15);
            mh.insert(7);
            System.out.println(mh.search(10));
            mh.delete(15);
            System.out.println(mh.search(15));
        }
}
