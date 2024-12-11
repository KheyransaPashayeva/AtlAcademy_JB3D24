import java.util.*;

import java.util.*;

class Library {
    private ArrayList<Book> books; // Bütün kitablar
    private Map<String, Set<Book>> booksByGenre; // Janr üzrə kitablar
    private Set<Book> rentedBooks; // İcarəyə götürülmüş kitablar

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.booksByGenre = new HashMap<>();
        this.rentedBooks = new HashSet<>();
    }

    // Yeni kitab əlavə et
    public void addBook(String genre, Book book) {
        // Ümumi siyahıya əlavə
        books.add(book);

        // Janr üzrə siyahıya əlavə
        booksByGenre.putIfAbsent(genre, new HashSet<>());
        Set<Book> genreBooks = booksByGenre.get(genre);
        if (genreBooks.add(book)) {
            System.out.println("'" + book.getTitle() + "' kitabxanaya əlavə edildi (Janr: " + genre + ").");
        } else {
            System.out.println("'" + book.getTitle() + "' artıq bu janrda mövcuddur.");
        }
    }

    // Bütün mövcud kitabları çap et
    public void showAvailableBooks() {
        System.out.println("\nMövcud kitablar:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    // Janr üzrə kitabları çap et
    public void showBooksByGenre(String genre) {
        System.out.println("\nJanr: " + genre);
        Set<Book> genreBooks = booksByGenre.get(genre);
        if (genreBooks != null) {
            for (Book book : genreBooks) {
                System.out.println(book);
            }
        } else {
            System.out.println("Bu janrda kitab yoxdur.");
        }
    }

    // Kitabı janr və adla icarəyə götür
    public void rentBook(String genre, String title) throws BookNotFoundException, BookAlreadyRentedException {
        Set<Book> genreBooks = booksByGenre.get(genre);
        if (genreBooks == null) {
            throw new BookNotFoundException("Janr '" + genre + "' tapılmadı.");
        }

        for (Book book : genreBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (rentedBooks.contains(book)) {
                    throw new BookAlreadyRentedException("'" + title + "' artıq icarədədir.");
                }
                book.rent();
                rentedBooks.add(book);
                return;
            }
        }

        throw new BookNotFoundException("'" + title + "' kitabxanada tapılmadı.");
    }

    // Kitabı janr və adla geri qaytar
    public void returnBook(String genre, String title) throws BookNotFoundException {
        Set<Book> genreBooks = booksByGenre.get(genre);
        if (genreBooks == null) {
            throw new BookNotFoundException("Janr '" + genre + "' tapılmadı.");
        }

        for (Book book : genreBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!rentedBooks.remove(book)) {
                    System.out.println("'" + title + "' artıq geri qaytarılmışdır.");
                    return;
                }
                book.returnBook();
                return;
            }
        }

        throw new BookNotFoundException("'" + title + "' kitabxanada tapılmadı.");
    }

    // Bütün kitab siyahısını çap et
    public void showAllBooks() {
        System.out.println("\nBütün kitablar:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
