# Bitcoin Mining Simulator in Java

This is a simple Java program that simulates Bitcoin mining. It generates random numbers and if the sum of two numbers is close to 1, it increments the Bitcoin count.

## How it works

1. **Creating Random and Scanner objects**: The program starts by creating a `Random` object for generating random numbers and a `Scanner` object for reading input from the console.

2. **User input**: The program asks the user to enter the time they want to wait for mining Bitcoins.

3. **Initializing variables**: The program initializes a variable to keep track of the number of Bitcoins found and gets the current time in milliseconds.

4. **Mining loop**: The program enters a loop that continues until the specified time by the user has passed. Inside the loop, the program generates a random number. If the absolute difference between this number and 1 is less than 0.01, the program increments the Bitcoin count by a random value multiplied by 2.

5. **Displaying results**: The program displays the number of Bitcoins found so far.

6. **Closing the Scanner**: Finally, the program closes the `Scanner` object.
