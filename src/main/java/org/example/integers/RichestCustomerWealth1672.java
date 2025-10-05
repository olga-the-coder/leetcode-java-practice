package org.example.integers;

public class RichestCustomerWealth1672 {
        public static int maximumWealth(int[][] accounts) {
            int[] sum = new int[accounts.length];
            for (int i = 0; i < accounts.length; i++) {
                int temp = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    temp = temp + accounts[i][j];
                }
                sum[i] = temp;
            }

            int wealth = sum[0];
            for (int k = 1; k < sum.length; k++) {
                if (sum[k] > wealth) {
                    wealth = sum[k];
                }
            }
            return wealth;
    }

    public static void main(String[] args) {
            int[][] accounts = {{1,2,3},{3,2,1}};
            System.out.println(maximumWealth(accounts));
    }
}
