//amstrong number
import java.util.Scanner;

class AmstrongNum
{
public boolean findAmst(int n)
{
int total=0;
int tmp=n;
int dc=countDig(n);
do
  {
   int d=n%10;
   total=total+power(d,dc);
   n=n/10;
  }while(n!=0);
return total==tmp;
}
public int countDig(int num)
{
int count=0;
do
   {
    count++;
    num=num/10;
   }while(num!=0);
return count++;
}
public int power(int d, int dc)
{
int temp=1;
do
   {
    temp=temp*d;
    dc--;
   }while(dc!=0);
return temp;
}
public static void main(String [] args)
{
AmstrongNum an=new AmstrongNum();
Scanner sc=new Scanner(System.in);
System.out.println("To check the number is Amstrong ");
System.out.println("enter the number");
int num=sc.nextInt();
boolean b=an.findAmst(num);
if (b==true)
  {
  System.out.println("Amstrong number");
  }
else
  {
   System.out.println("Not a Amstrong number");
  }
}
}