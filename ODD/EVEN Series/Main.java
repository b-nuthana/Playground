#include<stdio.h>
int main()
{
	//type your code here
  int n,a,d,t1,t2,nt;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    t1=(n+1)/2;
    nt=a+(t1-1)*d;
    printf("%d",nt);
  }
  else
  {
    a=0,d=1;
    t2=n/2;
    nt=a+(t2-1)*d;
    printf("%d",nt);
  }
	return 0;
}