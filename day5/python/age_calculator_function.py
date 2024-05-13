from datetime import datetime, date

def age_calculator(date_of_birth_str):

	#formatter =  "%d-%m-%Y"
	#date_of_birth = datetime.strptime(date_of_birth_str, formatter).date()
	date_of_birth = datetime.strptime(date_of_birth_str, "%d-%m-%Y").date()

	
	today = date.today()
	# to calculate the age
	age = today.year - date_of_birth.year - ((today.month, today.day) < (date_of_birth.month, date_of_birth.day))
	
	return age 

#dob_str = int(input(Enter date of birth("d-m-y"): )
dob_str = "20-04-1991"
print(f"Age: {age_calculator(dob_str)}")