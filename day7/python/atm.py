balance = 0
withdraw = 0
deposit = 0
transfer = 0

transaction_list = []

print("Welcome to Lero's Banking Platform")

def menu_display():
    print('''
    Welcome to Lero's Banking Platform
    Press:
    1. Create an Account
    2. Close Account
    3. Deposit Money
    4. Withdraw Money
    5. Check Account Balance
    6. Transfer from one account to another
    7. Change pin
    8. Exit
    9. View Transactions
    ''')

while True:
    menu_display()
    user_input = int(input("Enter your preferred number: "))

    balance = deposit - withdraw

    if user_input == 1:
        print("To create a new Account")
        first_name = str(input("Enter firstName: "))
        last_name = str(input("Enter lastName: "))

        
        pin = int(input("Enter 4 numbers for pin: "))
        if len(str(pin)) != 4:
            print("Invalid pin")
        else:
            print("Account opened successfully")
            transaction_list.append(f"Account opened by {first_name} {last_name}")

    elif user_input == 2:
        print("Account successfully closed")
        transaction_list.append('Account closed')

    elif user_input == 3:
        amount = float(input("Deposit money: "))
        deposit += amount 
        balance += amount
        print(f"Balance: {balance}")
        transaction_list.append(f'Deposited: {amount}')

    elif user_input == 4:
        amount = float(input("Enter amount to withdraw: "))
        if amount <= balance:  
            withdraw += amount
            balance -= amount
            print(f"Balance: {balance}")
            transaction_list.append(f'Withdrawn: {amount}')
        else:
            print("Insufficient funds")

    elif user_input == 5:
        print(f"Check Account balance: {balance}")

    elif user_input == 6:
        amount = float(input("Enter amount to transfer: "))
        if amount <= balance:
            transfer += amount  
            balance -= amount
            print("Your balance is: ", balance)
            transaction_list.append(f'Transferred: {amount}')
        else:
            print("Insufficient funds")

    elif user_input == 7:
        change_pin = int(input("Enter new pin: "))
        if len(str(change_pin)) == 4: 
            print("Pin change successfully")
            transaction_list.append('Pin changed')
        else:
            print("Invalid pin length")

    elif user_input == 8:
        print("Exiting....")
        break

    elif user_input == 9:
        print("Transactions: ")
        for transaction in transaction_list:
            print(transaction)

    else:
        print("Invalid option")
