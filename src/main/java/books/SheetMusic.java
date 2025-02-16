package books;

public class SheetMusic extends Book {
    private String composer;

    public SheetMusic(String title, int pages, String composer) {
        super(title, pages);
        this.composer = composer;
    }

    public SheetMusic(String title, int pages, int currentPage, String composer) {
        super(title, pages, currentPage);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }

    @Override
    public String toString() {
        return "SheetMusic{" +
                "composer='" + composer + '\'' +
                ", title='" + getTitle() + '\'' +
                ", pages=" + getPages() +
                '}';
    }
}
