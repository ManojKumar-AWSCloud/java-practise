class Question3 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int count =0;
        for (int i=3; i<nums1.length; i++)
        {
            nums1[i] = nums2[count];
            count++;
        }
        for (int i=0; i<nums1.length; i++)
        {
            System.out.print(nums1[i]);
        }
        System.out.println("\n");
        System.out.println("---------------After Merging and Sorting---------");
        int temp;
        for (int i=0; i<nums1.length; i++)
        {
            for (int j=1+i; j<nums1.length; j++)
            {
                if (nums1[i]>nums1[j])
                {
                    temp = nums1[j];
                    nums1[j] = nums1 [i];
                    nums1[i] = temp;
                }
            }
        }
        for (int i=0; i<nums1.length; i++)
        {
            System.out.print(nums1[i]);
        }
        
    }
}