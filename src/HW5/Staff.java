package HW5;

public class Staff {
    //ФИО, должность, email, телефон, зарплата, возраст;
    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int pay;
    private int age;

    public Staff(String fullName, String position, String email, int phoneNumber, int pay, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
    }

    /**
     * Форматированная печать списка
     */
    public void info(){
        System.out.printf("Name: %s\n Position: %s Email: %s Phone Number: %d Pay:  %d Age: %d\n",fullName,position,email,phoneNumber,pay,age);
    }

    /**
     * Возвращает значение возраста
     * @return age
     */
    public int getAge() {
        return age;
    }
}
