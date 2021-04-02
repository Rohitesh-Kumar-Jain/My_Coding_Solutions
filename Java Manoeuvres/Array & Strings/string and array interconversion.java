It's possible to convert between strings and character arrays using special methods like valueOf() or toCharArray():

        char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };

        String stringFromChars = String.valueOf(chars); // "ABCDEF"

        char[] charsFromString = stringFromChars.toCharArray(); // { 'A', 'B', 'C', 'D', 'E', 'F' }

        String theSameString = new String(charsFromString); // "ABCDEF"

        There is another way to turn a string into an array. Take a look:

        String text = "Hello";
        String[] parts = text.split(""); // {"H", "e", "l", "l", "o"}