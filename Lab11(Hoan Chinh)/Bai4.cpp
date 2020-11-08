#include <stdio.h>

void menu(){
    int a=0,b=0,kt=1;
    while (kt==1) {
        printf("\nTÍNH TOÁN\n");
        printf("=========================\n");
        printf("1. Nh?p s?\n");
        printf("2. Tính T?ng\n");
        printf("3. Tính Hi?u\n");
        printf("4. Tính Tích\n");
        printf("5. Tính Thuong\n");
        printf("6. Thoát\n");
        printf("==========================\n");
        printf("Ch?n:\t");
        int bien;
        scanf("%d", &bien);
        if (bien==1) {
            printf("Nh?p giá tr? a= ");
            scanf("%d", &a);
            printf("Nh?p giá tr? b= ");
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
            printf("K?t Thúc\n");
            kt=0;
        }
    }
}
int main(){
    menu();
}
