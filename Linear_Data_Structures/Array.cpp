/*
 This program is written to help you understand
 how data is stored in an array.
 */
#include<iostream>
using namespace std;
int main(){

	char name[6] = {'E','p','h','r','e','m'};
	int phone_number[5]={9,40,47,74,96};
	/* accessing an array using conventional way*/
	cout<<"One way of of accessing an array is using array_name[index] as follow:"<<endl;
	for(int i=0;i<6;i++){
		cout<<"Element "<<(i+1)<<" is "<<name[i]<<endl;
	}
	cout<<"We can also acces an array  using array name as pointer like this"<<endl;
	for(int i =0;i<6;i++){
		cout<<"Element "<<(i+1)<<" is "<<*(name+i)<<endl;
	}
	//let us see how arrays are stored in a sequential manner
	cout<<"Each element is a  name char array will take a mermory space of 8 bits which is equal to one word size and this can be demonstrated as follow:"<<endl;
	for( int i=0;i<5;i++){
		cout<<"Element "<<(i+1)<<" of name is stored at memory location of "<<(void*)&name[i]<<endl;
	}
	cout<<"However, when it comes to integer array one element will take a memory space of 32 bit which is equal to 4 word size"<<endl;
	for( int i=0;i<5;i++){
		cout<<"Element "<<(i+1)<<" of phone_number is stored at memory location of "<<&phone_number[i]<<endl;}
	//cout<<(void*)&x[0]<<endl;
	//cout<<(void*)&x[1]<<endl;
	//cout<<&x[2]<<endl;
	//cout<<&x[3]<<endl;
	//cout<<&*(x+4)<<endl;
	return 0;
}
