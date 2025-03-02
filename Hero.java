public class Hero implements Comparable<Hero>{

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Hero that) {
        return this.getName().compareTo(that.name);
    	
    }
    
}