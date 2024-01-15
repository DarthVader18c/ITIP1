import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Название книги: ");
        String name = sc.next();
        System.out.println("Автор книги: ");
        String autor = sc.next();
        System.out.println("Количество Страниц: ");
        int pagecount = sc.nextInt();
        System.out.println("Цена книги: ");
        int price = sc.nextInt();
        System.out.println("Длительность аудиокниги: ");
        int time = sc.nextInt();
        Audio a = new Audio(name, autor, pagecount, price, time);
        a.Println(name, autor, pagecount, price, time);

    }
}
