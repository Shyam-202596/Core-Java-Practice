# 02 - Data Types and Variables Notes

## Introduction

Data types and variables are the foundation of Java programming.

A variable is used to store data, and a data type defines what kind of data can be stored in that variable.

Example:

```java
int age = 25;
```

Here:

```text
int = data type
age = variable name
25 = value
```

---

# Variables in Java

## What is a Variable?

A variable is a named memory location used to store data.

The value of a variable can be used and changed during program execution.

Example:

```java
int marks = 90;
marks = 95;
```

Here, the value of `marks` changes from `90` to `95`.

---

## Syntax of Variable Declaration

```java
dataType variableName = value;
```

Example:

```java
int age = 25;
String name = "Java";
double salary = 55000.50;
```

---

## Variable Declaration

A variable can be declared without assigning a value.

```java
int age;
```

Here, `age` is declared but not initialized.

---

## Variable Initialization

Assigning a value to a variable is called initialization.

```java
int age = 25;
```

Here, `age` is initialized with value `25`.

---

## Variable Reassignment

A variable value can be changed after initialization.

```java
int age = 25;
age = 30;
```

Now the value of `age` is `30`.

---

# Rules for Naming Variables

Java variables must follow certain rules.

## Valid Rules

- Variable names can contain letters, digits, underscore `_`, and dollar sign `$`.
- Variable names cannot start with a digit.
- Variable names cannot be Java keywords.
- Variable names are case-sensitive.
- Variable names should be meaningful.

---

## Valid Variable Names

```java
int age;
int studentAge;
int total_marks;
int $amount;
int marks2;
```

---

## Invalid Variable Names

```java
int 2marks;
int class;
int student-age;
int total marks;
```

---

## Java Naming Convention for Variables

Variables should follow camelCase naming convention.

Example:

```java
int studentAge;
double accountBalance;
String firstName;
```

Avoid unclear names:

```java
int x;
int y;
```

Prefer meaningful names:

```java
int totalMarks;
int numberOfStudents;
```

---

# Identifiers

## What is an Identifier?

An identifier is the name given to a variable, method, class, package, or interface.

Example:

```java
int age = 25;
```

Here:

```text
age = identifier
```

---

## Examples of Identifiers

```java
class Student {
    int rollNumber;

    void displayDetails() {
        System.out.println(rollNumber);
    }
}
```

Here:

```text
Student = class identifier
rollNumber = variable identifier
displayDetails = method identifier
```

---

# Literals

## What is a Literal?

A literal is a fixed value assigned to a variable.

Example:

```java
int age = 25;
```

Here:

```text
25 = literal
```

---

## Types of Literals

```java
int number = 100;              // Integer literal
long population = 9000000L;    // Long literal
float marks = 98.5f;           // Float literal
double salary = 55000.75;      // Double literal
char grade = 'A';              // Character literal
String name = "Java";          // String literal
boolean isActive = true;       // Boolean literal
```

---

# Data Types in Java

Java data types define the type of value a variable can store.

Java data types are mainly divided into two categories:

1. Primitive Data Types
2. Non-Primitive Data Types

---

# Primitive Data Types

Primitive data types are the most basic data types in Java.

They are predefined by Java.

Java has 8 primitive data types:

1. byte
2. short
3. int
4. long
5. float
6. double
7. char
8. boolean

---

## Primitive Data Types Table

| Data Type | Size | Default Value | Example |
|---|---:|---|---|
| `byte` | 1 byte | `0` | `byte b = 10;` |
| `short` | 2 bytes | `0` | `short s = 1000;` |
| `int` | 4 bytes | `0` | `int i = 100000;` |
| `long` | 8 bytes | `0L` | `long l = 100000L;` |
| `float` | 4 bytes | `0.0f` | `float f = 10.5f;` |
| `double` | 8 bytes | `0.0d` | `double d = 99.99;` |
| `char` | 2 bytes | `'\u0000'` | `char c = 'A';` |
| `boolean` | JVM dependent | `false` | `boolean flag = true;` |

---

# Integer Data Types

Integer data types store whole numbers.

Java provides four integer data types:

1. byte
2. short
3. int
4. long

---

## byte

`byte` is used to store small integer values.

Range:

```text
-128 to 127
```

Example:

```java
byte age = 25;
```

