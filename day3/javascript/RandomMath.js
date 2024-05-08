function generateRandomMath() {

const operators = ['+', '-', '/', '*']


const number1 = Math.floor(Math.random() * 10)w
const number2 = Math.floor(Math.random() * 10)


const operator = operators[Math.floor(Math.random() * operators.length)];


const expression = `${number1} ${operator} ${number2}`;

  return expression;
}



const randomExpression = generateRandomArithmetic();
console.log(randomExpression); // e.g., "3 + 7"