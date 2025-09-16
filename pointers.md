#### POINTERS ###:

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


## To print the value of *ptr the function used is "%p".
## To print the above value in readable form "%u" is used.


int age=22;
printf("%d\n",age);
printf("%d\n",*ptr);
printf("%d\n",*(&age);
these above statements give same output i.e. 22



## Pointer to Pointer ##:
It stores the memory address of another *pointer*.
