# List of Katas

## Specifications

- All solutions must be contained with the `U1M1L1Katas` project found within the `starter-code` directory.
- Once all solutions have been written, they can be tested at the same time using `AllKatasTest`

## A Chatty Program
### Requirements
1. In the class `AChattyProgram` complete the following steps.
1. Add code to your main method that produces the following output:
```
Hi!
How are you?
I'm fine!
Doing really well in fact...
Isn't it a beautiful day?
Smiling is my favorite!
Good bye!!
```
1. Run `AChattyProgramTest` to confirm that your output is correct.

## A Postcard from Me
### Requirements
1. In the class `APostcardFromMe` complete the following steps.
1. Add code to your main method that produces output identical to the following:
```
*------------------------------------------------------------------*
| John Smith                                                       |
| 123 Main Street                                                  |
| Hometown, MN 55555                                               |
|                                                                  |
|                        Jane Doe                                  |
|                        345 Mockingbird Ln.                       |
|                        Smalltown, OR 99999                       |
|                                                                  |
|                                                                  |
*------------------------------------------------------------------*
```
1. Run `APostcardFromMeTest` to confirm that your output is correct.

## Marvel Table
### Requirements
1. In the class `MarvelTable` complete the following steps.
1. Add code to your main method that produces output identical to the following:
```
-------------------------------------------------------------
|   Hero              |   Affiliation     |   Power         |
-------------------------------------------------------------
|   Captain America   |   The Avengers    |   Peak Human    |
-------------------------------------------------------------
|   Wolverine         |   The X-Men       |   Healing/Claws |
-------------------------------------------------------------
|   Cyclops           |   The X-Men       |   Eye Beam      |
-------------------------------------------------------------
|   Domino            |   X-Force         |   Luck          |
-------------------------------------------------------------
```
1. Run `MarvelTableTest` to confirm that your output is correct.

---

# Challenge

If you've completed the previous katas, complete the below for an extra challenge.

## Formatted Output

### Instruction

So far, we've used `println` to print text to our standard output (`System.out`). Java also provides a method called `format`, which can be used to format our output to convert numbers to text for easier outputting. We'll delve into some of these concepts further in the next lesson, but for now, look over the basics below.

The following code:

```java
System.out.format("The value of the float is %f, while the value of the integer is %d, and the string is %s", 4.23, 5, "cat"); 
```

Will have the output:

```
The value of the float is 4.230000, while the value of the integer is 5, and the string is cat
```

Take a second to read through the code and try to understand how each piece of the puzzle comes together to form that output.

Important features to note:

* `%f` specifies that the value is a `float`. Simply put, this is a number that includes values after the decimal point.
* `%d` specifies that the value is an `integer`. This is a whole number.
* `%s` specifies that the value is a `string`. Strings are simply text, denoted by the double-quotes surrounding it.

Again, we'll cover all of this in more detail during the next lesson, but a core piece of being a developer is being able to extrapolate from a given pattern. 

It may seem like a little bit of a reach, but you've got this!

### Requirements

1. In the class  `FormattedOutput` complete the following steps.
1. Add code to your main method that produces output similar to the following, using `System.out.format`, the appropriate format specifier, and value for both your name and age:
```
My name is <YOUR NAME> and I am <YOUR AGE> years old.
```
1. Run `FormattedOutputTest` to confirm that your output is correct.

---
© 2019 Trilogy Education Services