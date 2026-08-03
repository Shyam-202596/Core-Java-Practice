# 04 - Control Flow Notes

## Conditional Statements and Loops

Control flow means controlling the order in which statements are executed in a program.

Java provides conditional statements and loops to control program execution.

---

# Conditional Statements

## What is a Condition?

A condition provides a check for a statement.

A condition usually evaluates to either:

```text
true
false
```

Conditional statements are used when we want to execute code based on some condition.

---

# 1. If-Else Statement

An `if-else` statement is used to check a boolean condition.

If the condition is true, the `if` block is executed.

If the condition is false, the `else` block is executed.

---

## Syntax

```java
if (condition) {
    // code to execute if condition is true
} else {
    // code to execute if condition is false
}
```

---

## Example: Salary Bonus

```java
public class IfElse {
    public static void main(String[] args) {
        int salary = 25400;

        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}
```

## Output

```text
27400
```

---

## Explanation

In this example:

- Salary is `25400`.
- Condition `salary > 10000` is true.
- Therefore, `2000` is added to salary.
- Final salary becomes `27400`.

---

# 2. Multiple If-Else Statement

Multiple `if-else` statements are used when we need to check multiple conditions.

Only one block is executed from multiple conditions.

---

## Syntax

```java
if (condition1) {
    // code to execute if condition1 is true
} else if (condition2) {
    // code to execute if condition2 is true
} else if (condition3) {
    // code to execute if condition3 is true
} else {
    // code to execute if all conditions are false
}
```

---

## Example: Multiple Salary Conditions

```java
public class MultipleIfElse {
    public static void main(String[] args) {
        int salary = 25400;

        if (salary <= 10000) {
            salary += 1000;
        } else if (salary <= 20000) {
            salary += 2000;
        } else {
            salary += 3000;
        }

        System.out.println(salary);
    }
}
```

## Output

```text
28400
```

---

## Explanation

In this example:

- Salary is `25400`.
- First condition `salary <= 10000` is false.
- Second condition `salary <= 20000` is false.
- Therefore, the `else` block is executed.
- `3000` is added to salary.
- Final salary becomes `28400`.

---

# Loops in Java

Loops are used to execute a part of a program multiple times.

Java provides different types of loops:

1. `for` loop
2. `while` loop
3. `do-while` loop

---

# 1. For Loop

A `for` loop is generally used when we know how many times the loop will execute.

---

## Syntax

```java
for (initialization; condition; increment/decrement) {
    // body
}
```

---

## Example 1: Print Numbers from 1 to 5

```java
public class ForLoop {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num += 1) {
            System.out.println(num);
        }
    }
}
```

## Output

```text
1
2
3
4
5
```

---

## Example 2: Print Numbers from 1 to N

```java
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int num = 1; num <= n; num += 1) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
```

## Input

```text
6
```

## Output

```text
1 2 3 4 5 6
```

---

# 2. While Loop

A `while` loop is generally used when we do not know exactly how many times the loop will execute.

The condition is checked before executing the loop body.

Therefore, a `while` loop is also called an entry-controlled loop.

---

## Syntax

```java
while (condition) {
    // code to execute
    // increment/decrement
}
```

---

## Example: Print Numbers from 1 to 5

```java
public class WhileLoop {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }
    }
}
```

## Output

```text
1
2
3
4
5
```

---

# 3. Do-While Loop

A `do-while` loop is used when we want to execute the loop body at least once.

In a `do-while` loop, the condition is checked after executing the loop body.

Therefore, a `do-while` loop is also called an exit-controlled loop.

---

## Syntax

```java
do {
    // code to execute
    // update statement
} while (condition);
```

---

## Example: Print Numbers from 1 to 5

```java
public class DoWhileLoop {
    public static void main(String[] args) {
        int n = 1;

        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
```

## Output

```text
1
2
3
4
5
```

---

# While Loop vs Do-While Loop

| While Loop | Do-While Loop |
|---|---|
| Used when the number of iterations is not fixed | Used when the loop body must execute at least once |
| Entry-controlled loop | Exit-controlled loop |
| Condition is checked before execution | Condition is checked after execution |
| Semicolon is not required after condition | Semicolon is required after condition |

