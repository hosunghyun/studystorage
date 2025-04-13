
public class StringFind {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB"; 
        
        pat.replaceAll("A", "C").replaceAll("B", "A").replaceAll("C","B");
        
        System.out.println((myString.contains(pat)) ? 1 : 0);
    }
}