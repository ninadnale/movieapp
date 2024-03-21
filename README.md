# movieapp
This repository hosts a simple Spring Boot application exposing APIs for crud operations on a movie database.
This project is a Spring Boot application that provides a RESTful API for managing movies and their reviews.

### Features
- CRUD operations for Movies:
    - List all movies.
    - Get a specific movie by its IMDb ID.
- Create Reviews:
    - Create a review for a movie by providing the review body and the IMDb ID of the movie.

### Technologies Used
- Spring Boot
- Spring Data MongoDB

### API Endpoints
- Movies:
    - GET /api/v1/movies - Get all movies.
    - GET /api/v1/movies/{imdbId} - Get a movie by its IMDb ID.

- Reviews:
    - POST /api/v1/reviews - Create a new review for a movie. (Body: {"reviewBody": "your review text", "imdbId": "movie imdb id"})

### Running the application
- Clone this repository.
- Make sure you have Java 11 and Maven installed.
- Open a terminal in the project directory.
- Run mvn clean install to build the application.
- Run mvn spring-boot:run to start the application.
- ### Access API endpoints
    - Swagger UI documentation is available at http://localhost:8080/swagger-ui.html. This allows you to explore the API endpoints and their functionalities interactively.