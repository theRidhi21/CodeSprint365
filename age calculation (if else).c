#include<stdio.h>
int main(){
    
int date[3];
int dob[3];int d,m,y;
scanf("%d %d %d",&date[0],&date[1],&date[2]);
scanf("%d %d %d",&dob[0],&dob[1],&dob[2]);

if(dob[2]<date[2])
y=date[2]-dob[2];

if(date[1]>dob[1])
m=date[1]-dob[1];
else 
{
    m=12-(dob[1]-date[1]);
    y=y-1;
}

if(date[0]>=dob[0]){
    if(date[0]==dob[0])
    d=0;
    else
    d=date[0]-dob[0];
}
else{
    d=30-(dob[0]-date[0]);
    m-=1;
}
    if(date[2]>dob[2])
    printf("%d %d %d\n",y,m,d);
    else
    printf("Invalid\n");
    return 0;
}
