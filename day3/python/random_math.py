import random

result = 0;
operations = ['+', '-', '*','/']
questions = 0;

number1 = random.randint(1, 10)
number2 = random.randint(1, 10)

operation = random.choice(operations)

print("You will be asked ten random questions")

for questions in range(1, 10):
#while questions < 10:
	operations = random.choice(operations)
	questions = '{} {} {}'.format(number1, operations, number2)
	print = ("What is " + str(number1) +str(operations) +str(number2), "?")
	
	answer =  input()

	
	if answer == '*':
		result = number1 * number2

	elif answer == '+':
		result = number1 + number2

	elif answer == '-':
		result = number1 - number2

	elif answer == '/':
		result = number1 / number2



print(f'{number1} {operations} {number2} = {result}')




