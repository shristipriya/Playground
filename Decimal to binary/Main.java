#include<stdio.h>
long long dectobin(int n)
{
  long long binary=0;
  int remainder,i=1;
  while(n!=0)
  {
    remainder=n%2;
    n/=2;
    binary= binary+remainder*i;
    i*=10;
    //return binary;
  }
  return binary;
}
int main()
{
  int n;
  scanf("%d",&n);
  long long x=dectobin(n);
  printf("%lld",x);
  return 0;
}