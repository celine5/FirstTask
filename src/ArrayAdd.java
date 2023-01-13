public class ArrayAdd {
    int even[] = new int[50];
    int odd[] = new int[50];

    public void generateeven()
    {
        int j=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {   System.out.println("Populating even numbers");
                even[j]=i;
                j++;
            }
        }
    }
    public void generateodd()
    {
        int j=0;
        for(int i=1;i<=100;i++)
        {
            System.out.println("Populating odd numbers");
            if(i%2!=0)
            {
                odd[j]=i;
                j++;
            }
        }
    }

    public void displayArrays() {
        System.out.println("Displaying the arrays");
        for(int m:even)
        {
            System.out.println(m);
        }
        for(int k:odd)
        {
            System.out.println(k);
        }
    }
}
