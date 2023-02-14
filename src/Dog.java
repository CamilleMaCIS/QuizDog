public class Dog {
    //3 instance variables
    private int age;
    private String name;
    private String color;

    //2 constructors

    public Dog(){
        this.age = 0;
        this.name = "";
        this.color = "";
    }
    public Dog(String name, int age, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    //methods

    //getter for each instance variable
    public int getAge() {
        return this.age;
    }
    public String getColor(){
        return this.color;
    }
    public String getName(){
        return this.name;
    }

    //setter for each instance variable
    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void addOneAge(){
        this.age ++;
    }
    public int birthday(){
        addOneAge();
        return this.age;
    }
    public String toString(){
        return "The dog is named " + this.name + " and is " + this.age + " years old. This dog is " + this.color + ".";
    }
}
