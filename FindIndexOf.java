import java.util.Scanner;
public class FindIndexOf 
{
   public static void main(String[] args) {
    Scanner jt=new Scanner(System.in);
    String haystack=jt.nextLine();
    String needle=jt.nextLine();
    SolutionOne sc=new SolutionOne();
    System.out.println(sc.strStr(haystack, needle));
   }
}
class SolutionOne {
    public int strStr(String haystack, String needle) {
        if(haystack.indexOf(needle)>-1)
        {
            int c=haystack.indexOf(needle);
            return c;
        }
        else
        {
            return -1;
        }
    }
}
