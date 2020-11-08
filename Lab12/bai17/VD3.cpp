#include<stdio.h>
#include<string.h>
int main()
{
	char firstname[15];
	char lastname[15];
	
	int clrscr();
	
	printf("Enter your firstname :");
	scanf("%s", &firstname);
	
	printf("Enter your lastname :");
	scanf("%s", &lastname);
	
	strcat(firstname, lastname);
	
	printf("%s", firstname);
	int getch();
}
