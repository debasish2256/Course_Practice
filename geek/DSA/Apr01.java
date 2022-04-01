package geek;

/*
 * Find the time complexity of the following algorithms
 

1.static void fun()
{
    int i, j;
    for (i = 1; i <= n; i++)
        for (j = 1; j <= log(i); j++)
            System.out.printf(""GeeksforGeeks"");
}
A: O(nlogn)

2.
for (i = 0; i < N; i++) {
    a = a + rand();
}
for (j = 0; j < M; j++) {
    b = b + rand();
}

A: O(N + M)


3.
int a = 0;
for (i = 0; i < N; i++) {
    for (j = N; j > i; j--) {
        a = a + i + j;
    }
}
A: O(N^2)

4.
int i, j, k = 0;
for (i = n / 2; i <= n; i++) {
    for (j = 2; j <= n; j = j * 2) {
        k = k + n / 2;
    }
}

A: O(n*logN)


5.
int a = 0, i = N;
while (i > 0) {
    a += i;
    i /= 2;
}

A: O(logN)

*/