import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EchoChamber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строки");

        List<String> list = new ArrayList<>();

        String str = "";
        while (!(str = scan.nextLine()).equals("")) {
            list.add(str);
        }

        list.forEach(System.out::println);
    }
}
