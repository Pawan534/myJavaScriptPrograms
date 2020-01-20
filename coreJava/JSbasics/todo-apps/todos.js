const todos = [{
    text: 'Order cat food',
    completed: false
}, {
    text: 'Clean kitchen',
    completed: true
}, {
    text: 'Buy food',
    completed: true
}, {
    text: 'Do work',
    completed: false
}, {
    text: 'Exercise',
    completed: true
}]

const inCompleteTodos = todos.filter(function(item){
    return !item.completed
})

const summary = document.createElement('h2')
summary.textContent = `You have ${inCompleteTodos.length} todos left`
document.querySelector('body').appendChild(summary)


todos.forEach(function(item){
    const newPara = document.createElement('p')
    console.log(item.text)
   newPara.textContent = item.text
   document.querySelector('body').appendChild(newPara)
})


document.querySelector('button').addEventListener('click', function(){
    console.log('Added')
})

