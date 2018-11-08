package sportsnews;

import java.util.List;

public interface IAthlete
{
    String provideFullName();
    String provideTeam();
    List<String> provideStats();
}
