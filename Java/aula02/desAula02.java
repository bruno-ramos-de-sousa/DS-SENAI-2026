import java.util.Scanner;

public class desaula02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ma1 = 0, ma2 = 0, ma3 = 0, fa1 = 0, fa2 = 0, fa3 = 0, mi1 = 0, mi2 = 0, mi3 = 0, fi1 = 0, fi2 = 0, fi3 = 0, esc;

        String m = """
                ------------------------------------
                ---Sistema de estoque de calçados---
                ---------Opçõs para estoque---------
                ------------------------------------
                
                1) Masculino (Adulto)
                2) Feminino (Adulto)
                3) Masculino (Infantil)
                4) Feminino (Infantil)
                
                """;


        System.out.println(m);
        esc = scanner.nextInt();

        switch (esc) {
            case (1):
                System.out.println(String.format("""
                        ----Calçados masculinos (Adultos)----
                        
                        %d Tenis de corrida
                        %d Tenis de academia
                        %d chuteira esportiva
                        """, ma1, ma2, ma3));
                break;
            case (2):
                System.out.println(String.format("""
                        ----Calçados femininos (Adultos)----
                        
                        %d Tenis de corrida
                        %d Tenis de academia
                        %d chuteira esportiva
                        """, fa1, fa2, fa3));
                break;
            case (3):
                System.out.println(String.format("""
                        ----Calçados masculinos (infantis)----
                        
                        %d Tenis do Mcqueen
                        %d Tenis dos Power Rangers
                        %d Crocs
                        """, mi1, mi2, mi3));
                break;
            case (4):
                System.out.println(String.format("""
                        ----Calçados femininos (Infantis)----
                        
                        %d Tenis de Princessa
                        %d Sapatilhas
                        %d Crocs
                        """, fi1, fi2, fi3));
                break;
        }
    }
}
