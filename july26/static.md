# Static

- `static` members belong to the class instead of a - specific instace.
Static block executes before antthing else in the program, even before main.
- It means that only one instance of a static field exists even if you create a million instances of the class or you don't create any !. It will be shared by all instances.
- Since `static` methods also do not belong to a specific instance, they can't refer to instance members (how would you know which instance Hello class you want to refer to?). `static` members can only refer to `static` members. Instance members can, of course access `static` members.
- *Side Note* : Of course, `static` members can access instance members through an object reference.
```
public class Example {
    private static boolean staticField;
    private boolean instanceField;
    public static void main(String[] args) {
        // a static method can access static fields
        staticField = true;

        // a static method can access instance fields through an object reference
        Example instance = new Example();
        instance.instanceField = true;
    }
```
 












# String Tokenizer
- It is similar to spilt function.
- In this one by one a token comes and it is processed.
- It is a part of `java.util` class.
```
class StringTokenizerMain
{
    public static void main(String[] args){
        StringTokenizer strToken = new StringTokenizer("This is a java class.");
        System.out.println(strToken.countTokens());
        while(strToken.hasMoreTokens()){
            System.out.println(strToken.nextToken());
        }
    }
}
```