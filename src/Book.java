import java.util.Objects;

public class Book {

  private String bookName;
  private Author bookAuthor;
  private int publishingYear;

  public Book(String bookName, Author bookAuthor, int publishingYear) {
    this.bookName = bookName;
    this.publishingYear = publishingYear;
    this.bookAuthor = bookAuthor;
  }

//  public String toString(){
//    return this.
//  }

  @Override
  public String toString() {
    return "Book{" +
        "bookName='" + bookName + '\'' +
        ", bookAuthor=" + this.bookAuthor.toString() +
        ", publishingYear=" + publishingYear +
        '}';
  }


//  public String getBookAuthor() {
//    return String.join(" ", bookAuthor.getAuthorSurname(), bookAuthor.getAuthorName());
//  }

  public String getName() {
    return this.bookName;
  }

  public Integer getPublishingYear() {
    return this.publishingYear;
  }


  public void setPublishingYear(int age) {
    this.publishingYear = age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Book book = (Book) obj;
    return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName)
        && Objects.equals(bookAuthor, book.bookAuthor) && (this.hashCode() == obj.hashCode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookName, bookAuthor, publishingYear);
  }
}

