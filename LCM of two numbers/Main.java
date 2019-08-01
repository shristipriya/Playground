#include<iostream>
using namespace std;
int main()
{
   int n1,n2,i,lcm;
  cin>>n1>>n2;
  int max=n1>n2?n1:n2;
  i=max;
  while(1)
  {
    if(i%n1==0 && i%n2==0)
    {
      lcm=i;
      break;
    }
    i=i+max;
  }
  cout<<lcm;
  return 0;
}