---

# Program: Largest of Three Numbers

## Problem Statement

Take three integer inputs from the keyboard and find the largest number among them.

---

## Approach 1

```java
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println(max);

        input.close();
    }
}
```

---

## Approach 2

```java
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println(max);

        input.close();
    }
}
```

---

## Approach 3: Using Math.max

`Math` is a class present in the `java.lang` package.

`max()` is a method of the `Math` class.

It takes two numbers as arguments and returns the maximum value.

```java
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);

        input.close();
    }
}
```

## Input

```text
3 6 5
```

## Output

```text
6
```

---

# Program: Alphabet Case Check

## Problem Statement

Take an input character from the keyboard and check whether it is an uppercase alphabet or lowercase alphabet.

---

## Java Program

```java
import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Not an alphabet");
        }

        input.close();
    }
}
```

## Input

```text
a
```

## Output

```text
Lowercase
```

## Input

```text
Z
```

## Output

```text
Uppercase
```

---

## Important Correction

Use:

```java
ch >= 'a' && ch <= 'z'
```

Do not use:

```java
ch > 'a' && ch <= 'z'
```

Because `ch > 'a'` excludes the character `'a'`.

---

# Fibonacci Numbers

## What is Fibonacci Series?

A Fibonacci series is a series of numbers where each number is the sum of the two preceding numbers.

Example:

```text
0, 1, 1, 2, 3, 5, 8, 13
```

---

## Program: Find the Nth Fibonacci Number

```java
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int a = 0;
        int b = 1;

        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);

        input.close();
    }
}
```

## Input

```text
7
```

## Output

```text
13
```

---

## Alternative: Print Fibonacci Series up to N Terms

```java
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        input.close();
    }
}
```

## Input

```text
7
```

## Output

```text
0 1 1 2 3 5 8
```

---

# Program: Counting Occurrence of a Digit

## Problem Statement

Input two numbers.

Find how many times the second number digit is present in the first number.

---

## Example

```text
First number = 14458
Second number = 4
Output = 2
```

Explanation:

`4` is present `2` times in `14458`.

---

## Java Program

```java
import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        int number = input.nextInt();
        int digitToFind = input.nextInt();

        while (number > 0) {
            int remainder = number % 10;

            if (remainder == digitToFind) {
                count++;
            }

            number = number / 10;
        }

        System.out.println(count);

        input.close();
    }
}
```

## Input

```text
45535
5
```

## Output

```text
3
```

---

# Program: Reverse a Number

## Problem Statement

Take a number as input from the keyboard and print its reverse.

---

## Example

```text
Input = 12345
Output = 54321
```

---

## Java Program

```java
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;
        }

        System.out.println(ans);

        input.close();
    }
}
```

## Input

```text
458792
```

## Output

```text
297854
```

---

# Calculator Program

## Problem Statement

Create a calculator program that:

- Takes an operator as input.
- Takes two numbers as input.
- Performs the operation.
- Keeps running until the user enters `x` or `X`.

Supported operators:

```text
+
-
*
/
%
```

---

## Java Program

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;

        while (true) {
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");

                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }

                if (op == '-') {
                    ans = num1 - num2;
                }

                if (op == '*') {
                    ans = num1 * num2;
                }

                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed");
                        continue;
                    }
                }

                if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Modulo by zero is not allowed");
                        continue;
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation");
                continue;
            }

            System.out.println(ans);
        }

        input.close();
    }
}
```

---

## Important Corrections

The operator condition should include `'-'`.

Correct:

```java
if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
```

Division and modulo by zero should be handled properly.

---

# Switch Statements

## What is a Switch Statement?

A `switch` statement is used when we want to execute one block of code from multiple possible cases.

It is useful when a variable or expression can have multiple fixed values.

---

## Syntax

```java
switch (expression) {
    case value1:
        // code block
        break;

    case value2:
        // code block
        break;

    default:
        // code block
}
```

---

## Example

```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
```

## Output

```text
Tuesday
```

---

# Important Points About Switch

## 1. Break Statement

The `break` statement is used to terminate the current case.

If `break` is not used, execution continues into the next case.

This is known as fall-through.

---

## Example Without Break

```java
public class SwitchWithoutBreak {
    public static void main(String[] args) {
        int number = 1;

        switch (number) {
            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

            default:
                System.out.println("Default");
        }
    }
}
```

## Output

```text
One
Two
Three
Default
```

---

## 2. Default Case

The `default` case executes when none of the cases match.

```java
default:
    System.out.println("No matching case found");
