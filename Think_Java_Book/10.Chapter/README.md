# Objects
## Important notes and pieces of code,from this chapter of the book!

___
### *Point objects*

The java.awt package provides a class named Point intended to represent
the coordinates of a location in a Cartesian plane. In mathematical notation,
points are often written in parentheses with a comma separating the coordi-
nates. For example, (0; 0) indicates the origin, and (x; y) indicates the point
x units to the right and y units up from the origin.

In order to use the Point class, you have to import it:

```java
  import java.awt.Point;
```

Then, to create a new point, you have to use the new operator:

```java
    Point blank;
    blank = new Point(3, 4);
```

The frst line declares that blank has type Point. The second line creates the
new Point with the given arguments as coordinates.

The result of the new operator is a reference to the new object. So blank
contains a reference to the new Point object.

___
### *Attributes*

Variables that belong to an object are usually called attributes, but you
might also see them called felds". To access an attribute of an object, Java
uses dot notation. For example:

```java
  int x = blank.x;
```

The expression blank.x means go to the object blank refers to, and get the
value of the attribute x." In this case, we assign that value to a local variable
named x. There is no con
ict between the local variable named x and the
attribute named x. The purpose of dot notation is to identify which variable
you are referring to unambiguously.

You can use dot notation as part of an expression. For example:

```java
    System.out.println(blank.x + ", " + blank.y);
    int sum = blank.x * blank.x + blank.y * blank.y;
```

    The first line displays 3, 4; the second line calculates the value 25.
    
___
### *Objects as parameters*

You can pass objects as parameters in the usual way. For example:

```java
  public static void printPoint(Point p) {
    System.out.println("(" + p.x + ", " + p.y + ")");
  }
```

This method takes a point as an argument and displays its attributes in paren-
theses. If you invoke printPoint(blank), it displays (3, 4).

But we don't really need a method like printPoint, because if you invoke
System.out.println(blank) you get:

    java.awt.Point[x=3,y=4]
    
Point objects provide a method called toString that returns a string repre-
sentation of a point. When you call println with objects, it automatically
calls toString and displays the result. In this case, it shows the name of the
type (java.awt.Point) and the names and values of the attributes.

___
### *Objects as return types*

The java.awt package also provides a class called Rectangle. To use it, you
have to import it:

```java
import java.awt.Rectangle;
```

Rectangle objects are similar to points, but they have four attributes: x, y,
width, and height. The following example creates a Rectangle object and
makes the variable box refer to it:

```java
Rectangle box = new Rectangle(0, 0, 100, 200);
```

If you run System.out.println(box), you get:

    java.awt.Rectangle[x=0,y=0,width=100,height=200]

You can write methods that return objects. For example, findCenter takes
a Rectangle as an argument and returns a Point with the coordinates of the
center of the rectangle:

```java
    public static Point findCenter(Rectangle box) {
      int x = box.x + box.width / 2;
      int y = box.y + box.height / 2;
    return new Point(x, y);
}
```

The return type of this method is Point. The last line creates a new Point
object and returns a reference to it.


___
### *Mutable objects*

You can change the contents of an object by making an assignment to one of
its attributes. For example, to move" a rectangle without changing its size,
you can modify the x and y values:

```java
Rectangle box = new Rectangle(0, 0, 100, 200);
box.x = box.x + 50;
box.y = box.y + 100;
```

We can encapsulate this code in a method and generalize it to move the rect-
angle by any amount:

```java
public static void moveRect(Rectangle box, int dx, int dy) {
  box.x = box.x + dx;
  box.y = box.y + dy;
}
```
The variables dx and dy indicate how far to move the rectangle in each direc-
tion. Invoking this method has the efect of modifying the Rectangle that is
passed as an argument.

```java
Rectangle box = new Rectangle(0, 0, 100, 200);
moveRect(box, 50, 100);
System.out.println(box);
```

Modifying objects by passing them as arguments to methods can be useful.
But it can also make debugging more difcult, because it is not always clear
which method invocations modify their arguments.

Java provides a number of methods that operate on Points and Rectangles.
For example, translate has the same efect as moveRect, but instead of pass-
ing the rectangle as an argument, you use dot notation:

```java
box.translate(50, 100);
```

This line invokes the translate method for the object that box refers to. As
a result, the box object is updated directly.

This example is a good illustration of object-oriented programming. Rather
than write methods like moveRect that modify one or more parameters, we
apply methods to objects themselves using dot notation.

___
### *Aliasing*

Remember that when you assign an object to a variable, you are assigning a
reference to an object. It is possible to have multiple variables that refer to
the same object. The state diagram in Figure 10.4 shows the result.

```java
Rectangle box1 = new Rectangle(0, 0, 100, 200);
Rectangle box2 = box1;
```

Notice how box1 and box2 are aliases for the same object, so any changes
that afect one variable also afect the other. This example adds 50 to all four
sides of the rectangle, so it moves the corner up and to the left by 50, and it
increases the height and width by 100:

```java
  System.out.println(box2.width);
  box1.grow(50, 50);
  System.out.println(box2.width);
```

The frst line displays 100, which is the width of the Rectangle referred to by
box2. The second line invokes the grow method on box1, which stretches the
Rectangle horizontally and vertically.

When we make a change using box1, we see the change using box2. Thus, the
value displayed by the third line is 200, the width of the expanded rectangle.

___
### *The null keyword*

When you create an object variable, remember that you are storing a reference
to an object. In Java, the keyword null is a special value that means no
object". You can declare and initialize object variables this way:

```java
Point blank = null;
```

If you try to use a null value, either by accessing an attribute or invoking a
method, Java throws a NullPointerException.

```java
Point blank = null;
int x = blank.x; // NullPointerException
blank.translate(50, 50); // NullPointerException
```

On the other hand, it is legal to pass a null reference as an argument or receive
one as a return value. For example, null is often used to represent a special
condition or indicate an error.

___
### *Garbage collection*

What happens when no variables refer to an object?

```java
Point blank = new Point(3, 4);
blank = null;
```

The frst line creates a new Point object and makes blank refer to it. The
second line changes blank so that instead of referring to the object, it refers
to nothing.

If there are no references to an object, there is no way to access its attributes
or invoke a method on it. From the programmer's view, it ceases to exist.
However it's still present in the computer's memory, taking up space.

As your program runs, the system automatically looks for stranded objects
and reclaims them; then the space can be reused for new objects. This process
is called garbage collection.

You don't have to do anything to make garbage collection happen, and in
general don't have to be aware of it. But in high-performance applications,
you may notice a slight delay every now and then when Java reclaims space
from discarded objects.
