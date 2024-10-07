package HashTable;

import java.util.HashSet;
import java.util.Set;

public class _202_Happy_Number {
    private static int sum(int n) {
        int total = 0;
        while(n != 0) {
            int tmp = (n % 10) * (n % 10);
            total += tmp;
            n /= 10;
        } 
        return total;
    }

     public static boolean isHappy(int n) {
        Set<Integer> check = new HashSet<Integer>();
        while(!check.contains(n)) {
            check.add(n);
            n = sum(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int n = 2;
        if (isHappy(n) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
