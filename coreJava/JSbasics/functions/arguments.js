let getScoreDetails = function(name='Anonymous', score=0) {
    return 'Name: ' + name + ' Score: ' + score;
}

console.log(getScoreDetails())

let details = getScoreDetails('Pawan', 85)
console.log(details);


// tip calculation

let tipAmount = function(totalAmt, tipPercent) {
    return totalAmt * tipPercent;
}

let tipAmtCustomerA = tipAmount(150, 0.05);

let tipAmtCustomerB = tipAmount(3800, 0.12);

console.log('Tip paid by customer A ' + tipAmtCustomerA);

console.log('Tip paid by customer B ' + tipAmtCustomerB);



let name = 'Pawan'

console.log(`Hey my name is ${name}`)


// tip calculation with template format return value

let tipAmtA = function(totalAmtA, tipPercentA) {
    return `A ${tipPercentA * 100}% tip on $${totalAmtA} would be $${totalAmtA * tipPercentA}`
}

console.log(tipAmtA(195, 0.25))