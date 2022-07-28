//Iterates through every element and returns an array.

const alphabets = ['a','b','c','d','e','f','g','h'];
const details = [{name:'BARATH',age:21},{name:'SANJAI',age:16},{name:'SUJATHA',age:50}];

console.log(alphabets.map(i => {
    return i;
}))

console.log(details.map(j => {
    return j.name;
}));