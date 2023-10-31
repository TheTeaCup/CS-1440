public class Demo {
    public static void main(String[] args) {
        Student tim = new Student("900", "Tim");
        System.out.println(tim);
        System.out.println("Ordinal for Tim: " + tim.getYear().ordinal());

        Student taylor = new Student("901", "Taylor", StudentYear.JUNIOR);
        System.out.println(taylor);
        System.out.println("Ordinal for Taylor: " + taylor.getYear().ordinal());

        StudentYear timYear = tim.getYear();
        StudentYear taylorYear = taylor.getYear();
        if (timYear.equals(taylorYear)) {
            System.out.println("They are in the same year!");
        } else if (timYear.compareTo(taylorYear) > 0) {
            System.out.println("Tim is closer to graduating!");
        } else {
            System.out.println("Taylor is closer to graduating!");
        }

        switch (taylorYear) {
            case FRESHMAN:
                System.out.println("Taylor is a first-year student");
                break;

            case SOPHOMORE:
                System.out.println("Taylor is a second-year student");
                break;

            case JUNIOR:
                System.out.println("Taylor is a third-year student");
                break;

            case SENIOR:
                System.out.println("Taylor is a fourth-year student");
                break;

            case GRADUATE:
                System.out.println("Taylor is a graduate student");
                break;
        }
    }
}
