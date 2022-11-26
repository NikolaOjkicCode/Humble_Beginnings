# Classes
## Important notes and pieces of code,from this chapter of the book!

___

Diference between classes and objects. Here are the most
important ideas:

- Defining a class creates a new object type with the same name.
- Every object belongs to some object type; that is, it is an instance of some class.
- A class definition is like a template for objects: it specifies what at-
  tributes the objects have and what methods can operate on them.
- The new operator instantiates objects, that is, it creates new instances of a class.
- Think of a class like a blueprint for a house: you can use the same blueprint to build any number of houses.
- The methods that operate on an object type are defined in the class for that object.
___
### *The Time class*

One common reason to define a new class is to encapsulate related data in
an object that can be treated as a single unit. That way, we can use objects
as parameters and return values, rather than passing and returning multiple
values. This design principle is called data encapsulation.

We have already seen two types that encapsulate data in this way: Point and
Rectangle. Another example, which we will implement ourselves, is Time,
which represents a time of day. The data encapsulated in a Time object are an
hour, a minute, and a number of seconds. Because every Time object contains
these data, we define attributes to hold them.

Attributes are also called instance variables, because each instance has its
own variables.

The first step is to decide what type each variable should be. It seems clear
that hour and minute should be integers. Just to keep things interesting, let's
make second a double.

Instance variables are declared at the beginning of the class definition, outside
of any method. By itself, this code fragment is a legal class definition:

```java
    public class Time {
      private int hour;
      private int minute;
      private double second;
    }
```

The Time class is public, which means that it can be used in other classes.
But the instance variables are private, which means they can only be accessed
from inside the Time class. If you try to read or write them from another class,
you will get a compiler error.

Private instance variables help keep classes isolated from each other so that
changes in one class won't require changes in other classes. It also simplifies
what other programmers need to understand in order to use your classes. This
kind of isolation is called information hiding.

___
### *The Time class*

