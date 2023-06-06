import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = new int[N];
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < N; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));

        int temp = arr[0];
        arr[0] = arr[N - 1];
        arr[N - 1] = temp;

        System.out.println(Arrays.toString(arr));
            }
        }

