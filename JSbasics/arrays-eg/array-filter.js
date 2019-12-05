let objA = [{
    title: 'Games of Thrones',
    author: 'George',
    price: '$100'
},{
    title: 'My life',
    author: 'Jenny',
    price: '$100'

},{
    title: 'Flying dreams',
    author: 'Terrace',
    price: '$900'

}
]

const findDetails = function(objA, query){
    return objA.filter(function(objA, index){
        const titleMatch = objA.title.includes(query)
        const authorMatch = objA.author.includes(query)
        return titleMatch || authorMatch
    })
}


console.log(findDetails(objA, 'life'))

