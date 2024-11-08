import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    Author Sierra = new Author("Sierra", "Kathy");
    Book firstBook = new Book("HeadFirstJava", Sierra, 2015);

    Author Hortsmann = new Author("Hortsmann", "Key");
    Book secondBook = new Book("JavaBible", Hortsmann, 2019);

    System.out.println(firstBook.toString());
    System.out.println(secondBook.toString());

    System.out.println(
        "сравниваем книгу " + firstBook.getName() + " и книгу " + firstBook.getName() + " = "
            + firstBook.equals(firstBook));
    System.out.println(
        "сравниваем книгу " + firstBook.getName() + " и книгу " + secondBook.getName() + " = "
            + firstBook.equals(secondBook));
    System.out.println(
        "сравниваем автора " + Sierra + " и автора " + Sierra + " = " + Sierra.equals(Sierra));
    System.out.println(
        "сравниваем автора " + Sierra + " и автора " + Hortsmann + " = " + Sierra.equals(
            Hortsmann));



  }
}

