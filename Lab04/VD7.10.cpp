#include<stdio.h>
int main()
{
	char ch;
	
	printf("\nEnter a lower cased alphabet (a-z):");
	scanf("%c", &ch);
	
	if (ch < 'a' || ch > 'z') printf("\nCharacter not a lower cased alphabet");
	else 
	
	{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		 printf("\nCharacter is a vowel");;
		 break;
		 
		case 'x':
		 printf("\nLast alphabet (z) was entered");
		 break;
		 
		default;
		 printf("\nCharacter is a consonant");
		 break;	
	}
}
