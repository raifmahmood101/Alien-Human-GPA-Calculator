package mahmood.raif;

public class AlienCalculatorGpaImpls implements GpaCalculator  {
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

            if (grade[i].equals (";)") || grade[i].equals (";(")){
                dec = 4;
                minimum += dec;

            }
            else if (grade[i].equals (":)") || grade[i].equals (":(")){
                dec = 3;
                minimum += dec;

            }
            else if (grade[i].equals ("*)") || grade[i].equals ("*(")){
                dec = 2;
                minimum += dec;

            }
            else if (grade[i].equals ("<)") || grade[i].equals ("<(")){
                dec = 1;
                minimum += dec;

            }
            else if (grade[i].equals (">)") || grade[i].equals (">(")){
                dec = 0;
                minimum += dec; }}
            double averageGPA = (double)minimum/(double)grade.length;
            return averageGPA;
    }
}
