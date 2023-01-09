import java.io.*;

public class Person {
    String name;
    String surname;
    double height;
    int age;
    public String getName(){return name;}
    public void setName(String N) {
        this.name = N;
    }
    public String getSurname(){return surname;}
    public void setSurname(String S) {
        this.surname = S;
    }
    public double getHeight(){return height;}
    public void setHeight(double H){
        this.height = H;
    }
    public int getAge(){return age;}
    public void setAge(int A){
        this.age = A;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