Use `byte` when memory saving is important and values are small.

---

## short

`short` is used to store integer values larger than `byte` but smaller than `int`.

Range:

```text
-32,768 to 32,767
```

Example:

```java
short marks = 30000;
```

---

## int

`int` is the most commonly used integer data type in Java.

Example:

```java
int salary = 50000;
```

By default, whole number literals are treated as `int`.

---

## long

`long` is used to store large integer values.

Example:

```java
long distance = 9876543210L;
```

Use uppercase `L` with long values.

Recommended:

```java
long value = 123456789L;
```

Avoid:

```java
long value = 123456789l;
```

Lowercase `l` can look like digit `1`.

---

# Floating Point Data Types

Floating point data types store decimal values.

Java provides two floating point data types:

1. float
2. double

---

## float

`float` stores decimal values with single precision.

Example:

```java
float marks = 98.75f;
```

By default, decimal values are treated as `double`.

Therefore, `f` or `F` is required for float values.

Incorrect:

```java
float marks = 98.75;
```

Correct:

```java
float marks = 98.75f;
```

---

## double

`double` stores decimal values with double precision.

It is more precise than `float`.

Example:

```java
double salary = 55000.75;
```

By default, decimal values are treated as `double`.

---

## float vs double

| Feature | float | double |
|---|---|---|
| Size | 4 bytes | 8 bytes |
| Precision | Lower | Higher |
| Suffix required | `f` or `F` | Not required |
| Recommended for | Memory-sensitive decimal values | General decimal calculations |

---

# char Data Type

`char` is used to store a single character.

Example:

```java
char grade = 'A';
```

Important:

- `char` uses single quotes.
- `String` uses double quotes.
- Java `char` is based on Unicode.

Correct:

```java
char ch = 'A';
```

Incorrect:

```java
char ch = "A";
```

---

# boolean Data Type

`boolean` stores only two values:

```text
true
false
```

Example:

```java
boolean isLoggedIn = true;
boolean isCompleted = false;
```

Boolean is commonly used in conditions.

```java
boolean isActive = true;

if (isActive) {
    System.out.println("User is active");
}
```

---

# Non-Primitive Data Types

Non-primitive data types are created using classes, interfaces, arrays, or enums.

Examples:

```java
String name = "Java";
int[] numbers = {1, 2, 3};
Student student = new Student();
```

Common non-primitive types:

- String
- Array
- Class
- Interface
- Enum
- Wrapper Classes

---

## Primitive vs Non-Primitive Data Types

| Primitive Data Types | Non-Primitive Data Types |
|---|---|
| Predefined by Java | Created using classes, arrays, interfaces, etc. |
| Store actual values | Store references to objects |
| Cannot call methods directly | Can call methods |
| Examples: `int`, `char`, `boolean` | Examples: `String`, `Array`, `Object` |

---

# String is Not a Primitive Data Type

`String` is not a primitive data type.

`String` is a class in Java.

Example:

```java
String name = "Java";
```

A string can contain multiple characters.

```text
"Java" = 'J', 'a', 'v', 'a'
```

---

# Default Values

Default values are assigned to instance variables when no value is explicitly assigned.

Example:

```java
class Student {
    int age;
    boolean active;
    String name;
}
```

Default values:

```text
int = 0
boolean = false
String = null
```

---

## Important Point About Local Variables

Local variables do not get default values.

They must be initialized before use.

Incorrect:

```java
public class Main {
    public static void main(String[] args) {
        int age;
        System.out.println(age);
    }
}
```

This gives compile-time error.

Correct:

```java
public class Main {
    public static void main(String[] args) {
        int age = 25;
        System.out.println(age);
    }
}
```

---

# Type Conversion

Type conversion means automatically converting one data type into another compatible data type.

It is also called widening conversion.

Example:

```java
int num = 100;
long value = num;
```

Here, `int` is automatically converted to `long`.

---

## Conditions for Automatic Type Conversion

Automatic type conversion happens when:

1. Both data types are compatible.
2. The destination type is larger than the source type.

---

## Widening Conversion Order

```text
byte -> short -> int -> long -> float -> double
char -> int -> long -> float -> double
```

Example:

```java
int number = 10;
double result = number;

System.out.println(result);
```

Output:

```text
10.0
```

---

# Type Casting

Type casting means manually converting one data type into another.

