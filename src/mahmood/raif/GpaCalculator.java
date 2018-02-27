package mahmood.raif;

public interface GpaCalculator {
    public void setNumberOfClasses(int classesTaken);
    public void setGrade (int classPeriod, String grade);
    public double calculateGpa();
}