public class Main {
    public static void main(String[] args) {
        // Kitabxananı yaradın
        Library library = new Library();

        // Kitablar əlavə edin
        library.addBook("Programming", new Book("Java Programming", "James Gosling"));
        library.addBook("Programming", new Book("Clean Code", "Robert C. Martin"));
        library.addBook("Programming", new Book("Effective Java", "Joshua Bloch"));
        library.addBook("Fiction", new Book("1984", "George Orwell"));
        library.addBook("Fiction", new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook("Fiction", new Book("Brave New World", "Aldous Huxley"));

        // Mövcud kitabların siyahısını çap edin
        System.out.println("\nMövcud kitablar:");
        library.showAvailableBooks();

        // Bütün kitabların siyahısını çap edin
        System.out.println("\nBütün kitablar:");
        library.showAllBooks();

        // Janr üzrə kitabların siyahısını çap edin
        System.out.println("\n'Programming' janrındakı kitablar:");
        library.showBooksByGenre("Programming");

        // Kitabı icarəyə götür
        try {
            System.out.println("\nKitabı icarəyə götürmək:");
            library.rentBook("Programming", "Clean Code");
            library.rentBook("Fiction", "1984");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // İcarəyə götürülən kitabı yenidən icarəyə götürmə cəhdi
        try {
            System.out.println("\nYenidən icarəyə götürmək cəhdi:");
            library.rentBook("Programming", "Clean Code");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Geri qaytarma
        try {
            System.out.println("\nKitabı geri qaytarmaq:");
            library.returnBook("Programming", "Clean Code");
            library.returnBook("Fiction", "1984");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Geri qaytarılmış kitabı yenidən geri qaytarmaq cəhdi
        try {
            System.out.println("\nYenidən geri qaytarmaq cəhdi:");
            library.returnBook("Programming", "Clean Code");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Mövcud kitabların siyahısını yenidən çap edin
        System.out.println("\nYenilənmiş mövcud kitablar:");
        library.showAvailableBooks();
    }
}
