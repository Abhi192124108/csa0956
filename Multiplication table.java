import java.util.Scanner;
public class Multiplication_Table3{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
int num,range;
System.out.println("Enter the number: ");
num=sc.nextInt();
System.out.println("Enter the range: ");
range=sc.nextInt();
int i=1;
while(i<=range){
System.out.println(num+"x"+i+"="+num*i);
 i++;

            }
        }

    }
