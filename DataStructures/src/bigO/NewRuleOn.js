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
