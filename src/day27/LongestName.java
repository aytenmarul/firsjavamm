package day27;

public class LongestName {
    public static void main(String[] args) {

        String[] developersTeam = {"vladislav", "volkan", "emine", "halilibrahim"};
        String[] testerTeam = {"selim","ali", "ismail", "mustafa"};
        String[] businesAnalysistTeam = {"fatma", "sultan", "betul"};
        String[][] scrumteam = {developersTeam, testerTeam, businesAnalysistTeam};

        int minLength = scrumteam[0][0].length();
        String shortestString = scrumteam[0][0];
        for (int i = 0; i < scrumteam.length; i++) {
            for (int j = 0; j < scrumteam[i].length; j++) {
                if (minLength > scrumteam[i][j].length()) {
                    minLength = scrumteam[i][j].length();
                    shortestString = scrumteam[i][j];

                }
            }

        }
           System.out.println(minLength);
           System.out.println(shortestString);
            //System.out.println();

    }
}