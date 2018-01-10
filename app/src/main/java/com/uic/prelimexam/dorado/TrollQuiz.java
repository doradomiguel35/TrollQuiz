package com.uic.prelimexam.dorado;

public class TrollQuiz {
    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 50;          //Array maximum size
    public final int TOTAL_SIZE = 50;        //Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
//    public static int SCORE = 50;
    public static int answered = 0;
    public static int questionAnswered = 0;  /*Scoring Rule:
                                              if correct score => sum of current score and timeremaining multiplied by 10
                                                else score => difference of current score and 10
                                                note: timeremaining is in seconds.
                                             */
    public TrollQuiz() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][4];
        answer = new String [MAX_SIZE];

        bugtong[0] = "When someone seems to be annoyed, what do you say?";
        choices[0][0] = "A. Chill man!";
        choices[0][1] = "B. Haha you're mad!";
        choices[0][2] = "C. U MAD BRO?!";
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

        bugtong[5] = "O ____";
        choices[5][0] = "A. SRSLY?";
        choices[5][1] = "B. RLY!";
        choices[5][2] = "C. Owly!";
        choices[5][3] = "D. RLY?";
        answer[5] = "D";

        bugtong[6] = "I like ________________!";
        choices[6][0] = "A. Brains";
        choices[6][1] = "B. Zombies";
        choices[6][2] = "C. Turtles";
        choices[6][3] = "D. Horses";
        answer[6] = "C";

        bugtong[7] = "Chocolate Rain\" was a massive internet sensation. Who sang it";
        choices[7][0] = "A. Tom Zayday";
        choices[7][1] = "B. Zon Tayday";
        choices[7][2] = "C. Tay Zonday";
        choices[7][3] = "D. Zay Tonay";
        answer[7] = "C";

        bugtong[8] = "Finish this phrase from the opening cut scene of the video game Zero Wing.\n" +
                "\"All Your Base Are ";
        choices[8][0] = "A. For us to have";
        choices[8][1] = "B. Belong to us";
        choices[8][2] = "C. We take for us";
        choices[8][3] = "D. Attacked and destroyed";
        answer[8] = "B";

        bugtong[9] = "Name the band who became an internet sensation after their 'one-take' video \"Here We Go\" hit YouTube and went viral.";
        choices[9][0] = "A. Hurry up Run";
        choices[9][1] = "B. OK Go";
        choices[9][2] = "C. 3OH3!";
        choices[9][3] = "D. M83";
        answer[9] = "B";

        bugtong[10] = "What is the game called that \"All your base are belong to us\" is from?";
        choices[10][0] = "A. Zero Wing";
        choices[10][1] = "B. Mario";
        choices[10][2] = "C. Zelda";
        choices[10][3] = "D. Monster Hunter";
        answer[10] = "A";

        bugtong[11] = "The Philosoraptor meme was originally a T-Shirt design.";
        choices[11][0] = "A. True";
        choices[11][1] = "B. False";
        choices[11][2] = "C. Tralse";
        choices[11][3] = "D. Troll";
        answer[11] = "A";

        bugtong[12] = "Complete the meme: One does not simply walk into ______  ";
        choices[12][0] = "A. Mordor";
        choices[12][1] = "B. The Shire";
        choices[12][2] = "C. Dunland";
        choices[12][3] = "D. Cardolan";
        answer[12] = "A";

        bugtong[13] = "What is \"I has a shuvel\" written in?";
        choices[13][0] = "A. Troll";
        choices[13][1] = "B. Shovel";
        choices[13][2] = "C. speakLol";
        choices[13][3] = "D. Lolspeak";
        answer[13] = "D";

        bugtong[14] = "Where was the company Cheezburger founded?";
        choices[14][0] = "A. Seattle";
        choices[14][1] = "B. Chicago";
        choices[14][2] = "C. Silicon Valley";
        choices[14][3] = "D. New York City";
        answer[14] = "A";

        bugtong[15] = "The term \"FAIL\" is Internet slang.";
        choices[15][0] = "A. Troll";
        choices[15][1] = "B. Tralse";
        choices[15][2] = "C. True";
        choices[15][3] = "D. False";
        answer[15] = "C";

        bugtong[15] = "Engrish is bad Asian translation.";
        choices[15][0] = "A. Tralse";
        choices[15][1] = "B. True";
        choices[15][2] = "C. Fralse";
        choices[15][3] = "D. False";
        answer[15] = "B";

        bugtong[16] = "The \"Advice God\" meme denounces religion.";
        choices[16][0] = "A. Fralse";
        choices[16][1] = "B. False";
        choices[16][2] = "C. True";
        choices[16][3] = "D. Truer";
        answer[16] = "C";

        bugtong[17] = "What is \"Grandma Finds the Internet\" also known as?";
        choices[17][0] = "A. Internet Grandpa Surprise";
        choices[17][1] = "B. Internet Grandma Rockstar";
        choices[17][2] = "C. Internet Grandma Surprise";
        choices[17][3] = "D. Internet Grandma Dances";
        answer[17] = "C";

        bugtong[18] = "What is \"Grandma Finds the Internet\" also known as?";
        choices[18][0] = "A. Internet Grandpa Surprise";
        choices[18][1] = "B. Internet Grandma Rockstar";
        choices[18][2] = "C. Internet Grandma Surprise";
        choices[18][3] = "D. Internet Grandma Dances";
        answer[18] = "C";

        bugtong[19] = "The concept of anti-jokes found in \"Anti-Joke Chicken\" is a modern concept.";
        choices[19][0] = "A. True";
        choices[19][1] = "B. Fralse";
        choices[19][2] = "C. Trues";
        choices[19][3] = "D. False";
        answer[19] = "D";

        bugtong[20] = "What time is it?";
        choices[20][0] = "A. bikini and beaches time";
        choices[20][1] = "B. peanut butter and jelly time";
        choices[20][2] = "C. kitten and puppy time";
        choices[20][3] = "D. LETS GET READY TO RUMBLEEE!!!";
        answer[20] = "B";

        bugtong[21] = "The \"Miami Zombie\" was supposedly under the influence of what substance?";
        choices[21][0] = "A. bath salts";
        choices[21][1] = "B. PCP";
        choices[21][2] = "C. crack cocaine";
        choices[21][3] = "D. CPH4";
        answer[21] = "A";

        bugtong[21] = "Which animal is known for \"crashing\" many pictures since 2009?";
        choices[21][0] = "A. elephant";
        choices[21][1] = "B. squirrel";
        choices[21][2] = "C. fox";
        choices[21][3] = "D. dog";
        answer[21] = "B";

        bugtong[22] = "What is Linda Glocke going to destroy?";
        choices[22][0] = "A. Hitler";
        choices[22][1] = "B. Iran";
        choices[22][2] = "C. ISIS";
        choices[22][3] = "D. Osama Bin Laden";
        answer[22] = "C";

        bugtong[23] = "What nationality is the Standing Cat named Rocky?";
        choices[23][0] = "A. English";
        choices[23][1] = "B. French";
        choices[23][2] = "C. Spanish";
        choices[23][3] = "D. Russian";
        answer[23] = "B";

        bugtong[24] = "Where did the \"picture unrelated\" phenomenon begin?";
        choices[24][0] = "A. 4chan";
        choices[24][1] = "B. Reddit";
        choices[24][2] = "C. Fark";
        choices[24][3] = "D. Facebook";
        answer[24] = "A";

        bugtong[25] = "\"They're eating her!\" is a line from which movie?";
        choices[25][0] = "A. Troll 2";
        choices[25][1] = "B. Xanadu";
        choices[25][2] = "C. Island";
        choices[25][3] = "D. Jurassic Park";
        answer[25] = "A";

        bugtong[26] = "Which cat is watching you, always?";
        choices[26][0] = "A. wall cat";
        choices[26][1] = "B. ceiling cat";
        choices[26][2] = "C. floor cat";
        choices[26][3] = "D. bed cat";
        answer[26] = "B";

        bugtong[27] = "While shouting \"Here come dat boi,\" what is the frog riding?";
        choices[27][0] = "A. a unicycle";
        choices[27][1] = "B. a duck";
        choices[27][2] = "C. a unicorn";
        choices[27][3] = "D. a cart";
        answer[27] = "A";

        bugtong[28] = "According to one meme, you're supposed to put what substance on your nipples in order to get high?";
        choices[28][0] = "A. bacon";
        choices[28][1] = "B. maple syrup";
        choices[28][2] = "C. beehive";
        choices[28][3] = "D. toothpaste";
        answer[28] = "D";

        bugtong[29] = "On which site did Tron Guy first appear?";
        choices[29][0] = "A. Ars Technica";
        choices[29][1] = "B. Reddit";
        choices[29][2] = "C. Slashdot";
        choices[29][3] = "D. 4Chan";
        answer[29] = "C";

        bugtong[30] = " Why can't we stop here?";
        choices[30][0] = "A. We took too many drugs";
        choices[30][1] = "B. They'll kill us all";
        choices[30][2] = "C. This is bat country";
        choices[30][3] = "D. I'm tired";
        answer[30] = "C";

        bugtong[31] = " What might Winnebago Man really need?";
        choices[31][0] = "A. anger management classes";
        choices[31][1] = "B. more money";
        choices[31][2] = "C. a recreational vehicle";
        choices[31][3] = "D. a life";
        answer[31] = "A";

        bugtong[32] = "What sort of cartoon animal most frequently appears in the Dolan memes?";
        choices[32][0] = "A. cats";
        choices[32][1] = "B. rabbit";
        choices[32][2] = "C. dog";
        choices[32][3] = "D. duck";
        answer[32] = "D";

        bugtong[33] = "Who answered a question about a map?";
        choices[33][0] = "A. Miss Nowhere";
        choices[33][1] = "B. Miss Alabama";
        choices[33][2] = "C. Miss South Carolina";
        choices[33][3] = "D. Miss Utah";
        answer[33] = "C";

        bugtong[34] = " Billy Herrington is best known for doing what in his video of dubious quality?";
        choices[34][0] = "A. erotic typing";
        choices[34][1] = "B. erotic wrestling";
        choices[34][2] = "C. erotic cooking";
        choices[34][3] = "D. erotic sex";
        answer[34] = "B";

        bugtong[35] = "One meme always features people in white masks as an homage to which group?";
        choices[35][0] = "A. Anonymous";
        choices[35][1] = "B. clowns";
        choices[35][2] = "C. KKK";
        choices[35][3] = "D. celebrities";
        answer[35] = "A";

        bugtong[36] = "A viral Kickstarter campaign resulted in a meme about recipes for what dish?";
        choices[36][0] = "A. poop";
        choices[36][1] = "B. kolache";
        choices[36][2] = "C. shark fin soup";
        choices[36][3] = "D. potato salad";
        answer[36] = "D";

        bugtong[37] = "What sort of animal was blown up with explosives in Miami in 1970?";
        choices[37][0] = "A. sea lion";
        choices[37][1] = "B. dolphin";
        choices[37][2] = "C. whale";
        choices[37][3] = "D. Great White shark";
        answer[37] = "C";

        bugtong[38] = "Which font is ridiculed endlessly?";
        choices[38][0] = "A. times new roman";
        choices[38][1] = "B. comic sans";
        choices[38][2] = "C. arial";
        choices[38][3] = "D. calibri";
        answer[38] = "B";

        bugtong[39] = "In one weird meme, Gandhi is always obsessed with what?";
        choices[39][0] = "A. eyeglasses";
        choices[39][1] = "B. nuclear weapons";
        choices[39][2] = "C. sheep";
        choices[39][3] = "D. guns";
        answer[39] = "B";

        bugtong[40] = "Why is one man closing the curtains on his house?";
        choices[40][0] = "The outside world distracts him from his computer.";
        choices[40][1] = "He is terrified of people.";
        choices[40][2] = "He is a vampire.";
        choices[40][3] = "Doesn't like carollers";
        answer[40] = "A";

        bugtong[41] = "A song called \"All This Love\" turned into a meme featuring which world leader hanging out with a rainbow?";
        choices[41][0] = "Hitler";
        choices[41][1] = "Yeltsin";
        choices[41][2] = "Lenin";
        choices[41][3] = "Stalin";
        answer[41] = "D";

        bugtong[42] = "Which TV show gave rise to the bizarre trend of people dressing up in green lycra suits?";
        choices[42][0] = "Orange is the New Black";
        choices[42][1] = "Game of Thrones";
        choices[42][2] = "It's Always Sunny in Philadelphia";
        choices[42][3] = "Walking Dead";
        answer[42] = "C";

        bugtong[43] = "\"Griefing\" refers to what act?";
        choices[43][0] = "posting videos of funerals";
        choices[43][1] = "annoying other players in online games";
        choices[43][2] = "crying in YouTube videos";
        choices[43][3] = "being a troller";
        answer[43] = "B";

        bugtong[44] = "What is Polybius?    ";
        choices[44][0] = "a badass movie";
        choices[44][1] = "a made-up religion";
        choices[44][2] = "an experimental drug";
        choices[44][3] = "a fictional arcade game";
        answer[44] = "D";

        bugtong[45] = "In what year did the word \"cringeworthy\" really come to light?";
        choices[45][0] = "1999";
        choices[45][1] = "1972";
        choices[45][2] = "2009";
        choices[45][3] = "2012";
        answer[45] = "B";

        bugtong[46] = "What sort of animal is \"drinking out of cups\"?";
        choices[46][0] = "lizard";
        choices[46][1] = "bird";
        choices[46][2] = "kangaroo";
        choices[46][3] = "rabbit";
        answer[46] = "A";

        bugtong[47] = "Where is the cat on the keyboard?";
        choices[47][0] = "in Paris";
        choices[47][1] = "in an oven";
        choices[47][2] = "in space";
        choices[47][3] = "in the computer";
        answer[47] = "A";

        bugtong[48] = "Cash me ousside ____________";
        choices[48][0] = "How bow dah!";
        choices[48][1] = "What's the weather?";
        choices[48][2] = "You stupid!";
        choices[48][3] = "21?";
        answer[48] = "A";

        bugtong[49] = "";
        choices[49][0] = "Quiz Over";
        choices[49][1] = "Quiz Over";
        choices[49][2] = "Quiz Over";
        choices[49][3] = "Quiz Over";
        answer[49] = "A";

//        bugtong[5] = "";
//        choices[5][0] = "Quiz Over";
//        choices[5][1] = "Quiz Over";
//        choices[5][2] = "Quiz Over";
//        choices[5][3] = "Quiz Over";
//        answer[5] = "A";


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
