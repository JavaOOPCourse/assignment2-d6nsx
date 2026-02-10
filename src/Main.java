import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {

            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1: {
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    library.addBook(new Book(title, author, year));
                    break;
                }

                case 2: {
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = scanner.nextInt();

                    System.out.print("File size (MB): ");
                    double size = scanner.nextDouble();
                    scanner.nextLine();

                    library.addBook(new EBook(title, author, year, size));
                    break;
                }

                case 3:
                    library.displayBooks();
                    break;

                case 4: {
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    Book found = library.searchByTitle(title);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Book not found.");
                    break;
                }

                case 5: {
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    library.borrowBook(title);
                    break;
                }

                case 6: {
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                }

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        scanner.close();
    }
}
