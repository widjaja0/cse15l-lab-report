# Lab Report 2  
```
For each of the commands cd, ls, and cat, and using the workspace you created in this lab:
- Share an example of using the command with no arguments.
- Share an example of using the command with a path to a directory as an argument.
- Share an example of using the command with a path to a file as an argument.
So that's 9 total examples (3 for each command). For each, include:
- A screenshot or Markdown code block showing the command and its output
- What the working directory was when the command was run
- A sentence or two explaining why you got that output (e.g. what was in the filesystem, what it meant to have no arguments).
- Indicate whether the output is an error or not, and if it's an error, explain why it's an error.
```
# CD
`An example of using the command with no arguments:`
```bash
1
[user@sahara ~]$ cd
[user@sahara ~]$ 

2
[user@sahara ~/lecture1]$ cd
[user@sahara ~]$ 

3
[user@sahara ~/lecture1/messages]$ cd 
[user@sahara ~]$ 
```
Working directory when *cd* was run: (1) /home (2) /home/lecture1 (3) /home/lecture1/messages  
We get this output because *cd* without any arguments changes the current working directory to the root or the home directory. This output is not an error.<br><br>

`An example of using the command with a path to a directory as an argument:`
```bash
[user@sahara ~]$ cd lecture1/
[user@sahara ~/lecture1]$ 
```
Working directory when *cd* was run: /home  
The directory changes only after running the command so the working directory when *cd* was run is /home. We change the current working directory to the `lecture1` folder which has a path of /home/lecture1 and this output is not an error.<br><br>

`An example of using the command with a path to a file as an argument:`
```bash
[user@sahara ~/lecture1]$ cd Hello.java
bash: cd: Hello.java: Not a directory
[user@sahara ~/lecture1]$ 
```
Working directory when *cd* was run: /home/lecture1  
This does not work and returns an error because cd changes to a certain directory given as an argument. However, a file is not a folder which you can go into.<br><br>

# LS
`An example of using the command with no arguments.`
```bash
[user@sahara ~]$ ls
lecture1
```
Working directory when *ls* was run: /home  
I got this output because I am listing the files and folders (if there are any) in the current directory. It lists out the contents of the current working directory because there are no arguments.<br><br>

`An example of using the command with a path to a directory as an argument.`
```bash
[user@sahara ~]$ ls lecture1/
Hello.class Hello.java messages README
```
Working directory when *ls* was run: /home  
The working directory does not change and we list the contents (files and folders if they exist) of the `lecture1` folder which has a path of /home/lecture1.<br><br>

`An example of using the command with a path to a file as an argument.`
```bash
[user@sahara ~]$ ls lecture1/Hello.java
lecture1/Hello.java
```
Working directory when *ls* was run: /home  
This lists all the files which have the name Hello.java in the `lecture1` folder which has a path of /home/lecture1.<br><br>

# CAT
`An example of using the command with no arguments.`
```bash
[user@sahara ~]$ cat
^C
[user@sahara ~]$ cat
cat
cat
^C
```
Working directory when *cat* was run: /home  
I got this output because I am concatenating nothing and so it prints nothing as I did not pass an argument. This also seems to leave the terminal to be stuck as if it is running a loop (CTRL+C to back out of the running process). However, note that if you type *cat* without supplying an argument, and then you enter in any string of characters, the *cat* command repeats exactly what you inputed into the terminal.<br><br>

`An example of using the command with a path to a directory as an argument.`
```bash
[user@sahara ~]$ cat lecture1/
cat: lecture1/: Is a directory
```
Working directory when *cat* was run: /home  
The cat command when you give it the path to a directory as an argument returns an error. The terminal tells you that lecture1/ is a directory because you cannot concatenate or print out a folder.<br><br>

`An example of using the command with a path to a file as an argument.`
```bash
[user@sahara ~]$ cat lecture1/Hello.java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hello {
  public static void main(String[] args) throws IOException {
    String content = Files.readString(Path.of(args[0]), StandardCharsets.UTF_8);    
    System.out.println(content);
  }
}
```
```bash
[user@sahara ~]$ cat lecture1/Hello.java lecture1/README
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hello {
  public static void main(String[] args) throws IOException {
    String content = Files.readString(Path.of(args[0]), StandardCharsets.UTF_8);    
    System.out.println(content);
  }
}To use this program:

javac Hello.java
java Hello messages/en-us.txt
```
Working directory when *cat* was run: /home  
The concatenate (cat) command concatenates the text content of one or multiple files and spits them out without modifying the contents of the files. In the second case we are printing out the contents of the Hello.java and README files in the folder with the path /home/lecture1/.<br><br>
