"use strict";

// forEach - Iterates through every element.
var alphabets = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'];
alphabets.forEach(function (i) {
  console.log(i);
});
var details = [{
  name: 'BARATH',
  age: 21
}, {
  name: 'SANJAI',
  age: 16
}, {
  name: 'SUJATHA',
  age: 50
}]; // forEach returns undefined.

console.log(details.forEach(function (j) {
  return j.name;
}));