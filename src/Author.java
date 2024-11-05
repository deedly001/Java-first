public class Author {

  private String authorSurname;
  private String authorName;

  public Author(String authorSurname, String authorName) {
    this.authorSurname = authorSurname;
    this.authorName = authorName;
  }

  public String getAuthor() {
    return String.join(" ", authorSurname, authorName);
  }

//  public String getAuthorName() {
//    return authorName;
//  }
//
//  public void setAuthorName(String name) {
//    this.authorName = name;
//  }
//
//  public void setAuthorSurname(String Surname) {
//    this.authorSurname = Surname;
//  }


}

