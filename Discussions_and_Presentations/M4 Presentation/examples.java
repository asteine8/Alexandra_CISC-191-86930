public class Book {
    public void outputContents() {
        System.out.println("Booky Book");
    }
    public final void jump() {
        System.out.println("Can't jump");
    }
}
public class TextBook extends Book {
    @Override
    public void outputContents() {
        System.out.println("Textbooky Textbook");
    }
}
Book book1 = new Book();
Book book2 = new TextBook();
book1.outputContents(); // Outputs "Booky Book"
book2.outputContents(); // "Textbooky Textbook"

public abstract class Book {
    public abstract void outputContents();
}
public class TextBook extends Book {
    @Override
    public void outputContents() {
        System.out.println("Textbooky Textbook");
    }
}
public class PictureBook extends Book {
    @Override
    public void outputContents() {
        System.out.println("pic book");
    }
}
Book book1 = new PictureBook();
Book book2 = new TextBook();

interface Book {
    public void outputContents();
}
public class TextBook implements Book {
    public void outputContents() {
        System.out.println("Textbooky Textbook");
    }
}
public class PictureBook implements Book {
    public void outputContents() {
        System.out.println("pic book");
    }
}
Book book1 = new PictureBook();
Book book2 = new TextBook();

public class Book {
    protected int numPages;
}

public class TextBook extends Book {
    public int getNumPages() {
        return super.numPages;
    }
}

public class PictureBook {
    private final int additionalPages = 10;

    public int getNumPages() {
        return super.numPages + additionalPages;
    }
}