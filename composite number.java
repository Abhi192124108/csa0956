import java.util.Scanner;
class finding
{
   int flag,n;
   finding()
     {
       System.out.print("Enter range to find the composite numbers:");
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       for(int i=2;i<=n;i++)
        {
            flag=0;
           for(int j=2;j<i;j++)
             {
                 if(i%j ==0)
                    flag++;
             }
           if(flag!=0)
            System.out.println("one of the composite number is:" + i);
        }
    }
}
class composite
{
   public static void main(String a[])    
      {
           finding ob=new finding();
      }
}
