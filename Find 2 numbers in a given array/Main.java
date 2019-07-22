#include<stdio.h>
int main()
{
  	//type your code here
  int n,i,k,l,e1=-1,e2=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d %d",&k,&l);
  for(i=0;i<n;i++)
  {
    if(k==a[i] && e1==-1)
    {
      e1=i;
    }
    if(l==a[i] && e2==-1)
    {
      e2=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",e1,e2);
  }
