// RULE -> Consider the Worst Case Scenario

const name = "Rule One";

function findTheLetter(name){
    for(let i = 0; i < name.length; i++){
    
        if(name[i] === 'n'){
            console.log("Found at index " + i);  // O(n) BECAUSE we have to interate with the entire string to find the letter n
            break
        }
    }
}

findTheLetter(name);

/* 
Notice here the fact that it doesn`t matter how big the string, the array or whatever the item is 
the main complexity here is O(n) becausse we have to interate with the entire object to find the letter -
or, find the condition that we are looking for. 

O(n) is always named as Linear Complexity - Which increases in the direct proportions of the size of the 
elements in the input.
*/
