// iterates through an array and return a single value.
// Here it returns the sum of all numbers in an array.
const numbers = [10, 20, 30, 40];
 
let total = 0;

const sum = numbers.reduce((number, total) => {  
  return number + total;
});
 
console.log(sum);