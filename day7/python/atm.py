balance = 0
withdraw = 0
deposit = 0
transfer = 0

transaction_list = []

print("Welcome to Lero's Banking Platform")


menu_display = print('''

	1. create an Account
	2. close Account
	3. Deposit Money
	4. Withdraw Money
	5. Check Account Balance
	6. Transger from one account to another
	7. Change pin
	8. Exit
	9. View Transcations
	''')


user_input = int(input("Enter your preffered number: "))

balance = deposit - withdraw
	
if user_input == 1:
	print("To create new Account")
	first_name = str(input("Enter firstName: "))
	last_name = str(input("Enter lastName: "))

	pin = int(input("Enter 4 numbers for pin: "))
	if pin != 4:
		print("Invalid pin")
	else:
		print("Account opened successfully")
		transaction_list.append(f"Account opened by  {first_name} {last_name}")

elif user_input == 2:
	print("Account sucessfully closed")
	transaction_list.append('Account closed')

elif user_input == 3:
	deposit = float(input("Deposit money: " ))
	print(f"Balance : " , deposit)
	transaction_list.append(f'Deposited: {deposit}')

elif user_input == 4:
	withdraw = float(input("Enter amount to withdraw: "))
	print(f"Balance: " , balance)
	transaction_list.append(f'Withdrawn: {withdraw}')

elif user_input == 5:
	print(f"Check Acount balance: " , balance)

elif user_input == 6:
	transfer = float(input("Enter amount to transfer: "))
	print("Your balance is : ", balance)
	transcation_list.append(f'Transferred: {transfer}')

elif user_input == 7:
	change_pin =int(input("Enter new pin: "))
	print("Pin change sucessfully")

elif user_input == 8:
	print("Exiting....")
	exit(0)

elif user_input == 9:
	print("Transcations: ")
	for transcation in transction_list:
		print(transcation)

else:
	print("Invalis option")
	 