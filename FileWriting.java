import java.io.FileWriter;

class FileWriting
{
public static void main(String args[])
{
try
{
FileWriter f = new FileWriter("new.txt");
f.write("WELCOME....");
f.close();
}
catch(Exception d)
{
System.out.println(d);
}
}
}