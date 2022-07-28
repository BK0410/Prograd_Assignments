//Function assigned to Variable.
var addition = (n=0,m=0)=> {
    return n+m;
}

let a = addition;
console.log(addition(10,20));
console.log(a(20,20));