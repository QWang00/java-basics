package books;

import java.util.Random;

public class Book {

    private String title;
    private int pages;
    private int currentPage;

    public static void main(String[] args) {

        Book book = new Book("\"Gone With the Wind\"", 678, 291);

        System.out.println("The book is: " + book.getTitle());
        System.out.println("The current page: " + book.getCurrentPage());

        Random random = new Random();
        book.setCurrentPage(random.nextInt(book.getPages()));
        System.out.println("The new current page: " + book.getCurrentPage() + " in the " + book.getTitle());

    }

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
