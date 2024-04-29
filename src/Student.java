import java.util.*;
public class Student {
    private String name;
    private String surname;
    private String pn; // Assuming this is the personal number or ID
    private ArrayList<Book> borrowedBooks;

    public Student() {
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public boolean returnBook(Book book) {
        return borrowedBooks.remove(book);
    }

    public void printBorrowedBooks() {
        System.out.println("Books borrowed by " + name + " " + surname + " (" + pn + "):");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}