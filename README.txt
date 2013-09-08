

1. Create new Wicket Quickstart Project with Maven:

mvn archetype:generate -DarchetypeGroupId=org.apache.wicket -DarchetypeArtifactId=wicket-archetype-quickstart -DarchetypeVersion=6.10.0 -DgroupId=com.mycompany -DartifactId=myproject -DarchetypeRepository=https://repository.apache.org/ -DinteractiveMode=false

2. Create new project 'myproject' with your preferred IDE


3. Update POM:

4. Create a new file called jetty-user.properties and add the following lines:
user1: password, ROLE_TEST1,ROLE_TEST2,ROLE_TEST3
user2: password, ROLE_TEST2
user3: password, ROLE_TEST3

5. Add to Start.java:

// Setup the test security realm, its name must match what's in the web.xml's 'realm-name' tag:
HashLoginService dummyLoginService = new HashLoginService("MySecurityRealm");
dummyLoginService.setConfig("src/test/resources/jetty-users.properties");
bb.getSecurityHandler().setLoginService( dummyLoginService );
server.setHandler(bb);

6. 


http://localhost:8080/wicket/bookmarkable/com.mycompany.Page1







