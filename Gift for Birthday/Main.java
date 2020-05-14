#include<iostream>
using namespace std;
int main()
{
  int yr;
  std::cin>>yr;
  if(yr%4==0)
  {
    std::cout<<yr<<""<<" is a leap year";
  }
  else
  {
    std::cout<<yr<<""<<" is not a leap year";
  }
  
}