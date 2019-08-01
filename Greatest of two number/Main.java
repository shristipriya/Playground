#include<stdio.h>
int main()
{
  int num1,num2;
  scanf("%d",&num1);
  scanf("%d",&num2);
  if(num1>num2)
  {
    printf("num1 is the greatest");
  }
  if(num1<num2)
  {
    printf("num2 is the greatest");
  }
  if(num1==num2)
  {
    printf("Both number equal");
  }
  //Type your code here
  return 0;
}