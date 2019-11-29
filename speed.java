public class speed {
    public static void main(String[] args){
velacity velacity=new velacity();
System.out.println("velacity is equal to "+velacity.velacity(30,1000));
    }
}
class velacity{
    static double velacity( int time,double distance){
        return distance/time;
        }
        }