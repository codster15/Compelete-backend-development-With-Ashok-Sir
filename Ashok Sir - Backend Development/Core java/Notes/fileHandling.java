



    
    .                                 -->    day 27  (27 - 1 - 2024)



.                                                 C O R E   J A V A



lec -56

            file handling




   program
   =========




   package fileHandlingAll;

import java.io.File;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        File f = new File("deepakSingh.txt"); //  new file will create --> deepak.txt
        boolean checkfstatus = f.createNewFile(); // this line will create the new file
        System.out.println(checkfstatus); // it will return the boolean status file created or not
        //-------------------------------------------------------------------------------------------------

        File f1 = new File("java.txt"); //  new file will create --> java.txt
        boolean checkf1status = f1.createNewFile(); // this line will create the new file
        System.out.println(checkfstatus); // it will return the boolean status file created or not
        //---------------------------------------------------------------------------------------


        File f2 = new File("My work Station");
        boolean check3 = f2.mkdir();
        System.out.println(check3);

        
// here creating directry
        File f4 = new File("data");
        f4.mkdir(); // here creating directry
        
        
// here storing (test.txt) file in --> (data) directory
        File f5 = new File(f4 ,"test.txt");
        f5.createNewFile();  //  new file will create  of test.txt and store in --> f4
        
    }
}
-----------------------------------------------------------------------------------------------------------------------------------



program ==> // beautiful program it will return the list of file available in the path



package fileHandlingAll;

import java.io.File;

public class listOfFile {

    public static void main(String[] args) {
        File f = new File("H:\\FULL STACK DEVELOPER\\Backend Part\\Vs code upload\\Ashok Sir - Backend Development\\Core java\\Notes");

// beautiful program
        String [] arr = f.list();  // f.list(); --> this will store all the file in the (arr) of above path 

        for(String name : arr){
            System.out.println(name);
        }
    }

}



-----------------------------------------------------------------------------------------------------------------------------------



program - important to check file or directory
=========



package fileHandlingAll;

import java.io.File;

public class filefilter {
    public static void main(String[] args) {
        File f = new File("I:\\testing");
        String []arr = f.list();

        for(String name: arr){
            File f1 = new File(f,name);  // (f,name); here f --> is the parent , and  (name) --> child which is content inside the parent
            if(f1.isFile()){
                System.out.println("File - "+ name);
            }if(f1.isDirectory()){
                System.out.println("Directory - "+ name);
            }
        }
    }
}


-------------------------------------------------------------------------------------------------------------------------------------


program = to delete the file 
========




package fileHandlingAll;

import java.io.File;

public class deletefile {
    public static void main(String[] args) {
        File f = new File("deepakSingh.txt");
        boolean check = f.delete();
        System.out.println(check);
    }
}
---------------------------------------------------------------------------------------------------------------------------------------


program => writing file using --> FileWriter
======

package fileHandlingAll;

import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("java.txt");
        fw.write("hi every one");
        fw.flush();
        fw.close();
    }
}


----------------------------------------------------------------------------------------------------------------------------------


-->


package fileHandlingAll;

import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("java.txt");
        fw.write("hi every one");



//important
        fw.write("\n"); // \n will change the line
        fw.write("\t"); // \t will give tab space
        fw.write("\s");  // \s will give just space
//-------------------------------------------------------------
        fw.write("how are you");
        fw.flush();
        fw.close();
    }
}



----------------------------------------------------------------------------------------------------------------------------------

   --> FileReader

program  =>  to read all the character from the file 
========



package fileHandlingAll;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
    public static void main(String[] args) throws IOException {
        FileReader  fr = new FileReader("z.txt");
        int a = fr.read();



        while(a != -1){  // condition to read all character from the file

            System.out.print((char) a);  // here i am doing type casting
            a = fr.read();

        }

         fr.close(); // to close the connection btw java to file


    }
}


----------------------------------------------------------------------------------------------------------------------------------



Buffered reader


program  --> to read the file line by line 


package fileHandlingAll;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("z.txt");
        BufferedReader br = new BufferedReader(fr); // to read line by line fileReader is required
        String a =  br.readLine();


        while (a != null){  // condition when readline will become null that means all the line got readed

            System.out.println(a);
            a = br.readLine();
        }


    }
}



.                                            Assignments

Notes ==> if you do these programs you are good with file handling
        - with only there concepts required -->  ( filereader ,FileWriter , bufferedReader).



1 >  write a java program to find how many character, how many words and how many lines available in the file

2 > write a java program to read 2 files data and write 2 files content into 3 rd file.

3 > write a java program to find common names which are available in 2 files .
    ex - file 1- ram ,shaym,ganesh
        -file 2 - karan, ram ,mahesh  
        // output shold be -->  ram






----------------------------------------------------------------------------------------------------------------------------------