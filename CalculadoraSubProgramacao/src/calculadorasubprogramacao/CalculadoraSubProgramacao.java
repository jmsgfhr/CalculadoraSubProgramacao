package calculadorasubprogramacao;

import java.util.Scanner;

/**
 *
 * @author jmsgfhr
 */
public class CalculadoraSubProgramacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float memoria=0;
        menucalc(memoria);
    }
    
    public static void menucalc(float memoria){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Estado da memória: "+memoria+"\nOpções:\n(1) Somar\n(2) Subtrair\n(3) Multiplicar\n(4) Dividir\n(5) Limpar memória\n(6) Sair do programa\nQual opção você deseja?");
       int resp = teclado.nextInt();
       if((resp>0)||(resp<7)){
           switch (resp){
               case 1:
                   memoria=soma(teclado,memoria);
                   menucalc(memoria);
                   break;
               case 2:
                   memoria=subtrair(teclado,memoria);
                   menucalc(memoria);
                   break;
               case 3:
                   memoria=multiplicar(teclado,memoria);
                   menucalc(memoria);
                   break;
               case 4:
                   memoria=dividir(teclado,memoria);
                   menucalc(memoria);
                   break;
               case 5:
                   menucalc(0);
                   break;
               case 6:
                   System.out.println("Muito obrigado por usar o programa :hangloose:");
                   System.exit(0);
           }
       }else
            System.out.println("Opção invalida!!!\n\n");
    }
    
    public static float soma(Scanner teclado,float memoria){
        System.out.println("Digite o numero que queira somar a memoria: ");
        float aux = teclado.nextFloat();
        memoria+=aux;
        return memoria;
    }
    
    public static float subtrair(Scanner teclado,float memoria){
        System.out.println("Digite o numero que queira subtrair da memoria: ");
        float aux = teclado.nextFloat();
        memoria-=aux;
        return memoria;
    }
    
    public static float multiplicar(Scanner teclado,float memoria){
        System.out.println("Digite o numero que queira multiplicar a memoria: ");
        float aux = teclado.nextFloat();
        memoria*=aux;
        return memoria;
    }
    
    public static float dividir(Scanner teclado,float memoria){
        System.out.println("Digite o numero que queira dividir a memoria: ");
        float aux = teclado.nextFloat();
        memoria/=aux;
        return memoria;
    }
}
