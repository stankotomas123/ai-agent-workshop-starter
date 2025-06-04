# AI Agent Workshop Starter Repo

This repository accompanies the **AI Agent Coding Workshop**. It contains a minimal
Java backend (Spring Boot) and React frontend so you can focus on using agentic
tools (Codex, Jules, RooCode, Symphony, JetBrains Junie) to extend functionality.

This project has been extended to include a search endpoint.

## Structure
* **backend/** — Spring Boot REST API (includes `/api/tasks` and `/search`)
* **frontend/** — React app (`npm start`)
* **tests/** — Placeholder for generated JUnit & Jest tests

## Building and Running the Spring Boot Application (Backend)

To build and run the Spring Boot application using Maven, navigate to the `backend` directory and execute the following command:

```bash
cd backend
mvn spring-boot:run
```

The application will start on the default port (usually 8080).

## API Endpoints

### Search Endpoint

This endpoint allows you to send a search request and receive the same request back as a response.

- **HTTP Method:** `POST`
- **Path:** `/search`
- **Request Body:** A JSON object with the following attributes:
    - `name` (String): The name to search for.
    - `id` (String): The ID to search for.

  Example:
  ```json
  {
    "name": "TestName",
    "id": "TestId"
  }
  ```

- **Response Body:** The same JSON object that was sent in the request.

  Example:
  ```json
  {
    "name": "TestName",
    "id": "TestId"
  }
  ```

- **Example Usage (curl):**

  ```bash
  curl -X POST \
    http://localhost:8080/search \
    -H 'Content-Type: application/json' \
    -d '{
          "name": "MySearchTerm",
          "id": "12345"
        }'
  ```

### Existing Tasks Endpoint (Example)
The backend also includes a pre-existing endpoint for managing tasks.
* **Path:** `/api/tasks`
 (Further details about this endpoint might be found in other documentation or by inspecting the code.)
