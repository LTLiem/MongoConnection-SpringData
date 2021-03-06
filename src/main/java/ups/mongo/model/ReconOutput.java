package ups.mongo.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "ReconOutput")
public class ReconOutput {

	@Id
	private ObjectId id;

	@Field(value = "report_id")
	@Indexed
	private String reportId;

	@Field(value = "report_name")
	private String reportName;

	@Field(value = "reporting_date")
	private String reportingDate;

	@Field(value = "recon_time")
	private Date reconTime;

	@Field(value = "keys")
	private String key;

	@Field(value = "rows")
	private List<String> rows;

	public ReconOutput() {
		super();
	}

	public ReconOutput(String reportId, String reportName, String reportingDate, Date reconTime,
			String key, List<String> rows) {
		super();
		this.reportId = reportId;
		this.reportName = reportName;
		this.reportingDate = reportingDate;
		this.reconTime = reconTime;
		this.key = key;
		this.rows = rows;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportingDate() {
		return reportingDate;
	}

	public void setReportingDate(String reportingDate) {
		this.reportingDate = reportingDate;
	}

	public Date getReconTime() {
		return reconTime;
	}

	public void setReconTime(Date reconTime) {
		this.reconTime = reconTime;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<String> getRows() {
		return rows;
	}

	public void setRows(List<String> rows) {
		this.rows = rows;
	}

}
