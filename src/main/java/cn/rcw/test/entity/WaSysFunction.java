package cn.rcw.test.entity;

import java.util.ArrayList;
import java.util.List;

public class WaSysFunction {
    private Integer id;

    private String name;

    private String type;

    private String icon;
    
    private String url;

    private Integer prarentId;

    private String prarentIds;

    private String pernission;

    private Integer sorting;

    private Boolean available;

    private String description;

    private List<WaSysFunction> functionLists = new ArrayList<WaSysFunction>();
    
    private Integer flag;

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public List<WaSysFunction> getFunctionLists() {
		return functionLists;
	}

	public void setFunctionLists(List<WaSysFunction> functionLists) {
		this.functionLists = functionLists;
	}
	
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPrarentId() {
		return prarentId;
	}

	public void setPrarentId(Integer prarentId) {
		this.prarentId = prarentId;
	}

	public String getPrarentIds() {
		return prarentIds;
	}

	public void setPrarentIds(String prarentIds) {
		this.prarentIds = prarentIds;
	}

	public String getPernission() {
        return pernission;
    }

    public void setPernission(String pernission) {
        this.pernission = pernission;
    }

    public Integer getSorting() {
        return sorting;
    }

    public void setSorting(Integer sorting) {
        this.sorting = sorting;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}