It is also called narrowing conversion.

Example:

```java
double value = 99.99;
int number = (int) value;

System.out.println(number);
```

Output:

```text
99
```

Decimal part is removed during casting.

---

## Syntax

```java
targetType variableName = (targetType) value;
```

Example:

```java
int num = (int) 67.89;
```

---

## Type Conversion vs Type Casting

| Type Conversion | Type Casting |
|---|---|
| Automatic | Manual |
| Widening conversion | Narrowing conversion |
| Smaller type to larger type | Larger type to smaller type |
| Usually safe | Data loss may happen |
| Example: `int` to `double` | Example: `double` to `int` |

---

# Data Loss in Type Casting

Type casting can cause data loss.

Example:

```java
double price = 99.99;
int roundedPrice = (int) price;

System.out.println(roundedPrice);
```

Output:

```text
99
```

The decimal part is removed.

---

# Overflow and Underflow

## Overflow

Overflow happens when a value exceeds the maximum range of a data type.

Example:

```java
byte b = 127;
b++;

System.out.println(b);
```

Output:

```text
-128
```

Reason:

`byte` range is from `-128` to `127`.

After `127`, it wraps around to `-128`.

---

## Underflow

Underflow happens when a value goes below the minimum range of a data type.

Example:

```java
byte b = -128;
b--;

System.out.println(b);
```

Output:

```text
127
```

---

# Type Promotion in Expressions

Java automatically promotes smaller data types during expression evaluation.

---

## Type Promotion Rules

1. `byte`, `short`, and `char` are promoted to `int`.
2. If one operand is `long`, the result is promoted to `long`.
3. If one operand is `float`, the result is promoted to `float`.
4. If one operand is `double`, the result is promoted to `double`.

---

## Example

```java
byte a = 40;
byte b = 50;

int result = a * b;

System.out.println(result);
```

Output:

```text
2000
```

Here, `a` and `b` are promoted to `int` before multiplication.

---

## Important Example

```java
byte a = 10;
byte b = 20;

// byte c = a + b; // Compile-time error
int c = a + b;

System.out.println(c);
```

Reason:

`a + b` is promoted to `int`.

---

# final Keyword with Variables

The `final` keyword is used to make a variable constant.

Once assigned, its value cannot be changed.

Example:

```java
final int MAX_USERS = 100;
```

Incorrect:

```java
final int MAX_USERS = 100;
MAX_USERS = 200;
```

This gives compile-time error.

---

## Naming Convention for Constants

Constants should be written in uppercase with underscores.

Example:

```java
final double PI = 3.14159;
final int MAX_RETRY_COUNT = 3;
```

---

# var Keyword

From Java 10, `var` can be used for local variable type inference.

Example:

```java
var name = "Java";
var age = 25;
```

Compiler determines the type based on assigned value.

Equivalent:

```java
String name = "Java";
int age = 25;
```

---

## Important Rules for var

`var` can only be used for local variables.

Valid:

```java
public class Main {
    public static void main(String[] args) {
        var number = 10;
    }
}
```

Invalid:

```java
class Student {
    var age = 25;
}
```

`var` must be initialized at declaration.

Invalid:

```java
var age;
```

---

# Variable Scope

Scope defines where a variable can be accessed.

Common scopes:

1. Local scope
2. Instance scope
3. Static scope
4. Block scope

---

## Local Variable

A local variable is declared inside a method, constructor, or block.

Example:

```java
public class Main {
    public static void main(String[] args) {
        int age = 25;
        System.out.println(age);
    }
}
```

`age` can be accessed only inside the `main` method.

---

## Instance Variable

An instance variable is declared inside a class but outside methods.

Each object gets its own copy.

Example:

```java
class Student {
    String name;
    int age;
}
```

---

## Static Variable

A static variable belongs to the class, not to individual objects.

Example:

```java
class Counter {
    static int count = 0;
}
```

All objects share the same static variable.

---

## Block Scope

A variable declared inside a block can be accessed only inside that block.

Example:

```java
public class Main {
    public static void main(String[] args) {
        if (true) {
            int number = 10;
            System.out.println(number);
        }

        // System.out.println(number); // Compile-time error
    }
}
```

---

# Good Practices for SDE-2 Level Code

## 1. Use Meaningful Names

Poor:

```java
int x = 100;
```

