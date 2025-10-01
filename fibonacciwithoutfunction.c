#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    int a=0,b=1;
    int sum=0;
    printf("%d \n %d",a,b);
    for(int i=0;i<(n-2);i++){
        sum=a+b;
        a=b;
        b=sum;
        printf("%d \n",sum);
    }
}
