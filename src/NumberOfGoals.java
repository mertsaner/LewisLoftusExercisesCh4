/**    Answer based on the Question : Write a class called NumberOfGoals that represents the total number of goals
*      scored by a football team. The NumberOfGoals class should contain a
*      single integer as instance data, represent- ing the number of goals
        scored. Write a constructor to initialize the number of goals to zero.
        Write a method called setGoal that increments the value by one
        whenever a goal is scored,
        and another method called getGoal that returns the total number of
        goals scored so far. Finally, create a driver class called GoalTracker
        that creates a few NumberOfGoals objects and tests their methods.
 @author mertsaner
*/

public class NumberOfGoals {

    static int goalsScored = 0;

    public static int getGoal() {
        return goalsScored;
    }
    public void GoalTracker() {
        NumberOfGoals firstObject = new NumberOfGoals();
        NumberOfGoals secondObject = new NumberOfGoals();
    }
}