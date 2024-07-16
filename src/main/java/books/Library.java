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

        System.out.println("Withdrawing books:");
        library.withdrawBook(book1);
        library.withdrawEbook(ebook1);
        library.withdrawGraphicNovel(graphicNovel1);
        library.withdrawSheetMusic(sheetMusic1);

        System.out.println("Listing all books after withdrawal:");
        library.listBooks();
        System.out.println();

        System.out.println("Listing all ebooks after withdrawal:");
        library.listEbooks();
        System.out.println();

        System.out.println("Listing all graphic novels after withdrawal:");
        library.listGraphicNovels();
        System.out.println();

        System.out.println("Listing all sheet music after withdrawal:");
        library.listSheetMusic();
    }
}