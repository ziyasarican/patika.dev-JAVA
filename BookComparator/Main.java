import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        Book book1 = new Book("Originals",335,"Adam Grant",2016);
        Book book2 = new Book("Martin Eden",606,"Jack London",2013);
        Book book3 = new Book("War and Peace",1225,"Lev Tolstoy",1867);
        Book book4 = new Book("1984",352,"George Orwell",1949);
        Book book5 = new Book("Mastery",353,"Robert Greene",2012);
         */

        Comparator<Book> nameComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        };


        TreeSet<Book> books = new TreeSet<>(nameComparator);
        books.add(new Book("Originals",335,"Adam Grant",2016));
        books.add(new Book("Martin Eden",606,"Jack London",2013));
        books.add(new Book("War and Peace",1225,"Lev Tolstoy",1867));
        books.add(new Book("1984",352,"George Orwell",1949));
        books.add(new Book("Mastery",353,"Robert Greene",2012));

        for(Book book: books){
            System.out.println(book.toString());
        }
        System.out.println("-------------------------");

        Comparator<Book> pageComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage() - o2.getPage();
            }
        };
        TreeSet<Book> pages = new TreeSet<>(pageComparator);

        pages.add(new Book("1984",352,"George Orwell",1949));
        pages.add(new Book("Mastery",353,"Robert Greene",2012));
        pages.add(new Book("Originals",335,"Adam Grant",2016));
        pages.add(new Book("Martin Eden",606,"Jack London",2013));
        pages.add(new Book("War and Peace",1225,"Lev Tolstoy",1867));
        
        for(Book book: pages){
            System.out.println(book.toString());
        }
    }

}
