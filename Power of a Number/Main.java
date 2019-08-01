#include <stdio.h>
#include<math.h>
int main()
{
  long int n,m,power;
  scanf("%ld%ld",&n,&m);
  if(m<0)
  {
    printf("Wrong input");
  }
  else
  {
  power=pow(n,m);
  printf("%ld",power);
  }
  	//Your code here       
    return 0;
}