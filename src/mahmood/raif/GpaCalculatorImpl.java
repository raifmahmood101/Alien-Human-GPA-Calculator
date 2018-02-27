package mahmood.raif;

public class GpaCalculatorImpl implements GpaCalculator  {
    String [] grade = new String[1];

    @Override
    public void setNumberOfClasses(int classesTaken) {
        grade = new String [classesTaken];

    }

    @Override
    public void setGrade(int classPeriod, String classGrade) {
        grade[classPeriod] = classGrade;

    }

    @Override
    public double calculateGpa() {
        int minimum = 0;
        for(int i = 0; i < grade.length; i++) {

            int dec;

            if (grade[i].equals ("A") || grade[i].equals ("a")){
                dec = 4;
                minimum += dec;

            }
            else if (grade[i].equals ("B") || grade[i].equals ("b")){
                dec = 3;
                minimum += dec;

            }
            else if (grade[i].equals ("C") || grade[i].equals ("c")){
                dec = 2;
                minimum += dec;

            }
            else if (grade[i].equals ("D") || grade[i].equals ("d")){
                dec = 1;
                minimum += dec;

            }
            else if (grade[i].equals ("E") || grade[i].equals ("e")){
                dec = 0;
                minimum += dec; }}
            double averageGPA = (double)minimum/(double)grade.length;
            return averageGPA;
    }
}
