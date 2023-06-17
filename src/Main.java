/*

The task is to implement HorseRace interface:
interface HorseRace {
 Horse[] run (Horse[] horses);
 }
 Run method accepts list of participants and returns the same horses in finishing order (race result).
 Run method shouldn’t return the same result for multiple invocations. There can be 2-12 horses in one race.
 public class Horse {
 public String name;
  public int power;
  }

  Power is int from range 1 to 15 (inclusive) which represents chances to win.

  Example:
The race with two horses:
1) Horse with name “Turtle” and power 4
 2) Horse with name “Bullet” and power 8
 “Bullet” has twice more chances to win than “Turtle”, but “Turtle” still has chance to win.
 */


public class Main {
    public static void main(String[] args) {
       HorseRace horseRace = new HorseRaceImplemantation();
       Horse[] horses = new Horse[2];
       horses[0] = new Horse("Turtle",4);
       horses[1] = new Horse("Bullet", 8);
       Horse[] winners = horseRace.run(horses);
       for (Horse winner: winners)
           System.out.println(winner);
    }
}