
# SkillBuilder5 - Loops and Arrays

The `SkillBuilder5` class contains methods that allow you to:

1. Simulate a game of craps with the `playCraps()` method.
2. Generate Pascal's Triangle up to a specified number of rows with the `pascalsTriangle()` method.

## Import Statements

```java
import java.util.Random;
```

This import allows the use of the `Random` class, which is used to simulate dice rolls in the `playCraps()` method.

## Methods Overview

### 1. `playCraps()`

Simulates a game of craps. The game involves rolling two six-sided dice and calculating the sum of their values. The rules are as follows:

- If the initial roll is 7 or 11, the player wins.
- If the initial roll is 2, 3, or 12, the player loses.
- For any other result, the player continues rolling until they roll either a 7 or 11 (a loss) or the initial value (a win).

**Method Signature:**

```java
public static boolean playCraps()
```

**Returns:**

- `true` if the player wins.
- `false` if the player loses.

**Example Usage:**

```java
public class SkillBuilder5Runner {
    public static void main(String[] args) {
        // Test playCraps method
        boolean result = SkillBuilder5.playCraps();
        System.out.println("Result of playing craps: " + (result ? "Win" : "Lose"));
    }
}

```

The output for `playCraps()` will be either "Win" or "Lose" depending on the game's result.

**Explanation:**

The method uses a static variable of type `Random`.  Since this is a static variable, it can be initialized outside of any method and at the beginning of the `SkillBuilder5` class.  Static variables are intialized once when the first `SkillBuilder5` object is created.  In this case, the `rand` static variable is a `Random` variable seeded with 17. This seed will produce the same sequence of dice rolls each time the program is executed.

<div style="background-color:pink; color:red; padding: 10px; border-radius:10px; border:1px solid gray;">
DO NOT MODIFY the line containing the static Random variable <code>rand</code> or your code will never pass the test.
</div>

### 2. `pascalsTriangle(int numOfRows)`

This method generates Pascal's Triangle up to `numOfRows` rows and returns it as a formatted string. It uses `generateLevel()` to calculate each row and `generateLevelString()` to format each row.

**Method Signature:**

```java
public static String pascalsTriangle(int numOfRows)
```

**Parameters:**

- `numOfRows `: The number of rows of Pascal's Triangle to generate.

**Returns:**

- A formatted string representing Pascal's Triangle up to `numOfRows ` rows.

**Example Usage:**

```java
String triangle = SkillBuilder5.pascalsTriangle(3);
System.out.println(triangle);
```

**Expected Output**

```
           1         
     1         1         
1         2         1         
```

**Explanation:**

For each level from 0 to `numOfRows`, `pascalsTriangle()` generates the appropriate row in Pascal's Triangle and appends the formatted string for that row to the result.


#### a. `generateLevel(int level, int[] a)`

This helper method calculates the values for each level of Pascal's Triangle. For a given level, it updates the elements in the array `a` to reflect Pascal’s Triangle values.

**Method Signature:**

```java
private static void generateLevel(int level, int[] a)
```

**Parameters:**

- `level`: The current level (row) of Pascal's Triangle to generate.
- `a`: The array representing values in Pascal's Triangle for each level.

**Example Usage:**

This method is used internally by `pascalsTriangle()` to generate each level of Pascal's Triangle.

#### b. `generateLevelString(int level, int[] a)`

This helper method formats the values in Pascal's Triangle for a specified level and returns it as a formatted string.

**Method Signature:**

```java
private static String generateLevelString(int level, int[] a)
```

**Parameters:**

- `level`: The current level of Pascal's Triangle.
- `a`: The array containing Pascal’s Triangle values up to the current level.  


**Returns:**

- A formatted string representing Pascal's Triangle for the specified level.

<div style="background-color:#66ee66; color:black; padding: 10px; border-radius:10px; border:1px solid gray;">
Use <code>String.format()</code> to format the string.  Use the formating field <code>%-5d</code> for integers and <code>%-5s</code>.  This will make sure to place values left justified within a field of width 5.
</div>

**Example Usage:**

This method is also used internally by `pascalsTriangle()` to format each level of Pascal's Triangle.

<h2 style="color:red;">Requirement</h2>

<p style="color:red;">
You MUST use the <code>generateLevelString</code> and <code>generateLevel</code> methods in the <code>pascalsTriangle</code> method.
</p>

---

## Example Program

```java
public class SkillBuilder5Runner {
    public static void main(String[] args) {
        String triangle = SkillBuilder5.pascalsTriangle(5);
        System.out.println(triangle);
    }
}
```

**Expected Output:**
 `pascalsTriangle(6)` will print the first 6 rows of Pascal’s Triangle in a formatted layout.
 
 ```
                          1         
                    1         1         
               1         2         1         
          1         3         3         1         
     1         4         6         4         1         
1         5         10        10        5         1         
 ```
 
<div style="background-color:pink; color:red; padding: 10px; border-radius:10px; border:1px solid gray;">
<strong>NOTE:</strong> the method <code>pascalsTriangle</code> returns a string, which when printed results in the output shown above.
</div>