#include<stdio.h>
int main()
{
	//your code here
  int n,i;
  unsigned long long int f=1;
  scanf("%d",&n);
  if(n<0)
    printf("err");
  else
  {
    for(i=1;i<=n;i++)
    {
      f=f*i;
    }
  printf("%llu",f);
  }
}