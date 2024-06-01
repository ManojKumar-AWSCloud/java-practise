class Question5 {
    public static void main(String[] args) {
        for (int i=1; i<5; i++)
        {
            int b = 4-i;
            for (int a=1; a<=b; a++)
            {
                System.out.print(" ");
            }
            for (int c=1; c<=i; c++)
            {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        for (int i=1; i<5; i++)
        {
            for (int a=1; a<i; a++)
            {
                System.out.print(" ");
            }
            for (int j=4; j>=i; j--)
            {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

    }
}
