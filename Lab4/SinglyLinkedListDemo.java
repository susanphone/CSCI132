//CSCI132 - Lab4
//Susan McCartney
//July 22, 2020
package Lab4;

public class SinglyLinkedListDemo {
    public static void main(String[] args) {

        // Part one: Adding airports to an array and then removing the first in the
        // array.
        SinglyLinkedList<String> airports = new SinglyLinkedList<>();
        airports.addFirst("LAX");
        airports.addLast("SLC");
        airports.addLast("BOS");
        airports.addFirst("BZN");
        airports.addFirst("SFO");
        System.out.println(airports);
        airports.removeFirst();
        System.out.println(airports);
        // Using get method on airport
        System.out.println(airports.get(2));

        // Part two: Movie playlist
        SinglyLinkedList<Movie> watchlist = new SinglyLinkedList<>();
        watchlist.addFirst(new Movie("Moonrise Kingdom", 2012));
        watchlist.addLast(new Movie("Life Aquatic", 2005));
        watchlist.addLast(new Movie("The Grand Budapest Hotel", 2014));
        System.out.println(watchlist.toString());

        // Using get method on Movies
        System.out.println(watchlist.get(1));
    }
}