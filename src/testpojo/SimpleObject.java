package testpojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "simple", schema = "feroz")
public class SimpleObject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column
	String key;
	@Column
	Long value;

	public SimpleObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof SimpleObject))
			return false;
		SimpleObject that = (SimpleObject) o;
		// we prefer the method versions of accessors,
		// because of Hibernate's proxies.
		if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null)
			return false;
		if (getKey() != null ? !getKey().equals(that.getKey()) : that.getKey() != null)
			return false;
		if (getValue() != null ? !getValue().equals(that.getValue()) : that.getValue() != null)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result = getId() != null ? getId().hashCode() : 0;
		result = 31 * result + (getKey() != null ? getKey().hashCode() : 0);
		result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
		return result;
	}
}
