package com.example.wb00188.arithmaticchallenge;

public class Division extends ArithmeticChallenge {
    int mNum1, mNum2;

    public Division(int TOTAL_LEVELS, int TURNS_PER_LEVEL) {
        super(TOTAL_LEVELS, TURNS_PER_LEVEL);
    }

    protected String createQuestion() {
        mNum1 = (int)(13*Math.random());
        mNum2 = (int)(13*Math.random());
        String question = (mNum1 + " \u00F7 " + mNum2);
        return question;
    }

    protected int[] createChoices() {
        int[] choices = new int[3];

        for(int i = 0; i < choices.length; i++)
                choices[i] = (int) (13 * (Math.random())) / (int) (13 * (Math.random()));

        choices[0] = mNum1 / mNum2;
        return choices;
    }
}
