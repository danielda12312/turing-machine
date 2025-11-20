UnaryAdditionTM - A turing machine implementation for adding two numbers in unary addition*

**Unary addition** - while in binary we represent numbers like this: 2 = 0010 (2 to the power of the index from the right)
in this approach we represent numbers in a different way, 2 = "00" or "11" or any other symbol that simply
repeats it-self up to the same number that it represents.

The class UnaryAdditionTM object accepts a String that consists of a symbol representing the numbers we want to 
apply addition on (e.g '0') and a divider to separate between the numbers (e.g '1').

I call the run function which then applies the logic behind the turing machine and returns the sum
of the two numbers.

(for the actual turing machine the way it will be executed will be a little bit different since I need to turn all
the '0's I copy from the left side of the separator to the right side of the separator back to 'blanc')

For this version that is written in code all I do is define a state variable initialized to "q0", an array of chars
and an int head that will point to the chars in the array.
I enter a while loop as long as state != "HALT" and inside that while loop I enter a switch case,

case 1 - "q0" : as long as the state I am in is "q0" and the symbol is '0' I move right on the tape (increase head by 1)
then I break out of the switch and get back into the while loop while still in state "q0" repeat that until I reach
the separator in the else-if statement which is '1', if I reached that symbol I replace it with '_' and set state to "HALT"

in a separate function name getResult() I turn tape to a new String object without all the blank chars '_'
(including the separator that we changed to '_') and get its length into a variable sum with length() and return sum.
