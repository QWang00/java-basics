package books;

public class Book {

    private String title;
    private int pages;
    private int currentPage;

    Book (String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.currentPage = 1;
    }

    public void turnPage() {
        currentPage++;
    }
}
