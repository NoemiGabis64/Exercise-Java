package URI.Builders.People;

/**People construtor*/

public class Person{

    String name;
    int age = 0;
    float weight = 0;
    float heigt = 0;
    String gender;

    public Person () { 

    }

    public Person(String name, int age, float weight, float heigt, String gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.heigt = heigt;
        this.gender = gender;
    } 
    
}