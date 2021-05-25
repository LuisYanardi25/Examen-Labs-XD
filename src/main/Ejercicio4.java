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
        Order order= [SELECT * FROM Order WHERE Id:IdDato];
        if(order.isStatus()){
            ArrayList<Product> productoID = [SELECT ProductId FROM OrdemItm WHERE OrderId=IdDato];
            for(Product producto:productoID){
                ArrayList<RelationShip> relationship = [SELECT productId FROM Product WHERE Id IN(SELECT RelationedProductId FROM RelationShip WHERE(MainProductId=1))];
                if(relationship.isEmpty()){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
}
