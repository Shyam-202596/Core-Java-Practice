# 02 - Data Types and Variables Assignment

## Objective

This assignment focuses on Java variables, data types, literals, identifiers, type conversion, type casting, type promotion, overflow, constants, and variable scope.

Keep answers short, clear, and practical.

---

# Theory and Interview Questions

## Q1. What is a variable in Java?

Explain with one example.

---

## Q2. What is the difference between variable declaration and initialization?

Give examples.

---

## Q3. Which of the following variable names are invalid and why?

```java
int age;
int 2marks;
int studentName;
int class;
int total_marks;
int student-age;
int $salary;
```

---

## Q4. What is an identifier?

Give examples of variable, method, and class identifiers.

---

## Q5. What is a literal?

Identify literals in the code below:

```java
int age = 25;
String name = "Java";
boolean active = true;
```

---

## Q6. List all 8 primitive data types in Java.

---

## Q7. What is the difference between primitive and non-primitive data types?

Give examples.

---

## Q8. Why is `String` not a primitive data type in Java?

---

## Q9. What is the difference between `float` and `double`?

---

## Q10. Why do we use `f` with float and `L` with long?

Example:

```java
float marks = 98.5f;
long value = 123456789L;
```

---

## Q11. Do local variables get default values in Java?

Explain with example.

---

## Q12. What are the default values of instance variables for `int`, `boolean`, and `String`?

---

## Q13. What is type conversion?

Give one example.

---

## Q14. What is type casting?

Give one example where data loss happens.

---

## Q15. What is type promotion in Java?

Explain why this code fails:

```java
byte a = 10;
byte b = 20;
byte c = a + b;
```

---

## Q16. What is overflow?

Predict the output:

```java
byte b = 127;
b++;
System.out.println(b);
```

---

## Q17. What is the use of the `final` keyword with variables?

---

## Q18. What is `var` in Java?

Mention two important rules.

---

## Q19. What is variable scope?

Explain local, instance, and static variables briefly.

---

## Q20. Why should `double` not be used for exact money calculations?

Which class should be preferred?

---

# Coding Questions

## Q21. Primitive Data Types Demo

Write a Java program to declare and print one variable of each primitive data type.

Expected types:

```text
byte, short, int, long, float, double, char, boolean
```

---

## Q22. Personal Information Program

Create variables to store and print:

1. Name
2. Age
3. Salary
4. Grade
5. Active status

---

## Q23. Type Conversion Program

Write a Java program to perform automatic conversion:

```text
int -> long
int -> double
char -> int
```

---

## Q24. Type Casting Program

Write a Java program to perform explicit casting:

```text
double -> int
float -> int
long -> int
```

Print values before and after casting.

---

## Q25. Type Promotion Program

Write a Java program to demonstrate type promotion using `byte`.

Example:

```java
byte a = 40;
byte b = 50;
```

Store the result in an `int`.

---

## Q26. Overflow Program

Write a Java program to show overflow using `byte`.

Hint:

```java
byte b = 127;
b++;
```

---

## Q27. Final Variable Program

Write a Java program using a `final` variable for `PI`.

Calculate area of a circle.

Formula:

```text
Area = PI * radius * radius
```

---

## Q28. Currency Converter

Write a Java program to convert rupees to USD.

Use a constant for exchange rate.

Example:

```java
final double USD_TO_INR_RATE = 83.0;
```

---

## Q29. Student Marks Calculator

Create variables for marks of 5 subjects.

Calculate:

1. Total marks
2. Average marks
3. Percentage

---

## Q30. Simple Bill Calculator

Create variables for:

1. Item price
2. Quantity
3. Tax percentage

Calculate final bill amount.

Use constants where required.

---

# Submission Checklist

Before submitting, verify:

- Variable names follow camelCase.
- Constants use uppercase naming.
- `float` values use `f`.
- `long` values use uppercase `L`.
- Local variables are initialized before use.
- Type casting is explicit where required.
- Programs compile successfully.
- Code is simple and readable.