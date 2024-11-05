public class App {

  public static void main(String[] args) {
    Author Sierra = new Author("Sierra", "Kathy");
    Book HeadFirstJava = new Book("HeadFirstJava", Sierra, 2015);
    System.out.println("HeadFirstJava.getBookName() = " + HeadFirstJava.getBookName());
    System.out.println("HeadFirstJava.getBookAuthor() = " + HeadFirstJava.getBookAuthor());
    System.out.println("HeadFirstJava.getBookSince() = " + HeadFirstJava.publishingYear());
    HeadFirstJava.setPublishingYear(2019);
    System.out.println("HeadFirstJava.getBookSince() = " + HeadFirstJava.publishingYear());

    Author Hortsmann = new Author("Hortsmann", "Key");
    Book JavaBible = new Book("JavaBible", Hortsmann, 2019);
    System.out.println("JavaBible.getBookName() = " + JavaBible.getBookName());
    System.out.println("JavaBible.getBookAuthor() = " + JavaBible.getBookAuthor());
    System.out.println("JavaBible.getBookSince() = " + JavaBible.publishingYear());
    JavaBible.setPublishingYear(2012);
    System.out.println("JavaBible.getBookSince() = " + JavaBible.publishingYear());
  }
}

