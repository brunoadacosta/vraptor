package br.com.caelum.vraptor.util.migration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Migration info helper for hibernate's implementation of Migration support.
 *
 * @author guilherme silveira
 */
@Entity
public class MigrationInfo {

	@Id
	@Column(length = 255)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
