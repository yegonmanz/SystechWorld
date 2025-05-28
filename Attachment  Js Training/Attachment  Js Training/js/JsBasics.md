# What are Template Strings in JavaScript?

**Template Strings** (also called **Template Literals**) are a way to work with strings in JavaScript that make it easier to:

- Embed **expressions** inside strings.
- Write **multi-line** strings without escape characters.

They use **backticks** ( `` ` `` ) instead of quotes.

---

## Features of Template Strings

### 1. String Interpolation  
Use `${expression}` to embed variables or expressions.

```js
const name = "Alice";
const greeting = `Hello, ${name}!`;
console.log(greeting);  // Output: Hello, Alice!

```

### 2. Multi-line Strings
No need for \n or string concatenation.

```js
const poem = `Roses are red,
Violets are blue,
JavaScript is awesome,
And so are you!`;

console.log(poem);

```

### 3. Expression Evaluation

```js
const a = 5, b = 10;
const result = `The sum is ${a + b}`;
console.log(result);  // Output: The sum is 15
```

### When to Use Template Strings
When building dynamic messages.

For multi-line content, such as HTML or emails.

To make your code cleaner and more readable.


## Callback Function in JavaScript

## 🔹 What is a Callback Function?

A **callback function** is a **function passed as an argument** to another function.  
It is "called back" later—**after the main function has finished its task**.

This is a core concept in JavaScript, especially when dealing with **asynchronous operations** like API calls, timeouts, or event handling.

---

## 🔹 Why Use Callback Functions?

- To handle **asynchronous behavior**
- To **customize** the behavior of a function
- To **reuse logic** and write modular code

---

## 🔹 Basic Example

```js
function greet(name, callback) {
  console.log(`Hi ${name}`);
  callback();
}

function sayBye() {
  console.log("Goodbye!");
}

greet("Alice", sayBye);
```

### Real-Life Example of Callback Function in JavaScript

This example shows how a **callback function** can be used in a real-world scenario to handle **asynchronous data fetching** using `fetch()`.


##  Example Code

```js
// 1. Define a function that takes a callback as its parameter
function fetchUserData(callback) {

  // 2. Use the Fetch API to get user data from an API endpoint
  fetch("https://api.example.com/user")

    // 3. Convert the response into JSON format
    .then(response => response.json())

    // 4. Pass the fetched data to the callback function
    .then(data => callback(data));
}

// 5. Define the callback function that handles the fetched data
function handleUser(data) {
  console.log("User info:", data);
}

// 6. Call fetchUserData and pass the handleUser function as the callback
fetchUserData(handleUser);
```
###  JavaScript Callback Function Exercises

---

## 1. Greeting with a Callback

### Task:
Write a function `greetUser` that takes a username and a callback. The callback should format or modify the name before it’s displayed.

###  Example:
```js
function greetUser(name, callback) {
  const formattedName = callback(name);
  console.log(`Hello, ${formattedName}!`);
}

function toUpperCase(str) {
  return str.toUpperCase();
}

greetUser("alice", toUpperCase);  // Output: Hello, ALICE!

```
## JavaScript Rest and Spread Operators (`...`)

JavaScript's `...` operator can be used in **two powerful ways**:

- As the **Rest Operator**: to collect multiple elements into one.
- As the **Spread Operator**: to expand elements out of an iterable (like an array or object).

---

## 🔹 Rest Operator (`...`)

#### What It Does:
- Collects multiple arguments or values into a **single array**.
- Often used in **function parameters**.

###  Syntax:
```js
function example(...args) {
  console.log(args);  // args is an array
}

function sum(...numbers) {
  return numbers.reduce((acc, num) => acc + num, 0);
}

console.log(sum(1, 2, 3));  // Output: 6

```
## Spread Operator (...)

#### What It Does:
Expands elements from an array, object, or iterable into individual items.

Commonly used in function calls, array merging, and object copying.

---

## Spread in Arrays

```js
const arr1 = [1, 2];
const arr2 = [...arr1, 3, 4];

console.log(arr2);  // Output: [1, 2, 3, 4]

```
 ## Spread in Function Calls
```js
const numbers = [3, 5, 1];
console.log(Math.max(...numbers));  // Output: 5
```
Explanation:
Math.max expects separate number arguments.

Using ...numbers spreads the array into individual arguments: 3, 5, 1.

Math.max returns the highest value among those arguments.

 ## Spread in Objects

```js
const user = { name: "Alice", age: 25 };
const updatedUser = { ...user, age: 26 };

console.log(updatedUser);  // Output: { name: "Alice", age: 26 }
```
Explanation:
...user copies all properties from the user object.

The age: 26 overrides the previous age property.

The result is a new object with updated properties, leaving the original object unchanged.

## JavaScript Maps

---

### 🔹 What is a Map?

A **Map** is a built-in JavaScript object that stores key-value pairs. Unlike plain objects, **Maps**:

- Can use **any value** (objects, functions, primitives) as keys.
- Maintain the **insertion order** of keys.
- Have a property that directly tells you the **size** of the Map.

---

## 🔹 Why Use Maps?

- When you need keys other than strings or symbols.
- When you want guaranteed key order.
- When you want built-in methods to work with entries, keys, and values easily.

---

## 🔹 Creating a Map

```js
const map = new Map();

map.set("name", "Alice");
map.set(42, "The answer");
map.set(true, "Yes");

```
### Iterating Over a Map
```js
const map = new Map([
  ["name", "Alice"],
  ["age", 25],
  ["city", "Wonderland"]
]);

for (const [key, value] of map) {
  console.log(`${key} = ${value}`);
}
```

### Converting Map to Array
```js
const map = new Map([
  ["a", 1],
  ["b", 2]
]);

const arr = [...map];  // Converts Map to array of [key, value] pairs

console.log(arr);  // Output
```

### Real-Life Example of Using Maps in JavaScript: User Sessions

---

## Scenario:
You want to keep track of active user sessions, where each user has a unique session ID and associated data like username and login time.

---

## Example Code:

```js
// Create a Map to store session data
const userSessions = new Map();

// Add sessions
userSessions.set("session123", { username: "Alice", loginTime: "10:00 AM" });
userSessions.set("session456", { username: "Bob", loginTime: "10:30 AM" });

// Access a session
const sessionData = userSessions.get("session123");
console.log(sessionData);  
// Output: { username: "Alice", loginTime: "10:00 AM" }

// Check if a session exists
if (userSessions.has("session456")) {
  console.log("Session 456 is active");
}

// Remove a session when user logs out
userSessions.delete("session123");

// Iterate over all active sessions
for (const [sessionId, data] of userSessions) {
  console.log(`Session ID: ${sessionId}, User: ${data.username}`);
}

// Output:
// Session ID: session456, User: Bob
```

## JavaScript `filter()` Method

---

## 🔹 What is `filter()`?

The `filter()` method creates a **new array** containing all elements of the original array that **pass a test** implemented by the provided callback function.

- It does **not** modify the original array.
- The callback function should return `true` to keep the element, or `false` to exclude it.

---

## 🔹 Syntax

```js
const newArray = array.filter(callback(element, index, array));

```
#### Example: Filter Users by Age

```js
const users = [
  { name: "Alice", age: 25 },
  { name: "Bob", age: 17 },
  { name: "Charlie", age: 19 },
];

const adults = users.filter(user => user.age >= 18);

console.log(adults);
/* Output:
[
  { name: "Alice", age: 25 },
  { name: "Charlie", age: 19 }
]
*/

```

#### Example: Filter Even Numbers
```js
const numbers = [1, 2, 3, 4, 5, 6];

const evenNumbers = numbers.filter(num => num % 2 === 0);

console.log(evenNumbers);  // Output: [2, 4, 6]

```

## JavaScript `sort()` Method

🔹 Purpose:
Sorts the elements of an array in place and returns the sorted array.

#### Basic Syntax:
``` js
array.sort([compareFunction]);
```
``` js
const nums = [10, 1, 20, 2];
nums.sort();  
// Result: [1, 10, 2, 20] – sorted as strings
```

```js
const fruits = ["banana", "Apple", "cherry"];
fruits.sort();  
// Result: ["Apple", "banana", "cherry"] (case-sensitive)

```

### Immutability – What Is It?

Immutability means not changing the original data. Instead of modifying an object or array, you create a new one with the desired changes.

#### Immutable Array Methods (✅ Safe)
```js
map()

filter()

reduce()

slice()

concat()
```

#### Mutable Array Methods (⚠️ Avoid)
```js
push()

pop()

splice()

sort()

reverse()
```

### What is a Promise?
A Promise in JavaScript is an object representing the eventual completion or failure of an asynchronous operation. It allows you to write async code in a cleaner, more manageable way than nested callbacks.

 #### Promise Lifecycle: The 3 States
```
Pending – the operation is still happening

Fulfilled – the operation completed successfully (resolve)

Rejected – the operation failed (reject)
```
```js
const myPromise = new Promise((resolve, reject) => {
  // async task here
});
```
#### Creating a Basic Promise
```js
const fetchData = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const success = true;
      if (success) {
        resolve("Data received");
      } else {
        reject("Error fetching data");
      }
    }, 1000);
  });
};

