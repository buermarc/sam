/*package bon.soir.sam.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
 
import bon.soir.sam.entity.Game;
import bon.soir.sam.service.GameService;

@RestController
@RequestMapping("/game")
public class NewGameController {

    @Autowired GameService gameService;

    @RequestMapping(path = "/new", method = { RequestMethod.PUT, RequestMethod.POST})
    public Game newGame(@RequestBody Game gameRequest) throws Exception {
        return this.gameService.createNewGame(gameRequest);
    }
}
*/
