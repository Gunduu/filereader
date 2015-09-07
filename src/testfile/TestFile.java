/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfile;

import java.io.*;
import java.io.IOException;


public class TestFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String dirName = "d:/test/foldertest/";
        String fileName = "listCapital.txt";
        String seperateField = ",";
        
        
        
        //--------------------- to create a file in the folder-------------
        File productsFile = new File (dirName+fileName);
        if(!productsFile.exists())
            productsFile.createNewFile();
        
        //--------------------- to write any information in the file-------------
        PrintWriter out = new PrintWriter(
                          new BufferedWriter(
                          new FileWriter(productsFile)));
        out.println("mali"+seperateField+ "Bamaka");
        out.println("India"+seperateField+ "Delhi");
        out.println("Canada"+seperateField+ "Ottawa");
        out.println("USA"+seperateField+"Washington DC");
        
        //------------- if file is not closed means it will not save the data------------
        out.close();
        
        //--------------- yo read any information for the file--------
        BufferedReader in = new BufferedReader(
                            new FileReader(productsFile));
        
        String line = in.readLine();
        while(line != null){
        System.out.println(line);
        line=in.readLine();
        }
       
        
        //----------------------- using split--------
         BufferedReader in1 = new BufferedReader(
                            new FileReader(productsFile));
        
        String line1 = in1.readLine();
        
        while(line1 !=null){
        String[] columns = line1.split(seperateField);
        String Country = columns[0];
        String Capital = columns[1];
        System.out.println("The capital of "+Country+" is "+Capital);
        line1=in1.readLine();
        }
        in.close();
        
       
    }
    
}
