package site.metacoding.red.web.dto.request.stardium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stardium.Stardium;

@Setter
@Getter
public class StardiumSaveDto {
	private String name;

	public Stardium toEntity(String name) {
		Stardium stardium = new Stardium(this.name);
		return stardium;
	}
}
