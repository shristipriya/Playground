#include<stdio.h>
#include<string.h>
int main()
{
  char str[20];
  scanf("%[^\n]s",str);
  int len=strlen(str);
  printf("%d",len);
  return 0;
}