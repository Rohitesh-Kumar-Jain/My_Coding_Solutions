#include <iostream>
using namespace std;
class bankAccount {
    string name;
    int accountNo;
    double balance;

public:
    bankAccount(string name, int accountNo, double balance){
        this->name = name;
        this->accountNo = accountNo;
        this->balance = balance;
    }

    void depositAmount(int amount){
        balance += amount;
    }

    void withdrawAmount(int amount){
        if (balance - amount > 0) {
            balance -= amount;
        } else {
            cout<<"You don't have enough money, consider applying for our low interest personal loan :)"<<endl;
        }
    }

    void display(){
        cout<<"name: "<<name<<endl;
        cout<<"balance: "<<balance<<endl;
    }

};
int main() {
    bankAccount r("rohitesh",9211420,100);
    r.display();
    r.depositAmount(50);
    r.display();
    r.withdrawAmount(200);
    r.display();
    return 0;
}