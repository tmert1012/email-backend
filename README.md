# email-backend challenge!

This is the backend part of a two part challenge. The frontend for this project is here https://github.com/tmert1012/email-frontend

## Coding Challenge
What we would like to build is a very simple email subscription web service and user interface.

## The user requirements are as follows:
* A place to add an email to the global email list.
* A place to view all currently subscribed emails in the list.
* An unsubscribe page for people that want to remove themselves from the list. It should require the user to click an unsubscribe button then show a message that they have been removed from the list.

## Things to keep in mind:

* Email validation is not simple, so a best effort is good here, just don’t allow any string.
* For security purposes, the url for unsubscribing should not contain the users email, but some other identifier. This identifier should not be easily guessed like an incrementing id.

## Implementation Notes:

* The web service should be written in Java or Kotlin, Kotlin is preferred, but you will not lose any points if you use Java.
* The backend should use some web framework, we have no preference on what is chosen.
* There should be some unit tests for the backend service. The test framework does not matter, but please use one.
* Code should be structured to support dependency injection. A framework for this is not required, but is okay if used.
* The java project should be set up with gradle. To run the web service should be  ‘./gradlew run’ and to run the tests should be ‘./gradlew test’.
* The frontend project can be set up separately with npm or yarn, and runnable separately with ‘yarn start’ or ‘npm start’, or integrated into the Gradle build.
* Do not worry about packaging or deploying this at all.
* Do not worry about using a database for this. In memory data structures work fine.
* There are no authentication or authorization concerns.

### `./gradlew run`

Runs the app in the development mode.  
* Open [http://localhost:7000](http://localhost:7000) to check that the app is up from in the browser.  
* CRUD operations are available for testing [http://localhost:7000/email](http://localhost:7000/email)
  * POST with 'email' form param adds email, returns a UUID for that record
  * GET returns array of records containing the email and UUID
  * DELETE /email/UUID removes the email record based on the URL param provided (UUID)  
    
### `./gradlew test`

Executes tests for the API.
