public class Audio extends Book{
    private int time;
    public Audio(String name, String autor, int pagecount, int price){
        super(name,autor,pagecount,price);
    }
    public Audio(String name, String autor, int pagecount, int price,int time ){
        super(name,autor,pagecount,price);
        this.time = time;
    }
    public void Println(String name, String autor,int pagecount, int price, int time){
        System.out.println("Название книги: " + name + " Автор книги: "+ autor +" Количество страниц: " + pagecount + " Цена: "+ price + "Время: " + time);
    }
    @Override
    public void ForWhat(){
        System.out.println("Аудио книга подходит как для слепых, так и для тех кому провели операцию на глаза");
    }
    public int getTime(){
        return time;
    }
    public void setTime(int time){
        this.time = time;
    }

}
