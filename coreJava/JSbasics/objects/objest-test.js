let myGame = {
    title: 'Games of Thrones',
    autoher: 'George',
    price: '$100'
}

console.log(myGame)

console.log('Game name is : ' + myGame.title )
console.log('Author name: ' + myGame.autoher)
console.log(`My fav game is ${myGame.title} and developed by ${myGame.autoher} and price of game is ${myGame.price}`)


myGame.title= 'PubG'

console.log('Game name is : ' + myGame.title )

console.log('*************************************');


let personalDetails = {
    name: 'Jorge',
    age: 28,
    location: 'Germany'
}

console.log(`${personalDetails.name} is ${personalDetails.age} years old and lives in ${personalDetails.location}`)
console.log(`${personalDetails.name} is ${personalDetails.age + 1} years old and lives in ${personalDetails.location}`)
