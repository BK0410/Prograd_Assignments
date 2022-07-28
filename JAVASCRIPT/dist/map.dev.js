"use strict";

//Iterates through every element and returns an array.
var alphabets = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'];
var details = [{
  name: 'BARATH',
  age: 21
}, {
  name: 'SANJAI',
  age: 16
}, {
  name: 'SUJATHA',
  age: 50
}];
console.log(alphabets.map(function (i) {
  return i;
}));
console.log(details.map(function (j) {
  return j.name;
}));