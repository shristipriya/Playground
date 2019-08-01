#include<stdio.h>
//#include<conio.h>
void main()
{
  float r,ang,length;
  scanf("%f%f",&r,&ang);
  length=2*3.14*r*(ang/360);
  printf("%.2f",length);
}