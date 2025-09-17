# POINTERS :
*pointers* is a variable which stores the memory address of another variable.
Short form of *pointers* is "ptr".

**Syntax**:
>'*' is definitely attached while wirting *pointers*.
>int age=22;
> int *ptr=&age; // the 'ptr' will now store the address of 'age'.
>int _age = *ptr; //the address stored in ptr is stored in a new variable _age.

**Declaration**:
>int *ptr;
>char *ptr;
>float *ptr;
>thte datatype of *pointers* depends on the variable whose memory is being stored.

### To print the value of *ptr the function used is "%p".
### To print the above value in readable form "%u" is used.

int age=22;
printf("%d\n",age);
printf("%d\n",*ptr);
printf("%d\n",*(&age);
these above statements give same output i.e. 22

## Pointer to Pointer:
It stores the memory address of another *pointer*.

**Syntax**
> int **pptr;
> char **pptr;
> float **pptr;

## Pointers in Function Calling:
1. Call By Value
2. Call By Reference

### Call by value:
We pass the value of variable as the argument.
Changes  made to the variables of the sub method doesnot reflect on those of the main method.
*Eg:* **code**
#include <stdio.h>

int square(int n);
int main() { int n;
    printf("enter the number\n");
    scanf("%d",&n);
   square(n);
   printf("the no is %d\n",n);
    return 0;
}

int square(int n)
{
   n=n*n;
   printf("the sq is %d\n",n);
}

**output**
enter the number
5
the sq is 25
the no is 5
#### the value of variable is not changed!!!!


### Call by reference:
We pass the address of the variable as the argument.
The changes made on the variables is reflected on the variables of the main method.
*Eg:***code**
#include <stdio.h>

int square(int* n);
int main() { int n;
    printf("enter the number\n");
    scanf("%d",&n);
   square(&n);
   printf("the no is %d\n",n);
    return 0;
}

int square(int* n)
{
   *n=(*n)*(*n);
   printf("the sq is %d\n",*n);
}

**output**
enter the number
5
the sq is 25
the no is 25
#### the value of variable is changed!!!!
