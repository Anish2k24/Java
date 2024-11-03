class StringMethodsExample {
    public static void main() {
        String text = "Hello, World!";
        int length = text.length();
        System.out.println("Length: " + length);
        String lowerCaseText = text.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseText);
        String upperCaseText = text.toUpperCase();
        System.out.println("Uppercase: " + upperCaseText);
        String replacedText = text.replace("World", "Java");
        System.out.println("Replaced: " + replacedText);
        boolean containsWorld = text.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        String substringText = text.substring(7, 12);
        System.out.println("Substring: " + substringText);
        String trimmedText = text.trim();
        System.out.println("Trimmed: " + trimmedText);
    }
}
