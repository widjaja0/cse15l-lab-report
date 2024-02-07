# Lab Report 23 
<a href="https://ucsd-cse15l-w24.github.io/week5/index.html#lab-report-3---bugs-and-commands-week-5" target="_blank">INSTRUCTIONS TO THIS LAB</a>

# Part 1 - Bugs  
In this lab (lab report 3), we choose one of the bugs from <a href="https://ucsd-cse15l-w24.github.io/week4/index.html#lab-tasks">week 4's lab</a> and we explore inputs that will return a failure-inducing input, a non-failure-inducing input, the symptom of said bug from both outputs, and the before-and-after code to showcase fixing said bug.
<br>

Here, I choose the first "reverseInPlace()" bug from <a href="https://ucsd-cse15l-w24.github.io/week4/index.html#lab-tasks">the week 4 lab</a>.

---

> Code block for the failure-inducing input as a JUnit test.
```java
@Test
public void testReverseInPlaceBug() {
	int[] input2 = { 1, 2, 3, 4 };
	ArrayExamples.reverseInPlace(input2);
	assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input2);
}
```

> Code block for the non-failure-inducing input as a JUnit test.
```java
@Test 
public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
}
```

---

> Screenshots of the symptoms from using each test.  

> **Screenshot 1:** <br>
![failure-inducing input](image-2.png)

---

> **Screenshot 2:** <br>
![non-failure-inducing input](image-1.png)

---

> Code block before the code change.
```java
// Changes the input array to be in reversed order
static void reverseInPlace(int[] arr) {
	for(int i = 0; i < arr.length; i += 1) {
    	arr[i] = arr[arr.length - i - 1];
	}
}
```

> Code block after the code change.
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
---

This fix addresses the issue where the function reverseInPlace() would forget about the element that is currently being iterated on, and it would also mirror the end array instead of reversing it. This is because we now store the element being iterated on in order to place it to the back of the array, and we also only iterate through half of the array in order to ensure no overlaps and that the array is reversed correctly instead of mirrored.

# Part 2 - Researching Commands
In this part of the lab, we choose between `less`, `find`, and `grep` in order to find 4 options or alternative ways to use the command we choose alongside 2 examples of using said option or alternative way in code blocks. Short descriptions are provided below the examples.  

# grep
Here, I chose `grep`. Sources used: https://www.geeksforgeeks.org/grep-command-in-unixlinux/  

## -c
`-c` : prints the number of lines containing the given pattern of characters to search for (geeksforgeeks)  

Two examples using the option:

```bash
$ cat index.md
# Stylesheet Cheat Sheet
*This is in italics.* <br> <br>
**This is bold.**
# I am a heading.
## I am a heading but smaller.
[This is a link to Youtube.](https://youtube.com) <br> <br>
![This is a cat.](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRF1IwK6-SxM83UpFVY6WtUZxXx-phss_gAUfdKbkTfau6VWVkt)

> This is embedded text. (Blockquote) Also make sure to press enter a few times which adds space below the blockquote to tell Github that the lines below are not part of the blockquote.


* This
* is a
* list.
1. This
2. is a
3. list. <br> <br>
This is a page break or a horizontal rule:
---
`This is inline code` with backticks like in Discord.
#```
# This is a code block also like in discord.
print '3 backticks or'
print 'indent 4 spaces'
#```

$ grep -c "discord" index.md
1
```
(added in #'s behind "```"'s for formatting)  
This is essentially finding the number of lines that contain the string of characters "discord" in a file called `index.md`. This is useful if we want to find all the instances of a certain keyword in a directory of files.

```bash
$ grep -r -c "class" ./
...
./technical/plos/pmed.0020162.txt:31
./technical/plos/pmed.0020180.txt:0
./technical/plos/pmed.0020181.txt:0
./technical/plos/pmed.0020182.txt:0
./technical/plos/pmed.0020187.txt:0
./technical/plos/pmed.0020189.txt:0
./technical/plos/pmed.0020191.txt:0
./technical/plos/pmed.0020192.txt:0
./technical/plos/pmed.0020194.txt:0
./technical/plos/pmed.0020195.txt:0
./technical/plos/pmed.0020196.txt:0
./technical/plos/pmed.0020197.txt:0
./technical/plos/pmed.0020198.txt:1
./technical/plos/pmed.0020200.txt:0
./technical/plos/pmed.0020201.txt:0
./technical/plos/pmed.0020203.txt:1
./technical/plos/pmed.0020206.txt:0
./technical/plos/pmed.0020208.txt:0
./technical/plos/pmed.0020209.txt:0
./technical/plos/pmed.0020210.txt:3
...

$ pwd
/c/Users/Widjaja/Documents/GitHub/cse15l-lab-report/week5 - lab3
```
This is also finding the number of lines that contain the string of characters "class" in the current working directory (/c/Users/Widjaja/Documents/GitHub/cse15l-lab-report/week5 - lab3). However this way of using the option utilizes the recursive search option `-r` and tells us the number of times "class" appears in each individual file and subfile within our working directory. This is useful if we want to find all the instances of a certain keyword in a directory of files or to find which file has the most occurances of a certain keyword.

