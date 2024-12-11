class Book {
    private String title;
    private String author;
    private boolean available;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // Default olaraq mövcuddur
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    // Kitabı icarəyə götür
    public void rent() throws BookAlreadyRentedException {
        if (!available) {
            throw new BookAlreadyRentedException("'" + title + "' artıq icarəyə götürülüb.");

        } available = false;
            System.out.println("'" + title + "' artıq icarəyə götürülüb.");

    }

    // Kitabı geri qaytar
    public void returnBook() {
        available = true;
        System.out.println("'" + title + "' geri qaytarıldı.");
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + (available ? "Mövcuddur" : "İcarədədir") +
                '}';
    }
}
