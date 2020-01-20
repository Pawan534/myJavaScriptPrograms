let myAcct = {
    name: 'Pawan',
    expenses: 0,
    income: 0
}

let anotherAcct = myAcct
anotherAcct.income=1000

let addExpense = function(acct, expenseAmt) {
    acct.expenses = expenseAmt + acct.expenses
    console.log(acct)
}

addExpense(myAcct, 12.8)
console.log(myAcct)