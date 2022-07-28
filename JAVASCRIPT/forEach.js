// forEach - Iterates through every element.
const alphabets = ['a','b','c','d','e','f','g','h'];

alphabets.forEach(i => {
    console.log(i);
});

const details = [{name:'BARATH',age:21},{name:'SANJAI',age:16},{name:'SUJATHA',age:50}];

// forEach returns undefined.
console.log(details.forEach(j => {
    return j.name;
}));