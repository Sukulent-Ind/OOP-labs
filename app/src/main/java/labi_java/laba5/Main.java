package labi_java.laba5;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] {
            "Павел", "Азат", "Никита", "Илона", "Георгий", "Дмитрий", "Софья", 
            "Вячеслав", "Василий", "Никита", "Дмитрий", "Арсений", "Никита", 
            "Антон", "Егор", "Егор", "Андрей", "Михаил", "Анастасия", "Илья", 
            "Роман", "Денис", "Виктор", "Владислав", "Данил"
        };

        String[] surnames = new String[] {
            "АГЛУШЕВИЧ", "БАЙКИН", "БЕЛОГУР", "БУКАТКА", "ВАЛЯВКО", "ВАСЮК", 
            "ГРИШКЕВИЧ", "ЗАЙЦЕВ", "ЗГУРСКИЙ", "КИБКАЛО", "КОЗАРЬ", "КОНЫЧЕВ", 
            "ЛИХОБАБИН", "МАСАЛЬСКИЙ", "ОЖЕРЕЛЬЕВ", "ПАНЬКОВ", "ПЕТРОВСКИЙ", 
            "ПОНАМАРЕВ", "ПОЯСНЮК", "ПРИТУЖАЛОВ", "ПЧЁЛКИН", "СКОВОРОДИН", 
            "СУЛИМОВ", "ШАТИЛО", "ШЕБАЛОВ"
        };
          
        try(FileOutputStream fos=new FileOutputStream("notes.txt"))
        {
            for (int i = 0; i < names.length; i++) {
                String text = names[i] + " " + surnames[i] + "\n";
                byte[] buffer = text.getBytes();
                fos.write(buffer, 0, buffer.length);
            }
              
            
            System.out.println("The file has been written");
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        }

        //reserve

        try(FileInputStream fis=new FileInputStream("notes.txt"); FileOutputStream copy = new FileOutputStream("reserve.txt"))
        {
            int i;
            while ((i=fis.read())!=-1) {
                copy.write(i);
            }

            System.out.println("The file has saved");
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        }

        //delete
        File fileToDelete = new File("notes.txt");
        boolean isDeleted = fileToDelete.delete();
        if (isDeleted) {
            System.out.println("File was deleted");
        } else {
            System.out.println("File wasn`t deleted");
        }


    }
}