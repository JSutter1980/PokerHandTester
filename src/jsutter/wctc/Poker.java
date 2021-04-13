package jsutter.wctc;

import java.util.List;


public class Poker {
    public static void sortSuit( Card[] h )
    {
        int i, s, min;

        for ( i = 0 ; i < h.length ; i ++ )
        {
            min = i;

            for ( s = i+1 ; s < h.length ; s++ )
            {
                if ( h[s].suit() < h[min].suit() )
                {
                    min = s;
                }
            }

        }
    }

    public boolean isStraight(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        int score = 0;
        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            score = card.getScore();
            if ((score != prevScore+1) && (i != 0)) isTheHand = false;
            prevScore = score;
        }
        return isTheHand;
    }
    public boolean isStraightFlush(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        String prevSuit = "";
        int score = 0;
        String suit = "";
        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            score = card.getScore();
            suit = card.getSuit();
            if (((score != prevScore+1) && (i != 0)) || ((!suit.equalsIgnoreCase(prevSuit)) && (i != 0))) isTheHand = false;
            prevScore = score;
            prevSuit = suit;
        }
        return isTheHand;
    }

    public boolean isHighCard(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        int score = 0;
        Card card = hand.get(i);
        score = card.getScore();
        if(score < card) isTheHand = false;
        prevScore = score;

        return isTheHand;
    }



    public static boolean isFullHouse( Card[] h )
    {
        boolean a1, a2;

        if ( h.length != 5 )
            return(false);

        sortSuit(h);

        a1 = h[0].suit() == h[1].suit() && h[1].suit() == h[2].suit() && h[3].suit() == h[4].suit();

        a2 = h[0].suit() == h[1].suit() && h[2].suit() == h[3].suit() && h[3].suit() == h[4].suit();

        return( a1 || a2 );
    }

    public static boolean isTwoPairs( Card[] h )
    {
        boolean a1, a2, a3;

        if ( h.length != 5 )
            return(false);

        sortSuit(h);

        a1 = h[0].suit() == h[1].suit() && h[2].suit() == h[3].suit() ;

        a2 = h[0].suit() == h[1].suit() && h[3].suit() == h[4].suit() ;

        a3 = h[1].suit() == h[2].suit() && h[3].suit() == h[4].suit() ;

        return( a1 || a2 || a3 );
    }
}