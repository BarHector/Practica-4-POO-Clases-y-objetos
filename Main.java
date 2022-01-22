import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner nao = new Scanner(System.in);
        
        String grade, pol, value="", grade2, pol2;
        
        grade = nao.nextLine();
        pol = nao.nextLine();
        grade2 = nao.nextLine();
        pol2 = nao.nextLine();
        value = nao.nextLine();
        
        Polynomial p1 = new Polynomial(Integer.parseInt(grade), pol);
        p1.createList();

        Polynomial p2 = new Polynomial(Integer.parseInt(grade2), pol2);
        p2.createList();

        Polynomial R = new Polynomial();

        R.add(p1, p2);
        R.substract(p1, p2);
        R.printP(R.getResultA(), Integer.parseInt(value));
        R.printP(R.getResultS(), Integer.parseInt(value));

        nao.close();
    }
}