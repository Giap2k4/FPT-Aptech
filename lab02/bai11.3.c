#include <stdio.h>
//author code Dinh Giap
int main(){
	char alpha[26];
	int i, j;
	for(i=97, j=0; i<122; i++,j++)
	{
		alpha[j] = i;
		printf("The characted now assigned is %c \n", alpha[j]);
	}
	getchar();

return 0;
}

