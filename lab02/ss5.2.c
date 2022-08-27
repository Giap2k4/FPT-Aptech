#include <stdio.h>

int main()
{
	int a, b, c, d;
	a = 50;
	b = 24;
	c = 68;
	d = a*b+c/2;
	printf("\n a*b+c/2 is : %d", d);
	d = a%b;
	printf("\n a mod b is : %d", d);
	d = a*b-c;
	printf("\n a*b-c is : %d", d);
	d = a/b+c;
	printf("\n a/b+c is : %d", d);
	d = a+b*c;
	printf("\n a+b*c is : %d", d);
	d = (a+b)*c;
	printf("\n (a+b)*c is : %d", d);
	d = a*(b+c+(a-c)*b);
	printf("\n a*(b+c(a-c)*b) is : %d", d);
	
	
}
