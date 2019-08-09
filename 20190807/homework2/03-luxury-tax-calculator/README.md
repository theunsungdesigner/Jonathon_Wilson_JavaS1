# Luxury Tax Calculator

## Structure

- Complete the below requirements in the `LuxuryTaxCalculator` project found in the `starter-code` directory.
- All code must be contained within the `main` method of the `LuxuryTaxCalculator` class.
- The requirements must be implemented in the order found below.
- Once your code has been written, it can be tested using `LuxuryTaxCalculatorTest`.

## Instruction

Sometimes we only want to execute portions of our code if a certain condition is true. To do so, we use an `if` statement.

```java
if (/* some condition */) {
  // If this condition is true, run some code
}
```

Let's take a second to parse through this code. We use the keyword `if` followed by parentheses that contain the conditional statement we're testing. If this is a true statement, then we run the code that's located inside our braces (`{}`).  If the statement is false, then the code block is essentially ignored and never executed.

For a more complete example, take a look at the code snippet below:

```java
int x = 5;
int y = 3;

if (x < y) {
  System.out.println("This code will never run");
}

if (x > y) {
  System.out.println("Of course 5 is bigger than 3! This code runs!");
}
```

Notice that we're using greater than (`>`) and less than (`<`) operators. These work exactly as you might remember from math class. 

In the first `if` statement, if `x` is less than `y`, then our program will execute the `println` command inside that code block. Of course, this never happens because `x` is not less than `y`.

In the second `if` statement, our condition (`x` is greater than `y`) is true, thus our program will output `Of course 5 is bigger than 3! This code runs!`.

There are several comparison operators, but we'll quickly go over three of them:

- `>` (greater than): As mentioned before, it checks to see if the value on the left is larger than the one on the right.
- `<` (less than): The inverse of the above, it checks to see if the value on the left is smaller than the one of the right.
- `==` (equal to): This is how we check if the two values are equal to one another. Since a single equals sign (`=`) is used to assign values to a variable, we use the double equals sign when we want to make a comparison.

The `if` statement is one of the core building blocks all developers in all languages use. Take a few moments to make sure you understand the basics, then tackle the assignment below.

## Requirements

The purpose of this program is to calculate how much luxury tax a hypothetical sports team will pay to sign three players. Here are the requirements:

1. Prompt the user to enter the salary for Player 1 (without the dollar sign or commas).
2. Prompt the user to enter the salary for Player 2 (without the dollar sign or commas).
3. Prompt the user to enter the salary for Player 3 (without the dollar sign or commas).
4. Calculate and display the total salary for all three players.
5. If the team went over their spending limit, calculate and display the cost of the luxury tax.
    - The team's spending limit is $40,000,000.
    - The tax rate is 18%. Note that the 18% luxury tax is only paid on the the amount of salary *over the team's spending limit*. For example, if a team's payroll is $55,000,000, they only pay luxury tax on \$15,000,000.

---
© 2019 Trilogy Education Services
