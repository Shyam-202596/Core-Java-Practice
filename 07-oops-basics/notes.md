# Object-Oriented Programming (OOP) Notes

Object-Oriented Programming is a programming style that organizes software around objects.

An object contains:

- **State:** Data stored in fields
- **Behaviour:** Operations defined through methods

---

# 1. Class and Object

## Class

A class is a blueprint used to create objects.

It defines:

- Fields
- Methods
- Constructors
- Initialization blocks

## Object

An object is a runtime instance of a class.

```java
class Car {
    String color;

    void start() {
        System.out.println("Car started");
    }
}

Car car = new Car();
```

Here:

- `Car` is a class
- `car` is a reference variable
- `new Car()` creates an object

---

# 2. Four Pillars of OOP

The four main pillars of OOP are:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

# 3. Encapsulation

Encapsulation means keeping data and the methods operating on that data inside one class.

Internal data is protected using access modifiers.

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

## Benefits

- Protects data from invalid modification
- Provides controlled access
- Improves maintainability
- Hides internal implementation

> Encapsulation is not just private fields with getters and setters. A class must also validate and control its state.

---

# 4. Abstraction

Abstraction means exposing only essential behaviour and hiding unnecessary implementation details.

It can be achieved using:

- Abstract classes
- Interfaces

Example: A user can make a payment without knowing the internal payment-processing logic.

## Encapsulation vs Abstraction

- **Encapsulation:** Protects internal data and implementation
- **Abstraction:** Hides unnecessary details and exposes essential behaviour

---

# 5. Inheritance

Inheritance allows a child class to reuse and extend the features of a parent class.

```java
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Writing code");
    }
}
```

## Types Supported Through Classes

- Single inheritance
- Multilevel inheritance
- Hierarchical inheritance

Java does not support multiple inheritance through classes because it may create ambiguity.

Multiple inheritance of type is supported through interfaces.

## Important Points

- Constructors are not inherited
- Private members are not directly accessible in child classes
- A child constructor calls a parent constructor first
- Every class directly or indirectly extends `Object`

---

# 6. Is-A and Has-A Relationships

## Is-A Relationship

An is-a relationship represents inheritance.

```text
Developer is an Employee
```

## Has-A Relationship

A has-a relationship represents composition or aggregation.

```text
Car has an Engine
```

Use inheritance only when a true is-a relationship exists.

Prefer composition when one object only needs the services of another object.

---

# 7. Association, Aggregation, and Composition

## Association

Association is a general relationship between two independent objects.

```text
Teacher teaches Student
```

## Aggregation

Aggregation is a weak has-a relationship.

The contained object can exist independently.

```text
Department has Teachers
```

A teacher can exist without a department.

## Composition

Composition is a strong has-a relationship.

The contained object is strongly owned by the parent object.

```text
House has Rooms
```

The lifecycle of a room is controlled by the house.

---

# 8. Polymorphism

Polymorphism means one interface or reference can represent multiple forms.

There are two types:

1. Compile-time polymorphism
2. Runtime polymorphism

---

# 9. Method Overloading

Method overloading means defining multiple methods with the same name but different parameter lists.

```java
void print(int value) {
}

void print(String value) {
}

void print(int first, int second) {
}
```

It is resolved by the compiler, so it is called compile-time polymorphism.

## Overloading Rules

Methods must differ by:

- Number of parameters
- Type of parameters
- Order of parameter types

Changing only the return type does not overload a method.

```java
int calculate() {
    return 10;
}

// Compilation error
double calculate() {
    return 10.0;
}
```

Methods can be overloaded in the same class or between parent and child classes.

---

# 10. Method Overriding

Method overriding happens when a child class provides a new implementation of a parent-class method.

```java
class Employee {
    void work() {
        System.out.println("Employee working");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer writing code");
    }
}
```

## Overriding Rules

- Method name and parameters must be the same
- Return type must be the same or covariant
- Access level cannot be more restrictive
- Checked exceptions cannot be broader than the parent method
- `final` methods cannot be overridden
- `private` methods are not overridden
- Static methods are hidden, not overridden

Always use `@Override` for overridden methods.

---

# 11. Runtime Polymorphism

Runtime polymorphism happens when a parent reference holds a child object.

```java
Employee employee = new Developer();
employee.work();
```

The overridden instance method is selected based on the actual object at runtime.

## Important Rule

- Overridden instance methods depend on the actual object
- Fields and static methods depend on the reference type

---

# 12. Upcasting and Downcasting

## Upcasting

Upcasting means storing a child object in a parent reference.

```java
Employee employee = new Developer();
```

Upcasting is automatic and safe.

