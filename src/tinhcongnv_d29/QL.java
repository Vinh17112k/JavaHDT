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
public class QL implements Serializable{
    private CongViec C;
    private NhanVien N;
    private int gio;

    public QL(CongViec C, NhanVien N, int gio) {
        this.C = C;
        this.N = N;
        this.gio=gio;
    }

    public CongViec getC() {
        return C;
    }

    public void setC(CongViec C) {
        this.C = C;
    }

    public NhanVien getN() {
        return N;
    }
    
    public int getGio(){
        return gio;
    }
    public void setGio(int gio)
    {
        this.gio=gio;
    }
    public void setN(NhanVien N) {
        this.N = N;
    }
    public Object[] toObjects()
    {
        return new Object[]{N.getId(), N.getName(), C.getId(), C.getName(), C.getCost(), gio};
    }
}
