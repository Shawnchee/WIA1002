/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l3;

import java.util.ArrayList;

/**
 *
 * @author aykay
 */
public class ArrayBag<T> implements BagInterface<T> {

    private T[] bag;
    private static int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int capacity) {
        T[] tempbag = (T[]) new Object[capacity];
        bag = tempbag;
        numberOfEntries = 0;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return (numberOfEntries == bag.length);

    }

    @Override
    public boolean isEmpty() {
        return (numberOfEntries == 0);
    }

    @Override
    public boolean add(T newEntry) {
        if (numberOfEntries == bag.length) {
            return false;
        }
        bag[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
    }

    @Override
    public T remove() {
        if (!isEmpty()) {
            T temp = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            return temp;
        } else {
            return null;
        }
    }

    @Override
    public boolean remove(T anEntry) {
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] == anEntry) {
                T temp;
                temp = bag[bag.length - 1];
                bag[bag.length - 1] = bag[i];
                bag[i] = temp;
                bag[bag.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        T[] tempbag = (T[]) new Object[bag.length]; // String [] str = new String (Has type)  /   for generic type (T), have to use (T) new Object;
        bag = tempbag;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] == anEntry) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] == anEntry) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] tmpBag = (T[]) new Object[numberOfEntries];
        System.arraycopy(bag, 0, tmpBag, 0, numberOfEntries);
        return tmpBag;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> bag2) {
        ArrayBag<T> newBag = new ArrayBag<>(this.getCurrentSize() + bag2.getCurrentSize());
        for (int i = 0; i < this.getCurrentSize(); i++) {
            newBag.add(bag[i]);
        }
        for (int i = 0; i < bag2.getCurrentSize(); i++) {
            newBag.add(bag2.toArray()[i]);
        }
        return newBag;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> bag2) {
        ArrayBag<T> newBag = new ArrayBag<>(this.getCurrentSize());
        T[] arr = bag2.toArray(); // have to make a copy, if not it will be initiliazed as a new array again

        for (int i = 0; i < this.numberOfEntries; i++) {
            for (int j = 0; j < bag2.getCurrentSize(); j++) {
                if (bag[i] == arr[j]) {
                    newBag.add(bag[i]);
                    arr[j] = null;
                        break;
                }
            }
        }
        return newBag;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> bag2) {
        ArrayBag<T> newBag = new ArrayBag<>(this.getCurrentSize());
         T [] bag2Array = bag2.toArray();
         T [] bag1Array = this.toArray();

        for (int i = 0; i < this.numberOfEntries; i++) {
            for (int j = 0; j < bag2.getCurrentSize(); j++) {
                if (bag1Array[i] == bag2Array[j]) {
                    bag1Array[i] = null;
                    bag2Array[j] = null;
                }
            }
        }
        // A: 1, 1, 2, 2, 3, 3
        // B: 1, 2, 3
        // 1, null, 2, null, 3, null
        // null, null, null
        for (int i = 0; i < bag1Array.length; i++) {
            if (bag1Array[i] != null) {
                newBag.add(bag[i]);
            }
        }
        return newBag;
    }

}
