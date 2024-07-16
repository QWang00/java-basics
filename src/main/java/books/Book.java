package books;

public class Book {

    private String title;
    private int pages;
    private int currentPage;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.currentPage = 1;
    }

    public Book() {
    }

    public Book(String title, int pages, int currentPage) {
        this.title = title;
        this.pages = pages;
        this.currentPage = currentPage;
    }


    public void turnPage() {
        currentPage++;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * 设置
     * @param pages
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * 获取
     * @return currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置
     * @param currentPage
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public String toString() {
        return "Book{title = " + title + ", pages = " + pages + ", currentPage = " + currentPage + "}";
    }
}
