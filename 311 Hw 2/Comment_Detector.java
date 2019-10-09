
/**
 * Write a description of class Comment_Detector here.
 *
 * jayson Schaefer 
 * 10/8/19
 * 
 * Comment Detector
 *  - Read contents of a file 
 *  - detect is there are C style comments (/*...  * /)
 *  - print comment loction start and end
 *  
 */
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.FileNotFoundException;
import java.util.Scanner;
public class Comment_Detector
{
    public static void main(String[] args) throws Exception
    {
        
        File file = new File("/Users/jaysonschaefer/Desktop/311/311 hw 2/311 Hw 2/test.txt"); 
        //Scanner sc = new Scanner(file); 

        //while (sc.hasNextLine()) 
        //{
        //    System.out.println(sc.nextLine()); 
        //}
        
        FileReader fr = new FileReader(file);   //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr);  //Creation of BufferedReader object
        int c = 0;
        while((c = br.read()) != -1)         //Read char by Char
        {
            char character = (char) c; 
            System.out.print(character);
        } 
    }
}