```

If `default` is not at the end, use `break` after it.

---

## 3. Duplicate Cases Are Not Allowed

Duplicate case labels are not allowed in a switch statement.

Incorrect:

```java
switch (number) {
    case 1:
        System.out.println("One");
        break;

    case 1:
        System.out.println("Duplicate One");
        break;
}
```

This will cause a compile-time error.

---

# Enhanced Switch Syntax

Java provides an enhanced switch syntax using arrow labels.

---

## Syntax

```java
switch (expression) {
    case value1 -> {
        // code block
    }

    case value2 -> {
        // code block
    }

    default -> {
        // code block
    }
}
```

---

## Example

```java
public class EnhancedSwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }
    }
}
```

## Output

```text
Wednesday
```

---

## Benefits of Enhanced Switch

- Cleaner syntax
- No need to write `break`
- Reduces fall-through mistakes
- Easier to read

---

# String Comparison in Java

## Using `equals()`

To compare string values, use the `equals()` method.

```java
String word = "Java";

if (word.equals("Java")) {
    System.out.println("Matched");
}
```

---

## Why Not Use `==` for Strings?

The `==` operator checks reference comparison.

The `equals()` method checks value comparison.

---

## Example

```java
public class StringComparison {
    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
```

## Output

```text
false
true
```

---

## Explanation

```text
a == b
```

Checks whether both references point to the same object.

```text
a.equals(b)
```

Checks whether both strings have the same value.

---

# Nested Switch Statement

A switch statement inside another switch statement is called a nested switch statement.

---

## Syntax

```java
switch (expression1) {
    case value1:
        // code block
        break;

    case value2:
        switch (expression2) {
            case valueA:
                // code block
                break;

            case valueB:
                // code block
                break;

            default:
                // code block
        }
        break;

    default:
        // code block
}
```

---

## Example: Nested Switch

```java
public class NestedSwitchExample {
    public static void main(String[] args) {
        int employeeId = 2;
        String department = "IT";

        switch (employeeId) {
            case 1:
                System.out.println("Employee 1");
                break;

            case 2:
                System.out.println("Employee 2");

                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "HR":
                        System.out.println("HR Department");
                        break;

                    default:
                        System.out.println("No department entered");
                }
                break;

            default:
                System.out.println("Invalid employee ID");
        }
    }
}
```

## Output

```text
Employee 2
IT Department
```

---

# Common Mistakes

## Mistake 1: Missing Break in Switch

Incorrect:

```java
switch (day) {
    case 1:
        System.out.println("Monday");

    case 2:
        System.out.println("Tuesday");
}
```

Correct:

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;
}
```

---

## Mistake 2: Duplicate Case Labels

Incorrect:

```java
switch (num) {
    case 1:
        System.out.println("One");
        break;

    case 1:
        System.out.println("Again One");
        break;
}
```

Correct:

```java
switch (num) {
    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;
}
```

---

## Mistake 3: Using `==` for String Value Comparison

Incorrect:

```java
if (name == "Java") {
    System.out.println("Matched");
}
```

Correct:

```java
if (name.equals("Java")) {
    System.out.println("Matched");
}
```

---

## Mistake 4: Missing Semicolon in Do-While

Incorrect:

```java
do {
    System.out.println(num);
} while (num <= 5)
```

Correct:

```java
do {
    System.out.println(num);
} while (num <= 5);
```

---

# Quick Revision

