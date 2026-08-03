# Java Basics Notes

## Lecture 1: Introduction to Programming

Programming is a way to instruct a computer to perform various tasks.

Computers only understand binary language, which consists of `0`s and `1`s. Writing instructions directly in binary is very difficult for humans. To solve this problem, programming languages are used.

---

## What is a Programming Language?

A programming language is a computer language used by programmers to communicate with computers.

In simple words:

```text
Programming Language = A medium to communicate instructions to a computer
```

Programming languages allow developers to write human-readable instructions that can be converted into machine-understandable instructions.

Examples of programming languages:

- Java
- Python
- C
- C++
- JavaScript
- Go
- Kotlin

---

## Types of Programming Languages

Programming languages can be categorized into different paradigms. The main types are:

1. Procedural Programming
2. Functional Programming
3. Object-Oriented Programming

---

# 1. Procedural Programming

Procedural programming specifies a series of well-structured steps and procedures to compose a program.

It follows a systematic order of statements, functions, and commands to complete a task.

---

## Key Points of Procedural Programming

- The program is executed step by step.
- The code is divided into functions or procedures.
- The execution flow is clearly defined.
- It is useful for small and medium-sized programs.
- The logic is written in a sequential manner.

---

## Example of Procedural Programming in Java

```java
public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int result = add(num1, num2);

        System.out.println("Sum is: " + result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
```

## Explanation

In this example:

1. Two variables are created.
2. The `add()` method is called.
3. The result is calculated.
4. The output is printed.

This follows a step-by-step approach.

---

# 2. Functional Programming

Functional programming is a programming style where programs are built using pure functions.

A pure function:

- Always produces the same output for the same input.
- Does not modify external state.
- Does not change existing variables.
- Returns a new output instead of modifying existing data.

Functional programming is useful when many different operations need to be performed on the same set of data.

Common use cases include:

- Machine Learning
- Data Processing
- Stream Processing
- Functional transformations

---

## Key Points of Functional Programming

- It avoids changing existing data.
- It focuses on pure functions.
- Functions can be treated as values.
- It is useful for data transformation.
- Java supports functional programming features from Java 8 onward.

---

## Example of Functional Programming in Java

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .map(num -> num * 2)
                .forEach(System.out::println);
    }
}
```

## Output

```text
2
4
6
8
10
```

## Explanation

The original list is not modified.  
The stream creates a new processed result.

---

# 3. Object-Oriented Programming

Object-Oriented Programming, also known as OOP, revolves around objects.

An object contains both data and behavior.

```text
Object = Data + Code
```

Object-Oriented Programming was developed to make software easier to develop, debug, reuse, and maintain.

Java is mainly an object-oriented programming language.

---

## Key Points of Object-Oriented Programming

- Programs are designed around objects.
- Objects can represent real-world entities.
- Code becomes reusable.
- Debugging becomes easier.
- Maintenance becomes easier.
- It is useful for large-scale applications.

---

## Example of Object-Oriented Programming in Java

```java
class Student {
    String name;
    int age;

    void displayDetails() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Rahul";
        student.age = 22;

        student.displayDetails();
    }
}
```

## Explanation

```text
Student = Class
student = Object
name and age = Data
displayDetails() = Behavior
```

---

# Can One Language Follow Multiple Programming Paradigms?

Yes. One programming language can support multiple programming paradigms.

For example, Python supports:

- Procedural Programming
- Functional Programming
- Object-Oriented Programming

Java supports:

- Procedural style
- Object-Oriented style
- Functional style using Java 8 features

Java mainly follows object-oriented programming, but procedural and functional styles can also be used.

---

# Static vs Dynamic Languages

Programming languages can also be classified based on type checking.

There are two main categories:

1. Static Languages
2. Dynamic Languages

---

## Static Languages

In static languages, type checking is performed at compile time.

Java is a statically typed language.

Compile time means the phase before the program starts running, when the source code is compiled.

---

## Features of Static Languages

- Type checking is performed at compile time.
- Type-related errors are detected before the program runs.
- The data type of a variable must be declared.
- It provides more control.
- Runtime type errors are reduced.

---

## Example of Static Typing in Java

```java
public class Main {
    public static void main(String[] args) {
        int age = 25;
        String name = "Shyam";

        System.out.println(age);
        System.out.println(name);
    }
}
```

Here:

```text
age = int
name = String
```

The following code is invalid in Java:

```java
int age = "twenty five";
```

This will cause a compile-time error because an integer variable cannot store a string value.

---

## Dynamic Languages

In dynamic languages, type checking is performed at runtime.

Runtime means the phase when the program is actually executing.

---

## Features of Dynamic Languages

- Type checking is performed at runtime.
- Variable data types do not need to be declared explicitly.
- Code can be written faster.
- Type errors may appear during program execution.
- It provides more flexibility.

---

## Example of Dynamic Typing in Python

```python
age = 25
age = "twenty five"

print(age)
```

In this example, the same variable first stores an integer value and later stores a string value.

---

## Static vs Dynamic Language Comparison

| Static Language | Dynamic Language |
|---|---|
| Type checking is performed at compile time | Type checking is performed at runtime |
| Errors are detected before execution | Errors may occur during execution |
| Data type declaration is required | Data type declaration is not required |
| Provides more control | Provides more flexibility |
| Runtime type errors are reduced | Runtime type errors are more likely |
| Examples: Java, C, C++ | Examples: Python, JavaScript |

---

# Memory Management

Memory management is the process of allocating and deallocating memory during program execution.

In Java, memory management is mostly handled by the JVM.

Java memory can be understood mainly in two parts:

1. Stack Memory
2. Heap Memory

---

## Stack Memory

Stack memory stores method calls, local variables, and reference variables.

---

## Key Points of Stack Memory

- Stack memory is fast.
- A stack frame is created when a method is called.
- The stack frame is removed when the method execution is completed.
- Local variables are stored in stack memory.
- Reference variables are also stored in stack memory.

---

## Heap Memory

Heap memory stores objects.

Whenever an object is created using the `new` keyword, it is stored in heap memory.

---

## Key Points of Heap Memory

- Objects are stored in heap memory.
- Heap memory is larger than stack memory.
- Heap memory is managed by the Garbage Collector.
- Objects remain in heap memory as long as they are reachable through references.

---

# Reference Variable and Object

When an object is created, the reference variable is usually stored in stack memory, and the actual object is stored in heap memory.

Example:

```java
Student student = new Student();
```

In this example:

```text
student = Reference variable
new Student() = Object
```

The reference variable points to the object stored in heap memory.

---

## Simple Example

```java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";

        System.out.println(s1.name);
    }
}
```

## Memory Explanation

```text
Stack Memory:
s1

Heap Memory:
Student object with name = Amit
```

The reference variable `s1` is stored in stack memory.  
The `Student` object is stored in heap memory.

---

# Important Memory Points

## Point 1: More than one reference variable can point to the same object

In Java, multiple reference variables can point to the same object.

Example:

```java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";

        Student s2 = s1;

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
```

## Output

```text
Amit
Amit
```

Both `s1` and `s2` are pointing to the same object.

---

## Point 2: Changes made through one reference are visible through other references

If multiple reference variables point to the same object, then changes made through one reference are reflected through all other references.

Example:

```java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";

        Student s2 = s1;

        s2.name = "Rahul";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
