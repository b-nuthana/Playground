#include<stdio.h>
int main()
{
  //type your code here
  int n,arr[1000],i,c=0;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[c++]=n%8;
    n=n/8;
  }
  for(i=c-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}