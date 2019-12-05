package practice;

public class Main {

    public static void main(String[] args) {
        amphibian matvey=new frog();
        matvey.moveInWater();
        matvey.moveOnLand();
    frog cheba=(frog)matvey;
    cheba.sayKva();
    amphibian maxon=new triton();
        if(maxon instanceof frog ){
            ((frog)maxon).sayKva();
        }
        else{
            System.out.println("рофлан ошибка,максон не является лягушкой");
        }
    }
}
class amphibian{
    public void moveInWater(){
        System.out.println("плыву,проверяйте");
    }
    public void moveOnLand(){
        System.out.println("делаем шажочки");
    }

}
class frog extends amphibian{
    @Override
    public void moveInWater(){
        System.out.println("плыву,проверяйте");
    }
    @Override
    public void moveOnLand(){
        System.out.println("делаем шажочки");
    }
    public void sayKva() {
System.out.println("kwa");
    }
    }
class triton extends amphibian{

}