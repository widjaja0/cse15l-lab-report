# Lab Report 2  
<a href="https://ucsd-cse15l-w24.github.io/week3/index.html#lab-report-2---servers-and-ssh-keys-week-3" target="_blank">INSTRUCTIONS TO THIS LAB</a>

# Part 1 - Chat Server  
In this lab (lab report 2), we build a chat server that is be able to take in a url and detect if that path contains "/add-message" followed by a query that is formatted as such: `?s=<string>&user=<string>`. This will concatenate the message to a String containing the name of the user followed by the user's message in the form: `<user>: <message>`. This will print to the page when the url contains "/add-message".  
<br>

## Code block for the Chat Server:
```java

```  
<br>

## Two screenshots using "/add-message":
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
In this part of the lab, we use the **ls** command in a terminal to demonstrate our usage and understanding of SSH.

> The absolute path to the private key for my SSH key for logging into ieng6 **(on my computer)**.  
C:/Users/Widjaja/.ssh/id_rsa
![Absolute path to private key on my computer.](image-2.png)  
<br>

> The absolute path to the public key for my SSH key for logging into ieng6 **(on ieng6)**.  
/home/linux/ieng6/oce/9f/wiwidjaja/.ssh/authorized_keys
![Absolute path to public key on ieng6.](image-1.png)  
<br>

> A terminal interaction where I log into my ieng6 account without being asked for a password **(on my computer)**.  
![Terminal interaction.](image-3.png)
<br>

# Part 3 - Something I Did Not Know...  
Something that I learned from lab in week 2 that I did not know before was: **"What the heck is a secure shell?"**  
I have used a secure shell in a hackathon in the past, but I was not aware that what I was using at the time was a secure shell. The usefulness of the tool was also made aware to me from the week 2 lab where each member of the class logged into what I assume to be a partition on the UCSD servers remotely. This week's lab from week 3 further solidified my initial curiousities about the use cases for a secure shell, and it seems very useful for accessing other systems across networks for something like remote development for example. 

# Part 4 - Jambo The Cat
![Jambo the cat.](image.png)
