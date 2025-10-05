
import java.util.*;
import java.time.LocalDate;

class Book {
    String BookName;
    int Quantity;

    public Book(String BookName, int Quantity) {
        this.BookName = BookName;
        this.Quantity = Quantity;
    }
}

class issuedBook {
    String issuer;
    String BookName;
    LocalDate issuedDate;
    LocalDate deadlineDate;

    public issuedBook(String issuer, String BookName, LocalDate issuedDate, LocalDate deadlineDate) {
        this.issuer = issuer;
        this.BookName = BookName;
        this.issuedDate = issuedDate;
        this.deadlineDate = deadlineDate;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        List<issuedBook> issuedBooks = new ArrayList<>();
        int choice;
        do {
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Issued Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String bookName = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    books.add(new Book(bookName, quantity));
                    break;
                case 2:
                    System.out.print("Enter issuer name: ");
                    String issuer = sc.nextLine();
                    System.out.print("Enter book name: ");
                    String issueBookName = sc.nextLine();
                    boolean found = false;
                    for (Book b : books) {
                        if (b.BookName.equals(issueBookName) && b.Quantity > 0) {
                            LocalDate issuedDate = LocalDate.now();
                            LocalDate deadlineDate = issuedDate.plusDays(14);
                            issuedBooks.add(new issuedBook(issuer, issueBookName, issuedDate, deadlineDate));
                            b.Quantity--;
                            found = true;
                            System.out.println("Book issued successfully.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not available or out of stock.");
                    }
                    break;
                case 3:
                    System.out.print("Enter issuer name: ");
                    String returnIssuer = sc.nextLine();
                    System.out.print("Enter book name to return: ");
                    String returnBookName = sc.nextLine();
                    boolean returned = false;
                    for (int i = 0; i < issuedBooks.size(); i++) {
                        issuedBook ib = issuedBooks.get(i);
                        if (ib.issuer.equals(returnIssuer) && ib.BookName.equals(returnBookName)) {
                            issuedBooks.remove(i);
                            // Increase the quantity in books list
                            for (Book b : books) {
                                if (b.BookName.equals(returnBookName)) {
                                    b.Quantity++;
                                    break;
                                }
                            }
                            System.out.println("Book returned successfully.");
                            returned = true;
                            break;
                        }
                    }
                    if (!returned) {
                        System.out.println("No such issued book found for this issuer.");
                    }
                    break;
                case 4:
                    for (issuedBook ib : issuedBooks) {
                        System.out.println("Issuer: " + ib.issuer + ", Book Name: " + ib.BookName + ", Issued Date: "
                                + ib.issuedDate + ", Deadline Date: " + ib.deadlineDate);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}