#include <stdio.h>
int main()
{
	//Type your code
  int n,j,a,k,sum=0;
  scanf("%d",&n);
  int t=n;
  while(n!=0)
  {
    a=n%10;
    k=1;
    for(j=1;j<=a;j++)
    {
      ;
      k=k*j;
    }
    sum=sum+k;
    n=n/10;
  }
  //printf("%d",sum);
  if(sum==t)
    printf("Yes");
  else
    printf("No");
return 0;
}