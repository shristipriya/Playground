#include<stdio.h>
int main()
{
  int n,third,first,sum;
  scanf("%d",&n);
  third=n%10;
  first=n/100;
  sum=third+first;
  printf("%d",sum);
  //Type your code here
  return 0;
}