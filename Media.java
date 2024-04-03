public class Media {

    public static void main(String[] args){

        double nota1 = 7.0;
        double nota2 = 3.5;
        double nota3 = 9.3;
        double nota4 = 8.0;

        double resultado = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("***************************");
        System.out.println("Avaliação 1: " + nota1);
        System.out.println("Avaliação 2: " + nota2);
        System.out.println("Avaliação 3: " + nota3);
        System.out.println("Avaliação 4: " + nota4);
        System.out.println("Média: " + resultado);
        if(resultado >= 7.0){
            System.out.println("Resultado: Aprovado!");
        }else{
            System.out.println("Resultado: Reprovado!");
        }
        System.out.println("***************************");
    }
}
