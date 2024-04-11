package HashTable;

import java.util.ArrayList;

public class MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBuckets[];

    MyHashSet(){
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++){
            myBuckets[i] = new ArrayList<>();
        }
    }

    // return hashValue
    private int hashFunction(int key){
        return key % SIZE;
    }

    public void add(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        if (keyIndex < 0){
            bucket.add(key);
        }
    }

    public boolean contains(int key){
        return false;
    }

}
