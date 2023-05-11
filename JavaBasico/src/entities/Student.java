package entities;

public class Student {
    public String nome;
    public double primeiroTrimestre;
    public double segundoTrimestre;
    public double terceiroTrimestre;

    public double finalGrade(){
        return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
    }

    public double missingPoints(){
        if (finalGrade() < 60.0){
            return 60.0 - finalGrade();
        }
        else{
            return 0.0;
        }
    }
}
