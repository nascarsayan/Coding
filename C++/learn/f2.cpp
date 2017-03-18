#include <iostream>
#include <cmath>
using namespace std;

static double power(double base, double idx)
{
  cout << "In function power\n";
  return pow(base, idx);
}
int main(int argc, char *argv[])
{
  cout << power(2, 4) << "\n";
  return 0;
}
