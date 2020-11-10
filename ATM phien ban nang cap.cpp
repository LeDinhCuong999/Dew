#include<stdio.h>
#include <stdlib.h>

int login();
void withdraw();
void transfer();
void check();

int sodu = 950000, num, id;

int login(int username, int password)
{
	if(username==1080 && password==9999)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

void withdraw(int num)
{
	printf("so tien ban co trong tai khoan :\n");
	printf("%d\n", sodu);
	
	if(num%50==0 && num<sodu)
	{
		printf("rut thanh cong, so tien con lai la : %d\n", sodu-num);
	}
	else 
		printf("so tien rut khong hop le\n");
}

void transfer(int id, int num)
{
	printf("so tien ban co trong tai khoan :\n");
	printf("%d\n", sodu);
	if(num<sodu)
	{
		printf("chuyen thanh cong, so tien con lai la : %d\n", sodu-num);
	}
	else 
		printf("so tien chuyen khong hop le\n");
}

void check()
{
	printf("so du trong tai khoan la : %d\n", sodu);
}

int main()
{
	int username, password, luachon, isOklogin, num;
	printf("*** Chao Mung Ban Den Voi Khoi Nghiep Bank:)) ***\n"); 
	
	printf("nhap so tai khoan cua ban :\n");
	scanf("%d", &username);
	
	printf("nhap mat khau cua ban :\n");
	scanf("%d", &password);
	
	
	isOklogin = login(username, password);
	
	if(isOklogin)
	{
		//neu dang nhap dung
		do
		{
			int num;
			
			printf("ban da hoan thanh login, moi ban chon menu :\n \n1.withdraw. \n2.transfer. \n3.check. \n");
			scanf("%d", &luachon);
			
			switch(luachon)
			{
				case 1:
					printf("nhap so tien ban muon rut :\n");
					scanf("%d", &num);
					withdraw(num);
					break;
				
				case 2:
					printf("nhap so tai khoan ban muon chuyen tien :\n");
					scanf("%d", &id);
					
					printf("nhap so tien ban muon chuyen :\n");
					scanf("%d", &num);
					transfer(id, num);
					break;
				
				case 3:
					check();
					break;
			}
		}
		while(luachon=1 || luachon==2 || luachon==3);
	}
	else
	{
		//neu dang nhap sai
	}
	
	return 0;
}

























