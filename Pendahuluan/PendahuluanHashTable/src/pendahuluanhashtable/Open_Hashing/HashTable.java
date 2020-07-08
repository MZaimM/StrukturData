/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendahuluanhashtable.Open_Hashing;

/**
 *
 * @author USER
 */
public class HashTable {

    private SortedLinkList[] hashArray;
    private int size;

    public HashTable(int size) {
        this.size = size;
        hashArray = new SortedLinkList[size];
        for (int i = 0; i < size; i++) {
            hashArray[i] = new SortedLinkList();
        }
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            System.out.print("| " + j + "|. ");
            hashArray[j].displayList();
        }
    }

    public int hasFunc(int key) {
        return key % size;
    }

    public void insert(int data) {
        Link theLInk = new Link(data);
        int key = theLInk.getKey();
        int hashVal = hasFunc(key);
        hashArray[hashVal].insert(theLInk);
    }

    public void delete(int key) {
        int hashVal = hasFunc(key);
        hashArray[hashVal].delete(key);
    }

    public Link find(int key) {
        int hashVal = hasFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        return theLink;
    }

}
