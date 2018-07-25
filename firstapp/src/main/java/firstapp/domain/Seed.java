package firstapp.domain;

/**
 * resource_seeds_info表所对应的实体类
 */
public class Seed {
	// 实体类的属性和表的字段名称一一对应
	private int id;
	private String word;
	private String alias;
	private int begin;
	private int end;
	private int done;
	private String start;
	private String finish;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setName(String word) {
		this.word = word;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getDone() {
		return done;
	}

	public void setDone(int done) {
		this.done = done;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	@Override
	public String toString() {
		return "Seed [id=" + id + ", word=" + word + ", alias=" + alias + ", begin=" + begin + ", end=" + end
				+ ", done=" + done + ", start=" + start + ", finish=" + finish + "]";
	}
}
