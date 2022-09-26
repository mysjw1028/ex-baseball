package site.metacoding.red.domain.stardium;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Stardium {
	private Integer id;
	private String name;
	private Date build;
	private Timestamp createDate;

	public Stardium(String name) {
		this.name = name;
	}

}