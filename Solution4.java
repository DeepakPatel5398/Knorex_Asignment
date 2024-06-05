package Solutions;

public class Solution4 {
	 public int printPrisonerToWarn(int n, int m, int s) {
	        return (s + m - 2) % n + 1;
	    }
	    public static void main(String[] args) {
	    	Solution4 candyDistribution = new Solution4();
	        System.out.println(candyDistribution.printPrisonerToWarn(5, 2, 1));
	        System.out.println(candyDistribution.printPrisonerToWarn(5, 2, 2));
	    }

}
