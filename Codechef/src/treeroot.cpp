#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
using namespace std;
int main(int argc, char *argv[])
{
  int t, n, p1, p2, i;
  pair <int, int> p;
  vector< pair <int, int> > tr;
  vector< pair <int, int> >::iterator it;
  cin >> t;
  while(t--)
    {
      cin >> n;
      for(i = 0; i < n; i++)
        {
          scanf("%d %d", &p1, &p2);
          tr.push_back(make_pair(p2, p1));
        }
      sort(tr.begin(), tr.end());
      for(it = tr.begin(); it < tr.end(); it++)
        if(it -> first != 0)
          break;
      for()
    }
  return 0;
}
