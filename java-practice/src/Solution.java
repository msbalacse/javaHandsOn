class Solution
{
    static public int findMaxSum(int houses[], int n){
        if (n == 0)
            return 0;

        int prevMax = 0,currMax = 0,maxAmount=0;

        for (int i = 0; i < n; i++) {
            maxAmount = Math.max(currMax, prevMax + houses[i]);
            prevMax = currMax;
            currMax = maxAmount;
        }

        return maxAmount;
    }

    public static void main(String[] args) {
        int[] houses = {9,4,11,12,6,12};

        System.out.println(findMaxSum(houses,6));
    }
}
