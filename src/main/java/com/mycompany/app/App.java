package com.mycompany.app;

public class App {
	
public static void main(String[] args) {
System.out.println("Ejecutando codigo de prueba con el numero 17");
int num = 17;
paridad(num);
num_digitos(num);
es_primo(num);
}

//metodo1
public static boolean paridad (int num) {
if ((num%2) == 0) {
System.out.println("El numero es par"); 
return true;
}	
else {
System.out.println("El numero es impar");
return false;
}
} 

 //metodo2
public static int num_digitos(int num) {
int digitos = 0;
while(num != 0){
num = num/10;
digitos++;
}
System.out.println("El numero tiene " + digitos + " digitos");
return digitos;     
}
    
//metodo3
public static String es_primo(int num){
String resultado;
boolean primo = true;
if(num < 2) {
primo = false;
}
else {	   
for(int i = 2; i < num; i++){
if( num%i == 0 ){
primo = false;
break;
}
}
}    
if (primo == true) {
System.out.println("El numero es primo");   
resultado = "Es primo";
}
else {
System.out.println("El numero no es primo");	   
resultado = "No es primo";
}
return resultado;
}		
}

