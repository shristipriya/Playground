#include<stdio.h>
void main()
{
  int i;
  long int n,fact=1;
  scanf("%ld",&n);
  for(i=n;i>=2;i--)
  {
    fact=fact*i;
  }
  printf("%ld",fact);
  //return fact;
}