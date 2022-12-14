package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.StardiumService;
import site.metacoding.red.web.dto.response.StardiumListDto;

@RequiredArgsConstructor
@Controller
public class StardiumController {
	
	private final StardiumService stardiumService;

	@GetMapping("/")
	public String getStardiumList(Model model) {
		List<StardiumListDto> stardiumList = stardiumService.경기장목록보기();
		model.addAttribute("stardiumList", stardiumList);
		return "stardium/test";
	}
}
