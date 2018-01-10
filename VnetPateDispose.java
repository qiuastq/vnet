public interface VnetPateDispose {

	/**
	* 新增通知事件处理信息
	* @param pateDispose
	*/
	public void addPateDispose(PateDispose pateDispose);

	/**
	* 根据event_uuid查询通知事件处理信息
	* @param event_uuid 事件id
	* @return PateDispose 
	*/	
	public PateDispose getById(String event_uuid);

	/**
	* 查询所有
	* @return pateList
	*/
	public ArrayList<PateDispose> findAll();

	/**
	 * 
	 * @param pageSize 每页有多少行
	 * @return int
	 */
	public int getPageCount(int pageSize);

	/**
	 * 获得指定页的数据
	 * @param pageNo 当前页
	 * @param pageSize 每页有多少行
	 * @return pateList
	 */
	public ArrayList<PateDispose> getPagePate(int pageNo,int pageSize);

}
