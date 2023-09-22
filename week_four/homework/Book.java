public class Book {
    //Put instance variables below this line.  

    public String author;
    public String title;
    public String publisher;
    public String phoneNumber;
    public int pages;

    public void setAuthor(String a) {
        author = a;
    }

    public void setTitle(String ti) {
        title = ti;
    }

    public void setPublisher(String pub) {
        publisher = pub;
    }

    public void setPhoneNumber(String pn) {
        phoneNumber = pn;
    }

    public void setPages(int pgs) {
        pages = pgs;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPages() {
        return pages;
    }

    public void printBookData() {
        System.out.print(author);
        System.out.print(title);
        System.out.print(pages);
        System.out.print(publisher);
        System.out.println(phoneNumber);
    }

}
