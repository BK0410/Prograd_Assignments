// Callback Function
// addition function - Callback - called inside another function
var addition = (n=0,m=0)=> {
    return n+m;
}

//default function - addition
const printSum = function(n,m,a=addition){
    var Sum = addition(n,m);
    console.log(Sum);
}

printSum(10,20);

