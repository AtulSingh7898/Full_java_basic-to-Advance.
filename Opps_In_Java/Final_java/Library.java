
class Book {
    String title = "Java And Dsa";

    void setTitle(String type) {
        this.title = title;
    }
}

public class Library {
    public static void main(String[] args) {
        final Book book = new Book();
        book.setTitle("this the new Book");
        System.out.println("Ttile is " + book.title);
    }
}
