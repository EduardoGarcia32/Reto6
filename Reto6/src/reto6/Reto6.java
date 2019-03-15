/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto6;

/**
 *
 * @author Eduardo Garcia
 */
public class Reto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int [][] datos = {{111,192,289,415},{483,500,470,114},{471,355,474,161},{427,158,160,308}};
int [][] datosmasaltos = {{0,0,0,0},{0,0,0,0}};

String [] trimestre = {"Enero a Marzo", "Abril a Junio", "Julio a Septiembre", "Octubre a Diciembre"};

for( int n = 0; n<datos.length; n++){
    for( int i = 0; i<datos.length; i++){
        if(datos[i][n]>datosmasaltos[0][n]){
            datosmasaltos[0][n] = datos[i][n];
            datosmasaltos[1][n] = i;
        }
    }
} 
        System.out.println("El periodo donde más se vendio el sabor de chocolate fue: " +trimestre[datosmasaltos[1][0]]);
        System.out.println("El periodo donde más se vendio el sabor de vainilla fue: " +trimestre[datosmasaltos[1][1]]);
        System.out.println("El periodo donde más se vendio el sabor de fresa fue: " +trimestre[datosmasaltos[1][2]]);
        System.out.println("El periodo donde más se vendio el sabor de oreo fue: " +trimestre[datosmasaltos[1][3]]);

            int[] totaltrimestres = {0,0,0,0,};
            int [][] trimestreconmasventa = {{0},{0}};
        
        for( int n = 0; n<datos.length; n++){
            for( int i = 0; i<datos.length; i++){
                totaltrimestres[n] += datos [n][i];
    }   
} 
    for (int n = 0; n<datos.length; n++){
        if(totaltrimestres[n]>trimestreconmasventa[0][0]){
            trimestreconmasventa[0][0] = totaltrimestres[n];
            trimestreconmasventa [1][0] = n;
            }
        }
        System.out.println("El trimestre que tubo mayor venta de producto fue : "+trimestre[trimestreconmasventa[1][0]]);
    }
    
}
