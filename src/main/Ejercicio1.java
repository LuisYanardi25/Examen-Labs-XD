/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.lang.Exception;

/**
 *
 * @author Coco
 */
public class Ejercicio1 {
 //es final ya que no se a modificar en el programa  
private final int LimiteDeConsultas = 200;


public ArrayList<Cuenta>ObtenerCuentadeContactos(ArrayList<Contacto> contactos) throws Exception{
  
       if(contactos.size()<LimiteDeConsultas){
         throw new Exception("No puede ser mayor al limite de 200 ");
       }else{
           ArrayList<Cuenta> Cuentas = new ArrayList<>(); 
           ArrayList<Contacto> CuentaObtenida = new ArrayList<>();
           //Con este array AccountId hacemos la consulta 
           ArrayList<Integer> AccountId =new ArrayList<>();
            //Recorremos la lista de contactos, si el contacto tiene una cuenta asociada
            //lo agregamos a la nueva lista
           for(Contacto contacto:contactos ){
               if(contacto.getAccountId() !=null){
                   CuentaObtenida.add(contacto);
               }
           }
            //Llenamos la lista de Id de cuentas
            //Que tienen estos contactos
            for(Contacto a : CuentaObtenida){
                AccountId.add(a.getAccountId());
            }
       Cuentas = [SELECT * FROM Cuenta WHERE id IN :AccountId];
       return Cuentas;
       }       
}  





    
}

