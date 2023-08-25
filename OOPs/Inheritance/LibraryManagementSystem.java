class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Member {
    private String name;
    private Book[] borrowedBooks;
    private int numBorrowedBooks;

    public Member(String name, int maxBooks) {
        this.name = name;
        borrowedBooks = new Book[maxBooks];
        numBorrowedBooks = 0;
    }

    public String getName() {
        return name;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (numBorrowedBooks < borrowedBooks.length && book.isAvailable()) {
            borrowedBooks[numBorrowedBooks] = book;
            book.setAvailable(false);
            numBorrowedBooks++;
            System.out.println("Book '" + book.getTitle() + "' borrowed by " + name);
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        int index = -1;
        for (int i = 0; i < numBorrowedBooks; i++) {
            if (borrowedBooks[i] == book) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            for (int i = index; i < numBorrowedBooks - 1; i++) {
                borrowedBooks[i] = borrowedBooks[i + 1];
            }
            borrowedBooks[numBorrowedBooks - 1] = null;
            book.setAvailable(true);
            numBorrowedBooks--;
            System.out.println("Book '" + book.getTitle() + "' returned by " + name);
        } else {
            System.out.println("You didn't borrow this book.");
        }
    }
}

class Library {
    private Book[] books;
    private int numBooks;

    public Library(int maxBooks) {
        books = new Book[maxBooks];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        }
    }

    public Book searchBook(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(10);

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Member member1 = new Member("John", 5);
        Member member2 = new Member("Emily", 5);

        library.searchBook("1984"); // Search for a book

        member1.borrowBook(book2); // John borrows a book
        member2.borrowBook(book2); // Emily borrows the same book (not available)

        member1.returnBook(book2); // John returns the book
        member2.borrowBook(book2); // Emily borrows the book (now available)

        // Display borrowed books for each member
        System.out.println(member1.getName() + "'s borrowed books: ");
        for (Book book : member1.getBorrowedBooks()) {
            if (book != null) {
                System.out.println(book.getTitle());
            }
        }
        System.out.println(member2.getName() + "'s borrowed books: ");
        for (Book book : member2.getBorrowedBooks()) {
            if (book != null) {
                System.out.println(book.getTitle());
            }
        }
    }
}
/*
int arr[] = new int[10];
int[] arr;
int []arr;
int[] arr = {1, 2, 3, 4, 5};



int arr[][] = new int[10][10];
int[][] arr;
int [][]arr;
int[] []arr;
int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
*/

/*
Similar Task:

Problem Statement: Online Shopping Cart Management System

You are tasked with developing an Online Shopping Cart Management System that allows users to add products to their cart and calculate the total cost of their purchases. You need to implement the following classes:

1. 'Product' Class:
   - Attributes:
     - 'name' (String): The name of the product.
     - 'price' (double): The price of the product.
     - 'quantity' (int): The quantity of the product the user wants to purchase.
   - Methods:
     - Constructor: Initialize the product with its name, price, and quantity.
     - 'getName()': Returns the name of the product.
     - 'getPrice()': Returns the price of the product.
     - 'getQuantity()': Returns the quantity of the product.
     - 'setQuantity(int quantity)': Sets the quantity of the product.

2. 'Cart' Class:
   - Attributes:
     - 'products' (Product[]): An array to store the products in the cart.
     - 'numProducts' (int): The number of products in the cart.
   - Methods:
     - Constructor: Initializes the cart with a maximum capacity for products.
     - 'addProduct(Product product)': Adds a product to the cart.
     - 'calculateTotal()': Calculates and returns the total cost of all products in the cart.

3. 'OnlineShoppingSystem' Class (Main Class):
   - The 'main' method of this class should demonstrate the usage of the 'Product' and 'Cart' classes.
   - Create instances of 'Product' for different products with names, prices, and quantities.
   - Add products to an instance of the 'Cart' class.
   - Calculate and display the total cost of the products in the cart.

You need to implement these classes and methods according to the provided problem statement. Use object-oriented programming principles to ensure encapsulation and modularity in your code.
*/