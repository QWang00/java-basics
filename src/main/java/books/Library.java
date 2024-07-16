package books;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Ebook> ebooks;
    private List<GraphicNovel> graphicNovels;
    private List<SheetMusic> sheetMusic;

    public Library() {
        books = new ArrayList<>();
        ebooks = new ArrayList<>();
        graphicNovels = new ArrayList<>();
        sheetMusic = new ArrayList<>();
    }

    // Methods to deposit books
    public void depositBook(Book book) {
        books.add(book);
    }

    public void depositEbook(Ebook ebook) {
        ebooks.add(ebook);
    }

    public void depositGraphicNovel(GraphicNovel graphicNovel) {
        graphicNovels.add(graphicNovel);
    }

    public void depositSheetMusic(SheetMusic music) {
        sheetMusic.add(music);
    }

    // Methods to withdraw books
    public boolean withdrawBook(Book book) {
        return books.remove(book);
    }

    public boolean withdrawEbook(Ebook ebook) {
        return ebooks.remove(ebook);
    }

    public boolean withdrawGraphicNovel(GraphicNovel graphicNovel) {
        return graphicNovels.remove(graphicNovel);
    }

    public boolean withdrawSheetMusic(SheetMusic music) {
        return sheetMusic.remove(music);
    }

    // Methods to list all books
    public void listBooks() {
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listEbooks() {
        System.out.println("Ebooks:");
        for (Ebook ebook : ebooks) {
            System.out.println(ebook);
        }
    }

    public void listGraphicNovels() {
        System.out.println("Graphic Novels:");
        for (GraphicNovel graphicNovel : graphicNovels) {
            System.out.println(graphicNovel);
        }
    }

    public void listSheetMusic() {
        System.out.println("Sheet Music:");
        for (SheetMusic music : sheetMusic) {
            System.out.println(music);
        }
    }

    // Methods to get all books
    public List<Book> getBooks() {
        return books;
    }

    // Methods to get all ebooks
    public List<Ebook> getEbooks() {
        return ebooks;
    }

    // Methods to get all graphic novels
    public List<GraphicNovel> getGraphicNovels() {
        return graphicNovels;
    }

    // Methods to get all sheet music
    public List<SheetMusic> getSheetMusic() {
        return sheetMusic;
    }

    // Method to convert a book to an Ebook
    public void convertToEbook(Book book, String fileType) {
        if (!(book instanceof Ebook)) {
            Ebook ebook = new Ebook(book.getTitle(), book.getPages(), book.getCurrentPage(), fileType);
            if (books.contains(book)) {
                books.remove(book);
                books.add(ebook);
            }
            ebooks.add(ebook);
        } else {
            System.out.println("The book is already an Ebook.");
        }
    }

    // Main method to test the Library class
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Gone With the Wind", 678);
        Ebook ebook1 = new Ebook("Digital Fortress", 356, "PDF");
        GraphicNovel graphicNovel1 = new GraphicNovel("The Killing Joke", 128, "Brian Bolland");
        SheetMusic sheetMusic1 = new SheetMusic("Fur Elise", 10, "Beethoven");

        library.depositBook(book1);
        library.depositEbook(ebook1);
        library.depositGraphicNovel(graphicNovel1);
        library.depositSheetMusic(sheetMusic1);

        System.out.println("Listing all books:");
        library.listBooks();
        System.out.println();

        System.out.println("Listing all ebooks:");
        library.listEbooks();
        System.out.println();

        System.out.println("Listing all graphic novels:");
        library.listGraphicNovels();
        System.out.println();

        System.out.println("Listing all sheet music:");
        library.listSheetMusic();
        System.out.println();

        // Convert a book to an Ebook
        library.convertToEbook(book1, "EPUB");
        System.out.println("After converting a book to an Ebook:");
        System.out.println("Listing all books:");
        library.listBooks();
        System.out.println("Listing all ebooks:");
        library.listEbooks();
    }
}