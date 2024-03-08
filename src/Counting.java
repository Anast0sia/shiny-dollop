import java.util.*;

public class Counting {
    private int dec;
    private int system;
    List<Integer> list = new LinkedList<>();

    public Counting(int dec) {
        this.dec = dec;
    }

    public void setSystem(int system) {
        if (system < 2 || system > 9) {
            return;
        }
        this.system = system;
    }

    public void method() {
        try {
            while (dec >= system) {
                int number = dec % system;
                dec = dec / system;
                list.add(number);
            }
            list.add(dec);
            Collections.reverse(list);
            System.out.print("Число в " + system + "-ной системе: ");
            for (Integer integer : list) {
                System.out.print(integer);
            }
        } catch (Exception e) {
            System.out.print("Недопустимая система счисления");
        }
    }
}
