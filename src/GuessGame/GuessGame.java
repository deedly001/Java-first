package GuessGame;

public class GuessGame {

  Player p1;
  Player p2;
  Player p3;

  public void startGame() {
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessp1;
    int guessp2;
    int guessp3;

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    int targetNum = (int) (Math.random() * 10);
    System.out.println("Игра угадай число!\nЗагадываю число от 0 до 9...");

    while (true) {
      System.out.println("Число, которое нужно угадать, - " + targetNum);

      p1.guess();
      p2.guess();
      p3.guess();

      guessp1 = p1.number;
      System.out.println("Первый игрок думает , что это -  " + guessp1);
      guessp2 = p2.number;
      System.out.println("Второй игрок думает , что это -  " + guessp2);
      guessp3 = p3.number;
      System.out.println("Третий игрок думает , что это -  " + guessp3);

      if (guessp1 == targetNum) {
        p1isRight = true;
      }
      if (guessp2 == targetNum) {
        p2isRight = true;
      }
      if (guessp3 == targetNum) {
        p3isRight = true;
      }

      if (p1isRight || p2isRight || p3isRight) {
        System.out.println("У нас победитель!");
        if (p1isRight) {
          System.out.println("Первый игрок угадал!");
        } else if (p2isRight) {
          System.out.println("Второй игрок угадал!");
        } else {
          System.out.println("Третий игрок угадал!");
        }
        System.out.println("Игра окончена!");
        break;
      } else {
        System.out.println("Игроки должны попробовать еще раз!");
      }
    }
  }
}