## -n
`-n` : prints lines and line numbers if the line contains the pattern of characters given (geeksforgeeks)  

Two examples using the option:

```bash
$ grep -r -n "discord" index.md
22:# This is a code block also like in discord.
```
This option is finding which line in `index.md` contains the string of characters "discord" and it tells you exactly which line in the file contains this string of characters and prints the line out. This is useful if we want to find where a certain line that contains something that we are looking for. This might be useful for example for debugging if we have a lot of code and we need to find certain lines in files that may be causing a certain bug or error.

```bash
$ grep -r -n "class" ./
./DocSearchServer.java:13:class FileHelpers {
./DocSearchServer.java:33:class Handler implements URLHandler {
./DocSearchServer.java:66:class DocSearchServer {
Binary file ./lib/hamcrest-core-1.3.jar matches
Binary file ./lib/junit-4.13.2.jar matches
./Server.java:19:class ServerHttpHandler implements HttpHandler {
...
./TestDocSearch.java:7:public class TestDocSearch {
./week-5-lab-report-3.md:116:$ grep -r -c "class" ./
./week-5-lab-report-3.md:143:This is also finding the number of lines that contain the string of characters "class" in the current working directory (/c/Users/Widjaja/Documents/GitHub/cse15l-lab-report/week5 - lab3). However this way of using the option utilizes the recursive search option `-r` and tells us the number of times "class" appears in each individual file and subfile within our working directory. This is useful if we want to find all the instances of a certain keyword in a directory of files or to find which file has the most occurances of a certain keyword.
```
This command is also finding which line contains the string of characters "class" in the current working directory (/c/Users/Widjaja/Documents/GitHub/cse15l-lab-report/week5 - lab3). This way of using the option also utilizes the recursive search option `-r` and tells us the number of times "class" appears in each individual file and subfile within our working directory. This is useful if we want to find all the instances of a certain keyword in a directory of files or to find which file has the most occurances of a certain keyword. This also has some potential usages in debugging, and note that "..." have been inserted in the code block for the sake of conciseness.

## -B
`-B` : prints the line containing the pattern of characters to search for and n lines before it (geeksforgeeks)  
Usage is `-Bn` where `n` is the number of lines to print before the line with the pattern.

Two examples using the option:

```bash
$ grep -r -B3 "discord" index.md
---
`This is inline code` with backticks like in Discord.
#```
# This is a code block also like in discord.
```
(added in #'s behind "```"'s for formatting)  
The `-B` option basically finds what what line of text contains the string of characters that you are searching for, and then it prints the line out as well as a few lines before it denoted by "n" which indicates how many lines to print before the found pattern like: `-Bn` (`-B3`). This might be useful when looking at code and we want to see a certain number of lines that precedes that code in order to analyze or debug it. (There is also an option for printing lines after the found pattern.)

```bash
$ grep -r -B3 "classroom" ./
./technical/911report/chapter-1.txt-
./technical/911report/chapter-1.txt-    Inside the National Military Command Center, the deputy director of operations and his assistant began notifying senior Pentagon officials of the incident. At about 9:00, the senior NMCC operations officer reached out to the FAA operations center for information. Although the NMCC was advised of the hijacking of American 11, the scrambling of jets was not discussed.
./technical/911report/chapter-1.txt-
./technical/911report/chapter-1.txt:    In Sarasota, Florida, the presidential motorcade was arriving at the Emma E. Booker Elementary School, where President Bush was to read to a class and talk about education. White House Chief of Staff Andrew Card told us he was standing with the President outside the classroom when Senior Advisor to the President Karl Rove first informed them that a small, twin-engine plane had crashed into the World Trade Center. The President's reaction was that the incident must have been caused by pilot error.
./technical/911report/chapter-1.txt-
./technical/911report/chapter-1.txt:    At 8:55, before entering the classroom, the President spoke to National Security Advisor Condoleezza Rice, who was at the White House. She recalled first telling the President it was a twin-engine aircraft-and then a commercial aircraft-that had struck the World Trade Center, adding "that's all we know right now, Mr. President."
...
--
./technical/plos/pmed.0020246.txt-
./technical/plos/pmed.0020246.txt-          Interviewers
./technical/plos/pmed.0020246.txt-          After completing an intensive training program, 24 Nigerian surveyors conducted the
./technical/plos/pmed.0020246.txt:          survey interviews. Interviewer training consisted of 5 d of classroom teaching and
```
This way of using the command is also finding the lines of text contain the string of characters that you are searching for, and then it prints the lines out as well as a few lines before them denoted by "n" which indicates how many lines to print before the found pattern like: `-Bn` (`-B3`). We are currently in the current working directory (/c/Users/Widjaja/Documents/GitHub/cse15l-lab-report/week5 - lab3) and so it searches for and prints lines before for each line for each file that it finds. This way of using the option also utilizes the recursive search option `-r` and tells us the number of times "classroom" appears in each individual file and subfile within our working directory. This could be useful to search for certain data and get the context of that information into a text file using '>'.


