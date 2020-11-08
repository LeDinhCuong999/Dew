#include<stdio.h>

int tieuchuan();
int totinh();
int thattinh();
int thattinh();
int yeuhetminh();


int main(int chieucao, int cannang, char kieutoc, char mautoc, char bonus)
{
	printf("nhap chieu cao :\n");
	scanf("%d", chieucao);
	
	printf("nhap can nang :\n");
	scanf("%d", cannang);
	
	printf("nhap kieu toc :\n");
	scanf("%c", kieutoc);
	
	printf("nhap mau toc :\n");
	scanf("%c", mautoc);
	
	printf("nhap bonus :\n");
	scanf("%c", bonus);

}

int tieuchuan(int chieucao, int cannang, char kieutoc, char mautoc, char ans)
{
	if(chieucao>155 && chieucao<165 && cannang>43 && cannang<57 && kieutoc==tocngan && mautoc==hightlight || ans==conchutich)
		{	
			totinh();
		}
	else
		printf("em den lam:)) vinh biet!! \n");
}

int totinh()
{
	int traloi;
	
	printf("chao em, anh dung day tu chieu nhung chua thay co gai nao dep nhu em!\n");
	printf("em oi :v cho anh lam quen nhe:)) anh yeu em ngay tu cai nhin dau tien!\n");
	printf("ngoai troi HaNoi thi do con mua:)))\n");
	printf("anh do em roi, em do anh chua :V ? yes or no ?\n");
	
	if(traloi == 'no')
	{
		thattinh();
	}
	else
		yeuhetminh();
}

int thattinh()
{
	printf("okey:)) , khong yeu tra dep bo ve . \n");
	printf("so bad:(( seven love :v \n");
}

int yeuhetminh()
{
	printf("chuc mung em da la nguoi may man nhat tro thanh nguoi yeu cua anh:V \n");
	printf("minh chinh thuc yeu nhau tu giay phut nay:V \n");
	printf("I LOVE YOU 3000 !!! \n");
}

  






















