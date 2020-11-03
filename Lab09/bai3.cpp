#include<stdio.h>
int main()
{
	int arr[10], i, max, min, sum=0, average;
	
	printf("nhap 10 phan tu bat ki : \n");
	
	for(i=0; i<10; i++)
	{
		scanf("%d", &arr[i]);
		sum+=arr[i];
	}
	printf("sum=%d \n", sum);
	
	average=sum/10;
	printf("average=%d \n", average);
	
	max=arr[0];
	for(i=0; i<10; i++)
	{
		if(arr[i]>max)
		max=arr[i];
	}
	printf("\nGTLN:%d", max);
	
	min=arr[0];
	for(i=0; i<10; i++)
	{
		if(arr[i]<min)
		min=arr[i];
	}
	printf("\nGTNN:%d", min);
	
	
}
