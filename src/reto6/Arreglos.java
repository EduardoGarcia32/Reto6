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
public class Arreglos {

    int [][] datos = {{111,192,289,415},{483,500,470,114},{471,355,474,161},{427,158,160,308}};
    int [][] datosmasaltos = {{0,0,0,0},{0,0,0,0}};

String [] trimestre = {"Enero a Marzo","Abril a Junio","Julio a Septiembre","Octubre a Diciembre"};

for( int n = 0; n < datos.length; n++){
    for( int i = 0; i<datos.length; i++){
        if(datos[i][n]>datosmasaltos[0][n]){
            datosmasaltos[0][n] = datos[i][n];
            datosmasaltos[1][n] = i;
        }
    }
}
