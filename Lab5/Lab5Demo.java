// CSCI 132- Lab5
// Susan McCartney
// July 29, 2020
package Lab5;

// The format for this demo comes from the textbook pg. 232
public class Lab5Demo {
    public static void main(String[] args) {
        // Linked stack using string elements
        LinkedStack<String> stringTest = new LinkedStack<>();
        System.out.println();
        stringTest.push("Cat");
        stringTest.push("Goat");
        System.out.println(stringTest.size()); // Size 2
        System.out.println(stringTest.pop()); // Remove Goat
        System.out.println(stringTest.isEmpty()); // False
        System.out.println(stringTest.pop()); // Remove Cat
        System.out.println(stringTest.isEmpty()); // True
        System.out.println(stringTest.pop()); //Null, nothing left to remove
        stringTest.push("Dog");
        stringTest.push("Cow");
        System.out.println(stringTest.top()); // Cow, but don't remove
        stringTest.push("Pig");     
        System.out.println(stringTest.size()); // 3
        System.out.println(stringTest.pop()); // Remove Pig
        stringTest.push("Squirrel");
        stringTest.push("Rabbit");
        System.out.println(stringTest.pop()); // Remove Pig

        // Linked stack using integer elements
        LinkedStack<Integer> intTest = new LinkedStack<>();
        System.out.println();
        intTest.push(5000);
        intTest.push(1);
        System.out.println(intTest.size()); // 2
        System.out.println(intTest.pop()); // remove 1
        System.out.println(intTest.isEmpty()); // false
        System.out.println(intTest.pop()); // remove 5000
        System.out.println(intTest.isEmpty()); //true
        System.out.println(intTest.pop()); // null, nothing to remove
        intTest.push(50);
        intTest.push(325);
        System.out.println(intTest.top()); // 325, but don't remove it
        intTest.push(64);
        System.out.println(intTest.size()); // 3
        System.out.println(intTest.pop()); // remove 64
        intTest.push(693);
        intTest.push(89);
        System.out.println(intTest.pop()); // remove 89
    }
}