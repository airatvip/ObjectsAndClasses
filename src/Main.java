public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Антон", "Чехов");
        Author author2 = new Author("Федор", "Достоевский");
        Book book1 = new Book("Вишневый сад", 1904, author1);
        Book book2 = new Book("Преступление и наказание", 1866, author2);

        int newYearBook = 1905;
        book1.setYearBook(newYearBook);

        System.out.println(book1.getNameBook() + ", " + book1.getYearBook() + ", " + book1.getAuthor());
        System.out.println(book2.getNameBook() + ", " + book2.getYearBook() + ", " + book2.getAuthor());

    }
}