import java.io.*;
class perfect
{
public static void main(String args[])throws IOException
{
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader bf=new BufferedReader(in);

int n;
n=Integer.parseInt(bf.readLine());

int sum=0;
for(int i=1;i<n;i++)
{
if(n%i==0)
sum=sum+i
}
if(sum==n)
Systen.out.println("perfect no.");
else
System.out.println("Not a perfect no.");
}
}
