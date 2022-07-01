public class BarChart {

    //First make it work on
    private String heading;
    private int columnNumber;
    private int rowNumber;
    private int numOfFilledDataItems;

    public BarChart (String heading, int columnNumber, int rowNumber, int numOfFilledDataItems) {
        this.heading = heading;
        this.columnNumber = columnNumber;
        this.rowNumber = rowNumber;
        this.numOfFilledDataItems = numOfFilledDataItems;
    }

    //==========================================
    // Accessors
    public String getHeading(){
        return heading;
    }

    public int getColumnNumber(){
        return columnNumber;
    }

    public int getRowNumber(){
        return rowNumber;
    }

    public int getNumOfFilledDataItems(){
        return numOfFilledDataItems;
    }

    //==========================================
    //Mutators

    public void setHeading(String heading){
        this.heading = heading;
    }

    public void setColumnNumber(int columnNumber){
        this.columnNumber = columnNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setNumOfDataItems(int numOfFilledDataItems){
        this.numOfFilledDataItems = numOfFilledDataItems;
    }

    public String toString(){
        String result = "Heading: " + getHeading() + ", Column Numbers: " + getColumnNumber() + ", Row Number: " + getRowNumber() + ", Number of Filled Data Items: " + getNumOfFilledDataItems();
        return result;
    }
}