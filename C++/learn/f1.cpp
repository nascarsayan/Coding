#include <iostream>
using namespace std;
#define max3(x, y, z) (x > y) ? (x > z)? x : z : (y > z) ? y : z;
int product(int x, int y)
{
  return x * y;
}
inline int sum(int x, int y)
{
  int s = 1;
  s = product(x, y);
  return s;
}
#define sum2(x, y) (x+ y)
int main(int argc, char *argv[])
{
  int x;
  cout<<"Enter the number\n";
  cin>>x;
  cout << "The number is : " << x <<"\n";
  cout << 2 * sum (3, 4);
  cout << 2 * sum2 (3, 4);
  x =  max3(4, 7, 3)
  cout << x;
  return 0;
}