```

## Output

```text
Rahul
Rahul
```

## Explanation

Both `s1` and `s2` point to the same object.

When `s2.name = "Rahul"` is executed, the actual object is modified.  
Therefore, the change is visible through both references.

---

## Point 3: An object without a reference is eligible for Garbage Collection

If an object is not referenced by any reference variable, it becomes unreachable.

Unreachable objects are eligible for Garbage Collection.

Example:

```java
Student s1 = new Student();

s1 = null;
```

After assigning `null` to `s1`, the object is no longer reachable.

---

# Garbage Collection

Garbage Collection is Java's automatic memory management process.

The Garbage Collector removes unused and unreachable objects from heap memory.

---

## Key Points of Garbage Collection

- Garbage Collection is handled by the JVM.
- Developers do not need to manually free memory.
- Unreachable objects can be removed from memory.
- It helps reduce memory management complexity.
- The Garbage Collector runs automatically.

---

## Garbage Collection Example

```java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";

        s1 = null;

        // The Student object is now eligible for Garbage Collection.
    }
}
```

---

# Stack and Heap Example

```java
class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Amit";
        s1.age = 20;

        Student s2 = s1;

        s2.name = "Rahul";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
```

## Output

```text
Rahul
Rahul
```

## Memory Explanation

```text
Stack Memory:
s1
s2

Heap Memory:
Student object
name = Rahul
age = 20
```

Both `s1` and `s2` point to the same heap object.

---

# Java-Specific Notes

## Is Java a Static Language?

Yes. Java is a statically typed language.

In Java, the data type of a variable is checked at compile time.

Example:

```java
int number = 10;
String name = "Java";
boolean isActive = true;
```

---

## Is Java a Dynamic Language?

No. Java is not a dynamically typed language.

In Java, the data type of a variable must be declared.

Invalid example:

```java
int number = "Java";
```

This is invalid because an integer variable cannot store a string value.

---

## Is Java Object-Oriented?

Yes. Java is an object-oriented programming language.

Java uses classes and objects.

However, Java is not considered purely object-oriented because it supports primitive data types.

Primitive data types in Java:

- int
- char
- boolean
- byte
- short
- long
- float
- double

---

## Is Java Procedural?

Java can support procedural style because methods can be used to write step-by-step instructions.

Example:

```java
public class Main {
    public static void main(String[] args) {
        printMessage();
    }

    static void printMessage() {
        System.out.println("Hello Java");
    }
}
```

---

## Is Java Functional?

Java supports functional programming features from Java 8 onward.

Functional features in Java include:

- Lambda Expressions
- Functional Interfaces
- Stream API
- Method References
- Optional

Example:

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Rahul", "Shyam");

        names.forEach(name -> System.out.println(name));
    }
}
```

---

# Quick Revision

```text
Programming:
A way to instruct a computer to perform a task.

Programming Language:
A medium used to communicate instructions to a computer.

Binary:
A language consisting of 0 and 1.

Procedural Programming:
Step-by-step programming.

Functional Programming:
Programming based on pure functions and immutable data.

Object-Oriented Programming:
Programming based on objects.

Object:
Data + Code.

Static Language:
Type checking happens at compile time.

Dynamic Language:
Type checking happens at runtime.

Stack Memory:
Stores method calls, local variables, and reference variables.

Heap Memory:
Stores objects.

Reference Variable:
Stores the reference of an object.

Garbage Collection:
The process of removing unreachable objects from memory.
```

---

# Important Points to Remember

- Computers understand binary language.
- Binary language consists of `0` and `1`.
- Programming languages are used to communicate with computers.
- Procedural programming follows a step-by-step approach.
- Functional programming is based on pure functions.
- Object-oriented programming is based on objects.
- An object contains both data and behavior.
- Java is a statically typed language.
- In Java, type checking happens at compile time.
- In dynamic languages, type checking happens at runtime.
- Java is mainly an object-oriented programming language.
- Java also supports procedural programming style.
- Java supports functional programming features from Java 8 onward.
- Stack memory stores method calls and reference variables.
- Heap memory stores objects.
- Multiple reference variables can point to the same object.
- Changes made to an object are visible through all references pointing to that object.
- An object without a reference is eligible for Garbage Collection.
- The Garbage Collector removes unreachable objects from memory.

---

# Interview Questions

## Q1. What is programming?

Programming is the process of giving instructions to a computer to perform a specific task.

---

## Q2. Which language does a computer understand?

A computer understands binary language, which consists of `0` and `1`.

---

## Q3. What is a programming language?

A programming language is a computer language used by programmers to communicate with computers.

---

## Q4. What are the main types of programming languages?

The main programming paradigms are:

1. Procedural Programming
2. Functional Programming
3. Object-Oriented Programming

---

## Q5. What is procedural programming?

Procedural programming is a programming style where the program is written as a sequence of steps or procedures.

---

## Q6. What is functional programming?

Functional programming is a programming style based on pure functions. It avoids modifying existing data and returns new output.

---

## Q7. What is object-oriented programming?

Object-oriented programming is a programming style based on objects.

```text
Object = Data + Code
```

---

## Q8. What is a static language?

A static language is a language where type checking is performed at compile time.

Examples:

- Java
- C
- C++

---

## Q9. What is a dynamic language?

A dynamic language is a language where type checking is performed at runtime.

Examples:

- Python
- JavaScript

---

## Q10. Is Java static or dynamic?

Java is a statically typed language because type checking happens at compile time.

---

## Q11. What is stack memory?

Stack memory stores method calls, local variables, and reference variables.

---

## Q12. What is heap memory?

Heap memory stores objects.

---

## Q13. What is a reference variable?

A reference variable stores the reference of an object.

Example:

```java
Student s1 = new Student();
```

Here, `s1` is a reference variable.

---

## Q14. What is Garbage Collection?

Garbage Collection is Java's automatic process of removing unused and unreachable objects from memory.

---

## Q15. Can multiple references point to the same object?

Yes.

Example:

```java
Student s1 = new Student();
Student s2 = s1;
```

Here, both `s1` and `s2` point to the same object.

---

# Practice Code

## Program 1: Create a simple object

```java
class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Amit";
        student.age = 20;

        System.out.println(student.name);
        System.out.println(student.age);
    }
}
```

## Output

```text
Amit
20
```

---

## Program 2: Multiple references pointing to the same object

```java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";

        Student s2 = s1;

        s2.name = "Rahul";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
```

## Output

```text
Rahul
Rahul
```

---

## Program 3: Object eligible for Garbage Collection

```java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Amit";

        s1 = null;

        // The object is now eligible for Garbage Collection.
    }
}
```

---

# Summary

In this chapter, we learned:

- What programming is
- What a programming language is
- Types of programming languages
- Procedural programming
- Functional programming
- Object-oriented programming
- Static vs dynamic languages
- Stack memory
- Heap memory
- Reference variables
- Objects
- Garbage Collection
- Java-specific basics

This chapter builds the foundation for learning Core Java.

---

# Flow of the Program

## What is Flow of Program?

Flow of program means the order in which the instructions of a program are executed.

A computer program runs step by step. To understand and represent the flow of a program, we commonly use:

1. Flowchart
2. Pseudocode

---

# Flowchart

## What is a Flowchart?

A flowchart is a diagrammatic representation of an algorithm or thought process.

In simple words:

```text
Flowchart = Visual representation of an algorithm
```

Flowcharts help in understanding the logic of a program before writing the actual code.

