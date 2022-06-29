public class ShelfCheck {       //driver Class which hosts Main function

    public static void main( String [] args){

    Shelf shelf1, shelf2,shelf3;

    shelf1 = new Shelf(1, 8, 15, false);
    shelf2 = new Shelf(5, 2, 10, false);
    shelf3 = new Shelf(4, 7, 12, false);


    shelf1.setHeight(111111);
    shelf2.setWidth(222222);
    shelf3.setCapacity(33333);

    shelf1.setOccupied(true);
    shelf2.setOccupied(true);
    shelf3.setOccupied(true);



        System.out.println("Shelf1;" + shelf1);
    System.out.println("Shelf2;" + shelf2);
    System.out.println("Shelf3;" + shelf3);

    }
}

class Shelf{

    //Instance Data Declarations
    //Each object of Shelf class will have these four specifications
    private double height;
    private double width;
    private double capacity;
    private Boolean occupied;

    public Shelf( double height, double width, double capacity, Boolean occupied){
        this.height = height;
        this.width = width;
        this.capacity = capacity;
        this.occupied = false;
    }


    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getCapacity(){
        return capacity;
    }
    public boolean getOccupied(){
        return occupied;
    }


    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setCapacity(double capacity){
        this.capacity = capacity;
    }
    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }

    public String toString(){
        String result = "Height: " + getHeight() + ", Width: " + getWidth() + ", Capacity: " + getCapacity() + ", Occupied: " + getOccupied();
        return result;
    }
}
