public class Book {

  private String bookName;
  private Author bookAuthor;
  private int publishingYear;

  public Book(String bookName, Author bookAuthor, int publishingYear) {
    this.bookName = bookName;
    this.publishingYear = publishingYear;
    this.bookAuthor = bookAuthor;
  }

  public String getBookName() {
    return this.bookName;
  }

  public String getBookAuthor() {
    return String.join(" ", bookAuthor.getAuthorSurname(), bookAuthor.getAuthorName());
  }

  public int getPublishingYear() {
    return this.publishingYear;
  }

  public void setPublishingYear(int age) {
    this.publishingYear = age;
  }

}

