package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Offer;
import kr.ac.hansung.service.OffersService;

@Controller
public class OffersController {
	
	private OffersService offersService;
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}
	//offer Url이  mapping이 되면  offers라는 jsp가 실행이 된다.
	@RequestMapping("/offers")
	public String showOffers(Model model){
		
		List<Offer> offers = offersService.getCurrent();
		
		model.addAttribute("offers", offers);
	
		return "offers";
	}
	//마찬가지...
	@RequestMapping("/createoffer")
	public String createOffer(Model model){
		
		return "createoffer";
	}
}
