package site.metacoding.red.web.dto.response;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StardiumListDto {
	private Integer id;
	private String name;
	private Date build;
	private Timestamp createDate;
}
