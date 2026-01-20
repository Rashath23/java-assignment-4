import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 2, c = 2;
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        boolean equal = true;

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (a[i][j] != b[i][j])
                    equal = false;

        if (equal)
            System.out.println("Matrices are Equal");
        else
            System.out.println("Matrices are Not Equal");
    }
}
