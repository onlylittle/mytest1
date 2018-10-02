package com.guigu.mapper;

import java.io.Serializable;

public class Page implements Serializable{

	private static final long serialVersionUID = -4474060363389034611L;

	private int pageNow = 1; // 当前页数 
	   
    private int pageSize = 10; // 每页显示记录的条数 
   
    private int totalCount; // 总的记录条 
   
    private int totalPageCount; // 总的页数 
   
    @SuppressWarnings("unused") 
    private int startPos; // 开始位置，从0开始 
 
    // 开始位置，从0开始 	
    @SuppressWarnings("unused")
    private boolean hasFirst;
    // 是否有首页 
    @SuppressWarnings("unused")	
    private boolean hasPre;
    // 是否有前一页
    @SuppressWarnings("unused")	
    private boolean hasNext;
    // 是否有下一页 	
    @SuppressWarnings("unused")	
    private boolean hasLast;// 是否有最后一页

    	/**
     * 通过构造函数 传入  总记录数  和  当前页
     * @param totalCount
     * @param pageNow
     */ 
    public Page(int totalCount, int pageNow) { 
        this.totalCount = totalCount; 
        this.pageNow = pageNow; 
    }


	public int getPageNow() {
		return pageNow;
	}


	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public int getTotalCount() {
		totalPageCount = getTotalCount() / getPageSize(); 
        return (totalCount % pageSize == 0) ? totalPageCount  //总页数
                : totalPageCount + 1; 
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}


	public int getTotalPageCount() {
		return totalPageCount;
	}


	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getStartPos() {
	     return (pageNow - 1) * pageSize; 
	}


	public void setStartPos(int startPos) {
		this.startPos = startPos;
	} 
	public boolean isHasLast() {		// 如果不是最后一页就有尾页	
		return (pageNow == getTotalCount()) ? false : true;	
		} 
	public void setHasLast(boolean hasLast) {		
		this.hasLast = hasLast;
		}
}

	

	

