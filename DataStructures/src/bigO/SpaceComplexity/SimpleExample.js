function boooo(n) {
  for (let i = 0; i < n.length; i++) {
    console.log("boooo");
  }
}

boooo([1, 2, 3, 4, 5]); // O(1)

// another example with hiher space complexity

function arrayOfHiNTimes(n) {
  let hiArray = [];

  for (let i = 0; i < n; i++) {
    hiArray[i] = "hi";
  }
  return hiArray;
}

arrayOfHiNTimes(6); // O(n) because we have to create an array of
//  n size and fill it with hi,
//  so the space complexity is defined by the size
// of the input.

/* 

    The Space time complexity is defined by 
    the size of the input and the amount of the space that we 
    use

*/
