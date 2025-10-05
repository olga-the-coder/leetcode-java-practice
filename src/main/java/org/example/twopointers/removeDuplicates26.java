package org.example.twopointers;

public class removeDuplicates26 {
    public static int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left + 1;
    }

    public static void main(String[] args) {
        int k = removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
        System.out.println(k);

        int b = removeDuplicates(new int[] {1,1,2});
        System.out.println(b);

    }
}

// Time complexity: O(n), Space Complexity O(1)