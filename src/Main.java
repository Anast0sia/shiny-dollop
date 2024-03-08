import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число в десятичной системе счисления (или end для выхода): ");
            String str = scanner.next();
            if (str.equalsIgnoreCase("end")){
                break;
            }
            int dec;
            int system;
            try {
                dec = Integer.parseInt(str);
            } catch (Exception e){
                meth();
                continue;
            }
            System.out.print("Введите систему счисления: ");
            try {
                system = scanner.nextInt();
            } catch (Exception e){
                meth();
                continue;
            }
            Counting count = new Counting(dec);
            count.setSystem(system);
            count.method();
            System.out.println();
            System.out.println();
        }
    }
    public static void meth(){
        System.out.println("Вы ввели недопустимое значение");
        System.out.println();
    }
}