#include <cstdlib>
#include <iostream>
#include <cstdio>
using namespace std;
class cl1{public : void foo();};
class cl2{public : void foo();};
void cl1::foo()
{
  printf("In cl1\n");
}
void cl2::foo()
{
  printf("In cl2\n");
}
int wh;
class A
{
public:
  int wh;
  class B
  {
  public:
    int wh;
    void sett()
    {
      A ob;
      ::wh = ob.wh = wh = 10;

    }
  };
  void print()
  {
    cout << "Here I am!\n";
    B ob;
    ob.sett();
  }
};
int main(int argc, char *argv[])
{
  cl1 c1;
  cl2 c2;
  c1.foo();
  c2.foo();
  c1.cl1::foo();
  c2.cl2::foo();
  wh = 1;
  A a;
  a.print();
  return 0;
}
