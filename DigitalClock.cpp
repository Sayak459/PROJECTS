#include<stdio.h>
#include<windows.h>
int main()
{
	int d=1000;
	int h,m,s;
	printf("Enter present time\n");
	scanf("%d%d%d",&h,&m,&s);
	if(h>12 || m>60 || s>60)
		{
			printf("ERROR\n");
			exit(0);
		}
	while(1)
	{
		s++;
		if(s>60)
		{
			m++;
			s=0;
		}
		if(m>60)
		{
			h++;
			m=0;
		}
		if(h>12)
		{
			h=1;
		}
		printf("%02d:%02d:%02d\n",h,m,s);
		Sleep(d);
		system("cls");
	}
}
