//Rule -> consider the independets terms - different inputs

function compressBoxesTwice(boxes, boxes2) {
  boxes.forEach(function (boxes) {
    console.log(boxes);
  });

  boxes2.forEach(function (boxes) {
    console.log(boxes);
  });
}


/*

At the first moment we might think that the time complexity of this code is O(n)  or O(n + n) 
because here we got a two loops about two different arrays. This is a situation usually called 
as Nested Loops or Nested Iteration

But actually , the time complexity is O(n + m) because we gotta two loops about two 
different inputs, and we can`t say that the time complexity is O(n) because we got two different inputs,
 so we have to consider both of them in the time complexity of this code. 

 Mental shortcut -> when we got two loops about two different inputs, we have to consider both of them in the time complexity of the code, so we have to say that the time complexity is O(n + m) because we got two different inputs.

 The best thing about this code is the fact that both loops are completely independent. 

 If we have 2 loops about the same input, we can say that the time complexity is O(n)
 or even O(n^2) 

 But when we got two loops about two different inputs, we have to consider both of them in the time complexity of the code, 
 so we have to say that the time complexity is O(n + m) because we got two different inputs.

*/