# 14 - Wrapper Classes and Object Class Notes

## 1. Object Class

`Object` is the root class of all Java classes.

Every class in Java directly or indirectly extends the `Object` class.

Example:

```java
class MyClass {
}
```

Internally, it behaves like:

```java
class MyClass extends Object {
}
```

Because of this, every Java object gets common methods from the `Object` class.

---

## 2. Important Methods of Object Class

Common methods of `Object` class:

```text
equals()
toString()
hashCode()
getClass()
clone()
```

---

## 3. equals() Method

The `equals()` method is used to compare two objects.

Default implementation of `equals()` in `Object` class compares object references.

It checks whether two references point to the same object.

Example:

```java
class MyClass {
    int x;

    MyClass(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(11);
        MyClass obj2 = new MyClass(11);

        System.out.println(obj1.equals(obj2));
    }
}
```

Output:

```text
false
```

Reason:

`obj1` and `obj2` have the same value, but they are two different objects.

---

## 4. equals() in Wrapper Classes

Wrapper classes like `Integer`, `Double`, and `Boolean` override the `equals()` method.

So, wrapper class `equals()` compares content, not references.

Example:

```java
Integer obj1 = Integer.valueOf(11);
Integer obj2 = Integer.valueOf(11);

System.out.println(obj1.equals(obj2));
```

Output:

```text
true
```

Reason:

`Integer.equals()` compares values.

---

## 5. Important Difference

```java
MyClass obj1 = new MyClass(11);
MyClass obj2 = new MyClass(11);

Integer num1 = Integer.valueOf(11);
Integer num2 = Integer.valueOf(11);
```

Comparison:

```java
obj1.equals(obj2); // false
num1.equals(num2); // true
```

Reason:

```text
MyClass does not override equals(), so reference comparison happens.

Integer overrides equals(), so value comparison happens.
```

---

## 6. When Should We Override equals()?

If we want to compare objects based on their data, we should override `equals()`.

Example:

```java
class MyClass {
    int x;

    MyClass(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        MyClass other = (MyClass) obj;

        return this.x == other.x;
    }
}
```

Now:

```java
MyClass obj1 = new MyClass(11);
MyClass obj2 = new MyClass(11);

System.out.println(obj1.equals(obj2));
```

Output:

```text
true
```

---

## 7. getClass() Method

The `getClass()` method returns the runtime class of an object.

Example:

```java
class MyClass {
    int x;

    MyClass(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(11);

        Class<?> clazz = obj.getClass();

        System.out.println(clazz.getName());
    }
}
```

Output:

```text
MyClass
```

---

## 8. Cloning in Java

Cloning means creating a copy of an existing object.

Java provides the `clone()` method in the `Object` class.

But to clone an object, the class must implement the `Cloneable` interface.

---

## 9. Cloneable Interface

`Cloneable` is a marker interface.

A marker interface does not have methods.

It tells JVM that objects of this class are allowed to be cloned.

Example:

```java
class Employee implements Cloneable {
}
```

---

## 10. clone() Method

The `clone()` method creates a copy of the current object.

Since `clone()` is protected in `Object` class, it is commonly called inside a public method.

Example:

```java
class Employee implements Cloneable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object myClone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```

---

## 11. Cloning Example

```java
class Employee implements Cloneable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void getData() {
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
    }

    public Object myClone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(11, "Shyam");

        Employee e2 = (Employee) e1.myClone();

        e1.getData();
        e2.getData();
    }
}
```

Output:

```text
Id = 11
Name = Shyam
Id = 11
Name = Shyam
```

---

## 12. Important Point About Cloning

After cloning:

```java
Employee e2 = (Employee) e1.myClone();
```

`e1` and `e2` are different objects.

```java
System.out.println(e1 == e2);
```

Output:

```text
false
```

But their data is copied.

---

## 13. Shallow Copy

Default `clone()` creates a shallow copy.

In shallow copy:

- Primitive fields are copied.
- Reference fields still point to the same referenced object.

Example:

```text
int id is copied
String name reference is copied
```

For immutable objects like `String`, this is usually safe.

But for mutable objects like arrays, lists, or custom objects, shallow copy can cause issues.

---

## 14. Deep Copy

Deep copy means copying the object and also copying its referenced objects.

Use deep copy when object contains mutable fields.

Example mutable fields:

```text
int[]
ArrayList
Address object
Department object
```

---

## 15. clone() vs Constructor Copy

Cloning:

```java
Employee e2 = (Employee) e1.myClone();
```

Copy constructor:

```java
Employee e2 = new Employee(e1.id, e1.name);
```

In real-world Java code, copy constructors or factory methods are often preferred because they are easier to understand and safer.

---

## 16. Common Mistakes

### Mistake 1: Forgetting Cloneable

```java
class Employee {
}
```

Calling `clone()` without implementing `Cloneable` may throw:

```text
CloneNotSupportedException
```

---

### Mistake 2: Thinking clone() means same reference

Cloning creates a new object.

```java
e1 == e2
```

Output:

```text
false
```

---

### Mistake 3: Confusing equals() and ==

```java
== checks reference
equals() usually checks logical equality if overridden
```

---

## 17. SDE-2 Notes

- Understand default `Object.equals()` compares references.
- Override `equals()` when logical equality is needed.
- When overriding `equals()`, also override `hashCode()`.
- `getClass()` returns runtime class information.
- `clone()` creates object copy but default cloning is shallow.
- Prefer copy constructor over `clone()` in production code when possible.
- Be careful while cloning objects with mutable fields.

---

## Quick Revision

```text
Object:
Root class of all Java classes.

equals():
Default behavior compares references.

Wrapper equals():
Compares values because wrapper classes override equals().

getClass():
Returns runtime class of an object.

clone():
Creates a copy of an object.

Cloneable:
Marker interface required for cloning.

Shallow Copy:
Copies primitive fields and references.

Deep Copy:
Copies object and referenced objects.

==:
Compares references for objects.

equals():
Can compare logical equality if overridden.
```