class Question8 {
    public static void main(String[] args) {
        int[] value = {4, 3, 2, 7, 8, 2, 3, 1};
        int [] frequency = new int [value.length];
        
        
        for (int i=0; i<value.length; i++)
        {
            int count = 1;
            for (int j=1+i; j<value.length; j++)
            {
                if (value[i] == value[j])
                {
                    frequency[j] = -1;
                    count++;
                }
            }
            if (frequency[i]==0)
            {
            frequency[i] = count;
            }
        }
        for (int i=0; i<value.length; i++)
        {
            System.out.print(value[i]);
        }
        System.out.println("\n");
        for (int i=0; i<value.length; i++)
        {
            System.out.print(frequency[i]);
        }
        System.out.println("\n");
        for (int i=0; i<frequency.length; i++)
        {
            if(frequency[i]>=2)
            {
                System.out.println("Duplication Value = " + value[i] + " ");
            }
        }
    }
}