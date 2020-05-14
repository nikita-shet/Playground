#include<iostream>
int main()
{
  int n,digit;
  std::cin>>n;
  do{
    n=n/10;
    digit++;
  }while(n!=0);
  std::cout<<digit;
}