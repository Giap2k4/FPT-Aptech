#include <stdio.h>

int main()

{
	int a = 5, b = 6, c = 7;
	printf( "int a = 5, b = 6, c = 7;\n");
	printf("a > b is \t%i\n\n", a > b);
	printf( "b < c is \t%i\n\n", b < c);
	printf("a + b >= c is \t%i\n\n", a + b >= c);
	printf("a - b <= b - c is \t%i\n\n", a - b <= b - c);
	printf("b - a == b - c is \t%i\n\n", b - a == b - c);
	printf("a*b != C * c is \t%i\n\n", a * b < c * c);
	printf("Result of a>10 && b<5 = %d\n\n", a>10 && b<5);
	printf("Result of a>100 || b<50 = %d\n\n", a>100 || b<50);
	
	
}
