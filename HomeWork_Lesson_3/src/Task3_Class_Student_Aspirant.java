public class Task3_Class_Student_Aspirant {
    public static void main(String[] args) {
        Student student = new Aspirant();
        Student[] arrStudent = new Student[]{new Student("Bob", "Hunt","Java programmer", 5), new Aspirant("Jack", "Brown", "Python programmer", 4.5),
                new Aspirant("William", "Smith", "C# programmer",5), new Student("Tom","Miller","psychology", 4.1)};
        for (Student stdnt:arrStudent) {
            System.out.println("Сумма степендии студента: " + stdnt.getFirstNameAndLastName() + " " + stdnt.getScholarShip());
        }
    }
}
