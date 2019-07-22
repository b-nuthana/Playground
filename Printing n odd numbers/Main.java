#include <stdio.h>
int main() {
	//Type your code
  int i,n,k=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
    printf("%d\n",i);
    n++;
    }
  }
    
	return 0;
}