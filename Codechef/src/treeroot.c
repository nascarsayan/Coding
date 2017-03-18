#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
int main(int argc, char *argv[])
{
  int t, n, i, t1, t2, s;
  scanf("%d%*c", &t);
  while(t--)
    {
      s = 0;
      scanf("%d%*c", &n);
      for(i = 0; i < n; i++)
        {
          scanf("%d %d%*c", &t1, &t2);
          s += t1 - t2;
        }
      printf("%d\n", s);
    }
  printf("%d", INT_MAX);
  return 0;
}
