import java.util.HashSet;

public class Hashing1 {
  public static void main(String[] args) {
    //creating of hashset
    HashSet <Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);

    //Search operating using Contains

    if(set.contains(1)){
      System.out.println("Set contains 1");
    }

    //Delete 
    set.remove(1);
  }
}
