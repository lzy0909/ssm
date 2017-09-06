package rml.util;

/**
 * 返回JSON对象
 * @author lyon
 * 2016-08-25
 */
public class ResultJson {
	//ajax 请求服务器代码放回状态
    /**
     * 成功 ：1
     */
    public static final Integer STATUS_CODE_SUCCESS = 1;
    /**
     * 失败 ：2
     */
    public static final Integer STATUS_CODE_FAIL = 2;
    /**
     * 异常 ：0
     */
    public static final Integer STATUS_CODE_EXCEPTION = 0;
    /**
     * 其他状态 ：3
     */
    public static final Integer STATUS_CODE_OTHER = 3;
    
    /**
     * 请求参数错误代码 ：-1
     */
    public static final Integer STATUS_CODE_PARAM_ERROR = -1;
    /**
     * 数据库获取不到数据信息错误 ：-2
     */
    public static final Integer STATUS_CODE_DATA_ERROR = -2;
    /**
     * SESSION 失效错误 ：-99
     */
    public static final Integer STATUS_CODE_SESSION_INVALID = -99;
    /**
     * 当前Session没有数据操作或查看权限 ： 506
     */
    public static final Integer STATUS_CODE_PERMISSIONS = 506;
    
    public static final Integer STATUS_CODE_FAIL_LEG_DEL = 10;
    public static final Integer STATUS_CODE_FAIL_CASE_DEL = 11;
    
    private int draw;
    
   	private int recordsTotal;
   	
   	private int recordsFiltered;
   	
   	private int pageCount;

    private int statusCode;

    private String statusMessage;
    
    private Object data;
    
    private Object additionalData;
    
    private Object otherData;

    public int getStatusCode()
    {
        return statusCode;
    }

    public void setStatusCode(int statusCode)
    {
        this.statusCode = statusCode;
    }

    public String getStatusMessage()
    {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage)
    {
        this.statusMessage = statusMessage;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

	public Object getAdditionalData()
	{
		return additionalData;
	}

	public void setAdditionalData(Object additionalData)
	{
		this.additionalData = additionalData;
	}

	public Object getOtherData() {
		return otherData;
	}

	public void setOtherData(Object otherData) {
		this.otherData = otherData;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public int getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	
}
