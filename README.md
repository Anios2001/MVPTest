# MvpTest
This repository demonstarates use of Model View Presenter Architecture Pattern in Android Design Language using Java as programming language. This is one of the oldest know design method in android 
app development and has its root in general Java Application Design applied to Android Contructs. 
## Problem Statement 
In Android, everything that occurs happens in an Activity. Activity is where the controller from the operating system reaches the user Application. The system decides which file in an array of files must 
run in some context as specified in AndroidManifest.xml. 
Ya! an XML, you might have seen the use of XML to define dependencies for JAVA SPRING APPLICATIONS, it turns out Android does the same. 
Every permission your app needs to access comes here, backgrond task info defined here, statically binding an Activity to a XML view file happens here.
But for a well defined and architected system which is Scalable, Adaptable and Extensible a coherent architecture is paramount. 
<b> That's where architectural design patterns and its type factors in. </b>
The most well mantained and intitutive pattern is MVP. 
It stands for ```Model View Presenter```
1. MODEL = ``` The data model for accessing the data part of the application and abstracting the relationships between the Objects used to design the system. Let's one build and extend the sources of data exxtraction and mantain a state through presenter actions.```
2. VIEW = ``` The view part of MVC only provides an interface to change the view through controller and is completely decoupled from the model ```
3. Presenter = ```Notifies Model of the changes in the view structure and handles data conversion, data formatting techniques i.e. Streaming data, Non Streaming data. It also defines the view of the application using view interface.```
