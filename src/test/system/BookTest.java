package test.system;

public class BookTest {
    static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("자바의 정석", "남궁성");
        books[1] = new Book("혼공자", "신용권");
        books[2] = new Book("이것이 자바다", "김익환");

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());

        }
    }
}
