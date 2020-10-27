import java.util.Scanner;
import java.util.*;
import java.io.*;
    class multiplicación{
        public static void main(String[]args){
            Scanner entrada = new Scanner(System.in);
            int opcion, edad, tempe, numero, pastel, muffin, cafe, malteada, base, altura, lado1, lado2, radio;
            char rom, temperatura, convert;
            double  num, nume, numer, area, perimetro, volumen, resultado, monto, num1, num2; 
            do{
                System.out.println("3IV8 MARTINEZ GAMBOA NATALIA");
                System.out.println("Escoja una de las siguientes opciones:");
                System.out.println("1.- Aplicar descuentos segun edades");
                System.out.println("2.- Conversor de decimal a binario");
                System.out.println("3.- Conversor de unidades de temperatura");
                System.out.println("4.- Contar números positivos y negativos");
                System.out.println("5.- Leer cantidades");
                System.out.println("6.- Calcular área, perímetro o volumen de una figura");
                System.out.println("7.- Tabla de valores");
                System.out.println("8.- Número a Factorial");
                System.out.println("9.- Calculadora");
                opcion = entrada.nextInt();
        switch(opcion) {
            case 1:
                    do{
                        System.out.println("¿Cuál es tu edad?");
                    edad = entrada.nextInt();
                    if(edad > 65){
                        System.out.println("Tiene un descuento de 40 %. Gracias.Vuelva Pronto!");
                    }
                    if(edad < 21){
                        System.out.println("¿Tus padres son socios de este establecimiento? Escriba s si tu respuesta es si o n si es no.");
                            rom = entrada.next().charAt(0);
                            if(rom == 's'){
                                System.out.println("Tiene un descuento de 45 %. Gracias.Vuelva Pronto!");
                            }
                            else if(rom == 'n'){
                                System.out.println("Tiene un descuento de 25 %. Gracias.Vuelva Pronto!");
                            }
                    }
                    if(edad >= 21 & edad <= 65){
                        System.out.println("Gracias.Vuelva Pronto!");
                    }
                    System.out.println(" ");
                    System.out.println("Presione la tecla r si desea repetir el programa.");
                    System.out.println("Presione la tecla m si desea volver al menu de opciones.");
                    rom = entrada.next().charAt(0);
                    }while(rom ==  'r');
                        break;
            case 2:
             do{
                        System.out.println("Ingrese un número entero y positivo para covertirlo a binario.");
                        numero = entrada.nextInt ();
                        String binario = "";
                        if (numero > 0){
                        while (numero > 0){
                            if (numero % 2 == 0){
                                binario = "0" + binario;
                            }
                            else{
                                binario = "1" + binario;
                            }
                            numero = (int) numero/2;
                        }
                        }
                        else if(numero == 0){
                            binario = "0";
                        }
                        else{
                            binario = "Ingrese unicamente números positivos";
                        }
                        System.out.println("Resultado de la conversión: " + binario + ".");
                    System.out.println(" ");
                    System.out.println("Presione la tecla r si desea repetir el programa.");
                    System.out.println("Presione la tecla m si desea volver al menu de opciones.");
                    rom = entrada.next().charAt(0);
                    }while(rom ==  'r');
                        break;
            case 3:
                do{
             tempe = 0;
                System.out.println("Introduzca una temperatura");
             tempe = entrada.nextInt();
                System.out.println(" ");
                System.out.println("C = Celsius. F = Farenheit. K = Kelvin. R = Rankine.");
                System.out.println(" ");
                System.out.println("Introduzca la temperatura inicial:");
                temperatura = entrada.next().charAt(0);
                System.out.println("Unidad a convertir (según las opciones):");
                convert = entrada.next().charAt(0);
                if(temperatura == 'C' & convert == 'C')
                {
                    System.out.println("Digite otra opción");
                }
                else if(temperatura == 'C' & convert == 'F')
                {
                    resultado = tempe*33.8;
                    System.out.println("El resultado de la conversión es: " + resultado);
                }
                else if(temperatura == 'C' & convert == 'K')
                {
                    resultado = tempe*274.15;
                    System.out.println("El resultado de la conversión es: " + resultado);
                }
                else if(temperatura == 'C' & convert == 'R')
                {
                    resultado = tempe*493.47;
                    System.out.println("El resultado de la conversión es: " + resultado);
                }
                if(temperatura == 'F' & convert == 'F')
                {
                    System.out.println("Digite otra opción");
                }
                else if(temperatura == 'F' & convert == 'C')
                {
                    resultado = tempe*-17.22;
                    System.out.println("El resultado de la conversión es: " + resultado);
                }
                else if(temperatura == 'F' & convert == 'K')
                {
                    resultado = tempe*255.92;
                    System.out.println("El resultado de la conversión es: " + resultado);
                }
                else if(temperatura == 'F' & convert == 'R')
                {
                    resultado = tempe*460.67;
                    System.out.println("El resultado de la conersión es: " + resultado);
                }
                if(temperatura == 'K' & convert == 'K')
                {
                    System.out.println("Digite otra opción");
                }
                else if(temperatura == 'K' & convert == 'F')
                {
                    resultado = tempe*-457.87;
                    System.out.println("El resultado de la conversión es: " + resultado);
                }
                else if(temperatura == 'K' & convert == 'C')
                {
                    resultado = tempe*-272.15;
                    System.out.println("El resultado de la conversión es: " + resultado);
                }
                else if(temperatura == 'K' & convert == 'R')
                {
                    resultado = tempe*1.8;
                    System.out.println("El resultado  de la conversión es: " + resultado);
                }
                if(temperatura == 'R' & convert == 'R')
                {
                    System.out.println("Digite otra opción");
                }
                else if(temperatura == 'R' & convert == 'F')
                {
                    resultado = tempe*-458.67;
                    System.out.println("El resultado  de la conversión es: " + resultado);
                }
                else if(temperatura == 'R' & convert == 'K')
                {
                    resultado = tempe*0.55;
                    System.out.println("El resultado de la conversión es: " + resultado);
                }
                else if(temperatura == 'R' & convert == 'C')
                {
                    resultado = tempe*-272.594;
                    System.out.println("El resultado de la conversión es: " + resultado);
                }
                System.out.println(" ");
                System.out.println("Presione la tecla r si desea repetir el programa.");
                System.out.println("Presione la tecla m si desea volver al menu de opciones.");
                rom = entrada.next().charAt(0);
                }while(rom ==  'r');
                break;
            case 4:
                do{
                System.out.println("Digita tres números y te indicaremos cuales son los positivos y cuales los negativos");
                num = entrada.nextDouble();
                nume = entrada.nextDouble();
                numer = entrada.nextDouble();
                if(num == 0){
                    System.out.println("Primer numero: neutro.");
                }
                    else if(num < 0){
                        System.out.println("Primer numero: negativo.");
                    }
                    else{
                        System.out.println("Primer numero: positivo.");
                    }
                if(nume == 0){
                    System.out.println("Seguno numero: neutro.");
                }
                    else if(nume < 0){
                        System.out.println("Segundo numero: negativo.");
                    }                
                    else{
                        System.out.println("Segundo numero: positivo.");
                    }
                if(numer == 0){
                    System.out.println("Tercer numero: neutro.");
                }
                    else if(numer < 0){
                        System.out.println("Tercer numero: negativo.");
                    }
                    else{
                    System.out.println("Tercer numero: positivo.");
                    }
                    System.out.println(" ");
                System.out.println("Presione la tecla r si desea repetir el programa.");
                System.out.println("Presione la tecla m si desea volver al menu de opciones.");
                rom = entrada.next().charAt(0);
                }while(rom ==  'r');
                break;
            case 5:
             do{
                System.out.println("Ofrecemos los siguientes productos:");
                System.out.println("Pastel - $50. Muffin - $25. Café - $20. Malteada - $30.");
             System.out.println(" ");
             pastel = 50;
              muffin = 25;
                cafe = 20;
                malteada = 30;
                monto = 0;
             resultado = 0;
             do{System.out.println("¿Cuántos pasteles compro?");
                pastel = entrada.nextInt();
                }while(pastel < 0);
                do{System.out.println("¿Cuántos muffins compro?");
                muffin = entrada.nextInt();
                }while(muffin < 0);
                do{System.out.println("¿Cuántos cafes compro?");
             cafe = entrada.nextInt();
                }while(cafe < 0);
             do{System.out.println("¿Cuántas malteadas compro?");
                malteada = entrada.nextInt();
                }while(malteada < 0);
                monto = (pastel + muffin + cafe + malteada);
                resultado = (50*pastel + 25*muffin + 20*cafe + 30*malteada);
                System.out.println("Cantidad de productos: " + monto + ".");
             System.out.println("El total de la compra es $ " + resultado + ".  Gracias. Vuelva pronto!");
                System.out.println(" ");
                System.out.println("Presione la tecla r si desea repetir el programa.");
                System.out.println("Presione la tecla m si desea volver al menu de opciones.");
                rom = entrada.next().charAt(0);
                }while(rom ==  'r');
                break;
            case 6:
             do{System.out.println("Seleccione una opción");
                System.out.println("1, área y perímetro de un rectángulo; 2, perímetro de un triángulo; 3, volumen de una esfera; 4, volumen de un cilindro.");
                opcion = entrada.nextInt();
                if(opcion == 1){
                    System.out.println("Base del rectángulo:");
                    base = entrada.nextInt();
                 System.out.println("Altura del triángulo");
                    altura = entrada.nextInt();
                 area = base*altura;
                 perimetro = 2*(base+altura);
                    System.out.println("Perímetro: " + perimetro);
                    System.out.println("Area: " + area);
            }
            if(opcion == 2){
                System.out.println("Base del triángulo:");
                base = entrada.nextInt();
                System.out.println("Introduce los dos lados del triángulo:");
                lado1 = entrada.nextInt();
                lado2 = entrada.nextInt();
                System.out.println("Altura del triángulo:");
                altura = entrada.nextInt();
                perimetro = base+lado1+lado2;
                area = (altura*base/2);
                System.out.println("Perímetro: " + perimetro);
                System.out.println("Area: " + area);
            }
            if(opcion == 3){
                System.out.println("Radio de la esfera:");
                radio = entrada.nextInt();
                System.out.println("Altura de la esfera:");
                altura = entrada.nextInt();
                volumen = 4*3.14*((radio*radio*radio)/3);
                System.out.println("Volumen: " + volumen);
            }
            if(opcion == 4){
                System.out.println("Radio del cilindro:");
                radio = entrada.nextInt();
                System.out.println("Altura del cilindro:");
                altura = entrada.nextInt();
                volumen = 3.14*(radio*radio)*altura;
                System.out.println("Volumen: " + volumen);
            }
            System.out.println(" ");
                System.out.println("Presione la tecla r si desea repetir el programa.");
                System.out.println("Presione la tecla m si desea volver al menu de opciones.");
                rom = entrada.next().charAt(0);
                }while(rom ==  'r');
            break;
        case 7:
            do{
            System.out.println("Tabla de valores");
            System.out.println("\tN\t\t\t");
            System.out.println("\t1\t10\t100\t1000");
            System.out.println("\t2\t20\t200\t2000");
            System.out.println("\t3\t30\t300\t3000");
            System.out.println("\t4\t40\t400\t4000");
            System.out.println("\t5\t50\t500\t5000");
            System.out.println("\t6\t60\t600\t6000");
            System.out.println("\t7\t70\t700\t7000");
            System.out.println("\t8\t80\t800\t8000");
            System.out.println("\t9\t90\t900\t9000");
            System.out.println("\t10\t100\t1000\t1000");
         System.out.println(" ");
            System.out.println("Presione la tecla r si desea repetir el programa.");
            System.out.println("Presione la tecla m si desea volver al menu de opciones.");
            rom = entrada.next().charAt(0);
            }while(rom ==  'r');
            break;
        case 8:
            do{
            System.out.println("Digite un número");
            int calculo = 0;
            while(calculo < 1) {
                try {
                    calculo = entrada.nextInt();
                    if(calculo < 1)
                        System.out.println("Digite otro valor");
                }catch(InputMismatchException e) {
                    System.out.println("Digite un número");
                    entrada.nextLine();
                }
            }
            long factorial = 1L;
            for(int i = calculo; i > 0; i--) {
                factorial=factorial*i;
            }
            System.out.println("El factorial de " + calculo + " es " + factorial + ".");
            System.out.println(" ");
            System.out.println("Presione la tecla r si desea repetir el programa.");
            System.out.println("Presione la tecla m si desea volver al menu de opciones.");
            rom = entrada.next().charAt(0);
            }while(rom ==  'r');
            break;
        case 9:
            do{
            System.out.println("Calculadora de 2 variables");
            System.out.println(" ");
            System.out.println("Digita un número");
            num1 = entrada.nextDouble();
            System.out.println(" ");
            System.out.println("Digita otro número");
            num2 = entrada.nextDouble();
            System.out.println(" ");
            System.out.println("¿Qué operación gustas hacer?");
            System.out.println(" ");
            System.out.println("a = suma. b = resta. c = multiplicación. d = división.");
            rom = entrada.next().charAt(0);
            System.out.println(" ");
            if(rom == 'a')
            {
                resultado = num1+num2;
                System.out.println("El resultado es: " + resultado);
            }
            if(rom == 'b')
            {
                resultado = num1-num2;
                System.out.println("El resultado es: "  + resultado);
            }
            if(rom == 'c')
            {
                resultado = num1*num2;
                System.out.println("El resultado es: "  + resultado);
            }
            if(rom == 'd')
            {
                resultado = num1/num2;
                System.out.println("El resultado es: "  + resultado);
            }
            System.out.println(" ");
            System.out.println("Presione la tecla r si desea repetir el programa.");
            System.out.println("Presione la tecla m si desea volver al menu de opciones.");
            rom = entrada.next().charAt(0);
            }while(rom ==  'r');
            break;
        default:
            System.out.println("Gracias por tomar parte.");   
    }
    System.out.println(" ");
    System.out.println("Presione la tecla m si desea volver al menu de opciones.");
    System.out.println("Presione la tecla x para cerrar el programa.");
    System.out.println(" ");
    rom = entrada.next().charAt(0);
}while(rom == 'm');       
}
}