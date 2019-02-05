# KotlinNumberGuess

Simple Android App used for the AperiCode in Feb, the 5h 2019. See https://www.meetup.com/it-IT/GDG-Pescara/events/258384797/ for more informations.

How the App should work:
- the App generates a random number, from 1 to 10;
- the App asks for a number, from 1 to 10;
- the number is checked, and the App shows an error if the user inputs a number that is out of range;
- if the user guesses the right number, the App shows a message, tells how many attempts it took to guess the right number and generates a new number;
- if the user does not guess the right number, the App shows an error message and increment the count of wrong guesses.

The App must be written solely in Kotlin and should use a ViewModel to hold the generated number and the count of wrong guesses.
