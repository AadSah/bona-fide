bona-fide : A Plagiarism Detector Software

Software Engineering Project for Spring Semester 2019 @ IITKGP:)

The software uses java and python3 libraries to search for the plagiarism of the text.

Python libraries and how to install:<br/>
1.BeautifulSoup : pip install beautifulsoup4<br/>
2.google        : pip install google<br/>
3.fuzzywuzzy    : pip install fuzzywuzzy

Other java libraries are included in the package.<br/>

As there is an option of Login and Signup, you may need to create a MySQL database with name "java_login_register" and a table named "the_app_users" with 4 columns named u_fname(varchar(50)) , u_uname(varchar(50)), u_pass(varchar(50)) and u_address(varchar(50)).
To ignore it you need to change the login and register windows directly to the search window. That can be done in Home.java where rather than calling for "Login rgf = new Login()", you need to call "Search rgf = new Search".

The above software is easy to be modified in Netbeans IDE.<br/>

How to run the software::<br/>
Open the folder depending on the platform you are using: NewProject_Windows for Windows and NewProject_Ubuntu for linux.<br/>
The software is designed for running through command prompt.<br/>
To run the project from the command line, go to the dist folder and
type the following::<t/>java -jar "NewProject.jar" 
