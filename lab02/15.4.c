#include <stdio.h>
int main(){
	register int i;
	int no, digit, sum;
	printf("\nThe number whose Sum of Cubes of Digits is Equal to the number itselt are :\n\n");
	for(i=1;i<999;i++)
	{
		sum = 0;
		no = i;
		while(no)
		{
			digit = no%10;
			no = no/10;
			sum = sum + digit * digit * digit;
		}
		if(sum==i)
			printf("%d\n", i);
	}
}

