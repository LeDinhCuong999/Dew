#include <stdio.h>

void menu(){
    int a=0,b=0,kt=1;
    while (kt==1) {
        printf("\nT�NH TO�N\n");
        printf("=========================\n");
        printf("1. Nh?p s?\n");
        printf("2. T�nh T?ng\n");
        printf("3. T�nh Hi?u\n");
        printf("4. T�nh T�ch\n");
        printf("5. T�nh Thuong\n");
        printf("6. Tho�t\n");
        printf("==========================\n");
        printf("Ch?n:\t");
        int bien;
        scanf("%d", &bien);
        if (bien==1) {
            printf("Nh?p gi� tr? a= ");
            scanf("%d", &a);
            printf("Nh?p gi� tr? b= ");
            scanf("%d", &b);
        }
        if (bien==2) {
            printf("T?ng= %d\n", a+b);
        }
        if (bien==3) {
            printf("Hi?u= %d\n", a-b);
        }
        if (bien==4) {
            printf("Tichs= %d\n", a*b);
        }
        if (bien==5) {
            if (b==0) {
                printf("L?i");
            }
            else
                printf("Thuong= %lf\n", (double)a/b);
        }
        if (bien==6) {
            printf("K?t Th�c\n");
            kt=0;
        }
    }
}
int main(){
    menu();
}
