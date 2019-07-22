#include<stdio.h>
int main()
{
	//type your code here
  char ch[100];
  int i,c=1,n;
  scanf("%[^\n]",ch);
  for(n=0;ch[n]!=NULL;n++);
  if(n>20)
    printf("Invalid Input");
  else
  {
    for(i=0;ch[i]!=NULL;i++)
    {
      if(ch[i]==ch[i+1])
        c++;
      else
      {
        printf("%c%d",ch[i],c);
        c=1;
      }
    }
  }
  return 0;
}