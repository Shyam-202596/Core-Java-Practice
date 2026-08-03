# 03 - Operators Notes

## 1. What is an Operator?

An operator is a symbol used to perform operations on variables and values.

Example:

```java
int sum = 10 + 20;
```

Here, `+` is an operator.

---

## 2. Types of Operators in Java

Java commonly uses these operators:

1. Arithmetic Operators
2. Unary Operators
3. Assignment Operators
4. Relational Operators
5. Logical Operators
6. Increment and Decrement Operators
7. Bitwise Operators
8. Shift Operators
9. Ternary Operator
10. `instanceof` Operator

---

## 3. Arithmetic Operators

Arithmetic operators are used to perform mathematical operations.

| Operator | Meaning |
|---|---|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus or remainder |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

---

## 4. Integer Division

When both operands are integers, division returns an integer result.

```java
int a = 10;
int b = 3;

System.out.println(a / b);
```

Output:

```text
3
```

To get decimal result:

```java
double result = 10.0 / 3;
```

---

## 5. Unary Operators

Unary operators work with a single operand.

| Operator | Meaning |
|---|---|
| `+` | Positive value |
| `-` | Negative value |
| `!` | Logical NOT |

Example:

```java
int a = 10;
boolean active = true;

System.out.println(-a);       // -10
System.out.println(!active);  // false
```

---

## 6. Increment and Decrement Operators

| Operator | Meaning |
|---|---|
| `++` | Increase value by 1 |
| `--` | Decrease value by 1 |

Example:

```java
int count = 5;

count++;
System.out.println(count); // 6

count--;
System.out.println(count); // 5
```

---

## 7. Pre-Increment vs Post-Increment

### Pre-Increment

Value is increased first, then used.

```java
int a = 5;
int b = ++a;

System.out.println(a); // 6
System.out.println(b); // 6
```

### Post-Increment

Value is used first, then increased.

```java
int a = 5;
int b = a++;

System.out.println(a); // 6
System.out.println(b); // 5
```

---

## 8. Assignment Operators

Assignment operators are used to assign or update values.

| Operator | Example | Meaning |
|---|---|---|
| `=` | `a = 10` | Assign value |
| `+=` | `a += 5` | `a = a + 5` |
| `-=` | `a -= 5` | `a = a - 5` |
| `*=` | `a *= 5` | `a = a * 5` |
| `/=` | `a /= 5` | `a = a / 5` |
| `%=` | `a %= 5` | `a = a % 5` |

Example:

```java
int a = 10;

a += 5;

System.out.println(a); // 15
```

---

## 9. Relational Operators

Relational operators compare two values and return boolean result.

| Operator | Meaning |
|---|---|
| `==` | Equal to |
| `!=` | Not equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |

Example:

```java
int a = 10;
int b = 20;

System.out.println(a == b); // false
System.out.println(a < b);  // true
```

---

## 10. Logical Operators

Logical operators are used to combine boolean expressions.

| Operator | Meaning |
|---|---|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

Example:

```java
int age = 25;
boolean hasId = true;

System.out.println(age >= 18 && hasId); // true
System.out.println(age < 18 || hasId);  // true
System.out.println(!hasId);             // false
```

---

## 11. Short-Circuit Evaluation

`&&` and `||` use short-circuit evaluation.

### `&&`

If the first condition is false, the second condition is not checked.

```java
int a = 5;

System.out.println(a > 10 && a++ > 0);
System.out.println(a); // 5
```

### `||`

If the first condition is true, the second condition is not checked.

```java
int a = 5;

System.out.println(a < 10 || a++ > 0);
System.out.println(a); // 5
```

---

## 12. Bitwise Operators

Bitwise operators work on bits.

| Operator | Meaning |
|---|---|
| `&` | Bitwise AND |
| `|` | Bitwise OR |
| `^` | Bitwise XOR |
| `~` | Bitwise Complement |

Example:

```java
int a = 5;  // 0101
int b = 3;  // 0011

System.out.println(a & b); // 1
System.out.println(a | b); // 7
System.out.println(a ^ b); // 6
```

---

## 13. Shift Operators

Shift operators shift bits left or right.

| Operator | Meaning |
|---|---|
| `<<` | Left shift |
| `>>` | Right shift |
| `>>>` | Unsigned right shift |

Example:

```java
int a = 8;

System.out.println(a << 1); // 16
System.out.println(a >> 1); // 4
```

Note:

```text
a << 1 means multiply by 2
a >> 1 means divide by 2
```

---

## 14. Ternary Operator

Ternary operator is a short form of `if-else`.

Syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

Example:

```java
int age = 18;

String result = age >= 18 ? "Adult" : "Minor";

System.out.println(result);
```

Output:

```text
Adult
```

---

## 15. instanceof Operator

`instanceof` checks whether an object belongs to a class or interface.

Example:

```java
String name = "Java";

System.out.println(name instanceof String); // true
```

---

## 16. Operator Precedence

Operator precedence decides which operator is evaluated first.

Example:

```java
int result = 10 + 5 * 2;

System.out.println(result); // 20
```

Multiplication happens before addition.

Use parentheses for clarity:

```java
int result = (10 + 5) * 2;

System.out.println(result); // 30
```

---

## 17. Common Mistakes

### Mistake 1: Confusing `=` and `==`

Incorrect:

```java
if (a = 10) {
}
```

Correct:

```java
if (a == 10) {
}
```

---

### Mistake 2: Integer Division

```java
System.out.println(10 / 3); // 3
```

Use decimal value if decimal result is required.

```java
System.out.println(10.0 / 3); // 3.3333
```

---

### Mistake 3: Misunderstanding Post-Increment

```java
int a = 5;
int b = a++;

System.out.println(b); // 5
System.out.println(a); // 6
```

---

## 18. SDE-2 Notes

- Prefer clear expressions over complex one-liners.
- Use parentheses when precedence can confuse readers.
- Be careful with integer division.
- Understand short-circuit behavior.
- Avoid side effects inside conditions.
- Use meaningful boolean variable names.

Good:

```java
boolean isEligible = age >= 18 && hasValidId;
```

Avoid:

```java
if (age++ > 18 && check()) {
}
```

---

## Quick Revision

```text
Arithmetic:
+, -, *, /, %

Unary:
+, -, !

Increment/Decrement:
++, --

Assignment:
=, +=, -=, *=, /=, %=

Relational:
==, !=, >, <, >=, <=

Logical:
&&, ||, !

Bitwise:
&, |, ^, ~

Shift:
<<, >>, >>>

Ternary:
condition ? trueValue : falseValue

instanceof:
Checks object type

Short-circuit:
&& and || may skip second condition

Precedence:
Defines operator evaluation order
```