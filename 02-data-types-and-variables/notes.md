# 02 - Data Types and Variables Notes

## 1. Variable

A variable is a named memory location used to store data.

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

## 2. Variable Declaration and Initialization

### Declaration

```java
int age;
```

### Initialization

```java
age = 25;
```

### Declaration with Initialization

```java
int age = 25;
```

---

## 3. Variable Naming Rules

Valid rules:

- Variable name can contain letters, digits, `_`, and `$`.
- Variable name cannot start with a digit.
- Java keywords cannot be used as variable names.
- Variable names are case-sensitive.
- Use meaningful names.

Valid examples:

```java
int age;
int studentAge;
int totalMarks;
int $salary;
int _count;
```

Invalid examples:

```java
int 2marks;
int class;
int student-age;
int total marks;
```

---

## 4. Naming Convention

Use camelCase for variables.

```java
int studentAge;
double accountBalance;
String firstName;
```

Use meaningful names.

Bad:

```java
int x;
```

Better:

```java
int totalMarks;
```

---

## 5. Identifier

An identifier is the name given to a variable, method, class, package, or interface.

```java
int age = 25;
```

Here, `age` is an identifier.

---

## 6. Literal

A literal is a fixed value assigned to a variable.

```java
int age = 25;
```

Here, `25` is a literal.

Examples:

```java
int number = 100;
long amount = 100000L;
float marks = 98.5f;
double salary = 55000.75;
char grade = 'A';
String name = "Java";
boolean active = true;
```

---

## 7. Data Types in Java

Java data types are divided into two categories:

1. Primitive Data Types
2. Non-Primitive Data Types

---

## 8. Primitive Data Types

Java has 8 primitive data types.

| Type | Size | Example |
|---|---:|---|
| `byte` | 1 byte | `byte b = 10;` |
| `short` | 2 bytes | `short s = 1000;` |
| `int` | 4 bytes | `int n = 100;` |
| `long` | 8 bytes | `long l = 100000L;` |
| `float` | 4 bytes | `float f = 10.5f;` |
| `double` | 8 bytes | `double d = 99.99;` |
| `char` | 2 bytes | `char c = 'A';` |
| `boolean` | JVM dependent | `boolean flag = true;` |

---

## 9. Important Primitive Type Points

### `int`

Most commonly used for whole numbers.

```java
int age = 25;
```

### `long`

Used for large integer values.

```java
long transactionId = 9876543210L;
```

Use uppercase `L`, not lowercase `l`.

### `float`

Used for decimal values with lower precision.

```java
float marks = 98.75f;
```

`f` is required because decimal values are treated as `double` by default.

### `double`

Used for decimal values with higher precision.

```java
double salary = 55000.75;
```

### `char`

Stores a single character.

```java
char grade = 'A';
```

Use single quotes for `char`.

### `boolean`

Stores only `true` or `false`.

```java
boolean isActive = true;
```

---

## 10. Non-Primitive Data Types

Non-primitive data types are based on classes, arrays, interfaces, and objects.

Examples:

```java
String name = "Java";
int[] numbers = {1, 2, 3};
Student student = new Student();
```

Common examples:

- String
- Array
- Class
- Object
- Interface
- Enum

---

## 11. Primitive vs Non-Primitive

| Primitive | Non-Primitive |
|---|---|
| Stores actual value | Stores reference |
| Predefined by Java | Created using classes or arrays |
| Cannot call methods | Can call methods |
| Example: `int`, `char` | Example: `String`, `Array` |

---

## 12. String is Not Primitive

`String` is not a primitive data type.

It is a class in Java.

```java
String name = "Java";
```

---

## 13. Default Values

Instance variables get default values.

| Type | Default Value |
|---|---|
| `int` | `0` |
| `long` | `0L` |
| `float` | `0.0f` |
| `double` | `0.0d` |
| `char` | `'\u0000'` |
| `boolean` | `false` |
| Object reference | `null` |

Important:

Local variables do not get default values.

Invalid:

```java
public class Main {
    public static void main(String[] args) {
        int age;
        System.out.println(age);
    }
}
```

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

## 14. Type Conversion

Type conversion means automatic conversion from a smaller compatible type to a larger type.

It is also called widening conversion.

```java
int number = 10;
double result = number;

System.out.println(result);
```

Output:

```text
10.0
```

Widening order:

```text
byte -> short -> int -> long -> float -> double
char -> int -> long -> float -> double
```

---

## 15. Type Casting

Type casting means manually converting one type into another.

It is also called narrowing conversion.

```java
double value = 99.99;
int number = (int) value;

System.out.println(number);
```

Output:

```text
99
```

Data loss can happen during type casting.

---

## 16. Type Promotion

During expression evaluation, Java promotes smaller types.

Rules:

- `byte`, `short`, and `char` are promoted to `int`.
- If one operand is `long`, result becomes `long`.
- If one operand is `float`, result becomes `float`.
- If one operand is `double`, result becomes `double`.

Example:

```java
byte a = 10;
byte b = 20;

// byte c = a + b; // compile-time error
int c = a + b;
```

Reason:

`a + b` is promoted to `int`.

---

## 17. Overflow and Underflow

Overflow happens when a value crosses the maximum range.

```java
byte b = 127;
b++;

System.out.println(b);
```

Output:

```text
-128
```

Underflow happens when a value goes below the minimum range.

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

## 18. final Keyword

`final` is used to create constants.

```java
final int MAX_USERS = 100;
```

Value cannot be changed after assignment.

Constants should be written in uppercase.

```java
final double PI = 3.14159;
final int MAX_RETRY_COUNT = 3;
```

---

## 19. var Keyword

`var` was introduced in Java 10 for local variable type inference.

```java
var name = "Java";
var age = 25;
```

Rules:

- Can be used only for local variables.
- Must be initialized at declaration.
- Cannot be used for instance variables.
- Should not be overused if it reduces readability.

Invalid:

```java
var salary;
```

---

## 20. Variable Scope

Scope defines where a variable can be accessed.

### Local Variable

Declared inside method or block.

```java
public class Main {
    public static void main(String[] args) {
        int age = 25;
    }
}
```

### Instance Variable

Declared inside class but outside methods.

```java
class Student {
    String name;
    int age;
}
```

### Static Variable

Belongs to class, shared by all objects.

```java
class Counter {
    static int count = 0;
}
```

### Block Scope

Variable declared inside a block is accessible only inside that block.

```java
if (true) {
    int number = 10;
}

// number cannot be used here
```

---

## 21. SDE-2 Notes

- Use meaningful variable names.
- Avoid magic numbers.
- Use constants for fixed values.
- Use `long` for large numeric values.
- Use `BigDecimal` for exact money calculations.
- Be careful with overflow.
- Prefer readability over unnecessary use of `var`.

Example:

```java
final double USD_TO_INR_RATE = 83.0;
double usd = rupees / USD_TO_INR_RATE;
```

For exact money calculations:

```java
BigDecimal amount = new BigDecimal("99.99");
```

---

## Quick Revision

```text
Variable:
Named memory location.

Data Type:
Defines what type of value a variable can store.

Identifier:
Name of variable, method, class, etc.

Literal:
Fixed value assigned to a variable.

Primitive Types:
byte, short, int, long, float, double, char, boolean.

Non-Primitive Types:
String, Array, Class, Object, Interface.

Type Conversion:
Automatic widening conversion.

Type Casting:
Manual narrowing conversion.

Type Promotion:
Automatic promotion during expression evaluation.

Overflow:
Value exceeds maximum range.

final:
Used to create constants.

var:
Local variable type inference.

Scope:
Defines where a variable can be accessed.
```