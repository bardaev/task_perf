public class Multiplication {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            table[i][0] = i + 1;
            table[0][i] = i + 1;
        }

        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                table[i][j] = table[0][j] * table[i][0];
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
