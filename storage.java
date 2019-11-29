import java.util.Scanner;
public class storage {
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
method method=new method();
System.out.println("введите строку:");
String line=input.nextLine();
int double_length=method.storage(line);
System.out.println("значение двойной длины:"+double_length);

    }
}
   class method
   {
         static int storage(String s)
        {
        return s.length()*2;
        }
   }
