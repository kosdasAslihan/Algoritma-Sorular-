package AlgoritmaSorulari;

public class HavayoluCustomer {
    private String name;
    private String surname;
    private int age;
    private City goalCity;
    private double ticketCost;

    private int direction;
    public HavayoluCustomer() {

    }

    public HavayoluCustomer(String name, String surname, int age, City goalCity, double ticketCost, int direction) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.goalCity = goalCity;
        this.ticketCost = ticketCost;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public City getGoalCity() {
        return goalCity;
    }

    public void setGoalCity(City goalCity) {
        this.goalCity = goalCity;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "HavayoluCustomer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", goalCity=" + goalCity +
                ", ticketCost=" + ticketCost +
                '}';
    }
}
