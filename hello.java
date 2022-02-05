import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cálculo de Média!");
        System.out.println("Diga as 4 Notas: ");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double m = (x1+x2+x3+x4)/4;
        if(m>=7){
            System.out.println("Parabéns, você passou por conceito A! Média: " + m);
        }else if(m>=4){
            System.out.println("Você está de AF!, Digite sua nota de AF: ");
            double af= scanner.nextDouble();
            m = (m + af)/2;
            if(m>=5){
                System.out.println("Parabéns, Você passou por conceito B! Média: " + m);
            }else{
                System.out.println("Infelizmente você foi Reprovado! Média: " + m);
            }
        }else{
            System.out.println("Infelizmente você foi Reprovado! Média: " + m);
        }
    }
}
