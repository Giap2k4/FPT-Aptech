#include <stdio.h>

int main ()
{
	int a, b, c;
	int sum;
	
	printf("\n Enter any three numbers : ");
	scanf("%d %d %d", &a, &b, &c);
	
	sum = a + b + c;
	printf("\n sum = %d", sum);
	return 0;
}
