# Closure

The Closure is a function bundled together with its parent's lexical environment.

<pre>
  Closure = function + lexical Scope of its parents
</pre>

### Example 1:

<pre>
  function x()
  {
    var a = 7;
    function y()
    {
       //We can access y() function's parent lexical environment i.e we can access 'a' variable of x()
       console.log(a); //7
    }//y

    y();
  }//x

  x();
</pre>

The function y() is forming a closure with parent's lexical environment i.e x()

