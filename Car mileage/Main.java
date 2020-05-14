#include<iostream>
using namespace std;
int main()
{
  float m;
  int p,dist,pos_d;
  std::cin>>m>>p>>dist;
  pos_d=m*p;
  if(pos_d>=dist)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}