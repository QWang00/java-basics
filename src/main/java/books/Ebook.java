package books;

public class Ebook extends Book {

    private String webAddress;

    public void setAddress (String webAddress) {
        this.webAddress = webAddress;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public Ebook(String webAddress) {
        this.webAddress = webAddress;
    }

    public Ebook(String title, int pages, String webAddress) {
        super(title, pages);
        this.webAddress = webAddress;
    }

    public Ebook(String title, int pages, int currentPage, String webAddress) {
        super(title, pages, currentPage);
        this.webAddress = webAddress;
    }


    @Override
    public String toString() {
        return "Ebook{" +
                "webAddress='" + webAddress + '\'' +
                '}';
    }
}
