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

    // Method to convert Library to EbookLibrary
    public EbookLibrary convertToEbookLibrary() {
        EbookLibrary ebookLibrary = new EbookLibrary();
        for (Book book : books) {
            Ebook ebook = new Ebook(book.getTitle(), book.getPages(), book.getCurrentPage(), "default");
            ebookLibrary.depositEbook(ebook);
        }
        for (Ebook ebook : ebooks) {
            ebookLibrary.depositEbook(ebook);
        }
        for (GraphicNovel graphicNovel : graphicNovels) {
            Ebook ebook = new Ebook(graphicNovel.getTitle(), graphicNovel.getPages(), graphicNovel.getCurrentPage(), "default");
            ebookLibrary.depositEbook(ebook);
        }
        for (SheetMusic music : sheetMusic) {
            Ebook ebook = new Ebook(music.getTitle(), music.getPages(), music.getCurrentPage(), "default");
            ebookLibrary.depositEbook(ebook);
        }
        return ebookLibrary;
    }

    // Print books in tabular format
    public void printInventory() {
        System.out.println("Title\t\tPages");
        for (Book book : books) {
            System.out.println(book.getTitle() + "\t\t" + book.getPages());
        }
        for (Ebook ebook : ebooks) {
            System.out.println(ebook.getTitle() + "\t\t" + ebook.getPages());
        }
        for (GraphicNovel graphicNovel : graphicNovels) {
            System.out.println(graphicNovel.getTitle() + "\t\t" + graphicNovel.getPages());
        }
        for (SheetMusic music : sheetMusic) {
            System.out.println(music.getTitle() + "\t\t" + music.getPages());
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

        System.out.println("Original Library Inventory:");
        System.out.println("Title\t\tPages");
        library.printInventory();

        // Convert Library to EbookLibrary
        EbookLibrary ebookLibrary = library.convertToEbookLibrary();
        System.out.println("\nEbookLibrary Inventory:");
        System.out.println("Title\t\tPages\t\tFile Type");
        for (Ebook ebook : ebookLibrary.getEbooks()) {
            System.out.println(ebook.getTitle() + "\t\t" + ebook.getPages() + "\t\t" + ebook.getFileType());
        }
    }
}
