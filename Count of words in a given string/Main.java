#include<stdio.h>

int main()
{
  //Type your code here
  char ch[100];
  int i,c=0;
  scanf("%[^\n]",ch);
  for(i=0;ch[i]!='\0';i++)
  {
    if(ch[i]==' ')
      c++;
  }
  printf("%d",c+1);
  return 0;
}