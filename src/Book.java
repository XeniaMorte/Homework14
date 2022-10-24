public class Book {
    String name;
    Author author;
    Integer yearPuplication;
    public Book (String name,Author author,Integer yearPuplication){
        this.author=author;
        this.yearPuplication=yearPuplication;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYearPuplication(Integer yearPuplication) {
        this.yearPuplication = yearPuplication;
    }

    public Integer getYearPuplication() {
        return yearPuplication;
    }
}
