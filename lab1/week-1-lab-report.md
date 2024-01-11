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
```console
[user@sahara ~]$ cd
[user@sahara ~]$ 
```
Working directory when *cd* was run: /home/  
I got this output because I am stating to change the directory to the current directory (since there are no arguments).<br><br>

`An example of using the command with a path to a directory as an argument:`
```console
[user@sahara ~]$ cd lecture1/
[user@sahara ~/lecture1]$ 
```
Working directory when *cd* was run: /home/  
The directory changes only after running the command, and we change the current working directory to the `lecture1` folder which has a path of /home/lecture1/<br><br>

`An example of using the command with a path to a file as an argument:`
```console
[user@sahara ~/lecture1]$ cd Hello.java
bash: cd: Hello.java: Not a directory
[user@sahara ~/lecture1]$ 
```
Working directory when *cd* was run: /home/lecture1/  
This does not work because cd changes to a certain directory but a file is not a folder which you can go into, therefore it returns and error.<br><br>

# LS
`An example of using the command with no arguments.`
```console
[user@sahara ~]$
lecture1
```
Working directory when *ls* was run: /home/  
I got this output because I am listing the files/folders in the current directory (since there are no arguments).<br><br>

`An example of using the command with a path to a directory as an argument.`
```console
[user@sahara ~]$ ls lecture1/
Hello.class Hello.java messages README
```
Working directory when *ls* was run: /home/  
The directory does not change except for the ls command itself (working directory does not change), and we list the contents of the `lecture1` folder which has a path of /home/lecture1/.<br><br>

`An example of using the command with a path to a file as an argument.`
```console
[user@sahara ~]$ ls lecture1/Hello.java
lecture1/Hello.java
```
Working directory when *ls* was run: /home/  
This lists all the files which have the name Hello.java in the relative path lecture1/.<br><br>

# CAT
`An example of using the command with no arguments.`
```console
[user@sahara ~]$ cat

```
Working directory when *cat* was run: /home/  
I got this output because I am concatenating nothing and so it prints nothing (CTRL+C to back out of the running process).<br><br>

`An example of using the command with a path to a directory as an argument.`
```console
[user@sahara ~]$ cat lecture1/
cat: lecture1/: Is a directory
```
Working directory when *cat* was run: /home/  
Cat tells you that lecture1/ is a directory because you cannot concatenate or print out a folder, therefore it is an error.<br><br>

`An example of using the command with a path to a file as an argument.`
```console
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
```console
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
}To use this program:

javac Hello.java
java Hello messages/en-us.txt
```
Working directory when *cat* was run: /home/  
The concatenate (cat) command concatenates the text content of one or multiple files and spits them out without modifying the contents of the files.<br><br>
