const names = ['pawan', 'seenu', 'rakesh', 'anu']

console.log(`Array values: ${names}`)
console.log(`Length of array: ${names.length}`)
console.log(`Value of array at index 0 is ${names[0]}`)

console.log(names.pop())
console.log(`Array values after deleting last item: ${names}`)

names.push('Krish')
console.log(`Array values after inserting new item: ${names}`)

console.log(names.shift())
console.log(names)
console.log(names.unshift('Pawan'))
console.log(names)

console.log('\n***********************************************************\n')
const namesTest = ['abc', 'bcd', 'cde', 'def']
console.log(`My new array is ${namesTest}`)
console.log('\n********************After Splice***************************************\n')

namesTest.splice(1, 1, 'New value')
console.log(namesTest)