#include<stdio.h>
int main()
{
  int n,sum,firstdigit,seconddigit;
  scanf("%d",&n);
  firstdigit=n/10;
  seconddigit=n%10;
  sum=firstdigit+seconddigit;
  printf("%d",sum);
  //Type your code here
  return 0;
}