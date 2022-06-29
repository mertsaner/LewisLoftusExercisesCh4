public class Kennel {               //Driver Class where we create objects
    public static void main(String[] args) {


    }
}


class Dog(){           //Other Class where we define getters,setters, toString Methods

    private String name;
    private int age;

        public Dog(String dogName, int dogAge){
            name = dogName;
            age = dogAge;
        }



        //COMMENT about getter, setters: //Set plays some role in the change of the object
        //While get(return) just return to that value of the object;
        //Basically GET = GETS THE VALUE
        //SET = SET THE VALUE SOMETHING ELSE

    public int getAge(){        //get the age of the dog hence returns to age
        return age;
    }

    public void setAge(){       //Changes the age of the dog hence return nothing
        age++;
    }

    public int getName(){        //get the name of the dog hence returns to age
        return name;
    }
    public void setName(){       //Changes the name of the dog hence return nothing
        name = " new Name";
    }


    public int personYears(){
        int personAge = age * 7; //Age of the person equals 7 times more of dog's age
    }



}



