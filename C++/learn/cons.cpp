#include <iostream>
#include <cstdlib>
#include <cstdio>
#include <vector>
using namespace std;
class A
{
private:
  int x, y;
public:
  A(int x, int y);
  A(int x1) : x(x1), y(0){}
  A() : x(0), y(0){}
};
A::A(int x1, int y1){x = x1; y = y1;}
int main(int argc, char *argv[])
{
  vector<int> v(5);
  vector<int>::iterator p;
  for(p = v.begin(); p < v.end(); p++)
    *p = 1;

  return 0;
}
