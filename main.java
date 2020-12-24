/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Copyright(C) Pulastya.LLC All Rights Reserved*/


package zip_unzip;


import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import java.util.zip.*;
import java.util.ArrayList;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.FileOutputStream;
import java.io.*;
/**
 *
 * @author user
 */
public class Zip_Unzip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, FileNotFoundException, IOException {
        
        JFileChooser fs=new JFileChooser();
        fs.showOpenDialog(fs);
        File filename=fs.getSelectedFile();
        System.out.println(filename.getAbsolutePath());
        System.out.println(filename.getName());
        
        FileOutputStream fos=new FileOutputStream(filename+".zip");
        ZipOutputStream zos=new ZipOutputStream(fos);
        FileInputStream fis=new FileInputStream(filename);
        ZipEntry zip=new ZipEntry(filename.getName());
        zos.putNextEntry(zip);
        byte[] byt=new byte[1024];
        int length;
        while((length = fis.read(byt))>=0){
            zos.write(byt,0,length);
        }
        zos.close();
        fis.close();
        fos.close();
        
       
        
        //String[] str=filename.getName().split(".");
        //System.out.println(str[0]);
 
        //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

// TODO code application logic here
    }
    
}
