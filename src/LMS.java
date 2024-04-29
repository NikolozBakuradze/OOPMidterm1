import java.util.ArrayList;
import java.util.List;

public class LMS {
    private List<Book> storage = new ArrayList<>();

    public void addBook(Book book) {
        boolean found = false;
        for (Book b : storage) {
            if (b.getTitle().equals(book.getTitle()) && b.getAuthor().equals(book.getAuthor())) {
                b.setQuantity(b.getQuantity() + 1);
                found = true;
                break;
            }
        }
        if (!found) {
            book.setQuantity(1);
            storage.add(book);
        }
    }

    public boolean removeBook(Book book) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            Book b = storage.get(i);
            if (b.getTitle().equals(book.getTitle()) && b.getAuthor().equals(book.getAuthor())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty.");
        } else {
            System.out.println("Library Contents:");
            for (Book b : storage) {
                System.out.println(b.getAuthor() + ", " + b.getTitle() + " (Quantity: " + b.getQuantity() + ")");
            }
        }
    }

    public boolean borrowBook(Book book, Student student) {
        for (Book b : storage) {
            if (b.getTitle().equals(book.getTitle()) && b.getAuthor().equals(book.getAuthor()) && b.getQuantity() > 0) {
                b.setQuantity(b.getQuantity() - 1);
                student.borrowBook(book);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(Book book, Student student) {
        boolean returned = student.returnBook(book);
        if (returned) {
            for (Book b : storage) {
                if (b.getTitle().equals(book.getTitle()) && b.getAuthor().equals(book.getAuthor())) {
                    b.setQuantity(b.getQuantity() + 1);
                    break;
                }
            }
        }
        return returned;
    }

    public void printStudentBooks(Student student) {
        student.printBorrowedBooks();
    }

    public void printBookInformation(Book book) {
        System.out.println("Book Information:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Quantity: " + book.getQuantity());
    }
}