/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MariaPeralta
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        
        alumnos a1,p2;
        administrativo ad1;
        catedratico c1;
        planta p1;
        
        a1=new alumnos("CC","1083011165","Peralta Charris","María Carolina",23, true,"2013173075","Educación","Lic.Informatica",9);
        System.out.println(a1.mostrar());
        
        c1=new catedratico("CC","36540011","Charris polo","Elizabeth", 62,true,"docente","Lenguaje","01/02/2013","05/10/2018");
        System.out.println(c1.mostrar());
        
       ArrayList<alumnos> listaalumnos=new ArrayList<alumnos> ();
       ArrayList<administrativo> listaadministrativo=new ArrayList<administrativo> ();
       ArrayList<catedratico> listacatedratico=new ArrayList<catedratico> ();
       int opcion=0;
       int accion=1;
       int repetir=1;
       
  while (repetir!=0){
  System.out.println ("estudiante");
  System.out.println("administrativo");
  System.out.println("docente");
  
       
       switch (opcion){
           case 1: 
               
             System.out.println("1. agregar estudiante");  
             System.out.println("2. modificar estudiante"); 
             System.out.println("3. eliminar estudiante");
             int opcionA=leer.nextInt();
             
               while (accion!=0){
               boolean estado=true;
               
              System.out.println("Ingrese el tipo documento del estudiante");
              String tipodocumento=leer.next();
              System.out.println("Ingrese el documento del estudiante");
              String documento=leer.next();
              System.out.println("Ingrese los apellidos del estudiante");
              String apellidos=leer.next();
              System.out.println("Ingrese los nombres del estudiante");
              String nombres=leer.next();
              System.out.println("Ingrese la edad del estudiante");
              int edad=leer.nextInt();
              System.out.println(" activo marque 1  inactivo marque 0");
              int activo=leer.nextInt();
              if (activo==0){
                  estado=false;
              }
              System.out.println("Ingrese el codigo del estudiante");
              String codigo=leer.next();
              System.out.println("Ingrese la facultad a la que pertenece el estudiante");
              String facultad=leer.next();
              System.out.println("Ingrese el programa al que pertenece estudiante");
              String programa=leer.next();
              System.out.println("Ingrese el semestre al que pertenece estudiante");
              int semestre=leer.nextInt();
               
           break;   
       }
          
           case 2:
               
             System.out.println("1. agregar administrativo");  
             System.out.println("2. modificar administrativo"); 
             System.out.println("3. eliminar administrativo"); 
             int opcionB=leer.nextInt();
               
               while (accion!=0){
               boolean estado=true;
               
              System.out.println("Ingrese el tipo documento del administrativo ");
              String tipodocumento=leer.next();
              System.out.println("Ingrese el documento del administrativo");
              String documento=leer.next();
              System.out.println("Ingrese los apellidos del administrativo");
              String apellidos=leer.next();
              System.out.println("Ingrese los nombres del administrativo");
              String nombres=leer.next();
              System.out.println("Ingrese la edad del administrativo");
              int edad=leer.nextInt();
              System.out.println(" activo marque 1  inactivo marque 0");
              int activo=leer.nextInt();
              if (activo==0){
                  estado=false;
              }
              
             System.out.println("Ingrese cargo del administrativo ");
             String cargo=leer.next();
             System.out.println("Ingrese la fecha de contrato del administrativo ");
             String fechacontrato=leer.next(); 
             
             break;  
    }
           case 3:
               
             System.out.println("1. agregar docente");  
             System.out.println("2. modificar docente"); 
             System.out.println("3. eliminar docente");
             int opcionC=leer.nextInt();
                  
             System.out.println(" docente catedraico marque 1, docente de planta marque 0");
             int opcionD=leer.nextInt();
             if (opcionD==1){
               
              while (accion!=0){
              boolean estado=true;
               
              System.out.println("Ingrese el tipo documento del docente ");
              String tipodocumento=leer.next();
              System.out.println("Ingrese el documento del docente");
              String documento=leer.next();
              System.out.println("Ingrese los apellidos del docente");
              String apellidos=leer.next();
              System.out.println("Ingrese los nombres del docente");
              String nombres=leer.next();
              System.out.println("Ingrese la edad del docente");
              int edad=leer.nextInt();
              System.out.println(" activo marque 1  inactivo marque 0");
              int activo=leer.nextInt();
              if (activo==0){
                  estado=false;
              } 
              System.out.println("profesion ");
              String profesion=leer.next();
              System.out.println("asignatura ");
              String asignatura=leer.next();
              System.out.println("fecha inicio");
              String fechainicio=leer.next();
              System.out.println("fecha fin ");
              String fechafin=leer.next();
              
       }   
              while (accion!=0){
              boolean estado=true;
               
              System.out.println("Ingrese el tipo documento del docente ");
              String tipodocumento=leer.next();
              System.out.println("Ingrese el documento del docente");
              String documento=leer.next();
              System.out.println("Ingrese los apellidos del docente");
              String apellidos=leer.next();
              System.out.println("Ingrese los nombres del docente");
              String nombres=leer.next();
              System.out.println("Ingrese la edad del docente");
              int edad=leer.nextInt();
              System.out.println(" activo marque 1  inactivo marque 0");
              int activo=leer.nextInt();
              if (activo==0){
                  estado=false;
              } 
              
              System.out.println("profesion ");
              String profesion=leer.next();
              System.out.println("asignatura ");
              String asignatura=leer.next();
              System.out.println("fecha contrato");
              String fechacontrato=leer.next();
              System.out.println("fecha catidad proyectos ");
              String cantproyectos=leer.next();
                
              
        }
      }
    }
  }
}
    }