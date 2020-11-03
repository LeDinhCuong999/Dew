#include<stdio.h>
int main()
{
	int A=300, B=250, loaikhac=100, mucluong, loainhanvien;
	printf("muc luong :");
	scanf("%d", &mucluong);
	
	printf("loainhanvien : \nA \nB \nloaikhac");
	scanf("%d", loainhanvien);
	
	if(loainhanvien==1)
	printf("muc luong cua nhan vien loai A la :%d", mucluong + A );
	
	else if (loainhanvien)
	printf("muc luong cua nhan vien loai B la :%d", mucluong + B );
	else 
	printf("muc luong cua nhan vien loai khac la :%d", mucluong + 100);
}

