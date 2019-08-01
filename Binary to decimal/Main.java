#include<stdio.h>
long long int bintodec(int n)
{
  int remainder,decimal=0,i=0;
  while(n!=0)
  {
    remainder=n%10;
    n/=10;
    decimal+=remainder*pow(2,i);
    ++i;
  }
  return decimal;
}
int main()
{
 int n;
  scanf("%lld",&n);
  printf("%d",bintodec(n));
  
  return 0;
}