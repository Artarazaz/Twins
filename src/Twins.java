import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        int sum = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int coin = scanner.nextInt();
            coins[i] = coin;
            sum = sum + coin;
        }
        int k;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (coins[i] < coins[j]){
                    k = coins[i];
                    coins[i] = coins[j];
                    coins[j] = k;
                }
            }
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = coins[i] + x;
            result++;
            if (x > sum/2){
                break;
            }
        }
        System.out.println(result);
    }
}
