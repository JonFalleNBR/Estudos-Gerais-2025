function printFirstItemThenFirstHalfThenSayHi100Times(items) {
    console.log(items[0]); 

    var middleIndex = Math.floor(items.length / 2);
    var index = 0;

    while (index < middleIndex){
        console.log(items[index]); // O(n/2) or O(n) Because we ignore the constants that is spliting the array in half 
        index++;
    }

    for(var i = 0; i < 100; i++){
        console.log(' hi ') // O(100) 
    }
}

/* 

Note that the main time complexity os this code is o(n) - because we havbe to interact with 
the whole array to print the first half, however we have also a constant time complexity of
O(1) to print the first item of the array and another constan time complexity of O(100) or O(1) 
to print hi a hundred times, but we can and should ignore the constants and say that the time 
complexity predominat here is O(n) due the fact that the time execution of code is 
defined by the size of the input and the number of times that we have to 
execute the loop.
*/