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

  public String toString() {
    return String.join(" ", this.getAuthorSurname(), this.getAuthorName());
  }

  public boolean isEquals(Author obj) {
    if ((this.getAuthorName().equals(obj.getAuthorName())) && (this.getAuthorSurname()
        .equals(obj.getAuthorSurname()))) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isHashCode(Author obj) {
    if (this.hashCode() == obj.hashCode()) {
      return true;
    } else {
      return false;
    }
  }

//  public void setAuthorName(String name) {
//    this.authorName = name;
//  }
//
//  public void setAuthorSurname(String Surname) {
//    this.authorSurname = Surname;
//  }


}

