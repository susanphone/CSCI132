package Lab1;


public class MyQueue {
    private String[] elements;

    public MyQueue(String[] elements){
        this.elements = elements;
    }
    
    // adds a new element to the beginning of the queue and pushes the 
    // other elements back one
    public void add(String newElement){
        String temp = newElement;
        for (int i = 0; i < elements.length; i++) {
            String temp2 = elements[i];
            elements[i] = temp;
            temp = temp2;
        }
    }

    // removes last element and returns the last element
    public String remove(){
        int lastIdx = elements.length - 1;
        String lastItem = elements[lastIdx];
        elements[lastIdx] = "";
        return lastItem;
    }

    // prints each element in the queue
    public void printQueue(){
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }

    }


}