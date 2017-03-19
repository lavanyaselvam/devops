
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class Text
{
public static void main(String args[]) 
{
try
{
FileWriter out=new FileWriter("test.txt");
BufferedWriter b=new BufferedWriter(out);
b.write("I am a sentence in text file");b.close();
System.out.println("File successfully written");
}
catch(Exception e)
{
e.printStackTrace();
}
}}