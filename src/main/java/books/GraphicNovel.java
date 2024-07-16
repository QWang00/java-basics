package books;

public class GraphicNovel extends Book {

    private String artist;

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public GraphicNovel(String artist) {
        this.artist = artist;
    }

    public GraphicNovel(String title, int pages, String artist) {
        super(title, pages);
        this.artist = artist;
    }

    public GraphicNovel(String title, int pages, int currentPage, String artist) {
        super(title, pages, currentPage);
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "GraphicNovel{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
