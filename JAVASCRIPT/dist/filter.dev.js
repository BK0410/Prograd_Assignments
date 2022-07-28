"use strict";

//.filter() method - filters based on a condition which can be a function.
var numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];

var isEven = function isEven(input) {
  return input % 2 === 0;
}; //filters even numbers


console.log("Even: ", numbers.filter(isEven)); //filters odd numbers.

console.log("Odd: ", numbers.filter(function (input) {
  return input % 2 !== 0;
}));