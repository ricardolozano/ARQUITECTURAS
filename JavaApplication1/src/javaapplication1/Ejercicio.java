package javaapplication1;



import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		Scanner dato= new Scanner (System.in);

System.out.println("Digite un número binario");
		int binario=dato.nextInt();
		int decimal=0;
		int base=0;
		
		if (binario==1||binario == 0){
			decimal = decimal+binario;
			System.out.println(binario);
		}
		do{
			if(binario%10==1){
				decimal+=(int)Math.pow(2,base); 
			}
			binario=binario/10;
			base+=1; 
		}while(binario!=1);
		decimal+=(int)Math.pow(2,base);
		


		
		System.out.println("Digite otro número binario");
		int binari=dato.nextInt();
		int decimale=0;
		int bas=0;
		
		if (binari ==1||binari == 0){
			decimale = decimale+binari;
			System.out.println(binari);
		}
		do{
			if(binari%10==1){
				decimale+=(int)Math.pow(2,bas); 
			}
			binari=binari/10;
			bas+=1; 
		}while(binari!=1);
		decimale+=(int)Math.pow(2,bas);
		System.out.println("Digite la operación a realizar.");
                System.out.println("1)Suma.");
                System.out.println("2)Resta.");
                System.out.println("3)Multiplicación.");
                System.out.println("4)División.");
                int operacion=dato.nextInt();
                if(operacion<1 || operacion>4){
                    System.out.println("Usted está fuera del menú de operaciones");
                }
                int resultado=0;
                if(operacion==1){
                    resultado=decimal+decimale;
                }
                if(operacion==2){
                    if(decimal>=decimale){
                    resultado=decimal-decimale;
                    }
                    if(decimale>decimal){
                        resultado=decimale-decimal;
                    }
                }
                if(operacion==3){
                    resultado=decimal*decimale;
                }
                if(operacion==4){
                    resultado=decimal/decimale;
                }
                String res=Integer.toBinaryString(resultado); 
                System.out.println(decimal);
                 System.out.println(decimale);
                  System.out.println(resultado);
                System.out.println(res);
	}
}