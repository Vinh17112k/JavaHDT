/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Quang Vinh
 */
public class fileio {
    public static void read(ArrayList listObj, String file)
    {
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
            Object obj=null;
            while((obj=ois.readObject())!=null)
            {
                Object o=(Object ) obj;
                listObj.add(o);
            }
            ois.close();
        } catch (IOException |ClassNotFoundException e) {
        }
    }
    public static void write(ArrayList listObj, String file)
    {
        try {
            ObjectOutputStream ois=new ObjectOutputStream(new FileOutputStream(file));
            for(Object o:listObj)
                ois.writeObject(o);
            ois.close();
        } catch (IOException e) {
        }
    }
}