Better:

```java
int totalAmount = 100;
```

---

## 2. Prefer `long` for Large Numeric Values

```java
long transactionId = 9876543210L;
```

---

## 3. Prefer `BigDecimal` for Money Calculations

Avoid using `double` for exact currency calculations.

Example:

```java
import java.math.BigDecimal;

BigDecimal price = new BigDecimal("99.99");
```

Reason:

Floating point types can have precision issues.

---

## 4. Avoid Magic Numbers

Poor:

```java
double usd = rupees / 83.0;
```

Better:

```java
final double USD_TO_INR_RATE = 83.0;
double usd = rupees / USD_TO_INR_RATE;
```

---

## 5. Be Careful With Overflow

```java
int max = Integer.MAX_VALUE;
System.out.println(max + 1);
```

This causes overflow.

Use `long` if the value can exceed `int` range.

---

# Common Mistakes

## Mistake 1: Using Uninitialized Local Variable

Incorrect:

```java
int age;
System.out.println(age);
```

Correct:

```java
int age = 25;
System.out.println(age);
```

---

## Mistake 2: Missing `f` with float

Incorrect:

```java
float marks = 98.5;
```

Correct:

```java
float marks = 98.5f;
```

---

## Mistake 3: Using Lowercase `l` with long

Avoid:

```java
long value = 123456789l;
```

Prefer:

```java
long value = 123456789L;
```

---

## Mistake 4: Assigning Larger Type to Smaller Type Without Casting

Incorrect:

```java
double value = 99.99;
int number = value;
```

Correct:

```java
double value = 99.99;
int number = (int) value;
```

---

## Mistake 5: Expecting byte Addition to Return byte

Incorrect:

```java
byte a = 10;
byte b = 20;
byte c = a + b;
```

Correct:

```java
byte a = 10;
byte b = 20;
int c = a + b;
```

---

# Quick Revision

```text
Variable:
A named memory location used to store data.

Data Type:
Defines the type of value a variable can store.

Identifier:
Name of a variable, method, class, or package.

Literal:
Fixed value assigned to a variable.

Primitive Data Types:
byte, short, int, long, float, double, char, boolean.

Non-Primitive Data Types:
String, Array, Class, Interface, Enum, Object.

Type Conversion:
Automatic conversion from smaller compatible type to larger type.

Type Casting:
Manual conversion from one type to another.

Type Promotion:
Automatic promotion during expression evaluation.

Overflow:
When value exceeds maximum range.

Underflow:
When value goes below minimum range.

final:
Used to create constants.

var:
Used for local variable type inference.

Scope:
Defines where a variable can be accessed.
```

---

# Interview Questions

## Q1. What is a variable?

A variable is a named memory location used to store data.

---

## Q2. What is a data type?

A data type defines the type of value a variable can store.

---

## Q3. How many primitive data types are available in Java?

Java has 8 primitive data types:

```text
byte, short, int, long, float, double, char, boolean
```

---

## Q4. Is String a primitive data type?

No. `String` is a class in Java, so it is a non-primitive data type.

---

## Q5. What is a literal?

A literal is a fixed value assigned to a variable.

Example:

```java
int age = 25;
```

Here, `25` is a literal.

---

## Q6. What is an identifier?

An identifier is the name given to a variable, method, class, package, or interface.

---

## Q7. What is the difference between float and double?

`float` uses 4 bytes and has lower precision.

`double` uses 8 bytes and has higher precision.

---

## Q8. Why do we use `f` with float values?

Because decimal values are treated as `double` by default in Java.

Example:

```java
float marks = 98.5f;
```

---

## Q9. What is type conversion?

Type conversion is automatic conversion from one compatible smaller type to a larger type.

---

## Q10. What is type casting?

Type casting is manual conversion from one type to another.

---

## Q11. What is type promotion?

Type promotion is Java's automatic promotion of smaller data types during expression evaluation.

---

## Q12. What is overflow?

Overflow happens when a value exceeds the maximum range of a data type.

---

## Q13. What is the use of final keyword?

The `final` keyword is used to make a variable constant.

---

## Q14. What is var in Java?

`var` is used for local variable type inference from Java 10 onward.

---

## Q15. What is the difference between local, instance, and static variables?

Local variables are declared inside methods.

Instance variables belong to objects.

Static variables belong to the class.