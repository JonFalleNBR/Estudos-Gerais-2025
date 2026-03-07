function funChallenge(input){
    let a = 10 
    a = 50 + 3

    for (let i = 0; i < input.length, i++;){
        anotherFunction(); 
        let stranger = true
        a++

    }

    return a
    
}


/* 
This code is part of and exercise to understand the time complexity of algorithms

Answering questions 
    1 - what this codes does ?  This code starts with a variable assignaded as 10, then , it reassings as 53 - this still O(1) because it doesn`t matter how the size of the input, the value of a still 53 
                But, when we havet to start a loop to interate the input.length, the time complexity of the code increases to O(N), due the fact that all the line codes inside this loops depends of the size of the input and the number o f times that we have to exexute it 
    2 - what is the time complexity of this code ? In general, the time execution of this code is O(n), once the complexity is measured by the loop and is conducted by the size of the input, but we can also say that the time of this code is O(n3) 
    because we have 3 lines with    O(n) time complexity, but we can ignore the constant and say that the time complexity of this code is O(n) because we only care about the big O notation and not the constants.
    3 - and why... due the fact that the BigO always considers the major factor of the code, and in this case, the major fact in this case is defined by the loop. 
*/ 