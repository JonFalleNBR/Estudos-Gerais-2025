const boxes = ["a", "b", "c", "d", "e"];

function logAllPairsOfArray(array) {
  for (let i = 0; i < array.length; i++) {
    for (let j = 0; j < array.length; j++) { // The point where we have a nested Loop, and get a quadratic time complexity, or an O(n^2) time complexity, because we have two loops that depend on the size of the input, and we have to execute it n times for each loop, so we have n * n = n^2 operations.
      console.log(array[i], array[j]);
    }
  }
}

logAllPairsOfArray(boxes);

/***************
 *
 * This exercise is part of the class Rule Number Three, which is about Nested Loops or Nested Iteration.
 * here we gotta two loops and both of them are about hte same array , so we can
 * say that the time complexity of this is O(n * n ) or O(n^2) because we got two loops about the same array.
 *
 * This is called Quadradic Time complexity, because as the number of elements increases, the time of
 * operations increases quadratically. For example, if we have 10 elements, we will have 100 operations, if we have 100 elements, we will have 10,000 operations and so on.
 *
 *
 * In this code, we gotta 5 elements in the array, so we will have 25 operations in the loops.
 * *************/
