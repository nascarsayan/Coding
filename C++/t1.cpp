#include <iostream>
using namespace std;
class point {
public:
  // place public members first
  void
  print() const { cout << "(" << x << "," << y << ")"; }
  void print(const string& name) const;
  void set(double u, double v) { x = u; y = v; }
  point inverse();
  void plus(point c);
  point* where_am_I() { return this; }
private:
  double x, y;
};
// Offset the existing point by point c
void point::plus(point c)
{
  x += c.x;
  y += c.y;
}
point point::inverse()
{
  point b;
  b.x = -this->x;
  b.y = -this->y;
  return b;
}
int main()
{
  point a, b;
  a.set(1.5, -2.5);
  a.print();
  cout << "\na is at " << a.where_am_I() << endl;
  b = a.inverse();
  b.print();
  cout << "\nb is at " << b.where_am_I() << endl;
  a.print();
}
