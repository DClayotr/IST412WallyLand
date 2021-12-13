Ticket Purchasing use case
For this use case, we focused on the Ticket package. As such, only the Ticket package is complete at this stage in the development process. Users can see the available tickets at the park, sort them by "Single", "Three person", or "Five person" tickets easily 
with a search button and checkboxes, then click on the purchase button to add the tickets to their list. Once purchased, users can click the "Show Tickets" button to view
their tickets. The ticket package was important to finalize first, since the ticket framework might serve as the basis for restaurant reservations and will also serve as 
data to be provided to the daily planner.

Ride wait time use case
The second use case involved being able to update the ride times and whether or not the ride is currently operating to give the user the most accurate information. 
The user should be able to view the rides and their current wait times, and employees are able to directly update the wait times on the screen by selecting the ride and 
changing the wait time, then pressing the update button. 

Restaurant Reservation use case
The third use case is restaurant reservations. Users can browse the restaurant options available at Walley Land. They can see the restaurant name and a short description of 
each one. If the user wants to make a reservation at a specific restaurant they can click the make reservation button. The user is brought to a reservation form 
to fill out. The form includes a drop down for the restaurant names and the dates/times that are available (fill in the blank - user interface design). Once the user fills 
out the form a reservation object is created. It is then added to etiher the Walley Land OG, Floor 2, Park Lounge, WL Club list of reservations. Each restaurant list extends 
an abstract reservation list class (abstract factory method). In each of these restaurant reservation classes they will have an addRes() method that will override the abstract method. 
This will allow each restaurant to have their own arraylist of reservations. This makes sense for this design because it is much simpler, faster, and more organized. Now when users are 
trying to see if the reservation they want is available the program will be able to look at an arraylist of all the same type of reservation rather than have to sort from a list of mixed 
restaurant reservations.

Planer use case 
The fourth and final use case of our project is the daily planner. Users can add events to their planner with a name of the event and time of the event. They can edit information, save data, create new events, and delete old events. 
The system prompts users to add new events and also allows them to cycle through all their events with “Previous” and “Next” buttons. When the user wants to check what events they’ve added to their planner, they can view them with the “View” button.