```text
Condition:
A check that evaluates to true or false.

if-else:
Executes one block when condition is true and another block when condition is false.

else-if:
Used to check multiple conditions.

for loop:
Used when the number of iterations is known.

while loop:
Used when the number of iterations is not fixed.

do-while loop:
Executes the block at least once.

entry-controlled loop:
Condition is checked before execution.

exit-controlled loop:
Condition is checked after execution.

switch:
Used to execute one block from multiple cases.

break:
Terminates the current switch case or loop.

default:
Executes when no switch case matches.

enhanced switch:
Modern switch syntax using arrows.

nested switch:
A switch statement inside another switch statement.

equals():
Used to compare string values.

==:
Used to compare references for objects.
```

---

# Interview Questions

## Q1. What is a conditional statement?

A conditional statement is used to execute code based on a condition.

---

## Q2. What is the difference between `if` and `if-else`?

`if` executes code only when the condition is true.

`if-else` provides an alternative block when the condition is false.

---

## Q3. When should we use `else-if`?

`else-if` is used when multiple conditions need to be checked.

---

## Q4. What is a loop?

A loop is used to execute a block of code multiple times.

---

## Q5. When should we use a `for` loop?

A `for` loop is used when the number of iterations is known.

---

## Q6. When should we use a `while` loop?

A `while` loop is used when the number of iterations is not fixed.

---

## Q7. What is a `do-while` loop?

A `do-while` loop executes the loop body at least once and checks the condition after execution.

---

## Q8. What is the difference between `while` and `do-while` loop?

A `while` loop checks the condition before execution.

A `do-while` loop checks the condition after execution.

---

## Q9. What is a switch statement?

A switch statement is used to execute one block of code from multiple possible cases.

---

## Q10. What is the use of `break` in switch?

`break` is used to stop execution of the current case and exit the switch block.

---

## Q11. What happens if `break` is missing in a switch case?

If `break` is missing, execution continues to the next case. This is called fall-through.

---

## Q12. What is the use of `default` in switch?

The `default` block executes when none of the cases match.

---

## Q13. Are duplicate switch cases allowed?

No. Duplicate case labels are not allowed in a switch statement.

---

## Q14. What is enhanced switch?

Enhanced switch is a modern switch syntax that uses arrow labels and does not require `break`.

---

## Q15. What is a nested switch?

A nested switch is a switch statement inside another switch statement.

---

## Q16. How should strings be compared in Java?

Strings should be compared using the `equals()` method.

---

# Practice Problems

## Problem 1

Take salary as input.

- If salary is greater than `10000`, add bonus `2000`.
- Otherwise, add bonus `1000`.

Print the final salary.

---

## Problem 2

Take salary as input.

- If salary is less than or equal to `10000`, add bonus `1000`.
- Else if salary is less than or equal to `20000`, add bonus `2000`.
- Otherwise, add bonus `3000`.

Print the final salary.

---

## Problem 3

Print numbers from `1` to `5` using a `for` loop.

---

## Problem 4

Print numbers from `1` to `5` using a `while` loop.

---

## Problem 5

Print numbers from `1` to `5` using a `do-while` loop.

---

## Problem 6

Take three numbers as input and print the largest number.

---

## Problem 7

Take a character as input and check whether it is uppercase or lowercase.

---

## Problem 8

Take a number `n` as input and print the Fibonacci series up to `n` terms.

---

## Problem 9

Take a number and a digit as input. Count how many times the digit occurs in the number.

---

## Problem 10

Take a number as input and print its reverse.

---

## Problem 11

Create a calculator using loops and conditional statements.

Supported operators:

```text
+
-
*
/
%
```

The calculator should stop when the user enters `x` or `X`.

---

## Problem 12

Create a switch program to print the day name based on day number.

Example:

```text
1 -> Monday
2 -> Tuesday
```

---

## Problem 13

Create a switch program to check whether a character is a vowel or consonant.

---

## Problem 14

Create a nested switch program for employee ID and department.

---

# Summary

In this chapter, we learned:

- Conditional statements
- `if-else`
- Multiple `if-else`
- `for` loop
- `while` loop
- `do-while` loop
- Difference between `while` and `do-while`
- Largest of three numbers
- Alphabet case check
- Fibonacci numbers
- Counting digit occurrence
- Reversing a number
- Calculator program
- Switch statements
- Enhanced switch syntax
- Nested switch statements
- String comparison using `equals()`

Control flow is one of the most important foundations of Java programming.