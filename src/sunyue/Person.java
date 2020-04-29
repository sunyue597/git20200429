package sunyue;

public class Person implements ZhuLei{

    private int id;
    private String name;
    public Person() {

    }
    private void siyou(String name){
        System.out.println("dsgdfgdfg0"+name);
    }
    private Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void test() {
        System.out.println("Test....");
    }
}
