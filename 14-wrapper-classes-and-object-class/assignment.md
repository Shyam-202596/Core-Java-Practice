# 14 - Wrapper Classes and Object Class Assignment

## Objective

This assignment focuses on `Object` class methods, `equals()`, `getClass()`, cloning, `Cloneable`, and the `equals()` and `hashCode()` contract.

Keep answers short and code clean.

---

# Theory and Interview Questions

## Q1. What is the `Object` class in Java?

Explain why every Java class gets methods like `equals()`, `toString()`, `hashCode()`, and `getClass()`.

---

## Q2. What is the default behavior of `Object.equals()`?

Explain with an example.

---

## Q3. Why does `Integer.equals()` compare values but a custom class `equals()` compares references by default?

---

## Q4. What is the difference between `==` and `equals()` for objects?

---

## Q5. What is the use of `getClass()` method?

---

## Q6. What is cloning in Java?

Explain in simple words.

---

## Q7. Why is `Cloneable` required for cloning?

What happens if a class does not implement `Cloneable` and `clone()` is called?

---

## Q8. What is the difference between shallow copy and deep copy?

Give one example where shallow copy can create a problem.

---

## Q9. What is the `equals()` and `hashCode()` contract?

Write the most important rule.

---

## Q10. Why should we override `hashCode()` when we override `equals()`?

---

## Q11. Can two unequal objects have the same hash code?

Explain briefly.

---

## Q12. How does `HashSet` use `hashCode()` and `equals()` to avoid duplicates?

---

## Q13. Why are mutable fields dangerous in `equals()` and `hashCode()`?

---

## Q14. Why is `Objects.equals()` safer than calling `.equals()` directly on a field?

---

## Q15. What are Java records?

Why are records useful for classes that mainly store data?

---

# Coding Questions

## Q16. Default equals() Behavior

Write a Java program where two `MyClass` objects have the same field value but `equals()` returns `false`.

Expected idea:

```java
MyClass obj1 = new MyClass(11);
MyClass obj2 = new MyClass(11);
```

Print whether both objects are equal or not.

---

## Q17. Wrapper Class equals() Behavior

Write a Java program where two `Integer` objects have the same value and `equals()` returns `true`.

Expected idea:

```java
Integer obj1 = Integer.valueOf(11);
Integer obj2 = Integer.valueOf(11);
```

Print whether both objects are equal or not.

---

## Q18. getClass() Demo

Write a Java program where an object is passed to a method.

The method should print the runtime class name of that object using `getClass()`.

Expected method:

```java
static void printName(Object obj)
```

---

## Q19. Cloning Demo

Write a Java program to clone an `Employee` object.

Requirements:

- Create `Employee` class.
- Fields: `id`, `name`.
- Implement `Cloneable`.
- Create a method `myClone()` that calls `super.clone()`.
- Clone one object into another object.
- Print both objects' data.

---

## Q20. Prove Cloned Object Has Different Reference

Extend the cloning program and print:

```java
System.out.println(e1 == e2);
```

Expected output:

```text
false
```

Explain why.

---

## Q21. Override equals() Only

Create an `Employee` class with `id` and `name`.

Override only `equals()`.

Add two equal `Employee` objects into a `HashSet`.

Print the size of the set.

Observe the issue.

---

## Q22. Override equals() and hashCode()

Update the previous program by overriding both `equals()` and `hashCode()`.

Add two equal `Employee` objects into a `HashSet`.

Expected output:

```text
1
```

---

## Q23. HashMap Key Demo

Create an `Employee` class with `id` and `name`.

Override `equals()` and `hashCode()`.

Use `Employee` as a key in `HashMap`.

Verify that two logically equal employee keys refer to the same stored value.

---

## Q24. Mutable Key Problem

Create an `Employee` object and use it as a key in `HashMap`.

Then update one field that is used in `hashCode()`.

Try to get the value again from the map.

Observe and explain the issue.

---

## Q25. Shallow Copy Problem

Create a class `Employee` with:

```text
int id
String name
Address address
```

Clone the `Employee` object using `super.clone()`.

Update the cloned object's address city.

Check whether original object's address also changes.

Explain why this happens.

---

## Q26. Deep Copy Fix

Modify the previous shallow copy program to perform deep copy for the `Address` object.

After cloning, changes in cloned object's address should not affect the original object.

---

## Q27. Null-Safe equals()

Create a class `Student` with:

```text
int id
String name
```

Override `equals()` using `Objects.equals()` for `name`.

Test comparison where one object's name is `null`.

---

## Q28. toString() Practice

Create an `Employee` class and override `toString()`.

Print the object directly.

Expected idea:

```java
System.out.println(employee);
```

Output should be readable.

---

## Q29. Complete Object Method Practice

Create a class `Product` with:

```text
int id
String name
double price
```

Override:

```text
equals()
hashCode()
toString()
```

Add duplicate products to `HashSet` and verify duplicates are removed.

---

## Q30. Interview Mini Task

Create a class `Book` with:

```text
String isbn
String title
String author
```

Two books should be considered equal if their `isbn` is same.

Override `equals()` and `hashCode()` based only on `isbn`.

Add books to a `HashSet` and verify uniqueness.

---

# Submission Checklist

Before submitting, verify:

- Code compiles successfully.
- `equals()` and `hashCode()` use the same fields.
- `Objects.equals()` is used for nullable fields.
- `HashSet` duplicate behavior is tested.
- `HashMap` key behavior is tested.
- Cloning example proves different references.
- Shallow copy and deep copy difference is clear.
- Code is short, readable, and interview-focused.