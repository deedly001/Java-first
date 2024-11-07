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

  public String toString() {
    String result = String.join(" ", this.bookName, this.bookAuthor.toString(),
        String.valueOf(this.publishingYear));
    return result;
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

  public boolean isEquals(Book obj) {
    if ((this.getName().equals(obj.getName())) && (this.getPublishingYear()
        .equals(obj.getPublishingYear()))) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isHashCode(Book obj) {
    if (this.hashCode() == obj.hashCode()) {
      return true;
    } else {
      return false;
    }
  }
}

