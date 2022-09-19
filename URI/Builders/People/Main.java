package URI.Builders.People;

public class Main{

	public static void main(String[] args) {
           
        Person main1 = new Person();
        
        Person p1 = new Person("Fernanda", 23, 73.5f, 1.80f, "Female");
        Person p2 = new Person("Julia", 45, 68.7f, 1.75f, "Female");
        Person p3 = new Person("Maria", 19, 63.3f, 1.73f, "Female");
        Person p4 = new Person("João", 05, 48.2f, 1.57f, "Male");
        Person p5 = new Person("Lucas", 12, 56.0f, 1.65f, "Male");


        System.out.println("Name:" + p1.name + "Age:" + p1.age + "Weight:" + p1.weight + "Heigt:" + p1.heigt + "Gender:" + p1.gender) ;
        System.out.println("Name:" + p2.name + "Age:" + p2.age + "Weight:" + p2.weight + "Heigt:" + p2.heigt + "Gender:" + p2.gender) ;
        System.out.println("Name:" + p3.name + "Age:" + p3.age + "Weight:" + p3.weight + "Heigt:" + p3.heigt + "Gender:" + p3.gender) ;
        System.out.println("Name:" + p4.name + "Age:" + p4.age + "Weight:" + p4.weight + "Heigt:" + p4.heigt + "Gender:" + p4.gender) ;
        System.out.println("Name:" + p5.name + "Age:" + p5.age + "Weight:" + p5.weight + "Heigt:" + p5.heigt + "Gender:" + p5.gender) ;
        
                   
        }
}
