# Java Works

A collection of Java coursework and algorithm exercises, built for BSCS coursework. Includes standalone algorithm implementations, a small Swing GUI app, a threading example, and school activity submissions organized by exam period.

## Requirements

- JDK 8 or newer
- No external libraries required
- Most files were authored in NetBeans (some retain NetBeans project comments/templates), but they're plain `.java` files and can be compiled/run with any standard JDK toolchain

## Projects

### Algorithms

| Project | Description |
|---|---|
| [`Greedy_Algorithm_Approach/`](Greedy_Algorithm_Approach) | Four greedy-algorithm exercises: Huffman encoding (`HuffmanEncoding.java`), minimum refueling stops for a trip (`MinRefuelStops.java`), a road network problem (`RoadNetwork.java`), and shortest delivery route (`ShortestDelivery.java`). |
| [`Permutation_and_Combination_Systems/`](Permutation_and_Combination_Systems) | A Swing GUI app (`MainApp.java`) that calculates linear, circular, truncated, and repeated permutations, and combinations, delegating each calculation to its own class (`LinearPermutation`, `CircularPermutation`, `TruncatedPermutation`, `PermutationWithRepeats`, `RepeatedPermutation`, `Combination`). |
| [`Thread-Sample/`](Thread-Sample) | A minimal example of Java threading — a `Thread` subclass that prints numbers, demonstrating `run()`/thread basics. |

### School Activities

| Folder | Covers |
|---|---|
| [`School-Activities/Prelim/`](School-Activities/Prelim) | Prelim-period activities, quizzes, exams, and self-assessments. |
| [`School-Activities/Midterm/`](School-Activities/Midterm) | Midterm-period activities and exams, including salary calculation exercises (`SalaryCalculations.java`, `SalaryOfEmployee.java`) and a `User` class exercise. |
| [`School-Activities/Semi-Final/`](School-Activities/Semi-Final) | Semi-final activities, quizzes, and exams, including two small Swing GUI apps (a bank account form and a salary GUI) plus console exercises. |

## Running

Most projects are single-file console programs. Compile and run directly:

```bash
javac ClassName.java
java ClassName
```

For the Swing GUI apps (`MainApp.java`, `BankJFrame.java`, `GUISalary.java`, `NewJFrame.java`, `SalesForm.java`, `SemiFinalExamination.java`), compile all `.java` files in that folder together, then run the class containing `main`:

```bash
javac *.java
java MainApp
```

> `.form` files are NetBeans GUI layout files — the app still runs fine outside NetBeans since the layout is compiled into the paired `.java` file.

## Getting Started

```bash
git clone https://github.com/KBJOwen29/Java-Works.git
cd Java-Works
```

Then navigate into the folder for the project you want and compile/run as above
