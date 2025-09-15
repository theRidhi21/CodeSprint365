#### FUNCTIONS AND RECURSIONS ####

****Functions****
*Eg Program:*
**code**
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

**output**
enter no and the radius
2 1
the power is 4.000000
the area is 3.140000




****Recursions****
*Eg Program:*
**code**
#include <stdio.h>

int factorial();
int main(){int n,f;
    printf("enter the no \n");
    scanf("%d",&n);
    f= factorial(n);
    printf(" the factorial is %d\n",f);
    return 0;
}

int factorial(int n){ 
    if(n==1 || n==0 )
    { 
    return 1;}
    else
    return n*factorial(n-1);
}

**output**
enter the no 
5
 the factorial is 120






