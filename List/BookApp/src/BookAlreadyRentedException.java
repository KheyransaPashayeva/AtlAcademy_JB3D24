class BookAlreadyRentedException extends Exception {
    public BookAlreadyRentedException(String message) {
        super(message);
    }
}