const names = ['Henry', 'Jack', 'Amy', 'Ronald', 'Stepine', 'Sosw']
console.log(`My array have this values ${names}`)

console.log(`\n Deleting the 3rd item`)

names.splice(2,1)

console.log(`After Deleting the 3rd item, my array contains this items----> ${names}`)

console.log(`\n Adding new item to the end of my array`)

names.push('Jony new data')

console.log(`After Adding new item, my array contains this items-----> ${names}`)

console.log(`\n remove first item from my array`)

names.shift();

console.log(` After remove first item from my array, my array contains this items ----> ${names}`)



//For each

const numA = [1, 4, 8, 10, 22, 41]

numA.forEach(function(item, index){
    console.log(index + '-->' + item)
})


