# Software Principles - Sorting Example

## Problem: Sorting an Array of Integers

The problem is to sort an array of integers. Sorting is a very common operation in programming, and it can be performed using different techniques or algorithms. In this project, we will demonstrate two ways to solve this problem:

1. **With KISS Principle** - Using Java's built-in `Arrays.sort()` method to sort the array.
2. **Without KISS Principle** - Using a custom sorting algorithm, namely **Bubble Sort**, to sort the array manually.

## What is the KISS Principle?

The **KISS Principle** stands for "Keep It Simple, Stupid." It suggests that systems and solutions should be as simple as possible. In this case, the built-in `Arrays.sort()` method is the simpler and more efficient approach, as it does not require any complex logic or additional code. It is straightforward and optimized for performance.

### How the KISS Principle is Applied

- **With the KISS principle applied**: We use the built-in `Arrays.sort()` method, which is simple to implement, efficient, and optimized for general use.
- **Without the KISS principle applied**: We implement a manual sorting algorithm, Bubble Sort, which involves writing more code and is less efficient compared to the built-in solution.

### Project Structure

- **`src/withprinciple/`**: Contains the object-oriented solution where the KISS principle is applied by using the built-in `Arrays.sort()` method.
  - **`BuiltInSortExample.java`**: Demonstrates the sorting using the built-in `Arrays.sort()` method (KISS principle applied).
  
- **`src/withoutprinciple/`**: Contains the object-oriented solution where the KISS principle is not applied, and the Bubble Sort algorithm is used manually.
  - **`BubbleSortExample.java`**: Demonstrates sorting using the Bubble Sort algorithm (without the KISS principle applied).

### How to Run the Code

1. Clone this repository to your local machine.
2. Open the project in Visual Studio Code (VS Code).
3. Open the `Run and Debug` section on the left and choose one of the configurations:
   - `Launch BuiltInSortExample` (Using built-in `Arrays.sort()`).
   - `Launch BubbleSortExample` (Using manual Bubble Sort).
4. Click **Run** to execute the program and see the sorting results.

### Conclusion

The **KISS principle** promotes simplicity in design and implementation. By using the built-in `Arrays.sort()` method, we save time, effort, and resources while ensuring efficiency. The Bubble Sort implementation, although functional, is more complex and inefficient for larger datasets.