---

## Why Do We Use Flowcharts?

Flowcharts are used to plan and understand program logic clearly.

## Benefits of Flowcharts

- They make logic easy to understand.
- They show the flow of the program clearly.
- They help identify mistakes in logic.
- They break complex problems into simple steps.
- They help convert an algorithm into code.

---

# Symbols Used in Flowcharts

Different symbols are used in flowcharts to represent different operations.

---

## 1. Start / Stop Symbol

An oval shape is used to indicate the starting and ending points of a flowchart.

```text
Oval = Start / Stop
```

## Use

- To represent where the program starts.
- To represent where the program ends.

Examples:

```text
Start
End
```

---

## 2. Input / Output Symbol

A parallelogram is used to represent input and output operations in a flowchart.

```text
Parallelogram = Input / Output
```

## Use

- To take input from the user.
- To display output.

Examples:

```text
Input name
Output salary
Print result
```

---

## 3. Processing Symbol

A rectangle is used to represent processing operations.

```text
Rectangle = Processing
```

## Use

- Mathematical calculations
- Variable assignment
- Updating values
- General processing steps

Examples:

```text
salary = salary + 2000
sum = a + b
count = count + 1
```

---

## 4. Condition Symbol

A diamond shape is used to represent a condition or decision.

```text
Diamond = Condition
```

## Use

A condition produces a true or false result.

Examples:

```text
salary > 10000?
num % i == 0?
age >= 18?
```

The result of a condition is usually represented as:

```text
Yes / No
True / False
```

---

## 5. Flow Direction Symbol

An arrow is used to represent the direction of program flow.

```text
Arrow = Flow direction
```

## Use

An arrow shows which step will be executed next.

---

# Flowchart Symbols Summary

| Symbol | Shape | Purpose |
|---|---|---|
| Start / Stop | Oval | Represents the beginning or end of a program |
| Input / Output | Parallelogram | Represents input or output |
| Processing | Rectangle | Represents calculation or assignment |
| Condition | Diamond | Represents decision making |
| Flow Direction | Arrow | Represents direction of execution |

---

# Example 1: Take a Name and Output Hello Name

## Problem Statement

Take a name as input and print `Hello name`.

---

## Algorithm

```text
Start
Input name
Output "Hello " + name
End
```

---

## Pseudocode

```text
Start

Input name

Output "Hello " + name

End
```

---

## Java Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();
    }
}
```

---

## Example Output

```text
Enter your name: Shyam
Hello Shyam
```

---

# Example 2: Salary Bonus Program

## Problem Statement

Take salary as input.

If the salary is greater than `10000`, add a bonus of `2000`.

Otherwise, add a bonus of `1000`.

---

## Algorithm

```text
Start
Input salary

If salary > 10000
    salary = salary + 2000
Else
    salary = salary + 1000

Output salary
End
```

---

## Pseudocode

```text
Start

Input salary

If salary > 10000
    salary = salary + 2000
Else
    salary = salary + 1000

Output salary

End
```

---

## Java Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();

        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }

        System.out.println("Final salary: " + salary);

        scanner.close();
    }
}
```

---

## Example Output 1

```text
Enter salary: 12000
Final salary: 14000
```

---

## Example Output 2

```text
Enter salary: 8000
Final salary: 9000
```

---

# Example 3: Check Whether a Number is Prime or Not

## Problem Statement

Take a number as input and check whether it is prime or not.

---

# What is a Prime Number?

A prime number is a number that is divisible only by:

1. `1`
2. Itself

Examples:

```text
2, 3, 5, 7, 11, 13, 17
```

---

## Important Points

- `1` is not a prime number.
- `1` is not a composite number.
- `2` is the smallest prime number.
- `2` is the only even prime number.
- If a number is divisible by any number other than `1` and itself, it is not prime.

---

# Basic Prime Number Logic

## Algorithm

```text
Start
Input num

If num <= 1
    Output "Neither prime nor composite"
    End

Set c = 2

While c < num
    If num % c == 0
        Output "Not Prime"
        End

    c = c + 1

Output "Prime"
End
```

---

## Pseudocode

```text
Start

Input num

If num <= 1
    Output "Neither prime nor composite"
    Exit

c = 2

While c < num
    If num % c == 0
        Output "Not Prime"
        Exit

    c = c + 1

End While

Output "Prime"

End
```

---

## Java Code: Basic Prime Check

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println("Neither prime nor composite");
            scanner.close();
            return;
        }

        int c = 2;

        while (c < num) {
            if (num % c == 0) {
                System.out.println("Not Prime");
                scanner.close();
                return;
            }

            c++;
        }

        System.out.println("Prime");

        scanner.close();
    }
}
```

---

## Example Output 1

```text
Enter number: 17
Prime
```

---

## Example Output 2

```text
Enter number: 10
Not Prime
```

---

## Example Output 3

```text
Enter number: 1
Neither prime nor composite
```

---

# Optimization of Prime Number Logic

In the basic prime number logic, we check divisibility from `2` to `num - 1`.

This approach is inefficient for large numbers.

For example:

```text
Check if 23456786543 is prime or not
```

Running a loop from `2` to this number would take a lot of time.

To improve performance, we can optimize the prime number logic.

---

# Why Check Only Till Square Root?

Factors of a number always occur in pairs.

Example:

```text
36
```

Factor pairs of `36`:

```text
1  x 36 = 36
2  x 18 = 36
3  x 12 = 36
4  x 9  = 36
6  x 6  = 36
9  x 4  = 36
12 x 3  = 36
18 x 2  = 36
36 x 1  = 36
```

After `6 x 6`, the factor pairs start repeating.

```text
sqrt(36) = 6
```

Therefore, to check whether a number is prime, it is enough to check divisibility from `2` to `sqrt(number)`.

---

## Logic

If no factor is found from `2` to `sqrt(num)`, then the number is prime.

```text
Check from 2 to sqrt(num)
```

Instead of:

```text
Check from 2 to num - 1
```

---

## Example 1

Number:

```text
17
```

Square root:

```text
sqrt(17) = 4.12
```

So we only need to check from `2` to `4`.

Checks:

```text
17 % 2 != 0
17 % 3 != 0
17 % 4 != 0
```

Therefore, `17` is prime.

---

## Example 2

Number:

```text
36
```

Square root:

```text
sqrt(36) = 6
```

Check:

```text
36 % 2 == 0
```

Therefore, `36` is not prime.

---

# Optimized Prime Number Pseudocode

```text
Start

Input num

If num <= 1
    Output "Neither prime nor composite"
    Exit

c = 2

While c * c <= num
    If num % c == 0
        Output "Not Prime"
        Exit

    c = c + 1

End While

Output "Prime"

End
```

---

## Why Use `c * c <= num`?

Instead of writing:

```java
c <= Math.sqrt(num)
```

We can write:

```java
c * c <= num
```

This avoids recalculating the square root repeatedly.

---

# Java Code: Optimized Prime Check

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println("Neither prime nor composite");
            scanner.close();
            return;
        }

        int c = 2;

        while (c * c <= num) {
            if (num % c == 0) {
                System.out.println("Not Prime");
                scanner.close();
                return;
            }

            c++;
        }

        System.out.println("Prime");

        scanner.close();
    }
}
```

---

## Example Output 1

```text
Enter number: 17
Prime
```

---

## Example Output 2

```text
Enter number: 36
Not Prime
```

