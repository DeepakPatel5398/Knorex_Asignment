package Solutions;

import java.util.Arrays;

public class Solution3 {
    public boolean isThereASum(int[] arr, int t) {
        Arrays.sort(arr);  // Sort the array
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == t) {
                return true;
            } else if (sum < t) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    	Solution3 checkSum = new Solution3();
        int[] arr1 = {0, -1, 2, -3, 1};
        int[] arr2 = {1, -2, 1, 0, 5};
        System.out.println(checkSum.isThereASum(arr1, -2));
        System.out.println(checkSum.isThereASum(arr2, 0));
    }
}





