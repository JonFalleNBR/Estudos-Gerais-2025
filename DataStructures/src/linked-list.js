class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
    this.size = 0;
  }

  // Add to the end
  append(value) {
    const node = new Node(value);
    if (!this.head) {
      this.head = node;
    } else {
      let current = this.head;
      while (current.next) {
        current = current.next;
      }
      current.next = node;
    }
    this.size++;
  }

  // Add to the beginning
  prepend(value) {
    const node = new Node(value);
    node.next = this.head;
    this.head = node;
    this.size++;
  }

  // Remove by value
  remove(value) {
    if (!this.head) return null;
    if (this.head.value === value) {
      this.head = this.head.next;
      this.size--;
      return value;
    }
    let current = this.head;
    while (current.next && current.next.value !== value) {
      current = current.next;
    }
    if (current.next) {
      current.next = current.next.next;
      this.size--;
      return value;
    }
    return null;
  }

  // Find by value
  find(value) {
    let current = this.head;
    while (current) {
      if (current.value === value) return current;
      current = current.next;
    }
    return null;
  }

  print() {
    const values = [];
    let current = this.head;
    while (current) {
      values.push(current.value);
      current = current.next;
    }
    console.log(values.join(' -> ') || '(empty)');
  }
}

module.exports = { LinkedList, Node };