fetchData()
  .then(data => console.log("✅ Success:", data))
  .catch(err => console.error("❌ Error:", err))
  .finally(() => console.log("🔁 Operation complete"));
```

 ### Real-World Example: Simulated API Call
```js
function getUser(id) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const users = {
        1: { name: "Alice", age: 25 },
        2: { name: "Bob", age: 30 }
      };

      const user = users[id];
      user ? resolve(user) : reject("User not found");
    }, 500);
  });
}

getUser(1)
  .then(user => console.log("User:", user))
  .catch(err => console.error("Error:", err));

```

### What is fetch() in JavaScript?
The fetch() method is a built-in browser API used to make HTTP requests (GET, POST, etc.). It returns a Promise that resolves to a Response object, which must then be read using .json(), .text(), etc.

#### Syntax
```js 
fetch(url, options)
  .then(response => response.json()) // or response.text(), etc.
  .then(data => console.log(data))
  .catch(error => console.error("Fetch error:", error));
  ```
url: The endpoint you want to fetch data from

#### Example: Explained
```js
fetch('https://dummyjson.com/todos')
  .then(res => res.json())     // Parse JSON response
  .then(console.log);          // Log the data

  ```
##### What Happens Step by Step:
```
fetch() sends a GET request to https://dummyjson.com/todos

The response comes back as a stream, so we call .json() to parse it

Once parsed, console.log() prints the JavaScript object
```

### What the Response Looks Like:
When you hit https://dummyjson.com/todos, it returns JSON like:

```json
{
  "todos": [
    { "id": 1, "todo": "Do homework", "completed": false, "userId": 5 },
    { "id": 2, "todo": "Walk the dog", "completed": true, "userId": 3 },
  ],
  "total": 150,
  "skip": 0,
  "limit": 30
}
```
### Rewriting the fetch() Chain Using Named Promises:
```js
const fetchTodos = fetch('https://dummyjson.com/todos'); // Step 1: returns a Promise

const handleResponse = fetchTodos.then(response => {
  return response.json(); // Step 2: returns another Promise
});

handleResponse
  .then(data => {
    console.log("✅ Todos received:", data); // Step 3: use the final data
  })
  .catch(error => {
    console.error("❌ Error occurred:", error); // Step 4: error handling
  });

```
dummy json to work with:: https://dummyjson.com/




