import java.util.Scanner;

class RotateLeftRight {
    static void rotate(int arr[], int n, int k) {
        k = k % n;
        if (k < 0) {
            k = n + k; // convert right rotation to left
        }

        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt(); // +ve = left, -ve = right

        rotate(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
