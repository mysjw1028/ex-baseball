package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stardium.Stardium;
import site.metacoding.red.domain.stardium.StardiumDao;
import site.metacoding.red.web.dto.request.stardium.StardiumSaveDto;
import site.metacoding.red.web.dto.response.StardiumListDto;

@Service
@RequiredArgsConstructor
public class StardiumService {

	private final StardiumDao stardiumDao;

	public List<StardiumListDto> 경기장목록보기() {
		return stardiumDao.findAll();
	}

	public void 경기장등록(StardiumSaveDto StardiumSaveDto) {
		Stardium stardium = StardiumSaveDto.toEntity(StardiumSaveDto.getName());
		stardiumDao.insert(stardium);
	}

	public void 경기장삭제(Integer id) {
		stardiumDao.deleteById(id);
	}
}
