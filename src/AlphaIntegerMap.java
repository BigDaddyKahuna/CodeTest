import java.util.HashMap;
import java.util.Map;

/***
 * Responsible for converting an alpha character into it's correlated value.
 */
public class AlphaIntegerMap
{
    // Map containing the working values
    private Map<String, Integer> charIntMap = new HashMap<>();

    // Constructor
    public AlphaIntegerMap()
    {
        loadMap();
    }

    /***
     * Returns the integer value for the passed in character.  The character will exist in the map ONLY
     * if the character is a character in the English alphabet.
     *
     * Return for all other characters is 0
     *
     * @param pChar
     * @return Integer correlating to the passed in character if it is in the alphabet, zero if it is not.
     */
    public Integer getCharValue(char pChar)
    {
        // Return value defaulted to 0 in case the character is not in the alphabet.
        Integer returnValue = 0;

        // Get value of char in alphabet
        if (charIntMap.containsKey(String.valueOf(pChar).toUpperCase()))
        {
            returnValue = charIntMap.get(String.valueOf(pChar).toUpperCase());
        }
        return returnValue;
    }

    /**
     * Load the map with the with numeric values for each letter in the alphabet.
     * For example:
     * A = 1
     * B = 2
     * C = 2
     * And so on...
     */
    private void loadMap()
    {
        int charValue = 1;

        for (char ch = 'A'; ch <= 'Z'; ++ch)
        {
            charIntMap.put(String.valueOf(ch), charValue++);
        }
    }
}
