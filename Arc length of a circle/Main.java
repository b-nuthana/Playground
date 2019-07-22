#include<stdio.h>
int main()
{
  float r,t,x;
  scanf("%f\n%f",&r,&t);
  x=(2*3.14*r)*(t/360);
  printf("%.2f",x);
  return 0;
}