---

# Time Complexity

## Basic Prime Check

In the basic approach, the loop runs from `2` to `num - 1`.

```text
Time Complexity = O(n)
```

---

## Optimized Prime Check

In the optimized approach, the loop runs only from `2` to `sqrt(num)`.

```text
Time Complexity = O(sqrt(n))
```

---

# Flowchart to Code Conversion

To convert a flowchart into code, follow these steps:

1. Treat the Start symbol as the beginning of the `main` method.
2. Convert input symbols into input statements.
3. Convert processing symbols into calculations or assignments.
4. Convert condition symbols into `if-else` statements or loop conditions.
5. Convert output symbols into print statements.
6. Treat the Stop symbol as the end of the program.

---

# Common Mistakes

## Mistake 1: Missing the `num <= 1` check

Incorrect:

```java
if (num == 1) {
    System.out.println("Not Prime");
}
```

Correct:

```java
if (num <= 1) {
    System.out.println("Neither prime nor composite");
}
```

---

## Mistake 2: Using an incorrect loop condition

Incorrect:

```java
while (c < Math.sqrt(num)) {
    // logic
}
```

Correct:

```java
while (c * c <= num) {
    // logic
}
```

---

## Mistake 3: Using assignment instead of comparison

Incorrect:

```java
if (num % c = 0) {
    System.out.println("Not Prime");
}
```

Correct:

```java
if (num % c == 0) {
    System.out.println("Not Prime");
}
```

---

## Mistake 4: Missing loop counter increment

Incorrect:

```java
while (c * c <= num) {
    if (num % c == 0) {
        System.out.println("Not Prime");
    }
}
```

Correct:

```java
while (c * c <= num) {
    if (num % c == 0) {
        System.out.println("Not Prime");
        return;
    }

    c++;
}
```

---

# Quick Revision

```text
Flow of Program:
The order in which instructions are executed.

Flowchart:
A graphical representation of an algorithm.

Pseudocode:
A rough code-like representation of an algorithm.

Oval:
Start / Stop

Parallelogram:
Input / Output

Rectangle:
Processing

Diamond:
Condition

Arrow:
Flow direction

Prime Number:
A number divisible only by 1 and itself.

1:
Neither prime nor composite.

Basic Prime Check:
Check from 2 to num - 1.

Optimized Prime Check:
Check from 2 to sqrt(num).

Optimized Condition:
c * c <= num
```

---

# Interview Questions

## Q1. What is a flowchart?

A flowchart is a diagrammatic representation of an algorithm or thought process.

---

## Q2. What is pseudocode?

Pseudocode is a rough code-like representation of an algorithm. It does not require exact programming syntax.

---

## Q3. What does the oval symbol represent in a flowchart?

The oval symbol represents Start and Stop.

---

## Q4. What does the parallelogram represent in a flowchart?

The parallelogram represents input and output operations.

---

## Q5. What does the diamond shape represent in a flowchart?

The diamond shape represents a condition or decision.

---

## Q6. What is a prime number?

A prime number is a number that is divisible only by `1` and itself.

---

## Q7. Is 1 a prime number?

No. `1` is neither prime nor composite.

---

## Q8. What is the optimized logic for checking a prime number?

To check whether a number is prime, we only need to check divisibility from `2` to `sqrt(num)`.

---

## Q9. Why do we use `c * c <= num`?

We use `c * c <= num` to run the loop only until the square root of the number without repeatedly calculating `Math.sqrt(num)`.

---

## Q10. What is the difference between the basic and optimized prime check?

The basic prime check runs from `2` to `num - 1`.

The optimized prime check runs only from `2` to `sqrt(num)`.

---

# Practice Problems

## Problem 1

Take a name as input and print:

```text
Hello <name>
```

---

## Problem 2

Take salary as input.

If salary is greater than `10000`, add a bonus of `2000`.  
Otherwise, add a bonus of `1000`.

---

## Problem 3

Take a number as input and check whether it is prime or not.

---

## Problem 4

Take a number as input and check whether it is even or odd.

---

## Problem 5

Take age as input.

If age is greater than or equal to `18`, print:

```text
Eligible to vote
```

Otherwise, print:

```text
Not eligible to vote
```

---

# Summary

In this chapter, we learned:

- What flow of program means
- What a flowchart is
- Common flowchart symbols
- What pseudocode is
- Salary bonus program logic
- Prime number logic
- Prime number optimization
- Basic approach vs optimized approach
- How to convert flowcharts into code

---

# Introduction to Java

## Why Do We Use Programming Languages?

A computer only understands machine language, which consists of `0`s and `1`s.

Writing instructions directly in binary is very difficult for humans. To solve this problem, programming languages are used.

Programming languages allow developers to write code in a human-readable format.

Java is one of the most popular programming languages.

---

## Java Source Code

The code written in Java is human-readable.

Java source code is saved with the `.java` extension.

Example:

```text
Main.java
```

This file contains the source code of a Java program.

---

## Java Compilation Process

Java source code cannot be executed directly by the computer.

The Java compiler converts the source code into bytecode.

```text
Java Source Code (.java) -> Java Compiler -> Bytecode (.class)
```

The generated bytecode is saved with the `.class` extension.

Example:

```text
Main.java -> Main.class
```

---

## What is Bytecode?

Bytecode is an intermediate code generated by the Java compiler.

It is not directly understood by the operating system.

Bytecode is executed by the JVM.

```text
Bytecode = Intermediate code between source code and machine code
```

---

## Java Compiler

The Java compiler converts Java source code into bytecode.

The Java compiler is called:

```text
javac
```

Example:

```bash
javac Main.java
```

After compilation, a `.class` file is generated.

Example:

```text
Main.class
```

---

## Java Interpreter

The Java interpreter converts bytecode into machine code.

Machine code consists of `0`s and `1`s.

The interpreter translates bytecode line by line into machine-understandable instructions.

---

## Java Execution Flow

```text
Java Source Code (.java)
        |
        v
Java Compiler (javac)
        |
        v
Bytecode (.class)
        |
        v
JVM
        |
        v
Machine Code
        |
        v
Program Execution
```

---

# Platform Independence in Java

Java is platform independent because Java code is compiled into bytecode.

The same bytecode can run on different operating systems if the JVM is available for that operating system.

```text
Write Once, Run Anywhere
```

This means Java code can be written once and executed on different platforms.

---

## Why is Java Platform Independent?

Java source code is compiled into bytecode.

Bytecode is not specific to any operating system.

The JVM converts bytecode into platform-specific machine code.

Therefore, the same `.class` file can run on different operating systems.

---

## Important Point

Java is platform independent, but JVM is platform dependent.

Different operating systems require different JVM implementations.

Example:

- JVM for Windows
- JVM for macOS
- JVM for Linux

The bytecode remains the same, but the JVM differs based on the operating system.

---

# Java vs C/C++ Compilation

In C and C++, source code is usually compiled into platform-specific executable files.

Example:

```text
C/C++ Source Code -> Compiler -> .exe file
```

The `.exe` file generated on Windows may not run directly on Linux or macOS.

In Java, source code is compiled into bytecode.

```text
Java Source Code -> Compiler -> Bytecode
```

The bytecode can run on any platform with a compatible JVM.

---

## Comparison

