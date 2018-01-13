package com.crypto.cryptostats.controller;

import com.crypto.cryptostats.dto.CoinDTO;
import com.crypto.cryptostats.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coin")
public class CoinController {

	private CoinService coinService;

	@Autowired
	public CoinController(CoinService coinService) {
		this.coinService = coinService;
	}


	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CoinDTO> getAllCoins(){
		return coinService.getAllCoins();
	}

}
