# Object-Oriented Programming (OOP) Assignment

This assignment contains selected OOP practice problems and important interview questions.

The focus should be on:

- Correct implementation
- Proper use of OOP principles
- Clean and readable code
- Meaningful naming
- Validations and edge cases
- Flexible and extensible design

---

# Practice Questions

## 1. Bank Account System

Create a `BankAccount` class with:

- Account number, account holder name, and balance
- `deposit()` and `withdraw()` methods
- Balance should not be directly modifiable
- Invalid deposits should be handled
- Insufficient balance should be handled

**Focus:** Encapsulation, validation, and access modifiers

---

## 2. Employee Salary System

Create a base class named `Employee` and the following subclasses:

- `FullTimeEmployee`
- `PartTimeEmployee`
- `ContractEmployee`

Each employee type should calculate salary differently.

Store different employee objects using parent-class references and display their calculated salaries.

**Focus:** Inheritance, method overriding, and runtime polymorphism

---

## 3. Shape Area Calculator

Create an abstract class named `Shape` with the following methods:

- `calculateArea()`
- `calculatePerimeter()`

Create the following subclasses:

- `Circle`
- `Rectangle`
- `Triangle`

Store all shape objects in a `List<Shape>` and display the area and perimeter of each shape.

**Focus:** Abstraction, polymorphism, and common contract

---

## 4. Notification System

Create the following notification types:

- Email notification
- SMS notification
- Push notification

Create a common notification contract.

Client code should not depend directly on concrete notification classes. The design should allow new notification types to be added easily.

**Focus:** Interfaces, loose coupling, and dependency inversion

---

## 5. Library Management System

Create appropriate classes such as:

- `Book`
- `Member`
- `Library`

### Requirements

- Issue a book
- Return a book
- Track book availability
- An issued book should not be issued again
- A member should have a maximum issued-book limit
- Display books issued to a member

**Focus:** Object relationships, encapsulation, and responsibility distribution

---

## 6. Shopping Cart System

Create a shopping cart system that supports:

- Adding a product
- Removing a product
- Updating product quantity
- Calculating the cart total
- Applying a percentage discount
- Applying a fixed-value discount

The design should allow new discount types to be added without modifying the existing cart-calculation logic.

**Focus:** Composition, interfaces, and Open/Closed Principle

---

## 7. Payment Processing System

Create a payment-processing system that supports:

- Credit card payment
- UPI payment
- Wallet payment

Create a common `PaymentMethod` contract.

Keep payment validation and payment processing logically separate.

**Focus:** Interface-based design, polymorphism, and separation of responsibilities

---

## 8. Immutable Class

Create an immutable `Employee` or `Student` class containing:

- Primitive or `String` fields
- A mutable field such as `Address`
- A collection field such as `List<String>`

The internal state of the object should not change after object creation.

Use defensive copying wherever required.

**Focus:** Immutability, `final` keyword, defensive copying, and encapsulation

---

## 9. Constructor and Initialization Challenge

Create parent and child classes containing:

- Static initialization blocks
- Instance initialization blocks
- Parent constructor
- Child constructor
- Overridden methods

Call an overridden method from the parent constructor.

First predict the output, then execute the program and explain the complete initialization order.

**Focus:** Object initialization order and constructor behaviour

---

## 10. Equality Contract

Create an `Employee` class where two employee objects are logically equal when their employee IDs are equal.

Test the following scenarios:

- Override `equals()` without overriding `hashCode()`
- Add employee objects to a `HashSet`
- Use employee objects as keys in a `HashMap`
- Override both `equals()` and `hashCode()`
- Modify a field used in equality after inserting the object into a hash-based collection

Explain the observed results.

**Focus:** `equals()` and `hashCode()` contract

---

## 11. Composition vs Inheritance

Create `Car` and `Engine` classes.

Support different engine types, such as:

- Petrol engine
- Diesel engine
- Electric engine

Implement and explain why `Car has an Engine` is better than `Car extends Engine`.

**Focus:** Composition over inheritance

---

## 12. Mini Parking Lot System

Design a basic parking lot system.

Support the following vehicle types:

- Bike
- Car
- Truck

### Requirements

- Support different parking-spot types
- Park a vehicle
- Unpark a vehicle
- Assign a suitable available parking spot
- Track occupied and available spots
- Prevent the same vehicle from being parked twice
- Calculate the parking fee
- Handle the case when no suitable spot is available

**Focus:** Complete OOP modelling, extensibility, and clean responsibility distribution

---

# Important OOP Interview Questions

## Core Concepts

1. What is the difference between a class and an object?

2. What are the four pillars of Object-Oriented Programming? Explain them with practical examples.

3. What is the exact difference between encapsulation and abstraction?

4. When should inheritance be used, and when should composition be used?

5. What is the difference between association, aggregation, and composition?

6. What is the difference between compile-time polymorphism and runtime polymorphism?

7. Why is method overloading considered compile-time polymorphism?

8. How is method overriding resolved at runtime in Java?

---

## Inheritance and Polymorphism

9. Can static, private, and final methods be overridden?

10. What is the difference between method hiding and method overriding?

11. What are the return-type and access-modifier rules for method overriding?

12. When a parent-class reference holds a child-class object, how are accessible members decided?

13. What are upcasting and downcasting? When does `ClassCastException` occur?

14. Why are constructors neither inherited nor overridden?

15. Why does Java not support multiple inheritance through classes?

16. How are conflicts between interface default methods resolved?

---

## Abstract Class and Interface

17. What is the practical difference between an abstract class and an interface?

18. When should an interface be used, and when should an abstract class be used?

19. Can an abstract class have a constructor? If yes, why?

20. Can an abstract class contain concrete, static, and final methods?

21. What is a marker interface?

22. How is a functional interface different from a normal interface?

---

## Object Class and Equality

23. What is the difference between `==` and `equals()`?

24. Why must `hashCode()` be overridden when `equals()` is overridden?

25. What are the rules of the `equals()` contract?

26. What is the purpose of `toString()`, `getClass()`, `clone()`, and `finalize()`?

27. What problems can occur when a mutable object is used as a `HashMap` key?

28. What is the difference between shallow copy and deep copy?

---

## Constructors and Object Creation

29. What is constructor chaining?

30. What is the difference between `this()` and `super()`?

31. Why is calling an overridden method from a constructor risky?

32. What is the execution order of static blocks, instance initialization blocks, and constructors?

33. What are the uses of a private constructor?

---

## Design-Oriented Questions

34. How do you design an immutable class?

35. What is the difference between loose coupling and tight coupling?

36. What does "Program to an interface, not an implementation" mean?

37. How are SOLID principles related to Object-Oriented Programming?

38. What is a God class, and how can it be avoided?

39. How can misuse of inheritance be identified?

40. Explain abstraction using a real-project example.

---

# Recommended Practice Order

1. Bank Account System
2. Employee Salary System
3. Shape Area Calculator
4. Notification System
5. Immutable Class
6. Equality Contract
7. Constructor and Initialization Challenge
8. Composition vs Inheritance
9. Library Management System
10. Shopping Cart System
11. Payment Processing System
12. Mini Parking Lot System

---

# Solution Review Checklist

Every submitted solution will be reviewed based on:

- Correctness
- Validations and edge cases
- Proper use of OOP principles
- Class and object design
- Code readability
- Naming conventions
- Unnecessary complexity
- Extensibility
- Time and space complexity, wherever applicable
- Possible interview follow-up questions