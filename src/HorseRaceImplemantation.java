import java.util.*;

public class HorseRaceImplemantation implements HorseRace{
    @Override
    public Horse[] run(Horse[] horses) {
        Queue<Horse> horseList = new LinkedList<>();
        Horse[] winnerHorses = new Horse[horses.length];
        List<Horse> listOfHorse = new ArrayList<>();
        for(Horse horse: horses){
            for(int i=0; i<horse.power; i++)
                listOfHorse.add(horse);
        }

        Random random = new Random();
        int index = 0;
        for(Horse horse: horses) {
           int num = random.nextInt(listOfHorse.size());

           winnerHorses[index] = horse;
           index++;
        }

        return winnerHorses;
    }
}
