/*File: PasswordTestJose.java
Project: CSIS3101 Assignment 11 
Author: Jose Ron Coka
History: Version 1.0 April 8, 2022*/


import java.io.File;
import java.io.*;
import java.util.Scanner;
public class PasswordTestJose {
        
    public static void main(String[] args) throws IOException {
        
    //input file, must be on the project folder, not inside src
    File iFile= new File("passwdin.txt");
    //output file
    File oFile= new File("Josepasswdout.txt");

    if (iFile.exists()==false){
        System.out.println("File does not exist");
        System.exit(1);
    }
    if (oFile.exists()){
        System.out.println("File already exist");
        System.exit(1);
    }
    Scanner inp= new Scanner(iFile);
    //Write into file 
    PrintWriter outp= new PrintWriter(oFile);
    
    while (inp.hasNext()){

        String testPass= inp.next();
        Passw0rdJose test= new Passw0rdJose(testPass);
        String outString= test.checkPassword();

        String printOut= testPass+ " - "+outString; 
        outp.println(printOut);
    }
    //Always close input scanner when reading files. 
    inp.close();
    outp.close();
}
}
