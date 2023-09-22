public class BookDriver {
    public static void main(String args[]) {
        Book book1 = new Book();
        book1.setAuthor("Susan Meyers");
        book1.setTitle("Book1");
        book1.setPages(200);
        book1.setPublisher("Publisher1");
        book1.setPhoneNumber("9195550110");

        Book book2 = new Book();
        book2.setAuthor("Mark Jones");
        book2.setTitle("Book2");
        book2.setPages(120);
        book2.setPublisher("Publisher2");
        book2.setPhoneNumber("9195550167");

        Book book3 = new Book();
        book3.setAuthor("Joy Rogers");
        book3.setTitle("Book3");
        book3.setPages(325);
        book3.setPublisher("Publisher3");
        book3.setPhoneNumber("9195550114");

        book1.printBookData();
        book2.printBookData();
        book3.printBookData();
    }
}
