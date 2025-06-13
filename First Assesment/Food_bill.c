#include<stdio.h>
struct MenuItem {
    char name[50];
    float price;
};

main()
{
	struct MenuItem menu;
    int menu_size;
    int choice,ch=0;
    int quantity,loop=1;
    float total_bill,price,total1,total2,total3,total4;
	while(loop==1)
	{
		printf("\n*****Menu*****");
		printf("\n1 Pizza Price 180rs/pcs");
		printf("\n2 Burger Price 100rs/pcs");
		printf("\n3 Dosa Price 120rs/pcs");
		printf("\n4 Idli Price 50rs/pcs");
		
		int menu_size;
		printf("\nPlease Enter Your Choose : ");
		scanf("%d",&ch);
		
		
		if(ch==1)
		{
			price=180;
			printf("You Have selected Pizza!!\n");
			printf("Enter Quantity : ");
			scanf("%d",&quantity);
			if (quantity > 0 ) 
			{
           	
            	total1 = 180*quantity;
            	printf("\nTotal Amount : %f",total1);
            	
	        } 
			else 
			{
	            printf("Invalid choice. Please try again.\n");
	        }
	        printf("\nAmount : %f\n",total1);
	        char ch1[1];
	        printf("Do you want to add another item?(yes/no): ");
        	scanf("%s",&ch1);
	    	if(strcmp(ch1,"n")==0)
	        {
	        	break;	
			}
		}
		else if(ch==2)
		{
		
			price=100;
			printf("You Have selected Burger!!\n");
			printf("Enter Quantity : ");
			scanf("%d",&quantity);
			
			total2 = price * quantity;
            
			printf("Amount %f\n",total2);
	        char ch1[1];
	        printf("Do you want to add another item?(yes/no): ");
        	scanf("%s",&ch1);
	    	if(strcmp(ch1,"n")==0)
	        {
	        	break;	
			}
		}
		else if(ch==3)
		{
			
			price=120;
			printf("You Have selected Dosa!!\n");
			printf("Enter Quantity : ");
			scanf("%d",&quantity);
			
			total3 = price * quantity;
            
			printf("Amount %f\n",total3);
			printf("Do you want to add another item?(yes/no): ");
        	char ch1[1];
	        printf("Do you want to add another item?(yes/no): ");
        	scanf("%s",&ch1);
	    	if(strcmp(ch1,"n")==0)
	        {
	        	break;	
			}
		}
		else if(ch==4)
		{
			
			price=50;
			printf("You Have selected Idli!!\n");
			printf("Enter Quantity : ");
			scanf("%d",&quantity);
			
			total4 = price * quantity;
            
			printf("Amount %f\n",total4);
		
	        char ch1[1];
	        printf("Do you want to add another item?(yes/no): ");
        	scanf("%s",&ch1);
	    	if(strcmp(ch1,"n")==0)
	        {
	        	break;	
			}
		}
		else
		{
			break;
		}	
	}	
	total_bill=total1+total2+total3+total4;
	printf("Total_bill : %f\n",total_bill);	
}
