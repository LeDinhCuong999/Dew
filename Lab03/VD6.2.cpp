#include<stdio.h>
int main()
{
	printf("The number 555 in various forms:\n");
	printf("whithout any modifier:\n");
	printf("[%d\n]", 555);
	printf("With-modifier:\n");
	printf("[%-d]\n", 555);
	printf("with digit string 10 as modifier:\n");
	printf("[%10d]\n", 555);
	printf("with 0 as modifier:\n");
	printf("[%0d]\n", 555);
	printf("with 0 and digit string 10 as modifier:\n");
    printf("[%010d]\n", 555);
    printf("with -, 0 and digit string 10 as modifier :\n");
    printf("[%-010d]\n");
} 
