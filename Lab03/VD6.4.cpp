#include<stdio.h>
int main()
{
	printf ("A string in various forms:\n");
	printf("without any format command:\n");
	printf("good day Mr.Lee.\n");
	printf("with format command but without any modifier:\n");
	printf("[%s]\n", "good day Mr.Lee.");
	printf("with digit string 4 as modifier:\n");
	printf("[%4s]\n","Good day Mr.Lee.");
	printf(" with digit  string 19 as modifier:\n");
	printf("[%19s]\n","Good day Mr.Lee.");
	printf(" with digit  string 23 as modifier:\n");
	printf("[%23s]\n","Good day Mr.Lee.");
	printf(" with digit  string 25.4 as modifier:\n");
	printf("[%25.4s]\n","Good day Mr.Lee.");
	printf(" with-and digit  string 25.4 as modifier:\n");
	printf("[%-25.4s]\n","Good day Mr.Lee.");

}
