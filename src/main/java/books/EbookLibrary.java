package books;

import java.util.ArrayList;
import java.util.List;

public class EbookLibrary {
    private List<Ebook> ebooks;

    public EbookLibrary() {
        this.ebooks = new ArrayList<>();
    }

    public void depositEbook(Ebook ebook) {
        if (!ebooks.contains(ebook)) {
            ebooks.add(ebook);
        }
    }

    public boolean withdrawEbook(Ebook ebook) {
        return ebooks.remove(ebook);
    }

    public List<Ebook> getEbooks() {
        return ebooks;
    }

    public void listEbooks() {
        System.out.println("Ebooks:");
        for (Ebook ebook : ebooks) {
            System.out.println(ebook);
        }
    }
}