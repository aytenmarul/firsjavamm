package day27;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        String[] developersTeam = {"vladislav", "volkan", "emine", "halilibrahim"};
        String[] testerTeam = {"selim", "ismail", "mustafa"};
        String[] businesAnalysistTeam = {"fatma", "sultan", "betul"};
        String[][] scrumteam = {developersTeam, testerTeam, businesAnalysistTeam};
        int maxLength = scrumteam[0][0].length();
        String longestString = "";
        for (String[] each1DArray : scrumteam) {
            for (String eachElement : each1DArray) {

                if (maxLength < eachElement.length()) {

                    maxLength = eachElement.length();
                    longestString = eachElement;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);
// usteki veya alttaki longeststring vericek o da halilibrahim  //12

        for (String[] each1DArray : scrumteam) {
            for (String eachElement : each1DArray) {
                if (maxLength == eachElement.length()) {
                    System.out.println(eachElement);
                }
            }
        }

    }
}