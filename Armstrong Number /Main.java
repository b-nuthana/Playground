#include <stdio.h>
int main() {
	//Type your code
  int n,i,b,a,sum=0,t;
  scanf("%d",&n);
  t=n;
  while(n>0)
  {
    b=n%10;
    a=b*b*b;
    sum=sum+a;
    n=n/10;
  }
 //printf("%d",sum);
  if(t==sum)
  {
    printf("Armstrong Number");
  }
  else
    printf("Not an Armstrong Number");
return 0;
}