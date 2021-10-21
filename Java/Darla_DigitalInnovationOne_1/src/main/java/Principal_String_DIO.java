import java.util.stream.IntStream;

public class Principal_String_DIO {
    public static void main (String[] args){
        //criação das variaveis
        var nome = "Darla";
        var sobre_nome = "Garcia";
        final var nome_completo = nome + sobre_nome; //String
        //imprimir na tela
        System.out.println("Primeiro nome do cliente: "+nome);
        System.out.println("Sobrenome do cliente....: "+sobre_nome);
        System.out.println("Nome completo do cliente: "+nome_completo);

        //criação da String
        var string = new String(" Minha String");


        System.out.println("Char na posição 5: "+ string.charAt(5));
        System.out.println("Quantidade: "+ string.length());
        System.out.println("Sem trim [" + string + "]");
        System.out.println("Com trim [" + string.trim() + "]");
        System.out.println("Lower: "+string.toLowerCase());
        System.out.println("Upper: "+string.toUpperCase());


        //testanto
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(""));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0,9]","[#]"));

        //laços de repetição
        //expressoes lambda
        System.out.println("\n\n LACOS DE REPETICAO");

        IntStream.of(1,2,3,4,5).forEach(n->{//imprime eles em uma coluna
            System.out.println(n);
        });

        IntStream.range(0,3).forEach(n->{//imprime os numeros inteiros 0>= n < 3 (0,1,2)
            System.out.println("Numero = "+n);
        });



    }
}
