# Lab Report 23 
<a href="https://ucsd-cse15l-w24.github.io/week5/index.html#lab-report-3---bugs-and-commands-week-5" target="_blank">INSTRUCTIONS TO THIS LAB</a>

# Part 1 - Bugs  
In this lab (lab report 3), we choose one of the bugs from <a href="https://ucsd-cse15l-w24.github.io/week4/index.html#lab-tasks">week 4's lab</a> and we explore inputs that will return a failure-inducing input, a non-failure-inducing input, the symptom of said bug from both outputs, and the before-and-after code to showcase fixing said bug.
<br>

Here, I choose the first "reverseInPlace()" bug from <a href="https://ucsd-cse15l-w24.github.io/week4/index.html#lab-tasks">the week 4 lab</a>.

Code block for the failure-inducing input as a JUnit test.
```java
@Test
public void testReverseInPlaceBug() {
	int[] input2 = { 1, 2, 3, 4 };
	ArrayExamples.reverseInPlace(input2);
	assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input2);
}
```

Code block for the non-failure-inducing input as a JUnit test.
```java
@Test 
public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
}
```

Screenshots of the symptoms from using each test.  
**Screenshot 1:** <br>
![failure-inducing input](image-2.png)

**Screenshot 2:** <br>
![non-failure-inducing input](image-1.png)

Code block before the code change.
```java
// Changes the input array to be in reversed order
static void reverseInPlace(int[] arr) {
	for(int i = 0; i < arr.length; i += 1) {
    	arr[i] = arr[arr.length - i - 1];
	}
}
```

Code block after the code change.
```java
// Changes the input array to be in reversed order
static void reverseInPlace(int[] arr) {
	for(int i = 0; i < arr.length / 2; i += 1) {
    	int temp = arr[i];
    	arr[i] = arr[arr.length - i - 1];
    	arr[arr.length - i - 1] = temp;
    }
}
```

> This fix addresses the issue where the function reverseInPlace() would forget about the element that is currently being iterated on, and it would also mirror the end array instead of reversing it. This is because we now store the element being iterated on in order to place it to the back of the array, and we also only iterate through half of the array in order to ensure no overlaps and that the array is reversed correctly instead of mirrored.

# Part 2 - Researching Commands
In this part of the lab, we choose between `less`, `find`, and `grep` in order to find 4 options or alternative ways to use the command we choose alongside 2 examples of using said option or alternative way in code blocks. Short descriptions are provided below the examples.  




Consider the commands less, find, and grep. Choose one of them. Online, find 4 interesting command-line options or alternate ways to use the command you chose. To find information about the commands, a simple Web search like “find command-line options” will probably give decent results. There is also a built-in command on many systems called man (short for “manual”) that displays information about commands; you can use man grep, for example, to see a long listing of information about how grep works. Also consider asking ChatGPT!  

For example, we saw the -name option for find in class. For each of those options, give 2 examples of using it on files and directories from ./technical. Show each example as a code block that shows the command and its output, and write a sentence or two about what it’s doing and why it’s useful.

That makes 8 total examples, all focused on a single command. There should be two examples each for four different command-line options. Many commands like these have pretty sophisticated behavior possible – it can take years to be exposed to and learn all of the possible tricks and inner workings.

Along with each option/mode you show, cite your source for how you found out about it as a URL or a description of where you found it. See the syllabus on Academic Integrity and how to cite sources like ChatGPT for this class.