| Feature | C/C++ | Java |
|---|---|---|
| Output after compilation | Executable file | Bytecode |
| File extension | `.exe` or platform-specific binary | `.class` |
| Platform dependency | Platform dependent | Platform independent |
| Runtime support | OS directly executes binary | JVM executes bytecode |
| Portability | Less portable | Highly portable |

---

# Architecture of Java

Java architecture mainly consists of:

1. JDK
2. JRE
3. JVM
4. Java Compiler
5. Class Loader
6. Bytecode Verifier
7. Interpreter
8. JIT Compiler
9. Garbage Collector

---

# JDK

JDK stands for Java Development Kit.

JDK provides an environment to develop and run Java programs.

It is mainly used by developers.

---

## JDK Includes

JDK includes:

1. Development tools
2. JRE
3. Java compiler
4. Archiver
5. Documentation generator
6. Interpreter and loader

---

## Important Tools in JDK

| Tool | Purpose |
|---|---|
| `javac` | Compiles Java source code into bytecode |
| `java` | Runs Java applications |
| `jar` | Creates and manages JAR files |
| `javadoc` | Generates documentation from Java source code |
| `jdb` | Java debugger |

---

## JDK Usage

If you want to write, compile, and run Java programs, you need JDK.

```text
JDK = JRE + Development Tools
```

---

# JRE

JRE stands for Java Runtime Environment.

JRE provides an environment to run Java programs.

It is mainly used when we only need to execute Java applications, not develop them.

---

## JRE Includes

JRE includes:

1. JVM
2. Base libraries
3. Integration libraries
4. User interface toolkit
5. Deployment technologies

---

## JRE Usage

If you only want to run a Java application, JRE is enough.

But if you want to develop Java applications, you need JDK.

```text
JRE = JVM + Libraries required to run Java programs
```

---

# JVM

JVM stands for Java Virtual Machine.

JVM is responsible for executing Java bytecode.

It converts bytecode into machine code that can be understood by the operating system.

---

## Responsibilities of JVM

JVM is responsible for:

- Loading class files
- Verifying bytecode
- Executing bytecode
- Managing memory
- Running the Garbage Collector
- Providing runtime environment

---

## JVM is Platform Dependent

JVM is platform dependent because every operating system needs a specific JVM implementation.

However, Java bytecode is platform independent.

```text
Java Bytecode = Platform Independent
JVM = Platform Dependent
```

---

# Compile Time and Runtime

Java program execution can be understood in two phases:

1. Compile Time
2. Runtime

---

## Compile Time

Compile time is the phase where Java source code is compiled by the Java compiler.

During compile time:

1. Java source code is checked for syntax errors.
2. The compiler converts `.java` files into `.class` files.
3. Bytecode is generated.

Example:

```bash
javac Main.java
```

Output:

```text
Main.class
```

---

## Runtime

Runtime is the phase where the compiled bytecode is executed by the JVM.

During runtime:

1. Class Loader loads required classes.
2. Bytecode Verifier checks the bytecode.
3. JVM executes the bytecode.
4. Interpreter and JIT Compiler convert bytecode into machine code.
5. Garbage Collector manages unused objects.

---

# Class Loader

Class Loader is a part of the JVM.

It loads `.class` files into memory when they are required.

---

## Class Loader Process

The Class Loader works in three main steps:

1. Loading
2. Linking
3. Initialization

---

## 1. Loading

In the loading phase, the Class Loader reads the `.class` file and generates binary data.

An object of the class representation is created in heap memory.

```text
.class file -> Binary data -> Loaded into memory
```

---

## 2. Linking

In the linking phase, JVM prepares the loaded class for execution.

Linking includes:

1. Verification
2. Preparation
3. Resolution

---

### Verification

JVM verifies the `.class` file to ensure that the bytecode is valid and safe to execute.

---

### Preparation

JVM allocates memory for class variables and assigns default values.

Example:

```java
static int count;
```

Default value:

```text
count = 0
```

---

### Resolution

JVM replaces symbolic references with direct references.

This helps JVM access classes, methods, and variables efficiently during execution.

---

## 3. Initialization

In the initialization phase, static variables are assigned their actual values defined in the code.

Static blocks are also executed during this phase.

Example:

```java
class Test {
    static int count = 10;

    static {
        System.out.println("Static block executed");
    }
}
```

During initialization:

```text
count = 10
Static block is executed
```

---

# JVM Memory Areas

JVM contains different memory areas to execute Java programs.

The two commonly discussed memory areas are:

1. Stack Memory
2. Heap Memory

---

## Stack Memory

Stack memory stores:

- Method calls
- Local variables
- Reference variables

Each thread has its own stack memory.

When a method is called, a stack frame is created.

When the method execution is completed, the stack frame is removed.

---

## Heap Memory

Heap memory stores objects.

Objects created using the `new` keyword are stored in heap memory.

Heap memory is shared among all threads.

Garbage Collector manages heap memory.

---

# JVM Execution

JVM executes bytecode using:

1. Interpreter
2. JIT Compiler

---

## Interpreter

The interpreter reads and executes bytecode line by line.

### Limitation

If the same method is called repeatedly, the interpreter translates it again and again.

This can make execution slower.

---

## JIT Compiler

JIT stands for Just-In-Time Compiler.

JIT Compiler improves Java performance.

It identifies frequently executed code and converts it directly into machine code.

This avoids repeated interpretation.

---

## Why JIT Compiler is Used

JIT Compiler is used to make Java execution faster.

Instead of interpreting the same bytecode again and again, JIT compiles frequently used code into native machine code.

---

## Interpreter vs JIT Compiler

| Feature | Interpreter | JIT Compiler |
|---|---|
| Execution style | Executes line by line | Compiles frequently used code |
| Speed | Slower | Faster |
| Repeated method calls | Interprets again and again | Uses compiled machine code |
| Purpose | Basic execution | Performance optimization |

---

# Garbage Collector

Garbage Collector is a part of JVM.

It automatically removes unused objects from heap memory.

An object becomes eligible for Garbage Collection when it is no longer reachable by any reference.

---

## Example

```java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Amit";

        student = null;

        // The Student object is now eligible for Garbage Collection.
    }
}
```

---

## Benefits of Garbage Collection

- Automatic memory management
- Reduces memory leaks
- Removes unreachable objects
- Makes Java safer compared to manual memory management

---

# Working of Java Architecture

The complete Java architecture can be summarized as follows:

```text
Java Source Code (.java)
        |
        v
Java Compiler (javac)
        |
        v
Bytecode (.class)
        |
        v
Class Loader
        |
        v
Bytecode Verifier
        |
        v
JVM Execution Engine
        |
        |-- Interpreter
        |-- JIT Compiler
        |-- Garbage Collector
        |
        v
Machine Code
        |
        v
Program Output
```

---

# Simple Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

---

## Explanation

```java
public class Main
```

This defines a class named `Main`.

```java
public static void main(String[] args)
```

This is the main method. Program execution starts from this method.

```java
System.out.println("Hello Java");
```

This statement prints output on the console.

---

## Compile and Run Java Program

### Step 1: Save the file

```text
Main.java
```

### Step 2: Compile the program

```bash
javac Main.java
```

### Step 3: Run the program

```bash
java Main
```

### Output

```text
Hello Java
```

---

# Tools Required to Run Java

To write and run Java programs, the following tools are commonly used:

1. JDK
2. IDE or code editor

---

## 1. JDK

JDK is required to compile and run Java programs.

Common JDK options include:

