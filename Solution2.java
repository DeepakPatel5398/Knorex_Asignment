package Solutions;

public class Solution2 {
    public void printTheSequence(int a, int b, int n) {
        int currentSum = a;
        int increment = 1;
        for (int i = 0; i < n; i++) {
            currentSum += increment * b;
            System.out.print(currentSum + " ");
            increment *= 2;
        }
    }
    public static void main(String[] args) {
    	Solution2 seriesGenerator = new Solution2();
        seriesGenerator.printTheSequence(0, 2, 10);
        System.out.println();
        seriesGenerator.printTheSequence(5, 3, 5);
    }
}