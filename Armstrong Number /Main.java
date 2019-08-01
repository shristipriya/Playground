#include <stdio.h>
int main() {
  int n,remainder,res=0,count=0,m,x;
  scanf("%d",&n);
  x=n;
  while(x>0)
  {
    x/=10;
    ++count;
  }
  x=n;
  while(x>0)
  {
    remainder=x%10;
    res=res+pow(remainder,count);
    x/=10;
  }
  if(res==n)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	//Type your code
	return 0;
}