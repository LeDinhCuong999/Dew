#include<stdio.h>
#include<string.h>
int main()
{
	char hotelname1[15]="Sea View";
	char hotelname2[15]="Sea Bzeere";
	
	int clrscr();
	
	printf("ten cu la %s\n", hotelname1);
	
	strcpy(hotelname1, hotelname2);
	
	printf("ten moi la %s\n", hotelname1);
	
	int getch();
}
