package 信息安全;

public class 信息安全 
{
	public static void main(String[] args) 
	{

long n=4294967297L;
int i;	
long fn=0;
int p = 0,q = 0; 
int d;
int e;
for (i=2;i<=n;i++)	
{ 
	while(n%i==0&&n!=i)	
	{	
		System.out.printf	("%d\n",i);	
		n=n/i;
		p=i;
	} 
	if(n==i)	
		System.out.printf("%d\n",i); 
	q=i;
}
 fn = (p-1)*(q-1);
 System.out.printf("%d", fn);
}
}
	
