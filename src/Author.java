public class Author {
    String name;
    String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return " Автор" + " " + name + " " + surname;
    }

    public boolean equals(Author author) {
        return author != null &&
                getName().equals(author.getName()) &&
                getSurname().equals(author.getSurname());

    }

    @Override
    public boolean equals(Object obj) {
        return obj != null &&
                obj.getClass() == this.getClass() &&
                this == obj;
    }
}
