/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Coco
 */
public class Ejercicio4 {
    
    public boolean EsValido(int IdDato){
        //Traigo la orden que tenga el id dato de la bd
        Order order= [SELECT * FROM Order WHERE Id=IdDato];
           //Verifico que el status de la orden sea valida
        if(order.isStatus()){
            //Creo una lista de id de productos, para obtener la relacion con OrderItem
            //Para asi llegar a la lista de productos
            ArrayList<Integer> productoID = [SELECT ProductId FROM OrderItem WHERE OrderId=IdDato];
            
            //Recorre la lista de productoIds y verifico la combinacion sea valida
            for(Integer prodid: productoID){
                ArrayList<RelationShip> relationship = [SELECT * FROM RelationShip WHERE RelationedProductId=prodid OR MainProductId=prodid];
                //Verifico si la lista es vacia, es porque no hay combinacion valida
                if(relationship.isEmpty()){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    
}
