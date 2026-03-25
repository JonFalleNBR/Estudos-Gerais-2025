function printAllNumbersThenTheirPairs(numbers){
   

    console.log('these are the numbers:');
    numbers.forEach(function(number){
        console.log(number);
    });


    console.log('and these are their sums:');
    numbers.forEach(function(firstNumber){
        numbers.forEach(function(secondNumber){
            console.log(firstNumber + secondNumber);
        });

    });

}


