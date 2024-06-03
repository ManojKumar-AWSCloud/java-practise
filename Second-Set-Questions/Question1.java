public class Question1 {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7};
        int [] nums01 = new int [nums.length];
        int k = 3;
        int count = 0;
        
        for (int i=k+1; i<nums.length; i++)
        {
            nums01 [count] = nums[i];
            count++;
        }
        
        for (int i=0; i<=k; i++)
        {
            nums01 [count] = nums[i];
            count++;
        }
        for (int j=0; j<nums01.length; j++)
        {
            System.out.print(nums01[j]);
        }
    }
}