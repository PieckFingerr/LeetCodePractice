package Problems;

public class _70_Climbing_Stairs {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
        }

    public static void main(String[] args) {
        int n = 2;
        int total = climbStairs(n);
        System.out.println(total);
    }
}
