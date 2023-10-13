# GatherGrid Project Documentation

## Project Definition
GatherGrid is a web application for event management that allows users to create, promote, manage, and participate in various events. The project aims to modernize the existing application by migrating to Java Enterprise Edition (JEE). This documentation will guide you on how to set up and use GatherGrid.

## Technologies Used
- **Maven (3.3.2)**: Maven is a build and dependency management tool. It simplifies project management and allows you to define your project's structure and dependencies in a POM (Project Object Model) file. It's a crucial tool to manage the project's build process and dependencies.

- **JAKARTA EE (Enterprise Edition) (2.0.0)**: Jakarta EE is a set of specifications for enterprise applications in Java. It provides a robust platform for building and deploying enterprise-level applications.

- **Hibernate (6.2.7.Final)**: Hibernate is an ORM (Object-Relational Mapping) framework for Java. It simplifies database interaction by mapping Java objects to database tables.

- **JPA (Java Persistence API)**: JPA is a Java specification for managing relational data in applications. It provides a standard way to map Java objects to database tables.

- **Servlets and JSP (JavaServer Pages) (Servlet 6.0.0)**: These are Java technologies used to develop web applications. Servlets handle server-side requests, while JSP is used for creating dynamic web pages.

- **Apache Tomcat (Add version if applicable)**: Apache Tomcat is a web server and servlet container that is used to host web applications built with Java. [Apache Tomcat® - Which Version Do I Want?](https://tomcat.apache.org/whichversion.html)

## Project Setup

1. Clone the project from the repository


```git
git clone https://github.com/abdelghafour77/GatherGrid
```


2. Ensure you have Maven installed on your system. If not, download and install it from [Maven's official website](https://maven.apache.org/download.cgi).

3. Open the project in your preferred IDE.

4. Configure your IDE to use Apache Tomcat as the application server. You may need to specify the Tomcat version in your IDE's server configuration.

5. Set up your database and configure the connection in the project. You can find the database configuration in the project's source code.

6. Build the project using Maven.

```cmd
mvn clean install
```


7. Deploy the project to your Apache Tomcat server.

8. Access the GatherGrid web application in your browser by navigating to `http://localhost:8080/GatherGrid` (or your configured server address).

## Usage

<!-- Once the project is set up and deployed, you can use GatherGrid to create, manage, and participate in events. The web application provides a user-friendly interface for all these functionalities. -->