## -f [file]
`-f` : this option takes a file and parses each line as individual patterns to grep for (geeksforgeeks)  

pattern.txt
```
PSM
figure
Interview
```

Two examples using the option:

```bash
$ grep -f pattern.txt ./technical/plos/pmed.0020246.txt
          Interviewers
          survey interviews. Interviewer training consisted of 5 d of classroom teaching and
          All interviews were conducted over 5 wk in October and November 2002. Interviews

$ grep -f pattern.txt ./technical/plos/journal.pbio.0030032.txt
        of a new graduate credential known as the professional science master's, or PSM. “Not many
        people have the ability to understand science and business, and [the PSM] program was
        PSMs are two-year American master's degrees financed in large part by the Alfred P.
        careers more attractive to talented young people like Herzer, a 2003 PSM graduate in
        Applied Biosciences from the University of Arizona, who believes his PSM makes him more
        from the Sloan Foundation to assess PSM graduates.
        across the US.
...
```
The `-f` option takes a pattern of strings from a file line by line, and then it searches for any one of those three strings within a file or files that you specify. In this instance, we are utilizing a pattern.txt file in order to search for one of three patterns of characters:
`PSM figure Interview`
The find command then searches the given file in this case for either of those three strings and then it prints out all of the lines found with the pattern that was found. This might be useful for finding all instances of certain strings within a file which can help with finding information or debugging code for example.
*Note: we are running the grep command twice and on two different files but with the same pattern.txt file.*

```bash
$ grep -f pattern.txt ./technical/plos/*.txt
./technical/plos/journal.pbio.0020012.txt:        have the highest average life expectancy of 85, he notes: “So the figure could be 100 in
./technical/plos/journal.pbio.0020052.txt:        upon this or a more appropriate figure and that there was international agreement that
./technical/plos/journal.pbio.0020053.txt:        “Basically, what we do is to try and figure out new ways to hijack the biosynthesis of
./technical/plos/journal.pbio.0020054.txt:        government's Joint Fire Science Program (JFSP), he figures his computer provides fingertip
./technical/plos/journal.pbio.0020067.txt:        configured to accommodate proteins in the nucleus. Wilkins enjoyed being included in the
...
./technical/plos/pmed.0020060.txt:        Many well-known figures contemplating their posthumous selves have been foiled in
./technical/plos/pmed.0020118.txt:        What these figures show perhaps more than anything is the difficulties of generalizing
./technical/plos/pmed.0020123.txt:        Health Assessment Nutrition Examination Survey, and the National Health Interview
./technical/plos/pmed.0020216.txt:        testing services coupled with antiretroviral treatment, these prevalence figures are likely
./technical/plos/pmed.0020216.txt:        figures are particularly alarming in Kathmandu, the capital city, where nearly 68% of
./technical/plos/pmed.0020246.txt:          Interviewers
./technical/plos/pmed.0020246.txt:          survey interviews. Interviewer training consisted of 5 d of classroom teaching and
./technical/plos/pmed.0020246.txt:          All interviews were conducted over 5 wk in October and November 2002. Interviews
```
The way that this uses `-f` is similar to the previous instance of using `-f`, but this time instead of using it to search for patterns in a specified file, we simply use a wildcard to find a pattern from pattern.txt in all of the `.txt` files within the current working directory in /technical/plos (current working directory: /c/Users/Widjaja/Documents/GitHub/cse15l-lab-report/week5 - lab3). In this output, one major difference is that grep prints out the paths to the files relative to the current working directory, but it still manages to print out the line itself that contains one of the patterns specified in pattern.txt. One important use case for this might be to help search a database such as the files given in the `docsearch` repo in order to scrape information from said database

# Part 3 - Jambo The Cat
![Jambo the cat.](image-3.png)