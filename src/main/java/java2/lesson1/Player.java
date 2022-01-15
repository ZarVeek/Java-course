package java2.lesson1;

public interface Player extends Runnable, Jumpable {
 boolean isPlayer();

 void setPlay(boolean success);

 int getJumpLimit();

 int getRunLimit();

 @Override
 default void jump(Wall wall){
  if (isPlayer()){
   if(wall.getHight() <= getJumpLimit()){
    System.out.println(this + "успешно перегнул" + wall);
   }
   else {
    System.out.println(this + "не перегнул" + wall);
    setPlay(false);
   }
  }
 }

 @Override
 default void run(Treadmill treadmill){
  if (isPlayer()){
   if(treadmill.getDinstance() <= getRunLimit()){
    System.out.println(this + "успешно пробежал" + treadmill);
   }
   else {
    System.out.println(this + "не пробежал" + treadmill);
    setPlay(false);
   }
  }
 }
}
