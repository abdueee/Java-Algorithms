# Java Algorithms Test Repository

## Overview

This repository contains a comprehensive test suite for evaluating a selection of algorithms from the well-known TheAlgorithms/Java repository. Our project focuses on rigorously testing the design, effectiveness, and real-world applicability of these algorithms using a variety of testing methodologies learned during the Distributed Cloud Computing course (COE 891) at [University Name].

## Project Scope

The tests cover a diverse range of algorithms, including string manipulation, search operations, mathematical calculations, and sorting mechanisms. Specific algorithms tested include:

String Algorithms: checkVowels, checkAnagram, convertUpperLetter, validParentheses
Search Algorithms: binarySearch, perfectBinarySearch, KMPsearch
Math Algorithms: ceil, floor, findMax, findMin, factorial, average, volume

## Testing Methodologies

This project utilizes the following testing approaches:

Input Space Partitioning - Testing different classifications of input data, focusing on edge/boundary conditions.
Graph-Based Testing - Analyzing control flow graphs to ensure all logical paths are tested.
Logic Coverage - Ensuring that each logical condition within the code is executed both true and false.
Mutation Testing - Modifying the code to check the robustness of existing test cases and improve the mutation score.


## Tools Used
JUnit 4: For creating and managing unit tests.
Pit Mutation Testing: Employed to assess the quality of test cases by introducing mutations to the code.
Clover: Used for analyzing logic coverage of the classes.

## Results
The testing revealed various insights into the algorithmic efficiency and exposed some minor bugs and performance issues which have been documented in the final report due for submission. For detailed results and insights from each testing methodology, please reach out privately.

## Getting Started
### Prerequisites

Java JDK 11 or later
Eclipse IDE with JUnit and PIT Mutation Testing plugins installed

### Running Tests
To run the tests locally:

Clone the repository:
bash
Copy code
git clone https://github.com/your-username/java-algorithms-test.git
Open the project in Eclipse.
Run the test suite using JUnit test runner.

## Contributions
We welcome contributions, especially in the form of additional test cases or improvements to existing ones. Please submit a pull request or open an issue if you have suggestions.

## Team
Abdul Mohammed
Ishan Parikh
Dev Kaneria
Hana Gorikhan

## License
Distributed under the MIT License. See LICENSE for more information.
