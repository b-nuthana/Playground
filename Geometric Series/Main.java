#include<stdio.h>
int main()
{
  //type your code here
  int n,t1,t2,n1,n2,r;
  scanf("%d",&n);
  if((n%2)==1)
  {
    r=2;
    t1=(n+1)/2;
    n1=pow(r,t1-1);
    printf("%d",n1);
  }
  else
  {
    r=3;
    t2=n/2;
    n2=pow(r,t2-1);
    printf("%d",n2);
  }
    return 0;
}