# Lab Report 5 
<a href="https://ucsd-cse15l-w24.github.io/week9/index.html#lab-report-5---putting-it-all-together-week-9" target="_blank">INSTRUCTIONS TO THIS LAB</a>

# Part 1 - Debugging Scenario  
In this lab (lab report 5), we simulate a scenario where we debug another student's code that produces an error in Java. We design a debugging scenario and we imagine a conversation on Edstem to write this report.
<br>

Design a debugging scenario, and write your report as a conversation on EdStem. It should have:

1. The original post from a student with a screenshot showing a symptom and a description of a guess at the bug/some sense of what the failure-inducing input is. (Don't actually make the post! Just write the content that would go in such a post)
Screenshot showing a symptom
A description of a guess at the bug from the student

2. A response from a TA asking a leading question or suggesting a command to try (To be clear, you are mimicking a TA here.)
A response from a TA asking a leading question or suggesting a command to try

3. Another screenshot/terminal output showing what information the student got from trying that, and a clear description of what the bug is.
3. Screenshot showing what info the student got from running the suggested command
A clear description of what the bug is

4. At the end, all the information needed about the setup including:


- The file & directory structure needed
- The contents of each file before fixing the bug
- The full command line (or lines) you ran to trigger the bug
- A description of what to edit to fix the bug

You should actually set up and run the scenario from your screenshots. It should involve at least a Java file and a bash script. Describing the bug should involve reading some output at the terminal resulting from running one or more commands. Design an error that produces more interesting output than a single message about a syntax or unbound identifier error – showcase some interesting wrong behavior! Feel free to set this up by cloning and breaking some existing code like the grading script or code from class, or by designing something of your own from scratch, etc.

---

# Part 2 - Reflection
Finally, to reflect on our lab reports, one thing I would say I have learned from my lab experience in the second half of this quarter that I did not know before was how we can use jdb to debug code in order to figure out the state of local variables and to figure out how or why some code can be stuck in an infinite loop. Another thing that I have learned from lab that I did not previously know before was that the terminal does not handle floating point values, but if you are running a Unix terminal, you can just use the `bc` command to handle this. However, if you are not on a Unix system and are using MingGW or some other windows system, I learned that you have to install msys2 in order to be able to access the command which I thought was a cool thing to learn from StackOverflow. I think the coolest thing that I have learned so far was being able to use a ProcessBuilder to run bash commands right within your Java program.

---

# Part 3 - Jambo The Cat
![jambo with hearts](image.png)