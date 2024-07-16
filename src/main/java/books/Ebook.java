package books;

public class Ebook extends Book {
    private String fileType;

    public Ebook(String title, int pages, String fileType) {
        super(title, pages);
        this.fileType = fileType;
    }

    public Ebook(String title, int pages, int currentPage, String fileType) {
        super(title, pages, currentPage);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "fileType='" + fileType + '\'' +
                ", title='" + getTitle() + '\'' +
                ", pages=" + getPages() +
                '}';
    }
}
