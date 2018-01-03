package com.uic.prelimexam.dorado;

public class Bugtong {
    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 6;          //Array maximum size
    public final int TOTAL_SIZE = 6;        //Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
    public static int SCORE = 50;           /*Scoring Rule:
                                                if correct score => sum of current score and timeremaining multiplied by 10
                                                else score => difference of current score and 10
                                                note: timeremaining is in seconds.
                                             */
    public Bugtong() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][4];
        answer = new String [MAX_SIZE];

        bugtong[0] = "When someone seems to be annoyed, what do you say?";
        choices[0][0] = "A. Chill man!";
        choices[0][1] = "B. Haha your mad!";
        choices[0][2] = "C. MAD BRO?!";
        choices[0][3] = "D. HA! GAAYY!!";
        answer[0] = "C";

        bugtong[1] = "Bad troll is bad";
        choices[1][0] = "A. True";
        choices[1][1] = "B. False";
        choices[1][2] = "C. Tralse";
        choices[1][3] = "D. Trolls";
        answer[1] = "A";

        bugtong[2] = "When you get trolled back after trolling, you still win.";
        choices[2][0] = "A. True";
        choices[2][1] = "B. False";
        choices[2][2] = "C. Tralse";
        choices[2][3] = "D. Not a troll this time";
        answer[2] = "B";

        bugtong[3] = "When someone says \"UMAD?\" What do you say back?";
        choices[3][0] = "A. I'm not mad";
        choices[3][1] = "B. I ain't even mad!";
        choices[3][2] = "C. Wow you fail";
        choices[3][3] = "D. BRRRRRR";
        answer[3] = "B";

        bugtong[4] = "Where did trolling grow from?";
        choices[4][0] = "A. 4chan";
        choices[4][1] = "B. Youtube";
        choices[4][2] = "C. Facebook";
        choices[4][3] = "D. Twitter";
        answer[4] = "A";

        bugtong[5] = "";
        choices[5][0] = "Quiz Over";
        choices[5][1] = "Quiz Over";
        choices[5][2] = "Quiz Over";
        choices[5][3] = "Quiz Over";
        answer[5] = "A";

    }

    public String getBugtong(int index){
        return bugtong[index];
    }

    public String getChoices(int index, int choice){
        return choices[index][choice];
    }

    public String getAnswer(int index){
        return answer[index];
    }

    public int getRandomIndex(){
        return 0 + new java.util.Random().nextInt(MAX_SIZE-1);
    }
}
