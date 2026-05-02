const nemo = ["nemo"];
const aLot = ["dory", "bruce", " marlin", "nemo", "squirt", "darla", "hank"];
const array = new Array(100).fill("nemo"); // to test the performance of the code in the worst case scenario - O(n)

function findNemo(aLot) {
  for (let i = 0; i < aLot.length; i++) { // O(n)
    if (aLot[i] === "nemo") {
      console.log("Founded at the position" + i);
      break; // the nemo is a way to make the code more efficient, stoping the loop instead of continue the entire loop
    }
  }
}


const findNemo2 = array => {
  array.forEach((fish, i) => { // O(n)
     if(fish === 'nemo'){
       console.log("Founded at the position" + i);
     }
  })
}

const findNemo3 = array => {
  for(let fish of array){ // O(n)
    if(fish === 'nemo'){
      console.log("Founded at the position" + array.indexOf(fish));
  }
  }
}

// const boxes = [0, 1, 2, 3, 4, 5]

// function grabFirstPosition(boxes){
//     console.log(boxes[0])
//     console.log(boxes[1])
//     console.log(boxes[4])
// }

// findNemo(array) // O(n) -> linear time complexity, because we have to interate throuth the entire array to find the object - this is the worst case scenario, because the the objkect is at the end or do not event exist in the array.

// grabFirstPosition(boxes); // O(1) -> constant linear complexity because doesnt matter how bit big the array is or even if it increase or empty, the algorithm will always take the same time to execute grabbing the first object of the array


findNemo3(aLot); // O(n) because we have to interate throuth the entire array to find the object - this is the worst case scenario, because the the objkect is at the end or do not event exist in the array. and we have also a time complexity of O(n) to find the index of the object, so the total time complexity is O(n) + O(n) = O(2n) = O(n) because we ignore the constants.
findNemo2(aLot); // O(n) because we have to interate throuth the entire array to find the object - this is the worst case scenario, because the the objkect is at the end or do not event exist in the array. and we have also a time complexity of O(n) to find the index of the object, so the total time complexity is O(n) + O(n) = O(2n) = O(n) because we ignore the constants.
findNemo(aLot); // O(n) because we have to interate throuth the entire array to find the object - this is the worst case scenario, because the the objkect is at the end or do not event exist in the array. and we have also a time complexity of O(n) to find the index of the object, so the total time complexity is O(n) + O(n) = O(2n) = O(n) because we ignore the constants.