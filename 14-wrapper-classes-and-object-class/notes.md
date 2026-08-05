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

---

# equals() and hashCode() Contract

## 1. Why equals() and hashCode() Matter

`equals()` is used to check logical equality between objects.

`hashCode()` returns an integer hash value used by hash-based collections.

Common hash-based collections:

```text
HashMap
HashSet
Hashtable
LinkedHashMap
LinkedHashSet
```

If a class overrides `equals()`, it should also override `hashCode()`.

---

## 2. Default Behavior from Object Class

If a class does not override `equals()` and `hashCode()`, then default behavior comes from `Object`.

Default `equals()` compares references.

```java
obj1.equals(obj2)
```

Default behavior is similar to:

```java
obj1 == obj2
```

Default `hashCode()` usually returns a value related to object identity.

---

## 3. equals() Contract

The `equals()` method should follow these rules.

### 1. Reflexive

An object must be equal to itself.

```java
x.equals(x) == true
```

### 2. Symmetric

If `x.equals(y)` is true, then `y.equals(x)` must also be true.

```java
x.equals(y) == y.equals(x)
```

### 3. Transitive

If `x.equals(y)` is true and `y.equals(z)` is true, then `x.equals(z)` must be true.

```java
if x == y and y == z, then x == z
```

### 4. Consistent

Multiple calls to `equals()` should return the same result if object data has not changed.

```java
x.equals(y)
```

should not randomly change from `true` to `false`.

### 5. Null Check

Any object compared with `null` should return `false`.

```java
x.equals(null) == false
```

---

## 4. hashCode() Contract

The `hashCode()` method should follow these rules.

### Rule 1

If two objects are equal using `equals()`, then both objects must have the same hash code.

```java
if a.equals(b) == true
then a.hashCode() == b.hashCode()
```

### Rule 2

If two objects have the same hash code, they may or may not be equal.

```text
Same hashCode does not always mean objects are equal.
```

This situation is called hash collision.

### Rule 3

If object data does not change, `hashCode()` should return the same value again and again.

---

## 5. Most Important Rule

If two objects are equal, their hash codes must be equal.

```text
Equal objects must have equal hash codes.
```

But reverse is not always true.

```text
Equal hash codes do not guarantee equal objects.
```

---

## 6. Problem Without hashCode()

If we override only `equals()` and not `hashCode()`, hash-based collections may behave incorrectly.

Example:

```java
import java.util.HashSet;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee other = (Employee) obj;

        return this.id == other.id && this.name.equals(other.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Shyam");
        Employee e2 = new Employee(1, "Shyam");

        HashSet<Employee> set = new HashSet<>();

        set.add(e1);
        set.add(e2);

        System.out.println(set.size());
    }
}
```

Expected:

```text
1
```

But actual output can be:

```text
2
```

Reason:

`equals()` says both objects are equal, but `hashCode()` is not overridden.

So `HashSet` may treat them as different objects.

---

## 7. Correct equals() and hashCode()

```java
import java.util.Objects;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee other = (Employee) obj;

        return this.id == other.id && Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
```

Now this works correctly:

```java
Employee e1 = new Employee(1, "Shyam");
Employee e2 = new Employee(1, "Shyam");

System.out.println(e1.equals(e2));
System.out.println(e1.hashCode() == e2.hashCode());
```

Output:

```text
true
true
```

---

## 8. Why Objects.equals() is Used

Use:

```java
Objects.equals(this.name, other.name)
```

Instead of:

```java
this.name.equals(other.name)
```

Because `Objects.equals()` handles `null` safely.

Example:

```java
Objects.equals(null, null);      // true
Objects.equals(null, "Java");    // false
```

---

## 9. HashMap and HashSet Usage

`HashMap` and `HashSet` use hash code to find the bucket.

Then they use `equals()` to compare objects inside that bucket.

Simple flow:

```text
Step 1: Calculate hashCode()
Step 2: Find bucket
Step 3: Use equals() to check actual equality
```

---

## 10. Common Mistakes

### Mistake 1: Overriding equals() but not hashCode()

Wrong:

```java
@Override
public boolean equals(Object obj) {
    // custom logic
}
```

Correct:

```java
@Override
public boolean equals(Object obj) {
    // custom logic
}

@Override
public int hashCode() {
    return Objects.hash(fields);
}
```

---

### Mistake 2: Using Mutable Fields in hashCode()

Avoid using fields in `hashCode()` if those fields can change after inserting object into `HashSet` or `HashMap`.

Example problem:

```java
HashSet<Employee> set = new HashSet<>();
set.add(employee);

employee.name = "Updated";
```

If `name` is part of `hashCode()`, then finding the object again may fail.

---

### Mistake 3: Comparing Strings with ==

Wrong:

```java
this.name == other.name
```

Correct:

```java
Objects.equals(this.name, other.name)
```

---

## 11. SDE-2 Notes

- Always override `hashCode()` when overriding `equals()`.
- Use the same fields in both `equals()` and `hashCode()`.
- Prefer immutable fields for equality.
- Be careful when using mutable objects as keys in `HashMap`.
- `HashSet` internally uses hashing and equality to avoid duplicates.
- `HashMap` uses `hashCode()` first and `equals()` later.
- Use IDE-generated `equals()` and `hashCode()` for production code.
- Java records automatically generate `equals()`, `hashCode()`, and `toString()`.

---

## Quick Revision

```text
equals():
Checks logical equality.

hashCode():
Returns integer hash value.

Contract:
If two objects are equal, their hash codes must be equal.

Hash collision:
Two different objects can have same hash code.

HashMap:
Uses hashCode() to find bucket and equals() to compare keys.

HashSet:
Uses hashCode() and equals() to avoid duplicates.

Best practice:
Override equals() and hashCode() together.
```