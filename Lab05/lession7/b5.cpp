#include<stdio.h>
int main()
{
	int x;
	
	printf("so diem x :");
	scanf("%d", &x);
	
	if(x>=75) 
		printf("loai A");
	if(x<75 && x>=60)
		printf("loai B");
	if(x<60 && x>=45)
		printf("loai C");
	if(x<45 && x>=35)
		printf("loai D");
	if(x<35)
		printf("loai E");
}
