# Groovy `return` in `eachWithIndex` Loop

This example demonstrates a common pitfall in Groovy when using `return` within an `eachWithIndex` closure.  The `return` statement only exits the closure, not the enclosing method.  This can be unexpected if you intend to terminate the method's execution upon a certain condition. 

The `bug.groovy` file shows the incorrect behavior. The `bugSolution.groovy` file shows the corrected implementation.

## How to reproduce

1. Save the code in `bug.groovy`.
2. Run the Groovy script: `groovy bug.groovy`
3. Observe that the final print statement executes even after encountering 'stop'.

## Solution

Use a different control flow mechanism, such as a `for` loop or `break` statement within the loop to terminate the method execution as intended.