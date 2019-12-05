let testA = [1, 3, 9]

//console.log(testA)



let objA = [{
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


const findNote = function(objA, expTitle) {
    // it will retrun the index
    const index =  objA.findIndex(function(objA, index){
        return objA.title === expTitle
    })
    return objA[index]
}

const findNoteFF = function(objA, expTitle) {
    // it will retrun value
    const res =  objA.find(function(objA, index){
        return objA.title === expTitle
    })
    return res
}


console.log(findNote(objA, 'Flying dreams')); 
console.log(findNoteFF(objA, 'My life')); 
/** 

let aObj = {}
let bObj = aObj
console.log(aObj === bObj)
console.log(objA)

const index =  objA.findIndex(function (item, index){
    console.log(item)
    return item.title ==='My life'
})

console.log(index); 


*/