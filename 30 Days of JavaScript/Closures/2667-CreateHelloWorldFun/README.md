
# 2667. Create a Hello World Function

Write a function createHelloWorld. It should return a new function that always returns "Hello World".

### Example 1:

<pre>
  Input: args = []
  Output: "Hello World"
  Explanation:
  const f = createHelloWorld();
  f(); // "Hello World"
  
  The function returned by createHelloWorld should always return "Hello World".
</pre>

### Example 2:

 <pre>
  Input: args = [{},null,42]
  Output: "Hello World"
  Explanation:
  const f = createHelloWorld();
  f({}, null, 42); // "Hello World"
  
  Any arguments could be passed to the function but should always return "Hello World".
</pre>

### Constraints:

<pre>
  0 <= args.length <= 10
</pre>

