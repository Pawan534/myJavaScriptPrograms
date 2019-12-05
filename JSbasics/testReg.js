/*
function SimpleSymbols(str) {

    if (/^[a-zA-Z]/.test(str) || /[a-zA-Z]$/.test(str)) {
        return false;
    }
    else if (/[^+][a-zA-Z]/.test(str) || /[a-zA-Z][^+]/.test(str)) {
        return false;
    }
    else {
        return true;
    }
}

// keep this function call here 
// to see how to enter arguments in JavaScript scroll down
SimpleSymbols(readline());

**/

let str = 'hello world!';
let res = '/^[a-zA-Z]/'
let result = /wof/.test(str);
console.log(result); // true


var regex = /foo/g;

// regex.lastIndex is at 0
console.log(regex.lastIndex)
console.log(regex.test('foo')); // true

// regex.lastIndex is now at 3
console.log(regex.lastIndex)
console.log(regex.test('foo')); // false

// regex.lastIndex is at 0
console.log(regex.lastIndex)
console.log(regex.test('barfoo')); // false

// regex.lastIndex is at 6
console.log(regex.lastIndex)
console.log(regex.test('foobar')); // true


var regex1 = new RegExp( "foo", "g" );
var str1 = 'table football, foosball';

console.log('------------------>')
console.log(regex1.test(str1));