#include <stdio.h>
int func(int n);
int main(){
    int n;
    scanf("%d",&n);
    printf("%d",func(n));
    return 0;
}

int func(int n){
    int b,s=0;
    for (int i=0;n>0;i++)
    {
        b=n%10;
        n=n/10;
        s=s+b;
    }
    if(s<=9)
    {
        return s;
    }
    else
    {
       return func(s);
    }
}
