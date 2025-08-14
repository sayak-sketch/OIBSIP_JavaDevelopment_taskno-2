# TASK 2
# Number Guessing Game 
# Created under the internship of OASIS INFOBYTE by SAYAK MUKHERJEE.
A simple yet engaging console-based Number Guessing Game implemented in Java. The game challenges players to guess a secret number within a given range, providing hints along the way.

Game Overview
This is a classic "Guess the Number" game where the computer generates a random number, and the player attempts to guess it within a limited number of attempts. The game offers helpful feedback after each guess, indicating whether the guess was too high, too low, or just right. It also incorporates features like multiple rounds and a scoring system to enhance the gameplay experience.

Features:
Random Number Generation: The system generates a random number between 1 and 100 for each round.

Intelligent Hints: Provides nuanced feedback on your guesses:

"Too high!" / "Too low!" (for significant differences)

"High." / "Low." (for moderate differences)

"A little bit high." / "A little bit low." (for close guesses)

Limited Attempts: Players have a predefined number of attempts (default: 10) to guess the correct number.

Multiple Rounds: Option to play multiple rounds to challenge yourself further.

Scoring System: Points are awarded based on the number of attempts taken in each round (fewer attempts = higher score). A total score is maintained across all rounds.

Input Validation: Handles invalid input gracefully, prompting the user for correct entries.

How to Play
The computer will choose a secret number between 1 and 100.

You will be prompted to enter your guess.

After each guess, you'll receive a hint: "Too high!", "High.", "A little bit high.", "Too low!", "Low.", or "A little bit low."

Keep guessing based on the hints until you find the number or run out of attempts.

At the end of each round, your score will be displayed, and you'll have the option to play again.

Installation and Setup
To run this game on your local machine, you need to have Java Development Kit (JDK) installed.

Prerequisites
Java Development Kit (JDK): Version 8 or higher is recommended. You can download it from Oracle or Adoptium (OpenJDK).

Steps to Run
Clone or Download the Repository:
If using Git:

Bash:

git clone https://github.com/sayak-sketch/OIBSIP_JavaDevelopment_taskno-2.git

cd number-guessing-game

Alternatively, you can download the .zip file and extract it.

Navigate to the Project Directory:
Open your terminal or command prompt and navigate to the directory where you saved NumberGuessingGame.java.

Bash:

cd path/to/NumberGuessingGame

(Replace path/to/NumberGuessingGame with the actual path)

Compile the Java Code:
Use the Java compiler (javac) to compile the source file. If you compiled with a newer JDK and are running on an older JRE, you might need to specify the target version:

Bash

### For modern Java versions (recommended if your JRE matches your JDK)
javac NumberGuessingGame.java

### If you need to compile for compatibility with an older JRE (e.g., Java 8)
### Make sure your current JDK is capable of targeting Java 8 (e.g., JDK 8 or newer)
javac -source 8 -target 8 NumberGuessingGame.java

# Run the Game:

Execute the compiled Java class file:

Bash:

java NumberGuessingGame


## Configuration:
You can easily modify game parameters by changing the final int constants in the NumberGuessingGame.java file:

maxAttempts: Defines the maximum number of guesses allowed per round.

SIGNIFICANT_DIFFERENCE: Sets the threshold for "too high" / "too low" hints.

MODERATE_DIFFERENCE: Sets the threshold for "high" / "low" hints.



