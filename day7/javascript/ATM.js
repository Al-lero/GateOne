const promptSync = require('prompt-sync')();


let balance = 0;
let withdraw = 0;
let deposit = 0;
let transfer = 0;

const listOfTransactions = [];

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

const mainMenu = `
Welcome to Lero's Banking Platform
Press:
1 -> Create an Account
2 -> Close Account
3 -> Deposit Money
4 -> Withdraw Money
5 -> Check Account Balance
6 -> Transfer from one account to another
7 -> Change pin
8 -> Exit
9 -> View Transactions
`;


const askQuestion = (question) => {
  return new Promise((resolve, reject) => {
    readline.question(question, (input) => resolve(input));
  });
};
  while (true) {
    console.log(mainMenu);
    const userInput = ('Enter your preferred number: ');
    
    balance = deposit - withdraw - transfer;

    switch (parseInt(userInput)) {
      case 1:
        console.log('To create new account');

        const firstName = ('Enter firstName: ');

        const lastName = ('Enter lastName: ');

        const number = ('Enter 4 numbers for pin: ');
        if (number.length !== 4) {
          console.log('Invalid pin');
        } 
	
	else {
          console.log('Account opened successfully');
          listOfTransactions.push(`Account opened by ${firstName} ${lastName}`);
          
        }
        break;
     case 2:
        console.log('Account successfully closed');
        listOfTransactions.push('Account closed');
        break;
      case 3:
        deposit = parseFloat('Deposit money: ');
	 deposit += amountToDeposit;
        balance += amountToDeposit;
        console.log(`Balance: ${deposit}`);
        listOfTransactions.push(`Deposited: ${deposit}`);
        break;
      case 4:
        withdraw = parseFloat('Withdraw money: ');
        console.log(`Balance: ${balance}`);
	if (amountToWithdraw <= balance) {
          withdraw += amountToWithdraw;
          balance -= amountToWithdraw;
        listOfTransactions.push(`Withdrawn: ${withdraw}`);
	}
	 else {
          console.log('Insufficient funds');
        }
        break;
      case 5:
        console.log(`Check Account balance: ${balance}`);
        break;
      case 6:
        transfer = parseFloat('Amount to transfer: ');
	 if (amountToTransfer <= balance) {
          transfer += amountToTransfer;
          balance -= amountToTransfer;
        console.log(`Your balance is: ${balance}`);
        listOfTransactions.push(`Transferred: ${transfer}`);
	}
	 else {
          console.log('Insufficient funds');
        }
        break;
      case 7:
        const pin = ('Change pin: ');
        console.log('Pin changed successfully');
        listOfTransactions.push('Pin changed');
        break;
      case 8:
        console.log('Exiting...');
        process.exit(0);
        break;
      case 9:
        console.log('Transactions:');
        listOfTransactions.forEach(transaction => {
          console.log(transaction);
        });
        break;
      default:
        console.log('Invalid option');
    }
  }




