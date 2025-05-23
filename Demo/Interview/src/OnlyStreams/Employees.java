package OnlyStreams;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Employees{
	
	private int id;
	private String name;
	private String dept;
	private List<Project> projects;
	private double salary;
	private String gender;

}
