public class BarChartDriver {       //Driver Class
    // Driver class will instantiate the BarChart Class
    // It will initialize the BarChart objects and will do them in Main Method


    public static void main (String [] args) {


        BarChart bar1, bar2;

        bar1 = new BarChart("Bar Chart of Sales", 150, 100, 15000);
        bar2 = new BarChart("Chart of Outsourcing orders", 10, 50, 40);


        System.out.println("Specs of first bar chart: " + bar1);
        System.out.println("Specs of second bar chart: " + bar2);

    }
}