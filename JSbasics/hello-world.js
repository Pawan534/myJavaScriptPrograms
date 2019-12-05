console.log('Hello world..!!');
console.log('Hello world..!!');


/** String elements */


let fname='Pawan';
let lname='Kumar'

console.log(fname + ' ' + lname);

/** Sample test program to print city, country and location */

console.log('\n*************************************');
console.log('Sample test program to print location');
console.log('*************************************');

let city='Philadelpia';
let country = 'US';
let location = city + ' , ' + country;

console.log(location);



console.log('\n*************************************');
console.log('Program to print temparature in Kelvin and Celsius');
console.log('*************************************');

let fahrenheit = 150;
let celsius = (fahrenheit - 32) * 5/9;
let kelvin = (fahrenheit + 459.67) * 5/9;

console.log('Fahrenheit temp ' + fahrenheit);
console.log('celsius temp ' + celsius);
console.log('kelvin temp ' + kelvin);

let temp = '31', t = 31;
let isFreez = temp === 31;
let isFreeze = t === 31;

console.log(isFreez);
console.log(isFreeze);
console.log(temp == 31);
console.log(t == 31);

let nameTS = 'T';
let nT;
if(true){ 
    nameTS = 'in if block';
    let nT = 'Initialize ' + nameTS;
    console.log(nameTS)
    console.log(nT)
} 



if(true){
    console.log(nameTS)
    console.log(nT)
}

