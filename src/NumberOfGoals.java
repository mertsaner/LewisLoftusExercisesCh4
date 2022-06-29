/**Answer based on the Question: Write a class called NumberOfGoals that represents
 * the total number of goals scored by a football team. The NumberOfGoals class should contain a
*      single integer as instance data, representing the number of goals
        scored. Write a constructor to initialize the number of goals to zero.
        Write a method called setGoal that increments the value by one
        whenever a goal is scored,
        and another method called getGoal that returns the total number of
        goals scored so far. Finally, create a driver class called GoalTracker
        that creates a few NumberOfGoals objects and tests their methods.
 @author mertsaner
*/

public class NumberOfGoals {

    //------------------------------------------------------------------------------
    // Creates two Goals object and make them goal several times
    //------------------------------------------------------------------------------

    public static void main(String[] args) {
        GoalTracker goal1, goal2;
        int sum;                        //Number of Goals scored declared

        goal1 = new GoalTracker (); // Creating new Goals object (named object1) from Die Class
        goal2 = new GoalTracker (); // Creating new Goals object (named object1) from Die Class


        //goal1.comboGoal();
        //goal1.goalMaker();

        System.out.println("Goal1: " + goal1);      //This kind of direct value of object printing possible
        System.out.println("Goal2: " + goal2);      // THANKS TO toString() method defined line 68

        sum = goal1.getGoal() + goal2.getGoal();
        System.out.println("Sum of the Goals: " + sum);

        System.out.println("set Goalfunction called!");
        goal1.setGoal();
        goal2.setGoal();
        sum = goal1.getGoal() + goal2.getGoal();
        System.out.println("Goal1: " + goal1);
        System.out.println("Goal2: " + goal2);
        System.out.println("New sum: " + sum);
    }
}

class GoalTracker {     //Driver Class

    private int currentGoal; // varibale shows current value of goals made

    public GoalTracker(){
        currentGoal = 0;        //Starting value goal number in the match
                                //Constructor of the class works as an initializer
    }

    public int comboGoal() {
        currentGoal = currentGoal + 5;
        return currentGoal;
    }

    public void setGoal() {
        currentGoal++;
    }

    public int getGoal() {
        return currentGoal;
    }

    public String toString()     //Without this method printing objects will just print their addresses instead of their values
    {

        String result = Integer.toString(currentGoal);
        return result;
    }
}