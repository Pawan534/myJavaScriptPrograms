let myTestData = [{
    title: 'My next trip',
    autoher: 'George',
    price: '$100'
},{
    title: 'Habbits to work on',
    autoher: 'Jenny',
    price: '$100'

},{
    title: 'Flying dreams',
    autoher: 'Terrace',
    price: '$900'

}
]

// Sorting array object

const sortMyArray = function(myTestData){
    myTestData.sort(function(a,b){
        if(a.title.toLowerCase() < b.title.toLowerCase()){
            return -1
        } else if(b.title.toLowerCase() < a.title.toLowerCase()){
            return 1
        } else{
            return 0
        }
    })
}

sortMyArray(myTestData);
console.log(myTestData);

const sortCharts = ['f', 'd', 'a', 'i']
const sortNum = [10, 99, 1, 0, 18, -4]

console.log(sortCharts.sort())
console.log(sortNum.sort())
