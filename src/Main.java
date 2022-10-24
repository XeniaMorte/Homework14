public class Main {
    public static void main(String[] args) {
        Book f1=new Book("Война и мир",new Author("Лев","Толстой"),1763);
        Book f2=new Book("Идиот",new Author("Федор","Достоевский"),1767);
f1.setName(" Билиберда");
        System.out.println(f1.getName());
    }
}