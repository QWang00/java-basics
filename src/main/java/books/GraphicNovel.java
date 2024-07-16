package books;

public class GraphicNovel extends Book {
    private String illustrator;

    public GraphicNovel(String title, int pages, String illustrator) {
        super(title, pages);
        this.illustrator = illustrator;
    }

    public GraphicNovel(String title, int pages, int currentPage, String illustrator) {
        super(title, pages, currentPage);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

    @Override
    public String toString() {
        return "GraphicNovel{" +
                "illustrator='" + illustrator + '\'' +
                ", title='" + getTitle() + '\'' +
                ", pages=" + getPages() +
                '}';
    }
}
