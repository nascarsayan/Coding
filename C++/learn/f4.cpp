#include <iostream>
#include <cstdlib>
#include <cstdio>
#include <ctime>
#include <climits>
#include <cmath>
#include <cassert>
using namespace std;
namespace n1
{
  void foo(int x)
  {
    cout << "The number is " << x << "\n";
  }
}
int la;
namespace n2
{
  void foo(int x);
}
void n2::foo(int x)
{
  cout << x << " is the number\n";
}
void modify(int &x, int &y)
{
  x = x * 2;
  y = y * 2;
}
class node
{
private:
  int x, y;
public:
  void print(){printf("(%d, %d)\n", x, y);}
  void set(int x1, int y1){x = x1; y = y1;}
};
using namespace n1;
using namespace n2;
int main(int argc, char *argv[])
{
  int la;
  string s1, s2;
  cout<<"Enter the strings  :";
  cin>> s1 >>s2;
  cout << "Str is "<<s1<<" and "<<s2<<"\n";
  node x1;
  x1.set(10, 20);
  x1.print();
  la = 5;
  cout << ::la << "\t" << la <<"\n" ;
  //cout << x1.x <<"\n";
  // int *f = new int(100);
  // assert(*f < 0);
  // cout << *f;
  // int *k = new int[5];
  // k[2] = 10;
  // cout<<k[2];
  // delete[] k;
  // delete f;
  // time_t t = time(0);
  // srand(t);
  // int i, x1, y1, arr[10][10];
  // long int x;
  // cout <<"Max int is "<<INT_MAX<<"\n";
  // x = INT_MAX;
  // x += 1;
  // cout << log2(x) <<" log \n";
  // for(i = 0; i < 10; i++)
  //   cout << (rand()*1.00) / INT_MAX << "\n";
  // n1::foo(5);
  // n2::foo(6);
  // x1 = 2; y1 = 3;
  // modify(x1, y1);
  // cout << "x1 " << x1 << "; y1 " << y1;
  // pass(a);
  // return 0;
}
