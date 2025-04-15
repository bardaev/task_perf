import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOChamber {
    public static void main(String[] args) {
        if (args.length == 0) {
            printStrings();
        } else {
            try (BufferedReader strReader = new BufferedReader(new FileReader(Paths.get(args[0]).toAbsolutePath().toString()));) {
                String line;
                List<String> list = new ArrayList<>();
                while ((line = strReader.readLine()) != null) {
                    list.add(line);
                }
                list.forEach(System.out::println);
            } catch (Exception e) {
                System.out.println("Файл не найден!");
            }
        }
    }

    static void printStrings() {
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
