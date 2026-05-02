const nemo = ["nemo"];
const aLot = ["dory", "bruce", " marlin", "nemo", "squirt", "darla", "hank"];
const array = new Array(100000).fill("nemo"); // to test the performance of the code in the worst case scenario - O(n)

function findNemo(aLot) {
  for (let i = 0; i < aLot.length; i++) {
    if (aLot[i] === "nemo") {
      console.log("Founded at the position" + i);
      break; // the nemo is a way to make the code more efficient, stoping the loop instead of continue the entire loop
    }
  }
}


const findNemo2 = array => {
  array.forEach((fish, i) => {
     if(fish === 'nemo'){
       console.log("Founded at the position" + i);
     }
  })
}

// const boxes = [0, 1, 2, 3, 4, 5]

// function grabFirstPosition(boxes){
//     console.log(boxes[0])
//     console.log(boxes[1])
//     console.log(boxes[4])
// }

// findNemo(array) // O(n) -> linear time complexity, because we have to interate throuth the entire array to find the object - this is the worst case scenario, because the the objkect is at the end or do not event exist in the array.

grabFirstPosition(boxes); // O(1) -> constant linear complexity because doesnt matter how bit big the array is or even if it increase or empty, the algorithm will always take the same time to execute grabbing the first object of the array
