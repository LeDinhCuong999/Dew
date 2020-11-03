#include<stdio.h>
int main()
{
	int arr[10], i, vitrichan;
	printf("nhap 10 phan tu :");
	
	for(i=0; i<10; i++)
	{
		scanf("%d", &arr[i]);
	}
	printf("\n vi tri chan la:");
	vitrichan=arr[0];
	
	
		for(i=1; i<10; i+=2){
		
		vitrichan=arr[i];
		printf("%d\t", vitrichan);
	}
}
