#include <stdlib.h>
#include <stdio.h>
#define scr "\
#bin/bash/\n\
ls -l\
"
#define PATH_MAX 50
int main(int argc, char *argv[])
{
  int status;
  char path[PATH_MAX];
  FILE *f = popen("\
#bin/bash/\n\
echo $no_proxy\
", "w");
  while (fgets(path, PATH_MAX, f) != NULL)
    printf("%s\n", path);
  status = pclose(f);
  return 0;
}
