package com;



 /* Implementation of Open Addressing in hashing*/

class MyHash
{
    private int[] arr;
    private int capacity,size;

    MyHash(int c)
    {
        capacity=c;
        size=0;
        arr=new int[capacity];
        for(int i=0;i<capacity;i++)
            arr[i]=-1;
    }

    int hash(int key){
        return key%capacity;
    }

    boolean insert(int key)
    {
        if(size==capacity)
            return false;
        int i=hash(key);
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
            i=(i+1)%capacity;
        if(arr[i]==key)
            return false;
        else{
            arr[i]=key;
            size++;
            return true;
        }
    }
    boolean search(int key)
    {
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key)
                return true;
            i=(i+1)%capacity;
            if(i==h)
                return false;
        }
        return false;
    }
    boolean erase(int key)
    {
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;
                return true;
            }
            i=(i+1)%capacity;
            if(i==h)
                return false;
        }
        return false;
    }
}


public class HashFunctionAddressing {

    public static void main(String[] args)
    {
        MyHash mh = new MyHash(7);
        mh.insert(49);
        mh.insert(56);
        mh.insert(72);
        if(mh.search(56))
            System.out.println("Yes");
        else
            System.out.println("No");
        mh.erase(56);
        if(mh.search(56))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
