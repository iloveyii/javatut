
class Book {
    public String title;
    public String author;
    public static String staticAttribute = "This is static and accessible in class code";

    public void readBook() {
        System.out.println("I am reading " + this.title + " written by " + this.author);
    }

    // Constructor
    public Book() {

    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}


public class Oop {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java in 24 hours";
        book1.author = "Orelly";

        book1.readBook();
        System.out.println("The static variable is : " + Book.staticAttribute);

        Book book2 = new Book("Java ++", "Me");
        book2.readBook();
    }
}