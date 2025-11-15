#include <stdio.h>

int fibonacii(int n);
int main() { int n;
printf("enter a positive value of n \n"); 
scanf("%d",&n);
fibonacii(n);
    return 0;
}

int fibonacii(int n){int a=0;int b=1;int sum=0;
printf("%d %d",a,b);
    for(int i=0;i<=n;i++)
    {
     sum=a+b;
     a=b;
     b=sum;
    printf(" %d",sum); 
    }return 0;
}
