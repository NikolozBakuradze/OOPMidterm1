public class LibraryTester {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student();
        s1.setName("Maka");
        s1.setSurname("Kapanadze");
        s1.setPn("12345678912");

        Student s2 = new Student();
        s2.setName("Giorgi");
        s2.setSurname("Giorgadze");
        s2.setPn("111111111111");

        // Create books
        Book b1 = new Book();
        b1.setTitle("Lord of the Rings");
        b1.setAuthor("J.R.R. Tolkien");

        Book b2 = new Book();
        b2.setTitle("Introduction to OOP");
        b2.setAuthor("Paata Gogishvili");

        // Create LMS
        LMS lms = new LMS();
        lms.addBook(b1);
        lms.addBook(b1);
        lms.addBook(b2);

        // Borrow and return books
        lms.borrowBook(b1, s1);
        lms.borrowBook(b2, s2);
        lms.returnBook(b1, s1);

        // Print library contents
        lms.printStorage();

        // Print student borrowed books
        lms.printStudentBooks(s1);
        lms.printStudentBooks(s2);

        // Print book information
        lms.printBookInformation(b1);
        lms.printBookInformation(b2);
    }
}