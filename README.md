# NeumontMC_API
The NeumontMC_API compaion .jar is for easily interfacing with our API at api.neumontmc.com in Java SE 11 applications. <br>
If you would like to use our API, but would prefer to refrain from using our compainion jar, please referance our API documentation at: https://documenter.getpostman.com/view/3095128/TWDdiZ6m#18d61da2-62da-4008-8881-5121510cd084<br><br>

## Installing the .jar<br>
For MAVEN: <br>
Add the dependancy to you pom.xml<br>
```xml
<dependency>
  <groupId>com.numc</groupId>
  <artifactId>api</artifactId>
  <version>1.0.0</version>
</dependency>
```
Install it using: 
`mvn install`
<br>
<br>
If you would like to install it manually, you can get the latest .jar from: https://github.com/Abstract-Programming/NeumontMC_API/releases/tag/v1.0%2C0 <br>

# Using the companion
Firstly, you will need to create a `NAPI` object: 
```java
NAPI napi = new NAPI();
```
One you have created the NAPI Obj, you can start to utilize the three main functions of the vZwei (version two) API. 
> (At this time for more detailed usage, please refer to the JavaDocs for the Jar)
### getUserArrayList()
API call: `GET http://api.neumontmc.com/vZwei/users` <br>
Code example: 
```java
ArrayList<User> users = napi.getUserArrayList();
```

### getUserArrayListWithMcmmoStats()
API call: `GET http://api.neumontmc.com/vZwei/mcmmo-stats` <br>
Code example:
```java
ArrayList<User_mcmmo> users = napi.getUserArrayListWithMcmmoStats();
```

### getORMUserStats()
If you use this method, please refer to the code and JavaDocs, failure to do so will result in some very confusing errors.
API call: `GET http://api.neumontmc.com/vZwei/user-stats` <br>
Code example:
```java
NAPI napi = new NAPI();
ArrayList<Ustats> users;
try {
    users = napi.getORMUserStats();
    int i = 0;
    for (Ustats u : users) {
        System.out.println("User UUID #" + i + ": " + u.getUUID());
        i++;
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

<br><br>
This is just a very bare bones doc. This was coded start to finish in a 8 hour stint (ending commit 0d7693c904c87d3fb5ab9cf4bd60e5c535911837). Expect this doc to be updated in greater detail in the future.
