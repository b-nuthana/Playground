#include<stdio.h>
int main()
{
   int num,a,sum=0;
  scanf("%d",&num);
  while(num>0)
  {
    a=num%10;
    num=num/10;
    sum=sum+a;
  }
  printf("%d",sum);
}