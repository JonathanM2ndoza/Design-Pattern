# Software Design Patterns
Example Software Design Pattern With Spring Boot

## Architectural patterns
An architectural pattern is a general, reusable solution to a commonly occurring problem in software architecture within a given context. Architectural patterns are similar to software design patterns but have a broader scope. The architectural patterns address various issues in software engineering, such as computer hardware performance limitations, high availability and minimization of a business risk. Some architectural patterns have been implemented within software frameworks. - Wikipedia

### Service Locator Pattern
The service locator design pattern is used when we want to locate various services using JNDI lookup. Considering high cost of looking up JNDI for a service, Service Locator pattern makes use of caching technique. For the first time a service is required, Service Locator looks up in JNDI and caches the service object. Further lookup or same service via Service Locator is done in its cache which improves the performance of application to great extent.

Example

![Screenshot](Prtsc/servicelocator_pattern_uml_diagram.jpg)

Reference
https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm

## Behavioral Patterns
These design patterns are specifically concerned with communication between objects.

### Command Pattern
Command pattern is a data driven design pattern and falls under behavioral pattern category. A request is wrapped under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.

Example

![Screenshot](Prtsc/command_pattern_uml_diagram.jpg)

Reference
https://www.tutorialspoint.com/design_pattern/command_pattern.htm



