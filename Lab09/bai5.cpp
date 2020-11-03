#include <stdio.h>
int main()
{
	int hang, cot;
	int mon[4][30];
	float sum[30];


	for(hang=1;hang<=2;hang++)
	{
		for(cot=1;cot<=4;cot++)
		{
			printf("nhap vao diem [%d][%d]: ",hang,cot);
			scanf("%d",&mon[hang][cot]);
		}
		printf("\n");
	}

		for(hang=1;hang<=2;hang++)
	{
		for(cot=1;cot<=4;cot++)
		{
		printf("Hoc sinh [%d][%d] la %d \n",hang,cot,mon[hang][cot]);
		sum[hang] += mon[hang][cot];
		}
		    printf("diem tong :%.2f\n",sum[hang]);
			printf("diem trung binh %d = %.2f",hang,sum[hang]/4);
			printf("\n");			
	}
}
