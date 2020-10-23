
package laboratorio2_luisflores;

import java.util.ArrayList;
import java.util.Scanner;


public class Laboratorio2_LuisFlores {

    static ArrayList <Detectives> lista=new ArrayList();
    static ArrayList <casos> listatodo=new ArrayList();
    static ArrayList <casos> listahom=new ArrayList();
    static ArrayList <casos> listarobo=new ArrayList();
    static ArrayList <casos> listasec=new ArrayList();
    static ArrayList <casos> listares=new ArrayList();
    static ArrayList <casos> listapen=new ArrayList();
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
                case 5:
                    if(lista.isEmpty()){
                        System.out.println("No hay Detective");
                    }
                    System.out.println("Registrar caso: ");
                    String lugar;
                    int opc;
                    String descripcion;
                    String tipo;
                    String detective;
                    String estado;
                    System.out.println("lugar de el caso: ");
                    lugar=leer.next();
                    System.out.println("descripcion : ");
                    descripcion=leer.nextLine();
                    descripcion=leer.nextLine();
                    System.out.println("Para el estado escriba: 'resuelto' o 'pendiente' ");
                    System.out.println("todo lo demas no sera agregado a la lista de resueltos o pendientes");
                    System.out.println("Estado: ");
                    estado=leer.next();
                    System.out.println("LISTA DETECTIVES!");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i+". ->   "+lista.get(i));
                    }
                    System.out.println("Escoja Detective: ");
                    detective=leer.next();
                    System.out.println("ingrese el tipo de caso:  ");
                    System.out.println("1. Homicidio");
                    System.out.println("2. Robo");
                    System.out.println("3. Secuestro");
                    opc=leer.nextInt();
                    if(opc==1){
                        tipo=" Homicidio";
                        listatodo.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                        listahom.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                        if(estado.equals("resuelto")){
                        listares.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                        if(estado.equals("pendiente")){
                        listapen.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                    }
                    
                    }
                        
                    }
                    if(opc==2){
                        tipo=" Robo";
                        listatodo.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                        listarobo.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                        if(estado.equals("resuelto")){
                        listares.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                        if(estado.equals("pendiente")){
                        listapen.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                    }
                    
                    }
                    }
                    if (opc==3){
                        tipo="Secuestro";
                        listatodo.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                        listasec.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                        if(estado.equals("resuelto")){
                        listares.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                        if(estado.equals("pendiente")){
                        listapen.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                    }
                    
                    }
                    }
                    
                    
                    
                break;
                case 6:
                    System.out.println("Modificar caso: ");
                    int u=0;
                    while (u!=6){
                        System.out.println("1. Modificar lugar");
                        System.out.println("2. Modificar descripcion");
                        System.out.println("3. Modificar tipo");
                        System.out.println("4. Modificar detective");
                        System.out.println("5. Modificar estado");
                        System.out.println("6. Salir");
                        u=leer.nextInt();
                        switch(u){
                            case 1:
                                int k;
                                String b;
                                System.out.println("Posicion caso a modificar: ");
                                k=leer.nextInt();
                                if( k>=0&&k<listatodo.size()){
                                    if(listatodo.get(k)instanceof casos){
                                        System.out.println("Ingrese Nuevo lugar: ");
                                        b=leer.next();
                                        ((casos)listatodo.get(k)).setLugar(b);
                                        ((casos)listarobo.get(k)).setLugar(b);
                                        ((casos)listares.get(k)).setLugar(b);
                                        ((casos)listasec.get(k)).setLugar(b);
                                        ((casos)listahom.get(k)).setLugar(b);
                                        ((casos)listapen.get(k)).setLugar(b);
                                    }else{
                                        System.out.println("posicion no es...");
                                    }
                                } else{
                                    System.out.println("posicion fuera rango: ");
                                    
                                }
                            break;
                            case 2:
                                int k2;
                                String b2;
                                System.out.println("Posicion caso a modificar: ");
                                k2=leer.nextInt();
                                if( k2>=0&&k2<listatodo.size()){
                                    if(listatodo.get(k2)instanceof casos){
                                        System.out.println("Ingrese Nuevo Descripcion: ");
                                        b2=leer.next();
                                        ((casos)listatodo.get(k2)).setDescripcion(b2);
                                        ((casos)listarobo.get(k2)).setDescripcion(b2);
                                        ((casos)listares.get(k2)).setDescripcion(b2);
                                        ((casos)listasec.get(k2)).setDescripcion(b2);
                                        ((casos)listahom.get(k2)).setDescripcion(b2);
                                        ((casos)listapen.get(k2)).setDescripcion(b2);
                                    }else{
                                        System.out.println("posicion no es...");
                                    }
                                } else{
                                    System.out.println("posicion fuera rango: ");
                                    
                                }
                                
                            break;
                            case 3:
                                int k3;
                                String b3;
                                System.out.println("Posicion caso a modificar: ");
                                k3=leer.nextInt();
                                if( k3>=0&&k3<listatodo.size()){
                                    if(listatodo.get(k3)instanceof casos){
                                        System.out.println("Ingrese Nuevo tipo: ");
                                        System.out.println("1. Homicidio");
                                        System.out.println("2. Robo");
                                        System.out.println("3. Secuestro");
                                        int opc1=leer.nextInt();
                                        if(opc1==1){
                                         b3="Homicidio";
                                        ((casos)listatodo.get(k3)).setDescripcion(b3);
                                        ((casos)listarobo.get(k3)).setDescripcion(b3);
                                        ((casos)listares.get(k3)).setDescripcion(b3);
                                        ((casos)listasec.get(k3)).setDescripcion(b3);
                                        ((casos)listahom.get(k3)).setDescripcion(b3);
                                        ((casos)listapen.get(k3)).setDescripcion(b3);
                                        }
                                        if(opc1==2){
                                         b3="Robo";
                                        ((casos)listatodo.get(k3)).setDescripcion(b3);
                                        ((casos)listarobo.get(k3)).setDescripcion(b3);
                                        ((casos)listares.get(k3)).setDescripcion(b3);
                                        ((casos)listasec.get(k3)).setDescripcion(b3);
                                        ((casos)listahom.get(k3)).setDescripcion(b3);
                                        ((casos)listapen.get(k3)).setDescripcion(b3);
                                        }
                                        if(opc1==3){
                                         b3="Secuestro";
                                        ((casos)listatodo.get(k3)).setDescripcion(b3);
                                        ((casos)listarobo.get(k3)).setDescripcion(b3);
                                        ((casos)listares.get(k3)).setDescripcion(b3);
                                        ((casos)listasec.get(k3)).setDescripcion(b3);
                                        ((casos)listahom.get(k3)).setDescripcion(b3);
                                        ((casos)listapen.get(k3)).setDescripcion(b3);
                                        }
          
                                    }else{
                                        System.out.println("posicion no es...");
                                    }
                                } else{
                                    System.out.println("posicion fuera rango: ");
                                    
                                }
                                
                            break;
                        }
                    }//fin switch
                break;
            }//fin switch
        }//fin while
    }
    
}
