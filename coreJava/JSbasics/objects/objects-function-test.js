let myBook = {
    title: 'Games of Thrones',
    autoher: 'George',
    pageCount: 380
}

let myPersonalBook = {
    title: 'Life journey',
    autoher: 'Jerry',
    pageCount: 170
}

let getBookDetails = function(book){

    console.log(`${book.title} by ${book.autoher} and have ${book.pageCount}`)
}

getBookDetails(myBook)
getBookDetails(myPersonalBook)

// return statement

let getBookDetail = function(book){

    return {
        summary: `${book.title} by ${book.autoher}`,
        pageCountSummary: `${book.title} is ${book.pageCount} pages long`
    }
}


let bookSummary = getBookDetail(myBook)
let otherBookSummary = getBookDetail(myPersonalBook)

console.log(bookSummary)
console.log(bookSummary.summary)
console.log(otherBookSummary)


