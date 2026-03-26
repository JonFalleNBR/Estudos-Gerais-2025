// Retorna true se valor estiver duplicado dentro do array 

const array = [3, 1, 4, 2, 5, 3];

function isDuplicate(array){

    const set = new Set(); // O(n) space complexity

    for (let i = 0; i < array.length; i++) { // O(n) time complexity
        if(set.has(array[i])){
            return true; // O(1) time complexity
        }
        set.add(array[i]); // O(1) time complexity - armazena o valor atual de i para a proxima iteracao, para que possamos comparar com os proximos valores do array e verificar se tem algum valor duplicado
    }
    return false; // O(1) time complexity
}


/// Mesmo algoritmo mas com Map 

function isDuplicateWithMap(array){

const map = new Map(); // O(n) space complexity

for(let i = 0 ; i < array.length; i++){ // O(n) time complexity
    if(map.has(array[i])){
             return true; // O(1) time complexity

    }
    map.set(array[i], true); // O(1) time complexity - armazena o valor atual de i para a proxima iteracao, para que possamos comparar com os proximos valores do array e verificar se tem algum valor duplicado
}
return false 

}// O(1) time complexity


// Pior cenario com Complexidade O(n^2) 

function isDuplicateWithO2(array){

    for (let i = 0; i < array.length; i++) { // O(n) time complexity
        for(let j = i + 1; j < array.length; j++){
            if(array[i] === array[j]){
                return true; // O(1) time complexity
            }
        }
    }
    return false
}