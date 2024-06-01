class Question3 {
    public static void main(String[] args) 
	{
        for (int i=1; i<5; i++)
        {    
            int a=4-i;
            for (int j=1; j<=a; j++)
            {
                System.out.print(" ");
            }
 
            for (int b=1; b<=i; b++)
            {
                System.out.print(" *");
            }
            System.out.print("\n");
            
        }
    }
}
