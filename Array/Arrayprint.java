public class Arrayprint
{
    public static void main(String[] args) {
        String [] Country = new String[4];
        Country[0]= "India";
        Country[1]= "Nepal";
        Country[2]= "Bhutan";
        Country[3]= "Japan";
        for(String str: Country){
            System.out.println(str);
        }
    }
}