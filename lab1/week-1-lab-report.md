```
For each of the commands cd, ls, and cat, and using the workspace you created in this lab:
- Share an example of using the command with no arguments.
- Share an example of using the command with a path to a directory as an argument.
- Share an example of using the command with a path to a file as an argument.
So that's 9 total examples (3 for each command). For each, include:
- A screenshot or Markdown code block showing the command and its output
- What the working directory was when the command was run
- A sentence or two explaining why you got that output (e.g. what was in the filesystem, what it meant to have no arguments).
Indicate whether the output is an error or not, and if it's an error, explain why it's an error.
```
# CD
## An example of using the command with no arguments.
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/6476d294-e634-4c59-b7bb-6aff6537d3ca) <br>
Working directory when command was run: /home/ <br>
I got this output because I am stating to change the directory to the current directory (since there are no arguments).

## An example of using the command with a path to a directory as an argument.
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/56db7d46-b591-4958-b9b9-9e06b951e20b) <br>
Working directory when command was run: /home/ <br>
The directory changes only after running the command, and we change the current working directory to the `lecture1` folder which has a path of /home/lecture1/

## An example of using the command with a path to a file as an argument.
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/0c0c5077-1437-4921-8330-94a340bccde0) <br>
Working directory when command was run: /home/lecture1/ <br>
This does not work because cd changes to a certain directory but a file is not a folder which you can go into, therefore it returns and error.

# LS
## An example of using the command with no arguments.
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/7c247dbe-4f1e-40e7-a333-9f539a23e20b) <br>
Working directory when command was run: /home/ <br>
I got this output because I am listing the files/folders in the current directory (since there are no arguments).

## An example of using the command with a path to a directory as an argument.
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/290defd6-f907-4285-b35e-fa309fd70fa4) <br>
Working directory when command was run: /home/ <br>
The directory does not change except for the ls command itself (working directory does not change), and we list the contents of the `lecture1` folder which has a path of /home/lecture1/.

## An example of using the command with a path to a file as an argument.
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/acca9825-d76c-498f-b8cf-5cf54d79118d) <br>
Working directory when command was run: /home/ <br>
This lists all the files which have the name Hello.java in the relative path /home/lecture1/.

# CAT
## An example of using the command with no arguments.
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/0725a6b3-ff0a-4a88-865d-53f02f988108) <br>
Working directory when command was run: /home/ <br>
I got this output because I am concatenating nothing and so it prints nothing (TRL+C to back out of the running process).

## An example of using the command with a path to a directory as an argument.
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/e5f44c77-04bf-44ba-9a0b-89c8c80a221c) <br>
Working directory when command was run: /home/ <br>
Cat tells you that lecture1/ is a directory because you cannot concatenate or print out a folder.

## An example of using the command with a path to a file as an argument.
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/9bcbc085-af96-404d-ad4f-6eb4e2ba24f8)
![image](https://github.com/widjaja0/cse15l-lab-report/assets/62527551/f0930dd0-7e01-4d4d-8a3f-b297bfef0b39) <br>
Working directory when command was run: /home/ <br>
The concatenate (cat) command concatenates the text content of two files and spits them out without modifying the contents of the files.
