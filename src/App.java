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
            + firstBook.isEquals(firstBook));
    System.out.println(
        "сравниваем книгу " + firstBook.getName() + " и книгу " + secondBook.getName() + " = "
            + firstBook.isEquals(secondBook));
    System.out.println(
        "сравниваем автора " + Sierra + " и автора " + Sierra + " = " + Sierra.isEquals(Sierra));
    System.out.println(
        "сравниваем автора " + Sierra + " и автора " + Hortsmann + " = " + Sierra.isEquals(
            Hortsmann));

    System.out.println(
        "сравниваем хэш книги " + firstBook.getName() + " и книги " + firstBook.getName() + " = " + firstBook.isHashCode(
            firstBook));

    System.out.println(
        "сравниваем хэш книги " + firstBook.getName() + " и книги " + secondBook.getName() + " = " + firstBook.isHashCode(
            secondBook));
    System.out.println(
        "сравниваем хэш автора " + Sierra + " и автора " + Sierra + " = " + Sierra.isHashCode(
            Sierra));
    System.out.println(
        "сравниваем хэш автора " + Sierra + " и автора " + Hortsmann + " = " + Sierra.isHashCode(
            Hortsmann));


  }
}

