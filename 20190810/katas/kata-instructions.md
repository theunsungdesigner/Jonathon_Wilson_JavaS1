# List of Katas

## Structure

- Add the code necessary to the `App` class found in the `starter-code` project `U1M1L6Katas`.
- All methods should be `public` and `static`.
- The requirements for each method are listed below.
- Tests can be found in `AppTest`. Once you have written each method, uncomment the associated test and run `AppTest`.

## Requirements

**NOTE**: All code and calculations should be done manually; do not use helper libraries to find these answers!

1. **Total**: Create a method called `total` which returns the sum of all the values in an array of ints. Your code should work for an array of any size.
    - _Example Input_: `[0, 1, 2, 3, 4, 5, 6, 7]`
    - _Example Output_: `28`
1. **Total Odd**: Create a method called `totalOdd` which returns the sum of only the values of the odd numbered indexes in an array of ints. Your code should work for an array of any size.
    - _Example Input_: `[0, 1, 2, 3, 4, 5, 6, 7]`
    - _Example Output_: `16`
1. **Total Even**: Create a method called `totalEven` the sum of only the values of the even numbered indexes in an array of ints. Your code should work for an array of any size.
    - _Example Input_: `[0, 1, 2, 3, 4, 5, 6, 7]`
    - _Example Output_: `12`
1. **2nd Largest Number**: Create a method called `secondLargestNumber` which returns the second largest number in an array of ints. Your code should work for an array of any size. Assume your input array will always have a length of at least 2.
    - _Example Input_: `[0, 1, 2, 3, 4, 5, 6, 7]`
    - _Example Output_: `6`
1. **Swap First and Last**: Create a method called `swapFirstAndLast` which takes in an array of strings, swaps the first and last elements, and returns the array. Your code should work for an array of any size. 
    - _Example Input_: `["foo", "bar", "baz", "qux"]`
    - _Example Output_: `["qux", "bar", "baz", "foo"]`
1. **Reverse**: Create a method called `reverse` which takes in an array of ints and returns a new array with the array reversed. Your code should work for an array of any size.
    - _Example Input_: `[0, 1, 2, 3, 4, 5, 6, 7]`
    - _Example Output_: `[7, 6, 5, 4, 3, 2, 1, 0]`
1. **Concatenate String**: Create a method called `concatenateString` which takes in an array of strings and returns a String which consists of the concatenation of all elements in the array. Your code should work for an array of any size.
    - _Example Input_: `["foo", "bar", "baz"]`
    - _Example Output_: `"foobarbaz"`
1. **Every 3rd**: Create a method called `everyThird` which takes in an array of ints and returns an array which consists of every third element. Your code should work for an array of any size. If there are fewer than three elements in the array, return `null`.
    - _Example Input_: `[0, 1, 2, 3, 4, 5, 6, 7]`
    - _Example Output_: `[2, 5]`
1. **Less Than 5**: Create a method called `lessThanFive` which takes in an array of ints, finds the elements which are less than five, and returns an array containing those elements. Your code should work for an array of any size. If there are no elements less than five, return `null`.
    - Determine how many values are less than 5.
    - Create a new array to hold the values under 5.
    - Copy all the values under 5 from the original array to the new array.
    - _Example Input_: `[0, 1, 2, 3, 4, 5, 6, 7]`
    - _Example Output_: `[0, 1, 2, 3, 4]`


## Challenge

1. **Split at 5**: Create a method called `splitAtFive` which takes in an array of ints. This method should split the array into two new arrays, one holding the values less than 5 and the other holding the values equal to or greater than 5. Return a two-dimensional array, with the small-value array first. Your code should work for an array of any size.
1. **Evens and Odds**: Create a method called `evensAndOdds` which takes in an array of Strings. Create two new arrays, one holding the values of the even indices and the other the values of the odd. Return a two-dimensional array, with the even-indices array first. Your code should work for an array of any size.

---
© 2019 Trilogy Education Services
