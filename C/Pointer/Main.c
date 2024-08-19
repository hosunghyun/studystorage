#include<stdio.h>

int add(int x, int y) {
    return x + y;
}
int main(void) {
    int result;
    int (*pf)(int, int);    // 함수 포인터 정의

    pf = add;
    result = pf(10, 20);
    printf("%d", result);

    return 0;
}