/*
 It is a simple Java program demonstrating 
 control flow statements using 
IF-Else.
 */
class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }
    }
}
// Output: a is greater than b

/*
 FOR LOOP
 */
class forloop{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
// Output: Iteration: 1....5

/*
 * WHILE LOOP
 */
class whileloop{
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
    }
}
// Output: Count: 1...5

/*
 * DO-WHILE LOOP
 */
class dowhileloop{
    public static void main(String[] args) {
        int number = 1;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 5);
    }
}
// Output: Number: 1...5

/*
 * SWITCH STATEMENT
 */
class switchstatement{
    public static void main(String[] args) {
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day: " + dayName);
    }
}
// Output: Day: Wednesday

/*
 * BREAK STATEMENT
 */
class breakstatement{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("i: " + i);
        }
    }
}
// Output: i: 1...4

/*
 * CONTINUE STATEMENT
 */
class continuestatement{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("i: " + i);
        }
    }
}
// Output: i: 1,3,5,7,9

/*
 * NESTED IF-ELSE
 */
class nestedifelse{
    public static void main(String[] args) {
        int num = 15;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is a positive even number.");
            } else {
                System.out.println(num + " is a positive odd number.");
            }
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
// Output: 15 is a positive odd number.

