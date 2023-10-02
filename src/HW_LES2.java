import java.util.Scanner;

public class HW_LES2 {
    public static void main(String[] args) {
        // method1();
        // method2();
        // method3();
        //method4();
    }
    /*
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа
        (типа float), и возвращает введенное значение.
        Ввод текста вместо числа не должен приводить к падению приложения,
        вместо этого, необходимо повторно запросить у пользователя ввод данных.

     */
    private static void method1(){
        try {
            Scanner iscan = new Scanner(System.in);
            System.out.println("Введите дробное число (через ,): ");
            float value = iscan.nextFloat();
            System.out.printf("Введено значение " + value);
            iscan.close();
        } catch (Exception e) {
            System.out.println("Данные некорректные, повторите ввод ");
            method1();
        }
    }
    /*
    Если необходимо, исправьте данный код
     */
    private static void method2() {
        try {
            int[] intArray = {1,2,3,4,5,6,7,8,9,10};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
    /*
    Дан следующий код, исправьте его там, где требуется
     */
    private static void method3(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль" + ex);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }

    }
    private static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    private static void method4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        try {
            if(str.isEmpty()){
                throw new Exception("пустые строки вводить нельзя");
            }
            System.out.println("Введена строка: " + str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            method4();
        }
        finally {
            scanner.close();
        }

    }




}