#include<stdio.h>
int main()
{
	printf("Hi,chao cau. Minh dung day tu chieu:))");
	
	int ma_the, ma_pin, lua_chon;
	
	printf("Nhap ma the :");
	scanf("%d", &ma_the);
	
	if(ma_the == 6789)
	{
		printf("Nhap ma pin :");
	    scanf("%d", &ma_pin);
	     
	    if(ma_pin == 9999) 
		{
			printf("Ban muon lam gi? Chon(1-3) :");
			scanf("%d", &lua_chon);
			
			if (lua_chon == 1)  
			   printf ("\nRut tien");
			else if (lua_chon == 2)
			   printf ("\nChuyen khoan");
			else if (lua_chon == 3)
			   printf("\nKiem tra so du");
			else 
			   printf("\nKhong hop le");      
		} 		
		else
			printf("Ma pin sai");
	}
	else
		printf("Ma the sai");
}
