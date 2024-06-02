public class Operadores {
    public static void main(String[] args) {

        //Exemplo de Operadores de Atribuição:
        // String nome = "Josias";
        // int idade = 20;
        // double peso = 90;
        // char sexo = 'M';
        // boolean doadorOrgao = false;


        //Exemplo de Operadores Aritméticos:
        // double soma = 10.5 + 15.7;
        // int subtração = 113 - 25;
        // int multiplicação = 20 * 7;
        // int divisao = 15 / 3;
        // int modulo = 18 % 3;
        // double resultado = (10 * 7 ) + (20 / 4);


        //Exemplo de Concatenação de textos:
        // String concatenacao = "?";
        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);
        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);

        // System.out.println(concatenacao);



        //Exemplo de Operadores Unários:
        // int numero = 5;

        // numero = -numero;
        // System.out.println(numero);

        // numero = numero * -1;
        // System.out.println(numero);

        // int numero = 5;

        // // x repetição
        // numero++;

        // System.out.println(numero);

        // boolean variavel = true;

        // variavel = !variavel;
        // System.out.println(variavel);





        //Exemplo de Operadores Ternário:
        // int numero1 = 6;
        // int numero2 = 6;
        // String resultado = numero1 == numero2 ? "verdadeiro" : "falso";
        // // if (numero1 == numero2)
        // // {
        // // resultado = "verdadeiro";
        // // }
        // // else
        // // {
        // // resultado = "falso";
        // // }
        // System.out.println(resultado);


        //Exemplo de Operadores Relacioanis:
        // String nomeUm = "Josias";
        // String nomeDois = new String("Josias");

        // System.out.println(nomeUm.equals(nomeDois));


        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;


        // if (numero1 < numero2)
        // {
        //     System.out.println("a nossa condição é verdadeira");
        // }
        
        // System.out.println("numeroUm é igual a numeroDois? " + simNao);


        // simNao = numero1 != numero2;
        // System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        // simNao = numero1 > numero2;
        // System.out.println("numeroUm é maior que numeroDois? " + simNao);


        //Exemplo de Operadores Lógicos:
        boolean condicao1 = true;
        
        boolean condicao2 = true;

        if (condicao1 && ( 7 > 4) )
        {
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2)
        {
            System.out.println("Uma das condições é verdadeiras");
        }

        System.out.println("fim");
    }
}