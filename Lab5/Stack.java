// CSCI 132- Lab5
// Susan McCartney
// July 29, 2020
package Lab5;

//this interface come from the textbook pg. 229
public interface Stack<E> {
    int size();

    boolean isEmpty();

    void push(E e);
    
    E top();

    E pop();
    
}