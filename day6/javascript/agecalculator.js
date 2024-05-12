function calulateAge(dateOfBirthStr) {
	const formatter = 'DD-MM-YYYY';
	const dateOfBirth = moment(dateOfBirthStr, formatter);
	const today = moment();
	const age = today.diff(dateOfBirth, 'years');
	return age;

	}

const dateOfBirth = '20-04-1991"
const age = calculateAge(dateOfBirth);
console.log('Age: ', age);