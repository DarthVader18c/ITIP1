public abstract class Book{
    private String name;
    private String autor;
    private int pagecount;
    private int price;


    public Book(String name, String autor, int pagecount, int price) {
        this.name = name;
        this.autor = autor;
        this.pagecount = pagecount;
        this.price = price;
    }
    public abstract void ForWhat();
}
    