package site.metacoding.red.domain.stardium;

import java.util.List;

import site.metacoding.red.web.dto.response.StardiumListDto;

public interface StardiumDao {
	public void insert(Stardium stadium);
	public Stardium findById(Integer id);
	public List<StardiumListDto> findAll();
	public void update(Stardium stardium);
	public void deleteById(Integer id);
}
