import age_calculator

def test_age_calculator(date_of_birth_str):
	dob_str = input("Enter date of birth('d-m-y'): ")

	print(f"Age: {age_calculator(dob_str)}")
