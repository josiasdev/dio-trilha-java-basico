public class Operadores {
    public static void main(String[] args) {
        String nome = "Josias";
        int idade = 20;
        double peso = 90;
        char sexo = 'M';
        boolean doadorOrgao = false;
        
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicação = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7 ) + (20 / 4);
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

    }
}
