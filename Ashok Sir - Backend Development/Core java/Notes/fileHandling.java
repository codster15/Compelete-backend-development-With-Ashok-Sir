



    
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
----------------------------------------------------------------------------------------------------


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




    





                  Assignments -->  file handling




program 1
=======


1 >  write a java program to find how many character, how many words and how many lines available in the file

package Assignment;

import java.io.*;

//1 >  write a java program to find how many character, how many words and
// how many lines available in the file
public class assignmentOne {

    //  ----------------------------------------------------------------------------file created and data Inserted
    public static void createFile () throws IOException {
        FileWriter fr = new FileWriter("demoFile.txt");

        fr.write("A paragraph is a series of sentences that are organized and coherent, and are all related to a single topic. Almost every piece of writing you do that is longer than a few sentences should be organized into paragraphs. This is because paragraphs show a reader where the subdivisions of an essay begin and end, and thus help the reader see the organization of the essay and grasp its main points.");
        fr.flush();
        fr.close();
    }


    // ----------------------------------------------------------------------------character find
    public static void CharaterFind() throws IOException {
        FileReader fr = new FileReader("demoFile.txt");
        int a = fr.read();
        int count = 0;
        int TotalCharacter;

        while(a != -1){
            count++;

            a = fr.read();
        }
        TotalCharacter = count;
        System.out.println("Total Character in file are - " + TotalCharacter);

    }


    //  ---------------------------------------------------------------------------- to count words
    public static void wordCount () throws IOException {
        FileReader fr = new FileReader("demoFile.txt");
        int a = fr.read();
            int count = 0;

            while(a != -1){
                if(a == 32 ){
                    count++;
                }

                a = fr.read();
            }
            count++;
            int noOfWord = count;

        System.out.println("total number of words in the file is => " + noOfWord);


    }


//   ----------------------------------------------------------------------------TO count line
    public static void Line() throws IOException {
        FileReader fr = new FileReader("demoFile.txt");
        BufferedReader br = new BufferedReader(fr);
       String line = br.readLine();
       int count = 0;

       while(line != null){

           count++;
           line = br.readLine();

       }
        System.out.println();
        System.out.println("Total lines - " + count);



    }


    public static void main(String[] args) throws IOException {
             //createFile();
            // CharaterFind();
           // wordCount();
          //Line();





    }
}



-------------------------------------------------------------------------------------------------------------------------------------


program 2
=======


2 > write a java program to read 2 files data and write 2 files content into 3 rd file.


package Assignment;

//program 2
//=======

//2 > write a java program to read 2 files data and
// write 2 files content into 3 rd file.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class assignmentTwo {

    public static void main(String[] args) throws IOException {
        SecondProgram();
    }

    public static void SecondProgram() throws IOException {

        FileWriter fw1 = new FileWriter("file1.txt");
        fw1.write("Paragraphs are the building blocks of papers.\n Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a " +
                "page " +
                "long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph \n. A paragraph is defined as “a group of sentences or a single " +
                "sentence that forms a unit” (Lunsford and Connors 116). Length and appearance do not determine whether\n a section in a paper is a paragraph. For instance, in some styles of " +
                "writing, particularly journalistic styles, a paragraph \n can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea. In " +
                "this handout, we will refer to this as the “controlling idea,\n” because it controls what happens in the rest of the paragraph.");

        fw1.flush();
        fw1.close();



        FileWriter fw2 = new FileWriter("file2.txt");
        fw2.write("The final movement in paragraph development involves tying up the loose ends of the paragraph. \nAt this point, you can remind your reader about the relevance of the " +
                "information " +
                "to the larger paper, or you can make a concluding point for \n this example. You might, however, simply transition to the next paragraph.\n" +
                "\n");
        fw2.flush();
        fw2.close();

//        --------------------------------------  file combine    --------------------------
//file 1 read
        FileReader frReader1 = new FileReader("file1.txt");
        BufferedReader brOfFile1 = new BufferedReader(frReader1);
        String fileone = brOfFile1.readLine();
        String f1data = fileone;


        while(fileone != null){

            f1data += fileone;


            fileone = brOfFile1.readLine();


        }






//file 2 read
        FileReader frReader2 = new FileReader("file2.txt");
        BufferedReader brOfFile2 = new BufferedReader(frReader2);
        String fileTwo = brOfFile2.readLine();
        String f2data = fileTwo;

        while(fileTwo != null){

            f2data += fileTwo;
            fileTwo = brOfFile2.readLine();

        }




        System.out.println();


//file 1 added in combine
//        FileWriter fwCombine = new FileWriter("Combine.txt");
//            fwCombine.write(f1data);
//
//            fwCombine.write("\n");
//
//            fwCombine.write(f2data);
//            fwCombine.flush();

//reading data

       FileReader frCombine = new FileReader("Combine.txt");
       BufferedReader brCombine = new BufferedReader(frCombine);
       String Combine = brCombine.readLine();


       while(Combine != null){
           System.out.println(Combine);
           Combine = brCombine.readLine();

       }




    }
}


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------



    .                                 -->    day 28  (28 - 1 - 2024)



.                                                 C O R E   J A V A


.    lec -58








            file handling



program ==> to write on console without using System.out.print
========



package fileHandlingAll.jan28_2024;

import java.io.PrintWriter;

public class printwriter {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.print("hello");
        pw.flush();
        pw.close();
    }
}

---------------------------------------------------------------------


program ==> we can write in file also using print writer
=======



package fileHandlingAll.jan28_2024;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printwriter2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("f1.txt");
        pw.print("hello every one");
        pw.close();
        pw.close();
    }
}

--------------------------------------------------------------------------



Serialization and de - Serialization topic
=========================

program
========


package fileHandlingAll.jan28_2024;

import java.io.*;

public class person implements Serializable {
    int id ;
    String name;
    String gender;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        person p = new person();
        p.id = 43434;
        p.name = "linken";
        p.gender  = "male";

        System.out.println("=========  Serialization started   ===========");

        FileOutputStream fos = new FileOutputStream("dataStr.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.flush();
        oos.close();

        System.out.println("=========  Serialization Compeleted   ===========");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=========  De - Serialization started   ===========");

            FileInputStream fis = new FileInputStream("datastr.ser"); // here connecting to the file
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            person p1 = (person) obj;
        System.out.println(p1.id);
        System.out.println(p1.name);
        System.out.println(p1.gender);
        ois.close();

        System.out.println("=========  De - Serialization Compeleted   ===========");
    }
}

--------------------------------------------------------

 traiensient
 // -  when we don't wanrt to serialize secret data then we go for treintent keyword -- > (transient int password ; )





.                                             FILER HANDLING COMPELETD




#####################################################################################################################################################################################


