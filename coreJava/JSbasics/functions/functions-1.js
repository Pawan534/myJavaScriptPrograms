let textMessage =  function() {
    console.log('Hello guys..');
}

textMessage()


/** Passing parameter to the function*/

let add = function(a,b){
    console.log(a + b);
}

let a=10, b=20, c=15;
add(a,b); //return 30
add(a, b, c);  //return 30


//Return value from method

let convertFahrenheitToCelsius = function(fahrenheit) {
    let celsius = (fahrenheit - 32) * 5/9;
    return celsius;
}

let convertFahrenheitToKelvin= function(fahrenheit) {
    let kelvin = (fahrenheit + 459.67) * 5/9;
    return kelvin;
}
let fahrenheit = 150;
let celsiusValue = convertFahrenheitToCelsius(fahrenheit);
let kelvinValue = convertFahrenheitToKelvin(fahrenheit);
console.log('Fahrenheit temp ' + fahrenheit);
console.log('celsius temp ' + celsiusValue);
console.log('kelvin temp ' + kelvinValue);