import java.io.FileWriter;
import java.io.IOException;
public class writetofile{
   public static void main(String [] args){
       try{
           FileWriter mywrite=new FileWriter("rita");
           mywrite.write("hello i am roshanpatil");
           mywrite.close();
           System.out.println("successfully wrote in file");

       }
       catch(IOException e){

           System.out.println("an a error occured");
           e.printStackTrace();
       }
   }
}