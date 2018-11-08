package sportsnews;

import java.util.ArrayList;
import java.util.List;

public class NewsPrinter
{
    private List<IAthlete> athletes;

    public NewsPrinter(IAthlete... athletes)
    {
        this.athletes = new ArrayList<>();

        for (IAthlete athlete : athletes)
        {
            this.athletes.add(athlete);
        }
    }

    public void printAthleteStats()
    {
        for (IAthlete athlete : athletes)
        {
            //print out each person
            System.out.println("Athlete: " + athlete.provideFullName());
            System.out.println("Plays on team: " + athlete.provideTeam());
            System.out.println("**************");

            for (String stat : athlete.provideStats())
            {
                System.out.println(stat);
            }
            System.out.println();
        }
    }
}