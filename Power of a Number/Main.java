#include <stdio.h>
int main()
{
  	//Your code here   
  int a,b,i;
  scanf("%d %d",&a,&b);
  if(b<0)
    printf("Wrong input");
  else
  {
    i=pow(a,b);
    printf("%d",i);
  }
   return 0;   
}