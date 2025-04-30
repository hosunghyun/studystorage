#include<stdio.h>

void myFunction() {
    printf("Hello world\n");

}

void myFunction2(int n) {
    printf("second function\n 매개변수 : %d\n", n);
}

void myFunnc3(int n[5]) {
    n[0] += 1;
    n[1] += 1;
    n[2] += 1;
    n[3] += 1;
    n[4] += 1;
}

int myFunc4(int n) {
    return n + 1;
}
int main(void) {
    myFunction();
    myFunction2(10);
    int n[5] = { 1, 2, 3, 4, 5 };
    myFunnc3(n);

    printf("%d\n", n[0]);
    printf("%d\n", n[1]);
    printf("%d\n", n[2]);
    printf("%d\n", n[3]);
    printf("%d\n", n[4]);

    printf("%d", myFunc4(10));

    return 0;
}