- Oracle JDK
- OpenJDK
- Eclipse Temurin JDK

---

## 2. IDE or Code Editor

An IDE helps developers write, run, debug, and manage Java projects easily.

Common IDEs and editors include:

- IntelliJ IDEA
- Eclipse
- Visual Studio Code
- NetBeans

For beginners and professional Java development, IntelliJ IDEA is widely used.

---

# Important Points to Remember

- Java is a programming language.
- Java source code is saved with the `.java` extension.
- Java compiler converts source code into bytecode.
- Bytecode is saved with the `.class` extension.
- Bytecode is executed by the JVM.
- Java is platform independent because of bytecode.
- JVM is platform dependent.
- JDK is used to develop and run Java programs.
- JRE is used to run Java programs.
- JVM executes Java bytecode.
- Class Loader loads class files into memory.
- Bytecode Verifier verifies bytecode.
- Interpreter executes bytecode line by line.
- JIT Compiler improves performance by compiling repeated code into machine code.
- Garbage Collector removes unused objects from heap memory.

---

# Quick Revision

```text
Java:
A high-level programming language.

.java:
Extension of Java source code files.

javac:
Java compiler.

.class:
Extension of Java bytecode files.

Bytecode:
Intermediate code generated by Java compiler.

JVM:
Executes bytecode.

JRE:
Provides environment to run Java programs.

JDK:
Provides environment to develop and run Java programs.

Interpreter:
Executes bytecode line by line.

JIT:
Compiles frequently used bytecode into machine code.

Garbage Collector:
Removes unused objects from heap memory.

Platform Independent:
Same bytecode can run on different operating systems.

Platform Dependent:
Software depends on a specific operating system.
```

---

# Interview Questions

## Q1. Why do we use programming languages?

Programming languages are used because computers understand only binary language, while humans need a readable way to write instructions.

---

## Q2. What is Java?

Java is a high-level, object-oriented, platform-independent programming language.

---

## Q3. What is source code in Java?

Source code is the human-readable code written by developers. In Java, source code is saved with the `.java` extension.

---

## Q4. What is bytecode?

Bytecode is the intermediate code generated by the Java compiler. It is stored in a `.class` file and executed by the JVM.

---

## Q5. What is the role of the Java compiler?

The Java compiler converts Java source code into bytecode.

---

## Q6. What is JVM?

JVM stands for Java Virtual Machine. It executes Java bytecode and converts it into machine code.

---

## Q7. Why is Java platform independent?

Java is platform independent because Java source code is compiled into bytecode, and bytecode can run on any platform that has a compatible JVM.

---

## Q8. Is JVM platform independent?

No. JVM is platform dependent because each operating system needs its own JVM implementation.

---

## Q9. What is JDK?

JDK stands for Java Development Kit. It provides tools to develop, compile, and run Java programs.

---

## Q10. What is JRE?

JRE stands for Java Runtime Environment. It provides the environment required to run Java programs.

---

## Q11. What is the difference between JDK, JRE, and JVM?

```text
JDK = JRE + Development Tools
JRE = JVM + Libraries
JVM = Executes bytecode
```

---

## Q12. What is Class Loader?

Class Loader is a part of JVM that loads `.class` files into memory.

---

## Q13. What is Bytecode Verifier?

Bytecode Verifier checks whether bytecode is valid and safe to execute.

---

## Q14. What is JIT Compiler?

JIT Compiler stands for Just-In-Time Compiler. It improves performance by converting frequently executed bytecode into machine code.

---

## Q15. What is Garbage Collector?

Garbage Collector is a JVM component that automatically removes unused objects from heap memory.

---

# Summary

In this chapter, we learned:

- Why programming languages are used
- What Java is
- Java source code and bytecode
- Java compiler
- Java interpreter
- Platform independence in Java
- JDK, JRE, and JVM
- Compile time and runtime
- Class Loader
- JVM execution process
- Interpreter and JIT Compiler
- Garbage Collector
- Tools required to run Java programs

This chapter explains how Java code is compiled, loaded, verified, and executed by the JVM.
---

# First Java Program

## Structure of a Java File

Java source code is saved with the `.java` extension.

Example:

```text
Main.java
```

A Java file contains source code written in a human-readable format.

---

## Important Rules for a Java File

- Everything written in a `.java` file must be inside a class.
- A Java file can contain multiple classes.
- If a class is declared as `public`, then the file name must be the same as the public class name.
- A Java program starts execution from the `main` method.
- By convention, class names should start with an uppercase letter.
- The `.java` file is compiled into a `.class` file.

---

## Example

If the file name is:

```text
Main.java
```

Then the public class should be:

```java
public class Main {
}
```

This is valid because the file name and public class name are the same.

---

## First Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## Output

```text
Hello World
```

---

# Converting `.java` File to `.class` File

The Java compiler is used to convert a `.java` file into a `.class` file.

The Java compiler is called:

```text
javac
```

---

## Compilation Command

```bash
javac Main.java
```

After compilation, Java creates a `.class` file.

```text
Main.java -> Main.class
```

The `.class` file contains bytecode.

---

# Running a Java Program

After compilation, the program can be executed using the `java` command.

---

## Run Command

```bash
java Main
```

Important:

- Use `javac Main.java` to compile the program.
- Use `java Main` to run the program.
- Do not write `.class` while running the program.

Correct:

```bash
java Main
```

Incorrect:

```bash
java Main.class
```

---

# Java Program Execution Flow

```text
Main.java
   |
   v
javac Main.java
   |
   v
Main.class
   |
   v
java Main
   |
   v
Output
```

---

# Explanation of Hello World Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## 1. `public`

```java
public class Main
```

`public` is an access modifier.

It allows the class to be accessed from anywhere.

---

## 2. `class`

```java
class Main
```

`class` is a keyword used to define a class in Java.

A class is a named group of variables, methods, and other members.

---

## 3. `Main`

```java
public class Main
```

`Main` is the name of the class.

If the class is public, the file name must be the same as the class name.

Example:

```text
Class Name: Main
File Name: Main.java
```

---

## 4. `public static void main(String[] args)`

```java
public static void main(String[] args)
```

This is the main method.

The main method is the entry point of a Java program.

Program execution starts from this method.

---

## 5. `public` in Main Method

```java
public static void main(String[] args)
```

The `public` keyword allows the JVM to access the `main` method from outside the class.

---

## 6. `static`

```java
static
```

`static` allows the JVM to call the `main` method without creating an object of the class.

Since program execution starts from `main`, JVM should be able to call it directly.

---

## 7. `void`

```java
void
```

`void` means the method does not return any value.

---

## 8. `main`

```java
main
```

`main` is the name of the method from where Java program execution begins.

---

## 9. `String[] args`

```java
String[] args
```

`String[] args` is used to store command-line arguments.

It is an array of strings.

Example:

```bash
java Main hello java
```

Here, `hello` and `java` can be received inside `String[] args`.

---

## 10. `System`

```java
System.out.println("Hello World");
```

`System` is a final class defined in the `java.lang` package.

---

## 11. `out`

```java
System.out
```

`out` is a public static member of the `System` class.

It is an object of `PrintStream`.

It is used to print output on the console.

---

## 12. `println`

```java
System.out.println("Hello World");
```

`println` is a method of the `PrintStream` class.

It prints the given value and moves the cursor to the next line.

---

## Difference Between `print` and `println`

