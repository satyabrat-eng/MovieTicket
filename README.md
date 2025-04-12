Movie Ticket APIs Overview

This is a implemented a basic Movie Ticket Management API using REST principles. The endpoints are as follows:

⸻--------------------------------------------------------------
🔹 GET /ticket/movie
	•	Purpose: Fetches all movies.
	•	Response: A list of movie objects with details like id, movieName, movieDirector, movieRating, and movieLanguage.
 
⸻--------------------------------------------------------------------------------
🔹 GET /ticket/movie/{id}
	•	Purpose: Fetches a single movie by its id.
	•	Example: /ticket/movie/2 returns details for the movie with ID 2.
	•	Response: A single movie object.
 
⸻--------------------------------------------------------------------------
🔹 POST /ticket/movie
	•	Purpose: Adds a new movie entry.
	•	Request Body: JSON payload with movieName, movieDirector, movieRating, and movieLanguage.
	•	Response: Confirmation with status 200 OK.
 
 ⸻------------------------------------------------------------------------------
🔹 PUT /ticket/movie/{movieId}
	•	Purpose: Updates an existing movie entry.
	•	Request Body: JSON payload with movieName, movieDirector, movieRating, and movieLanguage to update the movie details.
	•	Response: Confirmation with status 200 OK if the update is successful. If the movie with the provided ID does not exist, the response might be a 404 Not Found.
 
⸻------------------------------------------------------------------------------------
🔹 DELETE /ticket/movie/{movieId}
	•	Purpose: Deletes an existing movie entry by its ID.
	•	Request Body: No body required.
	•	Response: Confirmation with status 200 OK if the movie is successfully deleted. If the movie with the provided ID does not exist, the response might be a 404 Not Found.

---------------------------------------------------------------------------------------
![image](https://github.com/user-attachments/assets/1aa616f9-9f85-4b50-8b11-d8f1623a9b2f)
1.	This is a POST API to create a new movie ticket entry.
	2.	The URL localhost:8080/ticket/movie is used to send the movie details.
	3.	The request body includes movie name, director, rating, and language in JSON format.
	4.	A 200 OK response confirms the movie ticket was successfully added.

![image](https://github.com/user-attachments/assets/880b4332-764c-4269-a491-855d45c942e3)

	1.	This is a GET API to fetch all movie ticket records.
	2.	The endpoint localhost:8080/ticket/movie returns a list of movie tickets.
	3.	Each ticket contains details like movie ID, name, director, rating, and language.
	4.	The response status 200 OK confirms successful data retrieval.
![image](https://github.com/user-attachments/assets/76c8e86b-cbda-45ca-84e8-8f06de273bfc)

	1.	This is a GET API used to fetch details of a specific movie ticket.
	2.	The endpoint localhost:8080/ticket/movie/2 retrieves the ticket with ID 2.
	3.	The response includes movie info like name, director, rating, and language.
	4.	A 200 OK status confirms the data was successfully retrieved.

![image](https://github.com/user-attachments/assets/696ca054-6244-4ff9-a905-4b985f7c05c3)


	1.	This is a PUT API used to update movie ticket details.
	2.	The request is sent to localhost:8080/ticket/update.
	3.	It updates the ticket with ID 2 using the new movie data in JSON.
	4.	A 200 OK response means the update was successful.

![image](https://github.com/user-attachments/assets/76811d41-8a1b-4965-8fdb-6a4f56662953)

	1.	This is a DELETE API used to remove a movie ticket from the system.
	2.	The request URL is localhost:8080/ticket/movie/3.
	3.	It deletes the movie ticket with ID 3.
	4.	A 200 OK response confirms the ticket was deleted successfully.

![image](https://github.com/user-attachments/assets/e08a0ce1-f5a7-48d1-b18c-748fb1367324)





