#include <stdio.h>
#include <stdlib.h>
#include <complex.h>
#include <math.h>
#define PI 3.141592653589793
#define pcal(name, type, size) name = (type *) calloc(size, sizeof(type))
typedef complex double comp;

void transform(int pow, comp *act, comp *fin)
{
  if (pow == 1)
    {
      fin[0] = act[0];
      return;
    }
  int var2, var3, pown;
  pown = pow/3;
  comp o1, o, a, * p1, * p2,* p3,* f1,* f2,* f3;
  pcal(p1, comp, pown);
  pcal(p2, comp, pown);
  pcal(p3, comp, pown);
  pcal(f1, comp, pown);
  pcal(f2, comp, pown);
  pcal(f3, comp, pown);

  for (var2=var3=0; var3 < pow; var2++, var3+=3)
    {
      p1[var2] = act[var3];
      p2[var2] = act[var3+1];
      p3[var2] = act[var3+2];
    }

  transform(pow/3, p1, f1);
  transform(pow/3, p2, f2);
  transform(pow/3, p3, f3);
  o1 = 1;
  o = cos(2*PI/pow) +  sin(2*PI/pow)*I;
  a = cos(2*PI/3) +  sin(2*PI/3)*I;

  for(var3=0; var3<pow/3; var3++, o1 *= o)
    {
      fin[var3] = f1[var3] + o1*f2[var3] +  o1*o1*f3[var3];
      fin[var3 + pown] = f1[var3] +  a*o1*f2[var3] + a*a*o1*o1*f3[var3];
      fin[var3 + 2*pown] = f1[var3] + a*a*o1*f2[var3] + a*o1*o1*f3[var3];
    }
}

int main(int argc, char *argv[])
{
  if (argc == 1)
    {
      printf("data not given\n");
      return 0;
    }

  int len,i,var2;
  sscanf(argv[1]," %d", &len);
  comp *ans, *a;
  ans = (comp *)calloc(len, sizeof(comp));
  a = (comp *)calloc(len , sizeof(comp));

  printf("Polynomial is: \n");
  for(i = 0; i < len; i++)
    {
      a[i] = rand() % 21 - 10;
      printf("%.2f*x^(%d)\t", creal(a[i]),i);
    }
  transform(len, a, ans);
  for (i = 0; i < len; i++)
    {
      printf("value at root:%d = %f + %fi\n",i,creal(ans[i]), cimag(ans[i]));
    }

  for (i=0; i < len ;i++)
    {
      complex c;
      c = 0;
      for (var2 = len - 1;var2 >= 0; var2--)
        {
          c *= (cos(2*PI/len*i) +  sin(2*PI/len*i)*I);
          c += a[var2];
        }
      printf("value at root:%d = %f + %fi\n",i,creal(c), cimag(c));
    }
  return 0;
}
