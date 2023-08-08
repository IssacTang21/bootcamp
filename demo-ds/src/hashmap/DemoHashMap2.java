package hashmap;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap2 {

  public static void main(String[] args) {
    HashMap<Integer, Book2> books = new HashMap<>();
    // key = address of Byte or value of Byte?
    books.put(128, new Book2("Eric", "Book1"));
    books.put(128, new Book2("Eric", "Book2"));
    System.out.println(books.size());

    HashMap<Author, Book2> bookMap = new HashMap<>();
    // author unique key? -> equals(), hashcode()
    Author author1 = new Author("John", 30);
    Author author2 = new Author("John", 29);
    bookMap.put(author1, new Book2("Book3", "Tom"));
    bookMap.put(author2, new Book2("Book4", "Tom"));
    System.out.println(bookMap.size());

    HashMap<Author, ArrayList<Book2>> bookMap2 = new HashMap<>();
    ArrayList<Book2> booklist = new ArrayList<>();
    booklist.add(new Book2("Book1", "tom"));
    booklist.add(new Book2("Book2", "tom"));
    ArrayList<Book2> booklist2 = new ArrayList<>();
    booklist2.add(new Book2("Book3", "tom"));
    booklist2.add(new Book2("Book4", "tom"));

    bookMap2.put(author1, booklist);
    bookMap2.put(author2, booklist2);
    for (Map.Entry<Author, ArrayList<Book2>> author : bookMap2.entrySet()) {
      // System.out.println(author.getKey().name);
      for (Book2 book : author.getValue()) {
        System.out.println("Author Name:" + author.getKey().name + ", Book Name:" + book.getName());
      }
    }

    for (Book2 book : bookMap2.get(new Author("John", 0))) {
      System.out.println(book);
    }
  }
}
