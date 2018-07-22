# Bridge pattern

The bridge pattern (similar as the pimpl idiom in the C++ world) is a design pattern used in software engineering that is meant to "decouple an abstraction from its implementation so that the two can vary 
independently". The bridge uses encapsulation, aggregation, and can use inheritance to separate responsibilities into different classes. The Bridge pattern is a composite of the Template and Strategy patterns.

Use the Bridge pattern when:
- You want run-time binding of the implementation
- You have a proliferation of classes resulting from a coupled interface and numerous implementations
- You want to share an implementation among multiple objects

It is a common view some aspects of the Adapter pattern in the Bridge pattern. Adapter makes things work after they're designed. Bridge makes them work before they are. Bridge is designed up-front to let 
the abstraction and the implementation vary independently. Adapter is retrofitted to make unrelated classes work together. 


### Example 

The Bridge pattern is an application of the old advice, "prefer composition over inheritance". It becomes handy when you must subclass different times in ways that are orthogonal with one another. 

When, you have a structure like this:

```
                   ----Shape---
                  /            \
         Rectangle              Circle
        /         \            /      \
BlueRectangle  RedRectangle BlueCircle RedCircle

```

With the bridge pattern after some refactoring, you will have a structure like this:

```
          ----Shape---                        Color
         /            \                       /   \
Rectangle(Color)   Circle(Color)           Blue   Red

```

### Sources 

- [Wikipedia definition](https://en.wikipedia.org/wiki/Bridge_pattern)
- [Stackoverflow explanation](https://stackoverflow.com/questions/319728/when-do-you-use-the-bridge-pattern-how-is-it-different-from-adapter-pattern)
