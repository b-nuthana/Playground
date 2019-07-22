#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  while(num>=100)
  {
    num=num/10;
  }
  int c=num%10;
  printf("%d",c);
	return 0;
}