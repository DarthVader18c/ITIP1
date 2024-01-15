public class Musical extends Book {
    private int year;

    public Musical(String name, String autor, int pagecount, int price) {
        super(name, autor, pagecount, price);
    }

    public Musical(String name, String autor, int pagecount, int price, int year) {
        super(name, autor, pagecount, price);
        this.year = year;
    }

    public void Println(String name, String autor, int pagecount, int price, int year) {
        System.out.println("Название книги: " + name + " Автор книги: " + autor +" Количество страниц: " + pagecount + " Цена: " + price + "Год издания: " + year);
    }
    @Override
    public void ForWhat(){
        System.out.println("Фильмы подходят ценителям искусства");
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
}
