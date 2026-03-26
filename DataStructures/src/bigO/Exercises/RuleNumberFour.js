const numbers = [1,2,3,4,5];

function printAllNumbersThenTheirPairs(numbers){
   

    console.log('these are the numbers:');
    numbers.forEach(function(number){ // O(n)
        console.log(number);
    });


    console.log('and these are their sums:');
    numbers.forEach(function(firstNumber){
        numbers.forEach(function(secondNumber){ // O(n^2)
            console.log(firstNumber + secondNumber);
        });

    });

}

/* 
At the first moment we might think that the major time complexity in this case would be O(n^2) because we got a nested loop in the second part of the function

First - we got a O(n + n^2) -> but we should ignore constants and focus in the worst case, so we can say here we have a O(n^2) time complexity, but we can do better than that.

This is the rule number four -> in these cases, we should Drop the non-dominant terms, which here is O(n) and we should focus only in the dominant term wich is O(n^2) because it grows faster than O(n) and it will dominate the time complexity of the code, so we can say that the time complexity of this code is O(n^2) because we got a nested loop in the second part of the function.

*/ 

printAllNumbersThenTheirPairs(numbers);

