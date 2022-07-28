"use strict";

// iterates through an array and return a single value.
// Here it returns the sum of all numbers in an array.
var numbers = [10, 20, 30, 40];
var total = 0;
var sum = numbers.reduce(function (number, total) {
  return number + total;
});
console.log(sum);