#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[])
{
  int status = system("ls -l");
  printf("status = %d\n", status);
  return 0;
}
