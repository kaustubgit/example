//strong number
import java.util.Scanner;

class StrongNum
{
public boolean isStrongNum(int n)
{
int total=0;
int temp=n;
do
   {
    int d=n%10;
    total=total+fact(d);
    n=n/10;
   }while(n!=0);
 return total==temp;
}
public  int fact(int d)
{
int temp=1;
for(int i=d; i>1; i--)
     {
     temp=temp*i;
     }
return temp;
}
public  static void main(String [] args)
{
StrongNum sn=new StrongNum();
Scanner sc=new Scanner(System.in);
System.out.println("Finding Strong number");
System.out.println("Enter the number");
int num=sc.nextInt();
boolean b=sn.isStrongNum(num);
if(b==true)
   {
   System.out.println("Strong number");
   }
else
   {
   System.out.println("Not a Strong number");
   }
}
}