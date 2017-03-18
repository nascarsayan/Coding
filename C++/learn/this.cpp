#include <iostream>
#include <cstdlib>
#include <cstdio>

class pair
{
public:
  void print(){printf("(%d, %d)\n", x, y);}
  void set(int x, int y){this->x = x; this->y = y;}
  pair inverse(){x = -x; y = -y; return *this;}
  void plus(pair pt2){x += pt2.x; y += pt2.y;}
  pair* where_am_i(){return this;}
private:
  int x, y;
};
class X
{
public:
  X(){hide=0;}
  int visible;
  void  print() const {std::cout << "\nhide ="<< hide << " visible =" << visible; }
  void reset() { visible = hide; }
  void set(int i) { hide = i; }
private:
  int hide;
};
typedef void (X::*pfcn)();

int main(int argc, char *argv[])
{
  pair p, q;
  p.set(10, 20);
  p.print();
  std::cout<<p.where_am_i();
  q = p.inverse();
  p.print();
  std::cout<<p.where_am_i();
  q.print();
  std::cout<<q.where_am_i();
  return 0;
  X a, b, *pb = &b;
  int X::*pXint = &X::visible;

}
