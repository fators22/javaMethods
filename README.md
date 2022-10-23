# Lab 1.2 MethodDrills

## Instructions

Complete each of the methods in MethodDrills.java so that they do what their comments say they should do.

Write code in the main method to test your methods as you complete them. It is recommended that you write one method, test it, fix it, then move on to another method.

You will be using Math and String methods to solve these problems.

### Math Methods

```
Math.sqrt(double a)
Math.pow(double base, double exponent)
Math.abs(int a)
Math.abs(double a)
```

### String Methods

```
int length()
int indexOf(String needle)
String substring(int start, int end)
String substring(int start)
```

Your code must meet the following restrictions:

*  Do not use any of these methods to solve other methods.
*  Do not create any other methods to solve these methods.
*  Do not change the method headers (return type, name, parameters) of these methods.
*  Do not delete the comments from the starter code
*  Do not use if-statements or loops to solve these problems.

Remember that comments describe the method that comes after them.

If you get stuck, there are hints for each method at the end of this document.

## Testing

You need to test your work! Follow this example of how to test a method:

This statement invokes the hello method and stores its response in the answer variable

```
String answer = hello("World"); // invoke the hello method and stores its response in the answer variable
System.out.println( answer );   // output the value of the answer variable to the console
```

When you run this code it will call the hello method and output the results. Since the hello method is being passed the value "World" you should expect the answer to be "Hello World" (see the comment of the hello method). When you run this program you should look at the output and verify that it is correct! If it is not correct, then the method is not correct and you should keep working on it.

You should write code in the main method to test each method as you write it. Follow this pattern:

* Call the method you want to test and store its return value in a variable
* Use System.out.println to output that variable

Note: Make sure you declare the variable correctly. Its type should match the return type of the method.

If you are getting compile errors for your test code in this method then check these things:

* Did you write the method name correctly? Try copying and pasting the method name from the method header.
* Are the arguments you are passing to the method correct? Look at how many parameters the method has and the types of those variables.
* Is the type of your answer variable correct? Look at the return type of the method, this should match the type of your answer variable.

## Grading

You must *correctly complete at least 8* of these methods to pass this lab. If you correctly complete *all* of these methods, then you will earn 1 Above & Beyond point.

These methods will be tested by checking their output against several test cases. If you method fails any of those test cases it will be deemed *incorrect*.

For example: Consider the following method:

```
int subtract(int a, int b)
```

This method should return the difference between a and b so the following method call should result in the specified value:

```
subtract(3, 5) -> -2
```

If your version of this method returned the value 2, then it would be marked as *incorrect*.

## Methods

The instructions for each of these methods are located in the comments that precede them in the java source code file. The comments also include at least one example of what the method should return given some inputs.

It is recommended that you complete these methods in the order they are presented, however none of these methods have a prerequisite so you can complete them in any order you like.

```
double calculateDistance(int x1, int y1, int x2, int y2)
int distanceFrom16(int x)
String hello(String name)
String triple(String str)
int findNeedle(String needle, String haystack)
String isolateCharacterAtIndex(String str, int index)
String removeCharacter(String str, int index)
String insertNeedle(String needle, String haystack, int index)
int findEndOfNeedle(String needle, String haystack)
String removeNeedle(String needle, String haystack)
String whatILike(String str)
String getFirstNCharacters(String str, int n)
String removeFirstNCharacters(String str, int n)
String getLastNCharacters(String str, int n)
String removeLastNCharacters(String str, int n)
String frontBack(String str)
```

## Turning it in

When you have finished this lab, upload it to [https://turnerinner.com/@mrmaycs](https://turnerinner.com/@mrmaycs)

## Hints

### calculateDistance(int x1, int y1, int x2, int y2)

You need to use the Math methods to find square root and powers.

### distanceFrom16(int x)

You need to make sure the answer you get is always positive. That's exactly what the Absolute Value method does!

### hello(String name)

This is a simple concatenation problem.

### triple(String str)

This is also a simple concatenation problem!

### findNeedle(String needle, String haystack)

What string method tells you *where* a needle is?

### isolateCharacterAtIndex(String str, int index)

What string method can get a small string from a big string? You are given the index of where the character is located, how can you use math to calculate the index where that character ends?

### removeCharacter(String str, int index)

This problem is the inverse of the isolateCharacterAtIndex problem.

You should think of the string as a combination of three pieces. A beginning, a character in the middle, and an ending.

Consider the example removeCharacter("TACOS", 2) You can think of the string TACOS as being separated into three parts:

```
TA C OS
```

You need to isolate the beginning part (what index does it start at? What index does it end at?) and you need to isolate the ending part (what index does it start at? What index does it end at?). Then you can concatenate those two pieces together.

### insertNeedle(String needle, String haystack, int index)

This problem is similar to the removeCharacter problem, except you are breaking the string into two pieces and then inserting the third piece inbetween them.

Consider the example insertNeedle("CHEESE", "tacos", 2). You should break the string into two pieces.

```
tac os
```

Where does the first piece start? Where does it end? Where does the second piece start? Where does it end? Once you have solved that problem, this becomes a simple concatenation problem.

### findEndOfNeedle(String needle, String haystack)

You know how to find the index where needle starts in haystack (remember how you solved the findNeedle method) Now you need to do some math to figure out where that needle ends. What string method can you use to identify how many characters are in the needle string?

### removeNeedle(String needle, String haystack)

This is the same as the removeCharacter method, except now you are dealing with a needle that is (possibly) longer than 1 character. You need to combine your solution to removeCharacter with your solution to findEndOfNeedle.

### whatILike(String str)

Consider the following examples:

```
I like tacos
I like cake
I like computers
I like homework
I like dancing
```

Is there a pattern to where the-thing-I-like is found in these strings? If you knew where the-thing-I-like started in the string, could you isolate it from the string?

### getFirstNCharacters(String str, int n)

What string method can you use to get a smaller string from a bigger string? Where does the smaller string start? Where does the smaller string end?

### removeFirstNCharacters(String str, int n)

This is the inverse of getFirstNCharacters. Where does the the small string you want start and end for this problem?

### getLastNCharacters(String str, int n)

This is similar to the getFirstNCharacters method, except now you want the last N characters. Where does this small string start? Where does it end? What string method can you use to identify how many characters are in the string? How can you calculate where this small string starts if you know the length of the string and that you want the last N characters?

### removeLastNCharacters(String str, int n)

This is the inverse of getLastNCharacters. Similar to how removeFirstNCharacters was the inverse of getFirstNCharacters.

### frontBack(String str)

You need to remove the first character then remove the last character, then concatenate them back together.
