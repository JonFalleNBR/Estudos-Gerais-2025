// Data Structures Exercises
// =========================

const { LinkedList } = require('./linked-list');
const { Stack } = require('./stack');
const { Queue } = require('./queue');

console.log('=== Data Structures ===\n');

// --- Linked List ---
console.log('-- Linked List --');
const list = new LinkedList();
list.append(10);
list.append(20);
list.append(30);
list.print(); // 10 -> 20 -> 30

// --- Stack ---
console.log('\n-- Stack --');
const stack = new Stack();
stack.push(1);
stack.push(2);
stack.push(3);
console.log('Pop:', stack.pop()); // 3
console.log('Peek:', stack.peek()); // 2
stack.print();

// --- Queue ---
console.log('\n-- Queue --');
const queue = new Queue();
queue.enqueue('A');
queue.enqueue('B');
queue.enqueue('C');
console.log('Dequeue:', queue.dequeue()); // A
queue.print();
