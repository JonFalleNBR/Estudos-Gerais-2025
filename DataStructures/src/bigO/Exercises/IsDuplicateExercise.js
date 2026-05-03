// Retorna true se valor estiver duplicado dentro do array

const array = [3, 1, 4, 2, 5, 3];

function isDuplicateWithSet(array) {
  const set = new Set(); // O(n) space complexity

  for (let i = 0; i <= array.length; i++) {
    if (set.has(array[i])) {
      return true; // O(1) time complexity
    }
  }
}

/// Mesmo algoritmo mas com Map

function isDuplictedWithMap(array){
    const map = new Map(); // O(n) space complexity

     for(let i = 0; i <= array.length; i++){
        if(map.has(array[i])){
            return true     // O(1) time complexity

        }

        map.set(array[i], true)  // O(1) time complexity
    }
    return false; 
}

// Pior cenario com Complexidade O(n^2)

function isDuplicateWithO2(array) {
  for (let i = 0; i < array.length; i++) {
    // O(n) time complexity
    for (let j = i + 1; j < array.length; j++) {
      if (array[i] === array[j]) {
        return true; // O(1) time complexity
      }
    }
  }
  return false;
}
