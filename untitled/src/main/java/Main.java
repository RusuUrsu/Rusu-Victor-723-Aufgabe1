import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
   public static List<Spielort> readSpielorts(String filename){
       try {
           ObjectMapper objectMapper = new ObjectMapper();

           // Deserialize JSON array into a List of Spielort objects
           List<Spielort> spielorts = objectMapper.readValue(
                   new File(filename),
                   new TypeReference<List<Spielort>>() {}
           );

           // Print each Spielort
           for (Spielort spielort : spielorts) {
               System.out.println(spielort);
           }

           return spielorts;

       } catch (Exception e) {
           e.printStackTrace();
       }
        return null;

   }

    public static void main(String[] args) {
        System.out.println("Hello World");
        readSpielorts("E:\\Sem3\\MAP\\Rusu_Victor_723_Aufgabe1\\untitled\\src\\main\\java\\spielorte.json");

   }
}