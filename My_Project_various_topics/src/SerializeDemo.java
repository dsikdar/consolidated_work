import java.io.*;
public class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("E:/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         // object -> serialied -> ObjectOutputStream
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in E:/ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
 class Employee implements java.io.Serializable {
	   public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	}