#include <stdio.h>
int main() {
	// Type your code here
  char ch;
   scanf("%c", &ch);
   if('a' <=  ch && ch <= 'z')
   {
      printf("%c",ch-32);
   }
   if('A' <=  ch && ch <= 'Z')
   {
      printf("%c",ch+32);
   }
	return 0;
}