"use strict";

//Function assigned to Variable.
var addition = function addition() {
  var n = arguments.length > 0 && arguments[0] !== undefined ? arguments[0] : 0;
  var m = arguments.length > 1 && arguments[1] !== undefined ? arguments[1] : 0;
  return n + m;
};

var a = addition;
console.log(addition(10, 20));
console.log(a(20, 20));