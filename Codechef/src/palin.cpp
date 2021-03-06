#include <cstdlib>
#include <iostream>
using namespace std;
inline void add1(string& num)
{
  int i, l = num.size();
  for (i = l - 1; (i >= 0) && (num[i] == '9'); i--)
    num[i] ='0';
  if(i == -1)
    {
      num[0] = '1';
      num += '0';
    }
  else
    num[i]++;
}
inline void add1(string& num, int idx)
{
  int i;
  for (i = idx; (i >= 0) && (num[i] == '9'); i--)
    num[i] ='0';
  num[i]++;
}
int main(int argc, char *argv[])
{
  int t, l, i, h;
  string num;
  cin >> t;
  while(t--)
    {
      cin >> num;
      l = num.size();
      add1(num);
      l = num.size();
      h = (l + 1)/2;
      for(i = l - 1; i >= h;)
        {
          if(num[l - 1 - i] >= num[i])
            {
              num[i] = num[l - 1 - i];
              i--;
            }
          else
            add1(num, i);
        }
      cout << num << "\n";
    }
  return 0;
}
