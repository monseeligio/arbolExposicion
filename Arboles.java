package arboles;

import java.util.Scanner;

public class Arboles {
    public static void main(String[] args) {
    Procesos arbol =new Procesos();
     int elemento;
     int opc2=0;
     int opc;
     Scanner LECTOR = new Scanner(System.in);
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar dato");
        System.out.println("2. Recorido Pre-orden");
        System.out.println("3. Recorido In-Orden");
        System.out.println("4. Recorido Pos-orden");
        System.out.println("5. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){
            
            case 1:  
            Scanner Lector2 = new Scanner(System.in);
            System.out.println("inserte numero");  
            elemento=Lector2.nextInt();            
            Nodo nodoActual=new Nodo(elemento);
            arbol.insertar(nodoActual);
            break;
            case 2:
            arbol.Preorden(arbol.nodoRaiz);
            break;
            case 3:
            arbol.inOrden(arbol.nodoRaiz);
            break;
            case 4:
            arbol.PosOrden(arbol.nodoRaiz);
            break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
       }while(opc2!=4);



    }
    
}
