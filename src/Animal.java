public class Animal {
    private String name;
    private Integer age;

    Animal(String _name, Integer _age){
        name = _name;
        age = _age;
    }
    String getName(){
        return name;
    }
    Integer returnAge(){
        return age;
    }
}