```java
System.out.print("Hello");
System.out.print("World");
```

Output:

```text
HelloWorld
```

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```text
Hello
World
```

---

# What is a Package?

A package is a folder or namespace that groups related Java classes.

Packages are used to organize Java files and avoid naming conflicts.

Example:

```java
import java.util.Scanner;
```

Here:

```text
java.util = package
Scanner = class
```

---

# Primitive Data Types in Java

Primitive data types are the most basic data types in Java.

They are not objects and cannot be broken down into smaller data types.

Example:

```java
int age = 25;
char grade = 'A';
```

---

## Important Point

`String` is not a primitive data type in Java.

A string can be broken into characters.

Example:

```text
"Kunal" -> 'K', 'u', 'n', 'a', 'l'
```

But primitive data types like `int`, `char`, and `boolean` cannot be broken further.

---

# List of Primitive Data Types

| Data Type | Description | Example |
|---|---|---|
| `int` | Stores integer values | `int i = 26;` |
| `char` | Stores a single character | `char c = 'A';` |
| `float` | Stores decimal values with single precision | `float f = 98.67f;` |
| `double` | Stores larger decimal values with double precision | `double d = 45676.58975;` |
| `long` | Stores large integer values | `long l = 15876954832558315L;` |
| `boolean` | Stores either `true` or `false` | `boolean b = false;` |
| `byte` | Stores small integer values | `byte x = 10;` |
| `short` | Stores short integer values | `short s = 1000;` |

---

## Why Do We Use `f` With Float?

By default, decimal values in Java are treated as `double`.

Therefore, for `float`, we use `f` or `F`.

Example:

```java
float marks = 98.67f;
```

Without `f`, Java treats `98.67` as a double value.

---

## Why Do We Use `L` With Long?

Large integer values are treated as `int` by default.

For `long`, we use `L`.

Example:

```java
long number = 15876954832558315L;
```

Recommended:

```java
long number = 15876954832558315L;
```

Avoid lowercase `l` because it can look like the digit `1`.

---

# Literals

A literal is a fixed value assigned to a variable.

Example:

```java
int a = 10;
```

Here:

```text
10 = Literal
```

---

## Types of Literals

```java
int number = 100;          // Integer literal
float marks = 98.5f;       // Float literal
char grade = 'A';          // Character literal
String name = "Java";      // String literal
boolean active = true;     // Boolean literal
```

---

# Identifiers

Identifiers are names given to variables, methods, classes, packages, and other elements in Java.

Example:

```java
int a = 10;
```

Here:

```text
a = Identifier
```

---

## Examples of Identifiers

```java
int age = 25;
String studentName = "Rahul";
class Student {}
void displayDetails() {}
```

Here:

```text
age = variable identifier
studentName = variable identifier
Student = class identifier
displayDetails = method identifier
```

---

# Comments in Java

Comments are written in source code but ignored by the compiler.

Comments are used to explain code and improve readability.

---

## Types of Comments

Java supports mainly two commonly used types of comments:

1. Single-line comment
2. Multi-line comment

---

## 1. Single-Line Comment

A single-line comment starts with `//`.

Example:

```java
// This is a single-line comment
System.out.println("Hello Java");
```

---

## 2. Multi-Line Comment

A multi-line comment starts with `/*` and ends with `*/`.

Example:

```java
/*
 This is a multi-line comment.
 It can span multiple lines.
*/
System.out.println("Hello Java");
```

---

# Input in Java

Java provides the `Scanner` class to take input from the user.

The `Scanner` class is available in the `java.util` package.

---

## Steps to Take Input

1. Import the `Scanner` class.
2. Create an object of the `Scanner` class.
3. Use that object to take input from the keyboard.

---

## Syntax

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }
}
```

---

## Explanation

```java
Scanner input = new Scanner(System.in);
```

| Part | Meaning |
|---|---|
| `Scanner` | Class used to take input |
| `input` | Object reference used to access Scanner methods |
| `new` | Keyword used to create an object |
| `System.in` | Standard input stream, usually keyboard |

---

# Taking Integer Input

To take integer input, use `nextInt()`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rollNo = input.nextInt();

        System.out.println("Roll Number: " + rollNo);

        input.close();
    }
}
```

---

# Taking Float Input

To take float input, use `nextFloat()`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float marks = input.nextFloat();

        System.out.println("Marks: " + marks);

        input.close();
    }
}
```

---

# Taking String Input

There are two common ways to take string input:

1. `next()`
2. `nextLine()`

---

## 1. Using `next()`

`next()` reads only one word.

It stops reading when it finds a space.

Example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();

        System.out.println(word);

        input.close();
    }
}
```

Input:

```text
Hey Kunal
```

Output:

```text
Hey
```

---

## 2. Using `nextLine()`

`nextLine()` reads the complete line, including spaces.

Example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        System.out.println(line);

        input.close();
    }
}
```

Input:

```text
Hey Kunal
```

Output:

```text
Hey Kunal
```

---

# Program: Sum of Two Numbers

```java
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

        input.close();
    }
}
```

---

## Example Output

```text
Enter first number: 10
Enter second number: 20
Sum = 30
```

---

# Type Conversion

Type conversion happens when one type of data is automatically assigned to another compatible type.

This is also known as implicit type conversion or widening conversion.

---

## Conditions for Automatic Type Conversion

Automatic type conversion happens when:

1. The two types are compatible.
2. The destination type is larger than the source type.

---

## Example

```java
int num = 100;
long value = num;
```

Here, `int` is automatically converted into `long`.

This is valid because `long` has a larger range than `int`.

---

## Valid Automatic Conversion

```java
int a = 10;
float b = a;

System.out.println(b);
```

Output:

```text
10.0
```

---

# Type Casting

Type casting means manually converting one data type into another data type.

This is also known as explicit type conversion or narrowing conversion.

---

## Syntax

```java
targetType variableName = (targetType) value;
```

---

## Example

```java
int num = (int) 67.564f;

System.out.println(num);
```

Output:

```text
67
```

The decimal part is removed during conversion.

---

# Type Conversion vs Type Casting

| Type Conversion | Type Casting |
|---|---|
| Happens automatically | Done manually |
| Also called widening conversion | Also called narrowing conversion |
| No data loss usually | Data loss can happen |
| Smaller type to larger type | Larger type to smaller type |
| Example: `int` to `long` | Example: `float` to `int` |

---

# Automatic Type Promotion in Expressions

During expression evaluation, Java may automatically promote smaller data types to larger data types.

This prevents overflow or incorrect calculation during intermediate operations.

---

## Rules of Type Promotion

1. Java automatically promotes `byte`, `short`, and `char` operands to `int` during expression evaluation.
2. If one operand is `long`, the whole expression is promoted to `long`.
3. If one operand is `float`, the whole expression is promoted to `float`.
4. If one operand is `double`, the whole expression is promoted to `double`.

---

## Example

```java
byte a = 40;
byte b = 50;
byte c = 100;

int d = (a * b) / c;

System.out.println(d);
```

Output:

```text
20
```

---

## Explanation

```text
a * b = 40 * 50 = 2000
```

The value `2000` is outside the range of `byte`.

Therefore, Java automatically promotes `byte` values to `int` during expression evaluation.

---

# Type Promotion Example

```java
public class TypePromotion {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f * b) + (i / c) - (d * s);

        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
