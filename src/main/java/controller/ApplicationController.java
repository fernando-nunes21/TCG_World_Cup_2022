package controller;

import service.CardService;
import service.DeckService;
import service.GameService;
import service.UserService;

public class ApplicationController {

    private UserService userService;
    private GameService gameService;
    private DeckService deckService;
    private CardService cardService;

    public ApplicationController(UserService userService,
                          GameService gameService,
                          DeckService deckService,
                          CardService cardService
    ) {
        this.cardService = cardService;
        this.deckService = deckService;
        this.gameService = gameService;
        this.userService = userService;
    }
}
