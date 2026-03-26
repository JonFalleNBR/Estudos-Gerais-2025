const nums = [8, 6, 3, 9, 2, 7, 5, 1, 4];
const target = 10;

function twoSum(nums, target) {
  for (let i = 0; i < nums.length; i++) {
    for (let j = 0; j < nums.length; j++) {
      // O(n^2)
      if (nums[i] + nums[j] === target) {
        return [i, j];
      }
    }
    // The Time Complexty here is O(n^2)
    // The Space Complexity is O(1) because we are not using any extra space to store the pairs
  }
}

// Versao Otimizada em que usamos um hash map para armazenar os numeros e seus indices, eh o que chamamos de Space for Time Tradeoff, onde usamos mais espaco de memoria para armazenar os numeros e seus indices, mas ganhamos em tempo de execucao, pois conseguimos encontrar os pares em O(n) ao inves de O(n^2)
// Esse tradeOff eh recomendado em sistemas de alta performance, com alta carga de dados e onde o tempo de resposta eh critico, como em sistemas de busca, sistemas de recomendacao, etc.

function TwoSumOptimized(nums, target) {
  const map = new Map(); // O(n) space complexity -> ja piorou o Space Complexity, mas ganhamos em tempo de execucao

  for (let i = 0; i < nums.length; i++) {
    // O(n) time complexity
    const complement = target - nums[i]; // O(1) time complexity // complemento aqui seria o numero , subtraindo o target pelo numero atual que estamos iterando para encontrar o numero que falta para chegar no target

    if (map.has(complement)) {
      return [map.get(complement), i]; // O(1) time complexity
    }
    map.set(nums[i], i); // O(1) time complexity
  }
}
