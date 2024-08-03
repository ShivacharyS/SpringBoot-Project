<h1 align="center">SpringBoot Project with JWT Authentication</h1>


<h3 align="left">1. Starting the Project</h3>

- Navigate to  ***src/main/java*** Folder.

- Open ***com.example.techeazy*** package

- Right click on ***TecheazyApplication*** and Click on ***Run as*** and ***Spring Boot Appliation***.

<h3 align="left">2. API Testing</h3>

- Open ***Postman*** Application.

- Click on new tab and set method as ***POST*** method.

- Copy this URL ---------->      http://localhost:8087/authenticate <---------and paste in URL area.

- Select ***Body*** and then ***raw*** (Keep acceptance as ***JSON***).
- ***ADMIN LOG IN***

- And Paste this --------------->
-  {
    "username" : "Shiva",
    "password" : "password"}

- Now send the request by clicking on ***SEND***

- Now you will get the ***Token*** Copy it

- Open New Tab in Postman and Add this url http://localhost:8087/Class/add and set Method as ***POST*** and add the below code in ***BODY***
- {
   "student" : {
    "studentName" :  "Roja",
    "studentPassword": "9652",
    "role": "USER",
    "studentAddress" : "Potkapalli",
    "subject" : [
            {
                "subjectName" : "Economics"
            },
            {
                "subjectName" : "Sanskrit"
            }


    ]
   }
}

- Now After Sending the Request and the response ***Student Added Successfully*** is displayed.
- Explore ALL ***API's***:
  
- 2. http://localhost:8087/Class/getOneStudent/2 Method=***GET***
  3. http://localhost:8087/Class/getAllStu Method=***GET***
  4. http://localhost:8087/Class/getAllSub  Method=***GET***
  5. (***NOTE***) -----> Must paste the ***TOKEN** in Header Section as KEY as ***Authorization*** and VALUE as ***Bearer space TOKEN***

 - ***______________________________________________________________________________***

 - ***STUDENT LOG IN***
 - { 
    "username" : "Chary", 
    "password" : "password" 
}

- Authenticate using URL http://localhost:8087/authenticate and Copy the TOKEN
- (***NOTE***) -----> MUST PASTE THE ***TOKEN** IN HEADER SECTION as ***Bearer space TOKEN***
- Using ***STUDENT LOG IN*** we can only access few API's
- 1. http://localhost:8087/Class/add
  2. http://localhost:8087/Class/getOneStudent/2

- ***___________________________________________________________________***

- You Can also Test Using ***SWAGGER** UI
- http://localhost:8087/swagger-ui/index.html#/



