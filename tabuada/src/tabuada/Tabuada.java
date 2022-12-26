package tabuada;

import java.util.Scanner;

/**
 * RA: 5149354
 *
 * @author lucas
 */
public class Tabuada {

    public static void main(String[] args) {
        //variaveis
        int opc = 0, valor, opc1;
        int result = 1;
        int aux = 0;
        Scanner entrada = new Scanner(System.in);

        while (opc != 5) {
            //programa
            System.out.println("----Lista de exercicios----");
            System.out.println("1º- Tabuada");
            System.out.println("2º- Raiz Quadrada");
            System.out.println("3º- Potencia");
            System.out.println("4º- Fatorial");
            System.out.println("5º- Primo");
            System.out.println("6º- sair");
            System.out.println("---------------------------");
            System.out.print("Digite um valor: ");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("---calcule a tabuada de um número---");
                    System.out.print("Digite um valor de 1 a 10: ");
                    valor = entrada.nextInt();
                    System.out.println("1º tabuada da adição");
                    System.out.println("2º tabuada de subtração");
                    System.out.println("3º tabuada de multiplicação");
                    System.out.println("4º tabuada de divisão");
                    System.out.println("------------------------------------");
                    opc1 = entrada.nextInt();
                    switch (opc1) {
                        case 1: {
                            System.out.println("-----------tabuada adição----------------");
                            int vla = 0, resultA;
                            while (vla <= 10) {
                                resultA = valor + vla;
                                System.out.println(valor + "+" + vla + "=" + resultA);
                                vla++;
                            }
                        }
                        System.out.println("------------------------------------------");
                        break;
                        case 2:
                            System.out.println("----------tabuada subtração---------------");
                            int vlb = 0,
                             resultB;
                            while (vlb <= 10) {
                                resultB = vlb - valor;
                                System.out.println(vlb + "-" + valor + "=" + resultB);
                                vlb++;
                            }
                            System.out.println("------------------------------------------");
                            break;
                        case 3:
                            System.out.println("---------tabuada multiplicação------------");
                            int vlc = 0,
                             resultC;
                            while (vlc <= 10) {
                                resultC = valor * vlc;
                                System.out.println(valor + "*" + vlc + "=" + resultC);
                                vlc++;
                            }
                            System.out.println("-------------------------------------------");
                            break;
                        case 4:
                            int c = 1;
                            System.out.println("---------------tabuada divisão-------------");
                            while (c <= 10) {
                                System.out.println(">" + (c * valor) + "/" + valor + " = " + c);
                                c++;
                            }
                            System.out.println("--------------------------------------------");
                            break;
                    }

                    break;
                case 2: {
                    System.out.println("-----------------raiz quadrada-----------------------");
                    int resultE;
                    System.out.println("---calculando raiz quadrada---");
                    System.out.print("digite o numero para calculo :");
                    valor = entrada.nextInt();
                    resultE = (int) Math.sqrt(valor);
                    System.out.println(resultE);
                }
                System.out.println("-----------------------------------------------------");
                break;
                case 3:
                    System.out.println("------------potencia-------------------");
                    System.out.print("digite um valor para base:");
                    valor = entrada.nextInt();

                    System.out.println(" digite um valor para expoente ");
                    aux = entrada.nextInt();
                    while (aux < 0) {
                        System.out.println("digite um valor maior que 0");
                        System.out.println("digite um valor para expoente");
                        aux = entrada.nextInt();
                    }
                    for (int c = 1; c <= aux; c++) {
                        result *= valor;
                    }
                    System.out.println("o resultado da potência é " + result);
                    break;

                case 4:
                    System.out.println("---------------------fatorial------------------------------");
                    int fat = 1;
                    System.out.print("digite o valor que desejar");
                    valor = entrada.nextInt();
                    for (int i = 2; i <= valor; i++) {
                        fat *= i;
                    }
                    System.out.println("o Fatorial " + valor + "é igual á" + fat);
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("------------------Numeros primos-----------------------------");
                    System.out.print("Digite o numero: ");
                    valor = entrada.nextInt();
                    double numeroDouble = valor;
                    if ((numeroDouble / numeroDouble) == (valor / valor)) {
                        if (numeroDouble / 2 != valor / 2 || valor == 2) {

                            System.out.println("Este numero é primo!");
                        } else {
                            System.out.println("Este numero não é primo!");
                        }
                    } else {
                        System.out.println("Numero não é primo!");
                    }
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("--------------------seno----------------");
                    int Resultcon;
                    System.out.println("digite um numero: ");
                    valor = entrada.nextInt();
                    
                    Resultcon = (int) Math.log10(valor);
                    System.out.println(Resultcon); 
                    break;
            }

        }

    }

}
