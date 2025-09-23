public class StringAllMethod {
    public static void main(String[] args) {
        String str = "  Hello Java World  "; 

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Char at index 2: " + str.charAt(2));

        // 3. toUpperCase() & toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 5. equals() & equalsIgnoreCase()
        System.out.println("Equals '  Hello Java World  '? " + str.equals("  Hello Java World  "));
        System.out.println("EqualsIgnoreCase '  hello java world  '? " + str.equalsIgnoreCase("  hello java world  "));

        // 6. contains()
        System.out.println("Contains 'Java'? " + str.contains("Java"));

        // 7. startsWith() & endsWith()
        System.out.println("Starts with '  He'? " + str.startsWith("  He"));
        System.out.println("Ends with 'ld  '? " + str.endsWith("ld  "));

        // 8. indexOf() & lastIndexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'o': " + str.lastIndexOf("o"));

        // 9. substring()
        System.out.println("Substring (2, 7): " + str.substring(2, 7));

        // 10. replace()
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 11. split()
        String[] words = str.trim().split(" ");
        System.out.println("Split into words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 12. isEmpty()
        System.out.println("Is empty? " + str.isEmpty());

        // 13. compareTo()
        System.out.println("CompareTo '  Hello Java World  ': " + str.compareTo("  Hello Java World  "));

        // 14. concat()
        System.out.println("Concatenation: " + str.concat("!!!"));

        // 15. valueOf()
        int num = 100;
        System.out.println("ValueOf 100: " + String.valueOf(num));

        // 16. matches()
        System.out.println("Matches regex '.*Java.*'? " + str.matches(".*Java.*"));
    }
}
