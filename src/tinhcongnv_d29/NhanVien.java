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
public class NhanVien implements Serializable{
    private int id;
    private String name, add, pro;
    private static int currentId=99;

    public NhanVien(String name, String add, String pro) {
        this.id = ++currentId;
        this.name = name;
        this.add = add;
        this.pro = pro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        NhanVien.currentId = currentId;
    }
    public Object[] toObjects()
    {
        return new Object[]{id, name, add, pro};
    }
}
