function anotherFunChallenge(input) {
  let a = 5;
  let b = 10;
  let c = 50;

  for (let i = 0; i < input; i++) { 
    let x = i + 1;
    let y = i + 2;
    let z = i + 3;
  }
  for (let j = 0; j < input; j++) {
    let p = j * 2;
    let q = j * 2;
  }

  let WhoAmI = "I Don`t Know";
}

/* 
 O(4 + 5n)
 but, we should ignore the constants and say that the time of complexity is O(n), or whatever 
 is the predominant complexity of the code - that`s a value trick to interviews and 
 identify quickly the complexity of the code, but in general, we should say that the
  time complexity of this code is O(n) because the time of execution of the code is defined 
 by the loops and the size of the input, and not by the constants.

 In this case -> O(4 + 5n) -> O(n) because we ignore the constants and the predominant 
 factor is n, that is the size of the input
  and the number of times that we have to execute the loops.
*/