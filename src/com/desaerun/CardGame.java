package com.desaerun;

import com.desaerun.Utilities.MenuIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.desaerun.Utilities.MenuIO.printMenuGetString;

public class CardGame {
    public static List<Player> getHumanPlayers(int min, int max) {
        List<Player> human_players = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        List<String> menu_text = new ArrayList<>();
        menu_text.add("How many players (including yourself)[" + min + "-" + max + "]?: ");
        int n_players = MenuIO.printMenuGetInt(menu_text, min, max);
        for (int i = 2; i <= n_players; i++) {
            String player_name = printMenuGetString("What is player " + i + "'s name?: ");
            human_players.add(new Player(player_name));
        }
        return human_players;
    }
}
