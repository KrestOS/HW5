package HW5;

public class Main {
    public static void main(String[] args) {
        Staff[] staffArr = new Staff[5];
        staffArr[0] = new Staff("Ivan Ivanovich Ivanov", "Engineer", "ivanov@mail.com", 89995353, 30000, 25);
        staffArr[1] = new Staff("Petr Petrovich Petrov", "Senior engineer", "Petrov@mail.com", 89995354, 50000, 35);
        staffArr[2] = new Staff("Vasili Vasil`evich Vasiliev", "Main engineer", "Vasiliev@mail.com", 89995355, 70000, 45);
        staffArr[3] = new Staff("Alexandr Alexandrovich Alexandrov", "Engineer", "Alexandrov@mail.com", 89995356, 30000, 27);
        staffArr[4] = new Staff("Ivan Petrovich Vasiliev", "Lead engineer", "LeadVasiliev@mail.com", 89995555, 100000, 55);

        /*Печать всех сотрудников
        for (Staff staff: staffArr){
            staff.info();
        }*/

        //Печать сотрудников старше 40
        System.out.println("\nСотрудники старше 40:");
        for (int i = 0; i < staffArr.length; i++){

            if (staffArr[i].getAge() > 40){
                staffArr[i].info();
            }
        }
    }

}
