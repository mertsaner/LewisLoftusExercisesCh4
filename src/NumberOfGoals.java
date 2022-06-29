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
        Goals goal1, goal2;
        int sum;                        //Number of Goals scored declared

        goal1 = new Goals (); // Creating new Goals object (named object1) from Die Class
        goal2 = new Goals (); // Creating new Goals object (named object1) from Die Class


        //goal1.comboGoal();
        //goal1.goalMaker();
        goal2.setGoals(12);

        System.out.println("Goal1: " + goal1);
        System.out.println("Goal2: " + goal2);

        sum = goal1.getGoals() + goal2.getGoals();
        System.out.println("Sum of the Goals: " + sum);

        System.out.println("Goalmaker function called!");
        sum = goal1.goalMaker() + goal2.goalMaker();
        System.out.println("Goal1: " + goal1);
        System.out.println("Goal2: " + goal2);
        System.out.println("New sum: " + sum);

    }
}

class Goals {

    private int currentGoal; // current value showing number of goals made

    public Goals(){
        currentGoal = 0;        //Starting value goal number in the match
                                //Constructor of the class works as an initializer
    }

    public int comboGoal() {
        currentGoal = currentGoal + 5;
        return currentGoal;
    }

    public int goalMaker() {
        currentGoal++;
        return currentGoal;
    }


    public void setGoals(int value) {
        currentGoal = value;
    }

    public int getGoals() {
        return currentGoal;
    }

    public String toString()
    {

        String result = Integer.toString(currentGoal);
        return result;
    }
}