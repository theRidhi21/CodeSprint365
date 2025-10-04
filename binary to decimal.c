#include <stdio.h>
#include <math.h>.
void main(){
    int a,b=0;
    scanf("%d",&a);
    for(int i=0;a>0;i++){
        int x = a%10;
        a=a/10;
        int y= pow(2,i);
        b=b+(x*y);
    }
    printf("%d \n",b);
}
