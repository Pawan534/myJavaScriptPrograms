
//Letter challenge
/** 
 * Letter Changes
HIDE QUESTION
Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. 
Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
*/


function LetterChanges(str) { 

    // code goes here  
    
    let expectedRes = str.split('')
    let res = [];
    let regExp = ''; 
    let vowels = 'aeiou'
    
    expectedRes.forEach(function(item, index){
      if (item.match('^[a-zA-Z]')){
        res[index] = String.fromCharCode(item.charCodeAt()+1)
        regExp += vowels.includes(res[index].toLowerCase()) ? res[index].toUpperCase(): res[index]
      }else{
        res[index] = item
        regExp += item
      }
      
    })
    
    return regExp; 
  
  }
     
  // keep this function call here 
  console.log(LetterChanges(readline()));