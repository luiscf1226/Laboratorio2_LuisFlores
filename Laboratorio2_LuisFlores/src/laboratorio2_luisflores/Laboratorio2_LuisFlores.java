
package laboratorio2_luisflores;

import java.util.ArrayList;
import java.util.Scanner;


public class Laboratorio2_LuisFlores {

    static ArrayList <Detectives> lista=new ArrayList();
    static ArrayList <casos> lista1=new ArrayList();
    static ArrayList <casos> lista2=new ArrayList();
    static ArrayList <casos> lista3=new ArrayList();
    static ArrayList <casos> lista4=new ArrayList();
    static ArrayList <casos> lista5=new ArrayList();
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int opcion=0;
        while(opcion!=10){
            System.out.println("Escoja una opcion: ");
            System.out.println("1. Agregar Detectives");
            System.out.println("2. Eliminar Detectives");
            System.out.println("3. Modificar Detectives");
            System.out.println("4. Listar Detectives");
            System.out.println("5. Registar Casos");
            System.out.println("6. Modificar Casos");
            System.out.println("7. Listar Casos");
            System.out.println("8. Listar Casos Resueltos");
            System.out.println("9. Listar casos Pendientes");
            System.out.println("10. Salir de el Programa");
            opcion=leer.nextInt();
            switch(opcion){
                case 1: 
                    System.out.println("Agregando Detective...");
                    String nombre;
                    int edad;
                    String nacionalidad;
                    int years;
                    int nivel;
                    System.out.println("Ingrese Nombre Detective: ");
                    nombre=leer.next();
                    System.out.println("Ingrese Edad: ");
                    edad=leer.nextInt();
                    System.out.println("Ingrese Nacionalidad Detective: ");
                    nacionalidad=leer.next();
                    System.out.println("Ingrese Años Laborales: ");
                    years=leer.nextInt();
                    System.out.println("Ingrese Nivel {1-10}: ");
                    nivel = leer.nextInt();
                    
                    lista.add(new Detectives(nombre,edad,nacionalidad,years,nivel));
                    System.out.println("Agregado");
                break;
                case 2:
                    System.out.println("Vamos a Eliminar: ");
                    System.out.println("ingrese posicion a eliminar: ");
                    int g;
                    g=leer.nextInt();
                    if (g>=0 && g<lista.size()) {
                        lista.remove(g);
                        System.out.println("eliminado");
                        String salida="";
                        for (Object t : lista) {
                            salida+=""+lista.indexOf(t)+"- "+t+"\n";
                        }
                        System.out.println(salida);
                    }else{
                         System.out.println("fuera de rango");
                    }
                break;
                case 3:
                    System.out.println("Modificar ");
                    int o=0;
                    while (o!=6){
                        System.out.println("1. Modificar nombre");
                        System.out.println("2. Modificar edad");
                        System.out.println("3. Modificar nacion");
                        System.out.println("4. Modificar Tiempo Laboral");
                        System.out.println("5. Modificar nivel");
                        System.out.println("6. Salir");
                        o=leer.nextInt();
                        switch(o){
                            case 1:
                                int p;
                                String n;
                                System.out.println("posicion de detective a modificar: ");
                                p=leer.nextInt();
                                if (p>=0&&p<lista.size()){
                                    if(lista.get(p)instanceof Detectives){
                                        System.out.println("ingrese nuevo nombre: ");
                                         n=leer.next();
                                    ((Detectives)lista.get(p)).setNombre(n);
                                    System.out.println("cambiado");
                                    } else{
                                        System.out.println("posicion no es limpieza");
                                    }
                                }else{
                                    System.out.println("posicion fuera rango");
                                }
                            break;
                            case 2:
                                int p1;
                                int n1;
                                System.out.println("posicion de detective a modificar: ");
                                p1=leer.nextInt();
                                if (p1>=0&&p1<lista.size()){
                                    if(lista.get(p1)instanceof Detectives){
                                        System.out.println("ingrese nueva Edad: ");
                                         n1=leer.nextInt();
                                    ((Detectives)lista.get(p1)).setEdad(n1);
                                    System.out.println("cambiado");
                                    } else{
                                        System.out.println("posicion no es limpieza");
                                    }
                                }else{
                                    System.out.println("posicion fuera rango");
                                }
                            break;
                            case 3:
                                int p2;
                                String n2;
                                System.out.println("posicion de detective a modificar: ");
                                p2=leer.nextInt();
                                if (p2>=0&&p2<lista.size()){
                                    if(lista.get(p2)instanceof Detectives){
                                        System.out.println("ingrese nuevo pais: ");
                                         n2=leer.next();
                                    ((Detectives)lista.get(p2)).setNacionalidad(n2);
                                    System.out.println("cambiado");
                                    } else{
                                        System.out.println("posicion no es limpieza");
                                    }
                                }else{
                                    System.out.println("posicion fuera rango");
                                }
                            break;
                            case 4:
                                int p3;
                                int n3;
                                System.out.println("posicion de detective a modificar: ");
                                p3=leer.nextInt();
                                if (p3>=0&&p3<lista.size()){
                                    if(lista.get(p3)instanceof Detectives){
                                        System.out.println("ingrese nueva Tiempo Laboral: ");
                                         n3=leer.nextInt();
                                    ((Detectives)lista.get(p3)).setYears(n3);
                                    System.out.println("cambiado");
                                    } else{
                                        System.out.println("posicion no es limpieza");
                                    }
                                }else{
                                    System.out.println("posicion fuera rango");
                                }
                            break;
                            case 5:
                                int p4;
                                int n4;
                                System.out.println("posicion de detective a modificar: ");
                                p4=leer.nextInt();
                                if (p4>=0&&p4<lista.size()){
                                    if(lista.get(p4)instanceof Detectives){
                                        System.out.println("ingrese nuevo Nivel: ");
                                         n4=leer.nextInt();
                                    ((Detectives)lista.get(p4)).setNivel(n4);
                                    System.out.println("cambiado");
                                    } else{
                                        System.out.println("posicion no es limpieza");
                                    }
                                }else{
                                    System.out.println("posicion fuera rango");
                                }
                            break;
                        }//fin switch
                    }
                break;
                case 4:
                        System.out.println("LISTA DETECTIVES!");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i+". ->   "+lista.get(i));
                    }
                break;
            }//fin switch
        }//fin while
    }
    
}
