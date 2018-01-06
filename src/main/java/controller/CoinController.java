package controller;

import dto.CoinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.CoinService;

import java.util.List;

@RestController
//@RequestMapping("/coin")
public class CoinController {

	private CoinService coinService;

	@Autowired
	public CoinController(CoinService coinService) {
		this.coinService = coinService;
	}


//	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<CoinDTO> getAllCoins(){
//		return coinService.getAllCoins();
//	}

//	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping("/")
	public String getAllCoins(){

		return "Hello MOTHER FUCKER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
	}

}
