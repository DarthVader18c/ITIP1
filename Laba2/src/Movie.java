public class Movie extends Book{
    private String genre;
    public Movie(String name, String autor, int pagecount, int price){
        super(name,autor,pagecount,price);
    }
    public Movie(String name, String autor, int pagecount, int price,String genre ){
        super(name,autor,pagecount,price);
        this.genre = genre;
    }
    public void Println(String name, String autor,int pagecount, int price, String genre){
        System.out.println("Название книги: " + name + " Автор книги: "+ autor +" Количество страниц: " + pagecount + " Цена: " + price + "Жанр: " + genre);
    }
    @Override
    public void ForWhat(){
        System.out.println("Фильмы подходят тем кто не любит читать книги");
    }
    public String getTime(){
        return genre;
    }
    public void setGenre(String time){
        this.genre = genre;
    }
}
