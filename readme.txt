bona-fide : A Plagiarism Detection Software

Software Engineering Project for Spring Semester 2019 @ IITKGP:)

User Manual : How to use the software

github repo: https://github.com/AadSah/bona-fide/

The software uses java and python3 libraries to search for the plagiarism of the text.

Python libraries used in the software (Pre-requisites):

1.BeautifulSoup 
How to install:
	(i). Windows:
		(a). Install python (ignore if already installed).
		(b). Go to the folder where python is installed (probably C:\Users\<username>\AppData\Local\Programs\Python
		(c). Choose the folder depending upon python version. Go to "Scripts"
		(d). Open command prompt here 
		(e). Type this in command prompt: pip install beautifulsoup4 
	(ii). Ubuntu:
		(a). Open terminal.
		(b). Type pip install beautifulsoup4 to install it.

2.google        
How to install:
	(i). Windows:
		(a). Install python (ignore if already installed).
		(b). Go to the folder where python is installed (probably C:\Users\<username>\AppData\Local\Programs\Python
		(c). Choose the folder depending upon python version. Go to "Scripts"
		(d). Open command prompt here 
		(e). Type this in command prompt: pip install google 
	(ii). Ubuntu:
		(a). Open terminal.
		(b). Type pip install google to install it.

3.fuzzywuzzy
How to install:
	(i). Windows:
		(a). Install python (ignore if already installed).
		(b). Go to the folder where python is installed (probably C:\Users\<username>\AppData\Local\Programs\Python
		(c). Choose the folder depending upon python version. Go to "Scripts"
		(d). Open command prompt here 
		(e). Type this in command prompt: pip install fuzzywuzzy 
	(ii). Ubuntu:
		(a). Open terminal.
		(b). Type pip install fuzzywuzzy to install it.

Other java libraries are included in the package.

As there is an option of Login and Signup, you may need to create a MySQL database with name "java_login_register" and a table named "the_app_users" with 4 columns named u_fname(varchar(50)) , u_uname(varchar(50)), u_pass(varchar(50)) and u_address(varchar(50)). To ignore it you need to change the login and register windows directly to the search window. That can be done in Home.java where rather than calling for "Login rgf = new Login()", you need to call "Search rgf = new Search".

You can ignore it and go for "Guest Login"

The above software is easy to modify in NetBeans IDE 8.2.

How to run the software::

Download or clone the repository(Link given).
After downloading follow the steps depending upon the Operating System.

(i). Windows:
	(a). Open the folder "NewProject_Windows"
	(b). Go to the folder "dist".
	(c). Open command prompt here.
	(d). Type "java -jar NewProject.jar" to run it.
 
 (ii). Linux:
 	(a). Open the folder "NewProject_Ubuntu"
	(b). Go to the folder "dist".
	(c). Open command prompt here.
	(d). Type "java -jar NewProject.jar" to run it.