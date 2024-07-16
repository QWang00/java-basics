package books;

public class SheetMusic extends Book {

    private String composer;

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public SheetMusic(String composer) {
        this.composer = composer;
    }

    public SheetMusic(String title, int pages, String composer) {
        super(title, pages);
        this.composer = composer;
    }

    public SheetMusic(String title, int pages, int currentPage, String composer) {
        super(title, pages, currentPage);
        this.composer = composer;
    }

    @Override
    public String toString() {
        return "SheetMusic{" +
                "composer='" + composer + '\'' +
                "title: " + getTitle() +
                "pages: " + getPages() +
                "current page: " + getCurrentPage() +
                '}';
    }
}
