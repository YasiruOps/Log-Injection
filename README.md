# Log-Injection
**Setup**
We use java springboot with the log4j framework which is used by java applicaitons to excecute the attack 
we need to use log4j version higher than 2.10 and less thean 2.14.1 in oder to create this attack. So once an 
attacker has initiated an attack they can sit inbetween and control the log messages and their parameters

**Exloit**
In the user input (localhost:8080/vuln?userInput) where the user can enter their name an attacker can enter the following command
URL encorded and submit it to look upto the hosts JNDI resouces and use it to connect to that

**Mitigate **
We can mitigate this using JVM argument -DLog4j2.format.MsgNoLookups = true which makes sure it doesnt read 
lookups and therefore this is mitigated also u can use better log4j version in order to mitigate this
it is patched in the never log4j versions from 2.14.2
