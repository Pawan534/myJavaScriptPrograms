const names = ['pawan', 'seenu', 'rakesh', 'anu']

console.log('Before using unshift method: ' + names)
names.shift();
names.unshift('My new data');
console.log(names)

names.splice(1,1, 'New splice data')

console.log(names)


let myTestData = [{
    title: 'Games of Thrones',
    autoher: 'George',
    price: '$100'
},{
    title: 'My life',
    autoher: 'Jenny',
    price: '$100'

},{
    title: 'Flying dreams',
    autoher: 'Terrace',
    price: '$900'

}
]


let query = 'My life'
const findDataByNote = function(myTestData, query){
   const res = myTestData.find(function(myTestData, index){
       return myTestData.title === query
   })
   return res
}

console.log(findDataByNote(myTestData, query))


const asd = ['jsgfshdfs', '342dsf', 'dsfs3242sdsf093219831']
const dd = 'sdfsdaerwlweq'
console.log(asd.reverse())