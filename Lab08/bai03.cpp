#include<stdio.h>
int main()
{
	int mathe, mapin, dichvu, count, tien, rut, taikhoan, chuyen;
	
	printf("*** Chao Mung Ban Den Voi Khoi Nghiep Bank:)) ***");
	
	printf("\n hay nhap ma the :");
	scanf("%d", &mathe);
	
	if(mathe==1080)
	
	{
		printf("\n hay nhap ma pin :");
		scanf("%d", &mapin);
	
		if(mapin != 9999)
		do 
		{
			printf("\n ma pin sai");	
			printf("\n nhap lai ma pin");
			scanf("%d", &mapin);
			
			count++;
			printf("%d", count);
		}
		while(count<=2);
		printf("\n the cua ban da bi khoa. vui long lien he ngan hang de biet them chi tiet!");
		
	}
	
	else 
	printf("\n chon dich vu cua ban :\n1.rut tien. \n2.hien thi so du. \n3.chuyen khoan. \n4.ket thuc. \n");
	scanf("%d", &dichvu);
	
	if(dichvu==1) 
	{
		printf("\n so tien ban co trong tai khoan :");
		scanf("%d", &tien);
		printf("\n so tien ban can rut :");
		scanf("%d", &rut);
		if(rut<tien && rut<5000000 && rut%50000==0)
		{
			printf("\n thanh cong, so tien con lai la : %d", tien-rut);	
		}
		else 
		printf("\n so tien rut khong hop le!");
	}
	
	if(dichvu==2)
	printf("\n so tien ban co trong tai khoan : %d", tien);
	
	if(dichvu==3)
	{
	 	printf("\n nhap so tai khoan ban muon chuyen tien :");
		scanf("%d", taikhoan);
		printf("\n nhap so tien ban muon chuyen :");
		scanf("%d", chuyen);
		if(chuyen<tien)
		{
			printf("giao dich thanh cong!");
			printf("so tien con lai : %d", tien-chuyen);
		}
	else 
	printf("khong hop le");
	}
	
	if(dichvu=4)
	{
		printf("\n ket thuc giao dich, xin cam on!");
	}
	
	printf("ban co muon tiep tuc giao dich khac khong? yes/no?");
	
}
	
	
	
