#include<iostream>
using namespace std;

class ATM_bank{
	
	public:
		int pinno,ac_no,balance=2000;
		string name,address,location;
		int de,we;
		
		deposite()
		{
			cout<<"The Name Of Account Holders Are : ";
			cin>>name;
			cout<<"The Account Holder's Address is : ";
			cin>>address;
			cout<<"The Branch Location is: ";
			cin>>location;
			cout<<"Account Number : ";
			cin>>ac_no;
	
			cout<<"Present Available Balance : "<<balance<<endl;
			cout<<"Enter The Amount to be Deposited RS. ";
			cin>>de;
			
			balance = balance+de;
			
			cout<<"Your New available Balanced Amount is RS. "<<balance<<endl;
			cout<<"THANK YOU!!";
		}
		withdraw()
		{
			cout<<"The Name Of Account Holders Are : ";
			cin>>name;
			cout<<"The Account Holder's Address is : ";
			cin>>address;
			cout<<"The Branch Location is: ";
			cin>>location;
			cout<<"Account Number : ";
			cin>>ac_no;
			cout<<"Enter Amount for Withdraw : ";
			cin>>we;
			if(we>balance)
			{
				
				cout<<"Insufficient Balance in your account."<<endl;
				cout<<"SORRY!!";
				
				balance = balance-we;
				cout<<"Your withdraw amount is : "<<we<<endl;
			}
		}
		check_balance()
		{
			cout<<"Your Balance is : "<<balance<<endl;
		}

};

main()
{
	ATM_bank obj;
	int pinno=12345;
	
	cout<<"\n*****WELCOME TO ATM*****\n";
	cout<<"\n------------------------\n";
	cout<<"\nCurrent Date : Wed 05 june 03:15 2025\n";
	cout<<"\n------------------------\n";
	cout<<"\n\nPress 1 and then press Enter to Access your account via pin number \n";
	cout<<"Or\nPress 0 for Enter to get help.\n";
	
	cout<<"\nEnter your account pin Access Number!![Only one attempt is allowed] "<<endl;
	cin>>pinno;
	cout<<"\n------------------------\n";
	
	if(pinno==12345)
	{
		cout<<"\nYou must have the correct pin number to access this account. \nSee your bank representative for assistance during bank opening hours \nThanks for, your choice today!!"<<endl;
		cout<<"\nEnter [1] for Deposite Cash"<<endl;
		cout<<"Enter [2] for Withdraw Cash"<<endl;
		cout<<"Enter [3] for Balance Inquiry"<<endl;
		cout<<"Enter [4] for Exit ATM"<<endl;
		
		cout<<"\nPLEASE ENTER A SELECTION AND PRESS RETURN KEY\n";
		
		int ch1;
		cout<<"\nEnter Choice : ";
		cin>>ch1;
		if(ch1==1)
		{
			obj.deposite();
		}
		else if(ch1==2)
		{
			obj.withdraw();
		}
		else if(ch1==3)
		{
			obj.check_balance();
		}
		else if(ch1==4)
		{
			cout<<"Thank you!!";
			
		}
	}
	
	else
	{
		cout<<"You had made your attempt which failed!! No more attempt allowed!! Sorry!!"<<endl;
	}
	
	
}
