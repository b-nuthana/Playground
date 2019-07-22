#include<stdio.h>
int main()
{
  //Type your code here
  int arr[100],i,n,k;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    if(k==arr[i])
    {
      printf("%d",i+1);
      return 0;
    }
  }
  printf("%d isn't present in the array.",k);
  return 0;
}