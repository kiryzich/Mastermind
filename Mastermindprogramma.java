// Stappenplan mastermind
// Bij mastermind heb je 10 pogingen met 6 verschillende kleuren om de juiste code te kraken
// De code wordt door speler 1 (in dit geval de computer) aangemaakt
// Speler 2 voert een combinatiee in
// Daarna volgen er op de vier plekken verschillende  mogelijkheden. "Leeg" is de kleur komt niet voor in de gehele code. "Wit" is de kleur staat in de pin maar niet op de juist plek. "Zwart" is de pin staat op de juiste plek
// Speler 2 voert een nieuwe combinatie in
// Als all pinnen "Zwart" zijn wint speler 2
// Als 10 beurten gespeeld zijn wint speler 1

// Schrijven van de intro tekst
package werkjes;

// import werkjes.Domain.MastermindGame;
//    static int Wit, Zwart;
//    static String antwoord, poging;

import java.util.Scanner;

class MastermindGame {
    public static MastermindGame singleton = new MastermindGame();

    private int[] secret;

    public boolean isWon() {
        return won;
    }

    private boolean won = false;}
/*
    public String nextline(){
        return "";
    }

    private MastermindGame() {
        //sets all game logic for this game.
        this.secret = new int[4];
        this.secret[0] = getRandomValue();
        this.secret[1] = getRandomValue();
        this.secret[2] = getRandomValue();
        this.secret[3] = getRandomValue();
        System.out.println("Secret code is " + this.secret[0] + " " + this.secret[1] + " " + this.secret[2] + " " + this.secret[3]);
        //String combinatie = (this.secret[0] + this.secret[1] + this.secret[2] + this.secret[3]);
        //System.out.println("combinatie");
        //= Character.toString(100*Math.random());
*/

       /* boolean doorspelen = true;
        while (doorspelen) ;
        System.out.println("Welke combinatie wilt u proberen?");
        String gegevenAntwoord = Scanner.nextLine();
        if (gegevenAntwoord.equals(this.secret[0] + this.secret[1] + this.secret[2] + this.secret[3])) {
            doorspelen = false;
            MastermindGame game = MastermindGame.singleton;

            for (int i = 10; i > 0; i--) {
                System.out.println(i + " pogingen over!");
                if (i == this.secret[0] + this.secret[1] + this.secret[2] + this.secret[3]) ;
                {
                    System.out.println("U heeft gewonnen!!!");
                    break;
                }
            }
            System.out.println("Bedankt voor het spelen, probeer het volgende keer beter te doen");
        }
    }
        public void endGame () {
            System.out.println("Secret code was " + this.secret[0] + " " + this.secret[1] + " " + this.secret[2] + " " + this.secret[3]);
        }

        private static int getRandomValue () {
            int ret;
            ret = (int) (Math.round(Math.random() * 10) % 6);
            if (ret == 0) {
                ret = getRandomValue();
            }
            return ret;
        }
*/
/*

    public static void main(String[] args) {
        MastermindGame week1 = new MastermindGame();
        week1.getRandomValue();
        week1.isWon();
        week1.endGame();
        String leeg1 = ("LEEG");
        String leeg2 = ("LEEG");
        String leeg3 = ("LEEG");
        String leeg4 = ("LEEG");

        System.out.println("Welkom bij Mastermind!");
        System.out.println("Uw tegenspeler heeft een code gegenereert.");
        System.out.println("Deze code bestaat uit de cijfers 1 t/m 6.");
        System.out.println("Bij een juist cijfer op de juiste plek krijg u een zwarte pin");
        System.out.println("Bij een juist cijfer op de verkeerde plek krijg u een witte pin");


        Scanner scanner = new Scanner(System.in);
       //Antwoord antwoord = new Antwoord();

        System.out.println("Huidige combinatie:" + leeg1 + " - " + leeg2 + " - " + leeg3 + " - " + leeg4);


    }
}
*/

/*  class Poging {
        Antwoord();
            String = antwoord;

      if(this.secret[0]==antwoord[0])

        {
            String leeg1 = ("ZWART");
        } else if(this.secret[0]==antwoord[1])

        {
            String leeg1 = ("WIT");
        } else if(this.secret[0]==antwoord[2])

        {
            String leeg1 = ("WIT");
        } else if(this.secret[0]==antwoord[3])

        {
            String leeg1 = ("WIT");
        }
        if(this.secret[1]==antwoord[1])

        {
            String leeg2 = ("ZWART");
        } else if(this.secret[1]==antwoord[0])

        {
            String leeg2 = ("WIT");
        } else if(this.secret[1]==antwoord[2])

        {
            String leeg2 = ("WIT");
        } else if(this.secret[1]==antwoord[3])

        {
            String leeg2 = ("WIT");
        }
        if(this.secret[2]==antwoord[2])

        {
            String leeg3 = ("ZWART");
        } else if(this.secret[2]==antwoord[1])

        {
            String leeg3 = ("WIT");
        } else if(this.secret[2]==antwoord[0])

        {
            String leeg1 = ("WIT");
        } else if(this.secret[2]==antwoord[3])

        {
            String leeg3 = ("WIT");
        }
        if(this.secret[3]==antwoord[3])

        {
            String leeg4 = ("ZWART");
        } else if(this.secret[3]==antwoord[1])

        {
            String leeg4 = ("WIT");
        } else if(this.secret[3]==antwoord[2])

        {
            String leeg4 = ("WIT");
        } else if(this.secret[3]==antwoord[0])

        {
            String lee43 = ("WIT");
        }
    }
}
*/