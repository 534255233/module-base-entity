package com.zlp.entity;


/**
 * 分页java bean
 * @author zlp
 *
 */
public class Range {

	private Integer start = 0;
    private Integer end = 0;
    private Integer pageSize = 0;
    private Integer currentPage = 0;
	public Range(String range) {
        String[] parsed = range.split("-");
        this.start = new Integer(parsed[0]);
        this.end = new Integer(parsed[1]);
        this.pageSize = end - start + 1; 
        this.currentPage = (end+1) / this.pageSize;
    }
    public Integer getStart() {
        return this.start;
    }
    public Integer getEnd() {
    	return this.end;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }
    public Integer getCurrentPage() {
		return currentPage;
	}
    
}
