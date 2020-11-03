#include<stdio.h>
int main()
{
	char op;
	printf("chon ngon ngu :");
	scanf("%c", &op);
	switch(op)
	{
		case 'A': 
		printf("\n Ngon ngu lap trinh Ada");
		break;
		
		case 'a': 
		printf("\n Ngon ngu lap trinh Ada");
		break;
		
		case 'B':
		printf("\n Ngon ngu lap trinh Basic");
		break;
		
		case 'b':
		printf("\n Ngon ngu lap trinh Basic");
		break; 
		
		case 'C':
		printf("\n Ngon ngu lap trinh Cobol");
		break;
		
		case 'c':
		printf("\n Ngon ngu lap trinh Cobol");
		break;
		
		case 'D':
     	printf ("\n Ngon ngu lap trinh dBase III");
     	break;
     	
     	case 'd':
     	printf ("\n Ngon ngu lap trinh dBase III");
     	break;
     	
        case 'F':
     	printf ("\n Ngon ngu lap trinh Fortran");
     	break;
     	
     	case 'f':
     	printf ("\n Ngon ngu lap trinh Fortran");
     	break;

        case 'P':
     	printf ("\n Ngon ngu lap trinh Pascal");
     	break;
     	
     	case 'p':
     	printf ("\n Ngon ngu lap trinh Pascal");
     	break;
     	
        case 'V':
     	printf ("\n Ngon ngu lap trinh Visual C++");
     	break;
     	
     	case 'v':
     	printf ("\n Ngon ngu lap trinh Visual C++");
     	break;
     	
     	default:
     	printf("\n Invalid");
     	break;
	}
	return 0;
}
