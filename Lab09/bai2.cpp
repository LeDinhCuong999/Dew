#include<stdio.h>
int main()
{
	int arr1[5], i;
	float arr2[10];
	
	printf("phan tu cua mang 1 la : \n");
	for(i=0; i<5; i++)
	{
		scanf("%d", &arr1[i]);
	}
	
	printf("phan tu cua mang 2 la : \n");
	for(i=0; i<5; i++)
	{
		arr2[i]=arr1[i];
		printf("%d\n", arr1[i]);
	}
	
	for(i=5; i<10; i++)
	{
		arr2[i]=0;
		printf("%f\n", &arr2[i]);
	}
	printf("\n");
}
