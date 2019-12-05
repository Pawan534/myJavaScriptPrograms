
document.querySelector('h1').remove()

const all = document.querySelectorAll('p')
console.log(all)

all.forEach(function(item, index){
    console.log(`${index} --> ${item.textContent}`)

})

const newPara = document.createElement('p')
newPara.textContent = 'This is a new para created using js'

document.querySelector('body').appendChild(newPara)


document.querySelector('#add-all').addEventListener('click', function(e){
    const para = document.createElement('p')
    para.className="note"
    para.textContent = 'New data has been created after clicking'
    document.querySelector('body').appendChild(para)

})

document.querySelector('#remove-all').addEventListener('click', function(e){
    document.querySelectorAll(".note").forEach(function(item){
        item.remove();
    })
})

document.querySelector('#search-text').addEventListener('change', function(e){
    console.log(e.target.value)
})

document.querySelector('#search-textData').addEventListener('input', function(e){
    console.log(e.target.value)
})