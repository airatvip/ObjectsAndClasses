public class Book {
    private String nameBook ;
    private int yearBook;
    private Author author;


    public Book (String nameBook, int yearBook, Author author) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

}
