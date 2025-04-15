import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOChamberODD {
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
                printStringsOdd(list);
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

        printStringsOdd(list);
    }

    static void printStringsOdd(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(list.get(i));
            }
        }
    }
}
