package books;

public class GraphicNovel extends Book {

    private String illustrator;

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public GraphicNovel(String illustrator) {
        this.illustrator = illustrator;
    }

    public GraphicNovel(String title, int pages, String illustrator) {
        super(title, pages);
        this.illustrator = illustrator;
    }

    public GraphicNovel(String title, int pages, int currentPage, String illustrator) {
        super(title, pages, currentPage);
        this.illustrator = illustrator;
    }

    @Override
    public String toString() {
        return "GraphicNovel{" +
                "illustrator='" + illustrator + '\'' +
                "title: " + super.getTitle() +
                "pages: " + super.getPages() +
                "current page: " + super.getCurrentPage() +
                '}';
    }
}
