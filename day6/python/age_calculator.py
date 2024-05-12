from datetime import datetime, date

def age_calculator(date_of_birth_str):
   
     formatter = "%d-%m-%Y"
     date_of_birth = datetime.strptime(date_of_birth_str, formatter).date()
    
    # Get today's date
     today = date.today()

    # Calculate the age
     age = today.year - date_of_birth.year - ((today.month, today.day) < (date_of_birth.month, date_of_birth.day))

     return age 