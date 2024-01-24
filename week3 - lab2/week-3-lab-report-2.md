# Lab Report 2  
<a href="https://ucsd-cse15l-w24.github.io/week3/index.html#lab-report-2---servers-and-ssh-keys-week-3" target="_blank">INSTRUCTIONS TO THIS LAB</a>

# Part 1 - Chat Server  
In this lab (lab report 2), we build a chat server that is be able to take in a url and detect if that path contains "/add-message" followed by a query that is formatted as such: `?s=<string>&user=<string>`. This will concatenate the message to a String containing the name of the user followed by the user's message in the form: `<user>: <message>`. This will print to the page when the url contains "/add-message".  
<br>

## This is the code block for the Chat Server:
```java

```  
<br>

## These are two screenshots using "/add-message":
`Screenshot 1:` <br>
LINK

Which methods in your code are called?


What are the relevant arguments to those methods, and the values of any relevant fields of the class?


How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.
END TEXT  
<br>

`Screenshot 2:` <br>
LINK

Which methods in your code are called?


What are the relevant arguments to those methods, and the values of any relevant fields of the class?


How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.

<br>

# Part 2 - SSH  
In this part of the lab, we use the ls command in a terminal to demonstrate our usage and understanding of SSH.

> The absolute path to the private key for your SSH key for logging into ieng6 (on your computer, an EdStem workspace, or on the home directory of the lab computer)  
LINK  
<br>

> The absolute path to the public key for your SSH key for logging into ieng6 (this is the one you copied to your account on ieng6, so it should be a path on ieng6's file system)  
LINK  
<br>

> A terminal interaction where you log into your ieng6 account without being asked for a password.  
LINK  
<br>

# Part 3 - Something I Did Not Know...  
Something that I learned from lab in week 2 that I did not know before was: **"What the heck is a secure shell?"** I have used a secure shell in a hackathon in the past, but I wasn't aware of the usefulness of the tool until the lab from week 2 where we logged into what I assume to be a partition on the UCSD servers remotely. This week's lab from week 3 further solidified my initial curiousities about the use cases for a secure shell, and it seems very useful for accessing other systems across the internet for something like remote development for example.