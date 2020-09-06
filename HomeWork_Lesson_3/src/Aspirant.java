public class Aspirant extends Student {
    private String scientificWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
    public Aspirant() {
    }
    public Aspirant(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
    public String getScientificWork() {
        return scientificWork;
    }
    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }
    @Override
    public int getScholarShip() {
        if(getAverageMark() == 5){
            return 200;
        }else return 180;
    }
}