```

---

## Explanation

- `f * b` is promoted to `float`.
- `i / c` is promoted to `int`.
- `d * s` is promoted to `double`.
- Final result is stored in a `double`.

---

# Prime Number Program

A prime number is a number that is divisible only by `1` and itself.

---

## Optimized Prime Number Program

```java
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        if (n <= 1) {
            System.out.println("Neither prime nor composite");
            input.close();
            return;
        }

        int c = 2;

        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not Prime");
                input.close();
                return;
            }

            c++;
        }

        System.out.println("Prime");

        input.close();
    }
}
```

---

## Example Output 1

```text
Please enter a number: 17
Prime
```

---

## Example Output 2

```text
Please enter a number: 10
Not Prime
```

---

## Example Output 3

```text
Please enter a number: 1
Neither prime nor composite
```

---

## Important Correction

Avoid writing special logic only for `n == 4`.

The condition:

```java
while (c * c <= n)
```

already handles all composite numbers correctly, including `4`.

---

# If Statement

An `if` statement is used to execute a block of code only when a condition is true.

---

## Syntax

```java
if (condition) {
    // code to execute when condition is true
}
```

---

## Example

```java
public class IfStatement {
    public static void main(String[] args) {
        int a = 10;

        if (a == 10) {
            System.out.println("Hello");
        }
    }
}
```

---

## Output

```text
Hello
```

---

# While Loop

A `while` loop is used to execute a block of code repeatedly while a condition is true.

---

## Syntax

```java
while (condition) {
    // code to execute
}
```

---

## Example

```java
public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;

        while (count != 5) {
            System.out.println(count);
            count++;
        }
    }
}
```

---

## Output

```text
1
2
3
4
```

---

## Important Correction

Do not write:

```java
System.out.println("count");
```

if you want to print the value of the variable.

Correct:

```java
System.out.println(count);
```

---

# For Loop

A `for` loop is used when the number of iterations is known.

---

## Syntax

```java
for (initialization; condition; update) {
    // code to execute
}
```

---

## Example

```java
public class ForLoop {
    public static void main(String[] args) {
        for (int count = 1; count != 5; count++) {
            System.out.println(count);
        }
    }
}
```

---

## Output

```text
1
2
3
4
```

---

# Celsius to Fahrenheit Program

## Formula

```text
Fahrenheit = (Celsius * 9 / 5) + 32
```

---

## Java Program

```java
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + tempF);

        input.close();
    }
}
```

---

## Example Output

```text
Enter temperature in Celsius: 37
Temperature in Fahrenheit: 98.6
```

---

# Common Mistakes and Corrections

## Mistake 1: File Name and Public Class Name Mismatch

Incorrect:

```java
// File name: Main.java
public class Hello {
}
```

Correct:

```java
// File name: Main.java
public class Main {
}
```

---

## Mistake 2: Running Java Program With `.class`

Incorrect:

```bash
java Main.class
```

Correct:

```bash
java Main
```

---

## Mistake 3: Missing `static` in Main Method

Incorrect:

```java
public void main(String[] args) {
}
```

Correct:

```java
public static void main(String[] args) {
}
```

---

## Mistake 4: Using `next()` Instead of `nextLine()`

If input contains spaces, use `nextLine()`.

```java
String fullName = input.nextLine();
```

---

## Mistake 5: Forgetting `f` With Float

Incorrect:

```java
float marks = 98.67;
```

Correct:

```java
float marks = 98.67f;
```

---

## Mistake 6: Using Lowercase `l` With Long

Avoid:

```java
long value = 123456789l;
```

Prefer:

```java
long value = 123456789L;
```

---

# Quick Revision

```text
.java:
Java source code file.

.class:
Java bytecode file.

javac:
Java compiler.

java:
Command used to run Java bytecode.

main method:
Entry point of a Java program.

public:
Access modifier.

static:
Allows main method to run without object creation.

void:
Means method does not return anything.

System.out.println:
Prints output with a new line.

Package:
Folder or namespace for organizing Java classes.

Primitive data types:
Basic data types in Java.

Literal:
Fixed value assigned to a variable.

Identifier:
Name of variable, method, class, or package.

Scanner:
Class used to take input.

next():
Reads one word.

nextLine():
Reads complete line.

Type Conversion:
Automatic conversion from smaller compatible type to larger type.

Type Casting:
Manual conversion from one type to another.

Type Promotion:
Automatic promotion during expression evaluation.
```

---

# Interview Questions

## Q1. What is the extension of a Java source file?

A Java source file is saved with the `.java` extension.

---

## Q2. What is the extension of a Java bytecode file?

A Java bytecode file is saved with the `.class` extension.

---

## Q3. What is the role of `javac`?

`javac` is the Java compiler. It converts `.java` source files into `.class` bytecode files.

---

## Q4. What is the role of the `java` command?

The `java` command is used to run compiled Java bytecode.

---

## Q5. What is the entry point of a Java program?

The `main` method is the entry point of a Java program.

```java
public static void main(String[] args)
```

---

## Q6. Why is the main method static?

The main method is static so that the JVM can call it without creating an object of the class.

---

## Q7. What is `String[] args`?

`String[] args` is an array used to store command-line arguments.

---

## Q8. What is the difference between `print` and `println`?

`print` prints output without moving to the next line.

`println` prints output and moves to the next line.

---

## Q9. What is a package in Java?

A package is a namespace or folder used to organize related Java classes.

---

## Q10. Is String a primitive data type?

No. `String` is not a primitive data type. It is a class in Java.

---

## Q11. What is a literal?

A literal is a fixed value assigned to a variable.

Example:

```java
int a = 10;
```

Here, `10` is a literal.

---

## Q12. What is an identifier?

An identifier is the name of a variable, method, class, or package.

---

## Q13. What is Scanner in Java?

`Scanner` is a class from the `java.util` package used to take input from the user.

---

## Q14. What is the difference between `next()` and `nextLine()`?

`next()` reads only one word.

`nextLine()` reads the complete line including spaces.

---

## Q15. What is type conversion?

Type conversion is the automatic conversion of one compatible data type into another larger data type.

---

## Q16. What is type casting?

Type casting is the manual conversion of one data type into another data type.

---

## Q17. What is type promotion?

Type promotion is the automatic promotion of smaller data types like `byte`, `short`, and `char` to `int` during expression evaluation.

---

# Practice Problems

## Problem 1

Write a Java program to print:

```text
Hello World
```

---

## Problem 2

Write a Java program to take your name as input and print it.

---

## Problem 3

Write a Java program to take two integers as input and print their sum.

---

## Problem 4

Write a Java program to take marks as input using `float`.

---

## Problem 5

Write a Java program to check whether a number is prime or not.

---

## Problem 6

Write a Java program to print numbers from `1` to `10` using a `while` loop.

---

## Problem 7

Write a Java program to print numbers from `1` to `10` using a `for` loop.

---

## Problem 8

Write a Java program to convert Celsius temperature into Fahrenheit.

---

# Summary

In this chapter, we learned:

- Structure of a Java file
- First Java program
- Compilation and execution commands
- Meaning of each part of the `main` method
- Packages in Java
- Primitive data types
- Literals and identifiers
- Comments in Java
- Taking input using Scanner
- `next()` vs `nextLine()`
- Sum of two numbers program
- Type conversion
- Type casting
- Type promotion
- Prime number program
- If statement
- While loop
- For loop
- Celsius to Fahrenheit program