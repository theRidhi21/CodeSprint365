#### FUNCTIONS AND RECURSIONS ####
****functions****
***code***
#include <stdio.h>
#include <math.h>
#define pi 3.14

float numpower(int a);
float circlearea(float r);
int main() { int a;float r;
   printf("enter no and the radius\n");
   scanf("%d %f",&a,&r);
   numpower(a);
   circlearea(r);
   printf("the power is %f\n",numpower(a));
   printf("the area is %f\n",circlearea(r));
    return 0;
}

float numpower(int a){
    return pow(a,2);
}

float circlearea(float r){
    return pi*r*r;
}

***output***
enter no and the radius
2 1
the power is 4.000000
the area is 3.140000




****recursions****
