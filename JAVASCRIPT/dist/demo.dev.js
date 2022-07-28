"use strict";

// Callback Function
// addition function - Callback - called inside another function
var addition = function addition() {
  var n = arguments.length > 0 && arguments[0] !== undefined ? arguments[0] : 0;
  var m = arguments.length > 1 && arguments[1] !== undefined ? arguments[1] : 0;
  return n + m;
}; //default function - addition


var printSum = function printSum(n, m) {
  var a = arguments.length > 2 && arguments[2] !== undefined ? arguments[2] : addition;
  var Sum = addition(n, m);
  console.log(Sum);
};

printSum(10, 20);