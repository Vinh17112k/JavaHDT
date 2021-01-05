/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhcongnv_d29;

import java.io.Serializable;

/**
 *
 * @author Quang Vinh
 */
public class CongViec implements Serializable{
    private int id, cost;
    private String name, type;
    private static int currentId=99;

    public CongViec(int cost, String name, String type) {
        this.id = ++currentId;
        this.cost = cost;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        CongViec.currentId = currentId;
    }
    public Object[] toObjects()
    {
        return new Object[]{id, name, type, cost};
    }
}
