package AP_1;

/**
 * Created by ulloav on 7/25/2016.
 */
public class scoreUp {

    public static int scoreUp(String[] key, String[] answers)
    {
        int score = 0;

        printUtilities.printStringArray(answers);
        printUtilities.printStringArray(key);

        if(key.length == answers.length)
        {
            for(int i = 0; i < key.length; i++)
            {
                if((answers[i] != key[i]) && (answers[i] != "?"))
                {
                    score -= 1;
                }
                else if(answers[i] == "?")
                {
                    score += 0;
                }
                else
                {
                    score += 4;
                }
            }
        }


        return score;
    }

}
