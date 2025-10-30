#include <stdio.h>
int main() {
    int a,b,n;int x=0;
    printf("Enter the number and the no of digits\n");
    scanf("%d %d",&a,&n);
    int c=a;
    for(int i=0;i<n;i++)
    { b=a%10;
    a=a/10;
    x=x+(b*b*b);
    }
    if (c==x)
    printf("It is an armstrong no");
    else
    printf("it is not");
    return 0;
}
