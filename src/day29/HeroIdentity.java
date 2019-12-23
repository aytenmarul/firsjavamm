package day29;

public class HeroIdentity {
    public static void main(String[] args) {
  String hero1="Superman-Clark J Kent";
  String[] heroSplitted=hero1.split("-");
String  heroCode=heroSplitted[0];
String fullname=heroSplitted[1];
int nameCharCount=fullname.length();
String star="";
for(int i=0; i<nameCharCount; i++) {
    star = star + "*";
}
        System.out.println(fullname);
        System.out.println(star);
String heroX=heroCode+"-"+star;
        System.out.println("hero1="+hero1);
System.out.println("heroX="+heroX);
    }
}