## Downcasting

Downcasting means converting a parent reference back into a child reference.

```java
Developer developer = (Developer) employee;
```

Downcasting is explicit and may throw `ClassCastException`.

Use pattern matching with `instanceof` when required:

```java
if (employee instanceof Developer developer) {
    developer.writeCode();
}
```

---

# 13. Abstract Class

An abstract class is declared using the `abstract` keyword.

It may contain:

- Abstract methods
- Concrete methods
- Constructors
- Instance variables
- Static methods
- Final methods

```java
abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.println("This is a shape");
    }
}
```

An abstract class cannot be instantiated directly.

Use an abstract class when related classes need:

- Common state
- Shared implementation
- A common parent type

---

# 14. Interface

An interface defines a contract that implementing classes must follow.

```java
interface PaymentMethod {
    void pay(double amount);
}
```

A class can implement multiple interfaces.

```java
class UpiPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid through UPI");
    }
}
```

## Interface Members

Interface variables are implicitly:

- `public`
- `static`
- `final`

Interface abstract methods are implicitly:

- `public`
- `abstract`

Interfaces can also contain:

- Default methods
- Static methods
- Private helper methods

---

# 15. Abstract Class vs Interface

Use an **abstract class** when:

- Classes are closely related
- Common state is required
- Shared implementation is required
- Constructors are required

Use an **interface** when:

- A common capability or contract is required
- Unrelated classes need the same behaviour
- Multiple inheritance of type is required
- Loose coupling is important

A class can extend only one class but can implement multiple interfaces.

---

# 16. Default Method Conflict

If two interfaces provide the same default method, the implementing class must override it.

```java
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class Demo implements A, B {
    @Override
    public void show() {
        A.super.show();
    }
}
```

---

# 17. Marker and Functional Interfaces

## Marker Interface

A marker interface does not declare any method.

It marks a class with special information.

Examples:

- `Serializable`
- `Cloneable`

## Functional Interface

A functional interface contains exactly one abstract method.

```java
@FunctionalInterface
interface Calculator {
    int calculate(int first, int second);
}
```

A functional interface can be used with lambda expressions.

It may also contain:

- Default methods
- Static methods
- Private methods

---

# 18. Constructor

A constructor initializes an object.

```java
class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }
}
```

## Important Points

- Constructor name must match the class name
- A constructor has no return type
- Constructors can be overloaded
- Constructors cannot be inherited
- Constructors cannot be overridden
- A constructor can be private
- The compiler provides a default constructor only when no constructor is declared

---

# 19. Constructor Chaining

Constructor chaining means calling one constructor from another constructor.

## `this()`

Calls another constructor of the same class.

## `super()`

Calls a constructor of the parent class.

```java
class Employee {
    Employee() {
        this("Unknown");
    }

    Employee(String name) {
        super();
    }
}
```

## Rules

- `this()` or `super()` must be the first statement
- Both cannot be used directly in the same constructor
- If neither is written, the compiler tries to insert `super()`

---

# 20. Object Initialization Order

When a child object is created, execution happens in this order:

1. Parent static fields and static blocks
2. Child static fields and static blocks
3. Parent instance fields and instance blocks
4. Parent constructor
5. Child instance fields and instance blocks
6. Child constructor

## Important Points

- Static initialization happens once when the class is initialized
- Instance initialization happens every time an object is created
- Static members execute in their declaration order
- Instance members execute in their declaration order

> Calling an overridable method from a constructor is risky because child fields may not be initialized yet.

---

# 21. `this` and `super`

## `this`

`this` refers to the current object.

Uses:

- Access current object fields
- Call current class methods
- Call another constructor using `this()`
- Pass the current object
- Return the current object

## `super`

`super` refers to the parent-class part of the current object.

Uses:

- Access parent fields
- Call parent methods
- Call the parent constructor using `super()`

---

# 22. Access Modifiers

Java provides four access levels:

- `private`: Accessible only inside the same class
- Default: Accessible inside the same package
- `protected`: Accessible in the same package and subclasses
- `public`: Accessible from everywhere

Use the most restrictive access modifier that satisfies the requirement.

---

# 23. Static Keyword

A static member belongs to the class rather than individual objects.

```java
class Employee {
    static int employeeCount;
}
```

## Important Points

- One copy is shared by all objects
- Static methods should be called using the class name
- Static methods cannot directly access instance members
- Static methods cannot use `this` or `super`
- Static methods are hidden, not overridden

---

# 24. Final Keyword

## Final Variable

A final variable can be assigned only once.

## Final Method

A final method cannot be overridden.

## Final Class

A final class cannot be inherited.

```java
final class 