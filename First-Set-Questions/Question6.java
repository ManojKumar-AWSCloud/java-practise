class Question6 {
    public static void main(String[] args) {
        for (int i=1; i<5; i++)
        {
            int b=4-i;
            for (int a=1; a<=b; a++)
            {
                System.out.print(" ");
            }
            
            for (int j=1; j<=i; j++)
            {
                System.out.print(" " + i);
            }
            System.out.print("\n");
        }
    }
}
