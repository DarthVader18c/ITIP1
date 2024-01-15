import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //1 Задание
        int[] array = {12, 3, 1};
        int sum = 0;
        boolean is_Exception = false;
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            array[a] = b;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            sum = sum / array.length;
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Вы вышли за пределы массива");
            is_Exception = true;
        } catch (InputMismatchException ie) {
            System.out.println("Вы ввели не число");
            is_Exception = true;
        }
        if (!is_Exception) {
            System.out.println(sum);
        }

        //2 Задание
        try {
            String a = "C:\\Files_Laba4\\Copy.txt";
            String b = "C:\\Files_Laba4\\Input.txt";

            File f1 = new File(a);
            File f2 = new File(b);
            FileInputStream in = new FileInputStream(f1);
            FileOutputStream out = new FileOutputStream(f2);
            int n;
            while ((n = in.read()) != -1) {

                out.write(n);
            }
            in.close();
            out.close();
            while ((n = in.read()) != -1) {

                out.write(n);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("Не существует файла с таким названием!");
        } catch (IOException e) {
            System.out.println("Ошибка закрытия потока");
        }

        //3 Задача
        try {
            int number = readNumberFromKeyboard();
            System.out.println("Successfully read number: " + number);
        } catch (CustomInputMismatchException e) {
            ExceptionHandler.handleException(e);
        }
    }
    private static int readNumberFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль:");
        String input = scanner.nextLine();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new CustomInputMismatchException("Ошибка.У вас встречаются буквы в пароле. Вводите только цифры");
        }
    }
}