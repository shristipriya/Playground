#include<stdio.h>
int main()
{
  int n,a=0,b=1,i,c;
  scanf("%d",&n);
  if(n==1)
    printf("0");
  else if(n==2)
    printf("1");
  else
  {
    printf("%d %d ",a,b);
    for(i=2;i<n;i++)
  {
      //printf("%d%d",a,b);
    c=a+b;
    a=b;
    b=c;
    printf("%d ",c);
  }
  }
 
    
  return 0;
}