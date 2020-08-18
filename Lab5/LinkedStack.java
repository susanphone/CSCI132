// CSCI 132- Lab5
// Susan McCartney
// July 29, 2020
package Lab5;

import Lab4.SinglyLinkedList;
// Inplementation of a stack using a singly linked list
// this class comes straight from the textbook pg.233
public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<E>();
    public LinkedStack() {}
    public int size() {return list.size(); }
    public boolean isEmpty() {return list.isEmpty(); }
    public void push (E element) {list.addFirst(element);}
    public E top() {return list.first(); }
    public E pop() {return list.removeFirst(); }     
}