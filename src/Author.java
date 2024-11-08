import java.util.Objects;

public class Author {

  private String authorSurname;
  private String authorName;

  public Author(String authorSurname, String authorName) {
    this.authorSurname = authorSurname;
    this.authorName = authorName;
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getAuthorSurname() {
    return authorSurname;
  }

  @Override
  public String toString() {
    return "Author{" +
        "authorSurname='" + authorSurname + '\'' +
        ", authorName='" + authorName + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Author author)) {
      return false;
    }
    return Objects.equals(authorSurname, author.authorSurname) && Objects.equals(
        authorName, author.authorName) && (this.hashCode() == obj.hashCode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorSurname, authorName);
  }

  //  public void setAuthorName(String name) {
//    this.authorName = name;
//  }
//
//  public void setAuthorSurname(String Surname) {
//    this.authorSurname = Surname;
//  }


}

