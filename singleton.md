# Singleton Pattern  
It is a **creational** design pattern** that lets you ensure a class has only one instance,  
while providing a global access point to this instance.

### Use cases for singleton design pattern:  
*   Logging
*   Access Shared Resources(_Database connection class object_)
*   When need stricter control over global variables.


### Eager Initialization singleton:  
When we create a singleton object even when we don't need it. Code Example below.

```Java
public class EagerSingleton {
	
	private static volatile EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance; 
	}

}
```

### Lazy Initialization singleton:  
Creating a singleton object only when we require it. Code Example below.

```Java
public final class LazySingleton {
	
	private static volatile LazySingleton instance = null;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		if(instance==null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}

```

### Lazy Initialization singleton with thread safe:  
Adding thread safety to lazy initialization method. Code Example below.

```Java

public final class LazySingleton {
	
	private static volatile LazySingleton instance = null;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		if(instance==null) {
			synchronized(LazySingleton.class) {
				instance = new LazySingleton();
			}
			
		}
		return instance;
	}
	

}

```
  
#### Pros:
* You can be sure that a class has only single instance.  
* You gain global access point to that instance.  
* The singleton object is initialized when it's requested for the first time.

#### Cons:  
* The singleton pattern can mask bad design, for instance, when the components of the program know too much  
about each other.  
* The pattern requires special treatment in a multithreaded environment.
