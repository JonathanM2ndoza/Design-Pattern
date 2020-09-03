# Software Design Patterns
Example Software Design Pattern With Spring Boot

## Architectural patterns
An architectural pattern is a general, reusable solution to a commonly occurring problem in software architecture within a given context. Architectural patterns are similar to software design patterns but have a broader scope. The architectural patterns address various issues in software engineering, such as computer hardware performance limitations, high availability and minimization of a business risk. Some architectural patterns have been implemented within software frameworks. - Wikipedia

### Service Locator Pattern
The service locator design pattern is used when we want to locate various services using JNDI lookup. Considering high cost of looking up JNDI for a service, Service Locator pattern makes use of caching technique. For the first time a service is required, Service Locator looks up in JNDI and caches the service object. Further lookup or same service via Service Locator is done in its cache which improves the performance of application to great extent.

Example

![Screenshot](Prtsc/servicelocator_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm

## Behavioral Patterns
These design patterns are specifically concerned with communication between objects. - GoFPatterns

### Command Pattern
Command pattern is a data driven design pattern and falls under behavioral pattern category. A request is wrapped under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.

Example

![Screenshot](Prtsc/command_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/command_pattern.htm

### Template Pattern
In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. 

Example

![Screenshot](Prtsc/template_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/template_pattern.htm

## Creational Patterns
These design patterns provide ways to create objects while hiding the creation logic, instead of instantiating objects directly using the new operator. This gives the program more flexibility in deciding which objects need to be created for a given use case. - GoFPatterns

### Abstract Factory Pattern
Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

Example

![Screenshot](Prtsc/abstractfactory_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

### Builder Pattern
Builder pattern builds a complex object using simple objects and using a step by step approach. 

Example

![Screenshot](Prtsc/builder_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/builder_pattern.htm

### Simple Factory Pattern
Simple Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of ***the best ways to create an object.***

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

Example

![Screenshot](Prtsc/factory_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

### Singleton Pattern
Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

Example

![Screenshot](Prtsc/singleton_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm

## Structural Patterns
These design patterns deal with class and object composition. The concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionality. - GoFPatterns

### Decorator Pattern
Decorator pattern allows a user to add new functionality to an existing object without altering its structure.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

Example

![Screenshot](Prtsc/decorator_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm

### Facade Pattern
Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.

This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.

Example

![Screenshot](Prtsc/facade_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/facade_pattern.htm

### Proxy Pattern
In proxy pattern, a class represents functionality of another class. 

In proxy pattern, we create object having original object to interface its functionality to outer world.

Example

![Screenshot](Prtsc/proxy_pattern_uml_diagram.jpg)

Reference:
https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm






