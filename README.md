SOLID Principles

Single Responsibility Principle (SRP): 
--
[`Definition: A class should have only one reason to change.`]
--
`Example:` 
	A BankService class that handles both deposit, withdraw, and printPassbook violates SRP.
	To fix this, move the printPassbook logic to a new PrinterService class,
	so BankService is only responsible for financial transactions.

Open/Closed Principle (OCP): 
--
[`Definition: A software entity should be open for extension, but closed for modification.`]
--
`Example:` 
	A PaymentProcessor class initially handles only credit cards.
	To add PayPal, you don't modify the original class. Instead, you can create a new PayPalPayment class that extends a base 	Payment class, and the PaymentProcessor can be extended to use this new class.

Liskov Substitution Principle (LSP): 
--
[`Definition: Derived classes must be completely substitutable for their base classes.`]
--
`Example:` 
	If you have a Bird class with a fly() method, and you create a Penguin subclass,
	the Penguin class should not violate the principle by overriding fly() to do nothing or throw an error.
	If it cannot fly, it should not inherit from Bird or should be handled differently.
	A better approach might be to have a Bird base class and two subclasses: FlyingBird and NonFlyingBird

Interface Segregation Principle (ISP): 
--
[`Definition: Clients should not be forced to depend on interface members they do not use.`]
--
`Example:` 
	A large IWorker interface with methods like work(), eat(), and sleep() is problematic for a Robot class,
	which cannot eat or sleep. To adhere to ISP, break this into smaller interfaces,
	like IWorkable, IEatable, and ISleepable.
	Then, a Human class can implement IWorker (assuming it can do all), but a Robot can implement only IWorkable.

Dependency Inversion Principle (DIP): 
--
[`Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions.`]
--
`Example:`
	A Car class that directly depends on a concrete Engine class is not ideal.
	If the Engine implementation changes, the Car class needs modification.
	DIP suggests the Car class should depend on an IEngine interface. The concrete Engine class implements IEngine,
	and a dependency injection mechanism passes the specific Engine implementation to the Car class.
	This makes the Car class independent of the specific Engine implementation.
