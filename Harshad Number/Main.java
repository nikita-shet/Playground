#include<iostream>
using namespace std;
int main()
{
  int n, res,temp,sum=0;
  std::cin>>n;
  temp=n;
  while(temp)
  {
  sum=sum+temp%10;
  temp=temp/10;
  }
  res=n%sum;
  if(res==0)
  {
    std::cout<<"Harshad Number";
  }
  else
  std::cout<<"Not Harshad Number";
}