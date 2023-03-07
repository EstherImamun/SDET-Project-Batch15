package Class30.HomeWork;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name,String lastName,int age,int salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public int getSalary() {
        return salary;
    }
    public void printDetails(){
        System.out.println("Name : "+name+"Lastname : "+lastName+"Age : "+age+"Salary : "+salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

