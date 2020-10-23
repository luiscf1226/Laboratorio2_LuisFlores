
package laboratorio2_luisflores;

import java.util.ArrayList;
import java.util.Scanner;


public class Laboratorio2_LuisFlores {

    static ArrayList <Detectives> lista=new ArrayList();//lista detectives
    static ArrayList <casos> listatodo=new ArrayList();//lista todo casos
    static ArrayList <casos> listahom=new ArrayList();//lista homicidios
    static ArrayList <casos> listarobo=new ArrayList();//lista robo
    static ArrayList <casos> listasec=new ArrayList();//lista secuestros
    static ArrayList <casos> listares=new ArrayList();//lista resueltos
    static ArrayList <casos> listapen=new ArrayList();// lista pendientes
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
                        System.out.println("cambiando asignacion casos segun nivel......");
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
                    boolean flag=false;
                    if(lista.isEmpty()){
                        flag=false;
                        System.out.println("No hay Detective");
                    }else{
                        flag=true;
                    }
                    if(flag==true){
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
                        System.out.println("Escriba el Nombre de el Detective deseado:");
                        detective=leer.next();
                        System.out.println("ingrese el tipo de caso:  ");
                        System.out.println("Ingrese numero de opcion");
                        System.out.println("1. Homicidio");
                        System.out.println("2. Robo");
                        System.out.println("3. Secuestro");
                        opc=leer.nextInt();
                        if(opc==1){
                            tipo=" Homicidio";
                            listatodo.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            listahom.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            if(estado.equals("pendiente")){
                                listapen.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            }
                            if(estado.equals("resuelto")){
                             listares.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            }





                        }
                        if(opc==2){
                            tipo=" Robo";
                            listatodo.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            listarobo.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            if(estado.equals("pendiente")){
                                listapen.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            }
                            if(estado.equals("resuelto")){
                             listares.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            }




                        }
                        if (opc==3){
                            tipo="Secuestro";
                            listatodo.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            listasec.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            if(estado.equals("pendiente")){
                                listapen.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            }
                          if(estado.equals("resuelto")){
                             listares.add(new casos(lugar,  descripcion,  tipo, detective,  estado));
                            }


                    
                        }else{
                            System.out.println("No existen Detectives");
                        }
                    }
                    
                    
                    
                break;
                case 6:
                    System.out.println("Modificar caso: ");
                    System.out.println("Modificara la Lista de Todos");
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
                                        ((casos)listatodo.get(k3)).setTipo(b3);
                                        
                                        }
                                        if(opc1==2){
                                         b3="Robo";
                                        ((casos)listatodo.get(k3)).setTipo(b3);
                                        
                                        }
                                        if(opc1==3){
                                         b3="Secuestro";
                                        ((casos)listatodo.get(k3)).setTipo(b3);
                                        
                                        }
          
                                    }else{
                                        System.out.println("posicion no es...");
                                    }
                                } else{
                                    System.out.println("posicion fuera rango: ");
                                    
                                }
                                
                            break;
                            case 4:
                                int k4;
                                String b4;
                                System.out.println("Posicion caso a modificar: ");
                                k4=leer.nextInt();
                                if( k4>=0&&k4<listatodo.size()){
                                    if(listatodo.get(k4)instanceof casos){
                                        System.out.println("LISTA DETECTIVES!");
                                        for (int i = 0; i < lista.size(); i++) {
                                            System.out.println(i+". ->   "+lista.get(i));
                                        }
                                        System.out.println("Ingrese Nuevo Detective: ");
                                        b4=leer.next();
                                        ((casos)listatodo.get(k4)).setDetective(b4);
                                        
                                    }else{
                                        System.out.println("posicion no es...");
                                    }
                                } else{
                                    System.out.println("posicion fuera rango: ");
                                    
                                }
                                
                            break;
                            case 5:
                                int k5;
                                String b5;
                                System.out.println("Posicion caso a modificar: ");
                                k5=leer.nextInt();
                                if( k5>=0&&k5<listatodo.size()){
                                    if(listatodo.get(k5)instanceof casos){
                                        System.out.println("Para el estado escriba: 'resuelto' o 'pendiente' ");
                                        System.out.println("todo lo demas no sera agregado a la lista de resuelto o pendiente");
                                        System.out.println("Ingrese Nuevo Estado: ");
                                        b5=leer.next();
                                        if(b5.equals("pendiente")){
                                           
                                            ((casos)listatodo.get(k5)).setLugar(b5);
                                            
                                        }
                                        if(b5.equals("resuelto")){
                                            ((casos)listatodo.get(k5)).setLugar(b5);
                                          
                                        }
                                    }else{
                                        System.out.println("posicion no es...");
                                    }
                                } else{
                                    System.out.println("posicion fuera rango: ");
                                }
                    }//fin switch
                    }
                break;
                case 7:
                    System.out.println("Total casos sin Orden");
                    System.out.println("LISTA CASOS!");
                    for (int i = 0; i < listatodo.size(); i++) {
                        System.out.println(i+". ->   "+listatodo.get(i));
                     }
                    System.out.println("");
                    System.out.println(" ");
                    System.out.println("-----------------------------------");
                    System.out.println("HOMICIDIOS");
                    for (int i = 0; i < listahom.size(); i++) {
                        System.out.println(i+". ->   "+listahom.get(i));
                     }
                    System.out.println("SECUESTROS");
                    for (int i = 0; i < listasec.size(); i++) {
                        System.out.println(i+". ->   "+listasec.get(i));
                     }
                    System.out.println("ROBOS");
                    for (int i = 0; i < listarobo.size(); i++) {
                        System.out.println(i+". ->   "+listarobo.get(i));
                     }
                break;
                case 8:
                     
                    System.out.println("LISTA CASOS RESUELTOS!");
                    for (int i = 0; i < listares.size(); i++) {
                        System.out.println(i+". ->   "+listares.get(i));
                     }
                break;
                case 9:
                    System.out.println("LISTA CASOS PENDIENTES!");
                    for (int i = 0; i < listapen.size(); i++) {
                        System.out.println(i+". ->   "+listapen.get(i));
                     }

                break;
            }//fin switch
        }//fin while
    }
    
}
