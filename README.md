# Zendesk OA - Vinay (vinay.1si13cs131@gmail.com)

1. [Features. ](#feats)
2. [System Requirements. ](#reqs)
3. [Instructions to run application. ](#runapp)
4. [Technology stack. ](#stack)
5. [High level design](#high_design)
6. [Sequence diagram](#seq_diagram)
7. [Unit test results](#junits)
8. [Screenshots](#screenshots)

<a name="feats"></a>
## Features
    - User can view list of assigned tickets on browser.
    - User can paginate accross requests if number of tickets are more than 25.
    - User can click on each ticket to view details.
    - User can change the number of records per page, default is set to 25 tickets per page.
    - Appropriate error messages are displayed on UI in case of exceptions.

<a name="reqs"></a>
## System requirements
    - Java 8 - To run spring boot application.
    - Maven - To build application.
    - Chrome - To run UI.

<a name="runapp"></a>
## Instructions to run application
### Instuctions to run backend
```sh
cd backend
mvn clean install
java -jar target/vinay-0.0.1-SNAPSHOT.jar
```
### Instuctions to run UI
    - Go to UI directory open index.html on Chrome browser

<a name="stack"></a>
## Technology stack
    - Languages: Java 8, Javascript, HTML/CSS
    - Frameworks: Springboot, ehcache
    - UI: Bootstrap table

<a name="high_design"></a>
## High level design

<a name="seq_diagram"></a>
## Sequence diagram
![Alt text](images/design/sequence.png)

<a name="junits"></a>
## Unit test results
![Alt text](images/junits/junit1.png)
![Alt text](images/junits/junit2.png)
![Alt text](images/junits/junit3.png)

<a name="screenshots"></a>
## Screenshots
- Successful loading
![Alt text](images/gui/sc1.png)
- View ticket details
![Alt text](images/gui/sc2.png)
- Select number of tickets per page
![Alt text](images/gui/sc3.png)
- Error while loading main page
![Alt text](images/gui/error1.png)
- Error while loading ticket details
![Alt text](images/gui/error2.png)