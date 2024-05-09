const prompt =require("prompt-sync")();
let inputs = [];

for(let j = 0; j < 9; j++){
	userInput = prompt("Enter alphabet{i + 1}:");
	inputs.push(userInput);
}
console.log(inputs);

let alphabetArray = new Array(3);

for(let i = 0; i <alphabetArray.length; i++) {
	alphabetArray[i] = new Array().push(userInput);

}