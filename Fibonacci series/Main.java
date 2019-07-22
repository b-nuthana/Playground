#include<stdio.h>
int main()
{
  //Type your code here
  int n,a=1,b=0,c=0,i;
  scanf("%d",&n);
  printf("0 1 ");
  for(i=1;i<n-1;i++)
  {
    c=a+b;
    b=a;
    a=c;
    printf("%d ",c);
  }
  return 0;
}