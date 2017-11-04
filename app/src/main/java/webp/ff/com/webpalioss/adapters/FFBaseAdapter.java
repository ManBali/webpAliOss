package webp.ff.com.webpalioss.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author wu
 * 2015年4月20日 14:14:16
 * @description 基类的适配器
 * 
 */
public abstract class FFBaseAdapter<T> extends BaseAdapter {
	/**
	 * 用于存储的新数据
	 */
	protected List<T> mData=new ArrayList<T>();
	/**创建视图的上下文**/
	protected Context mContext;
	/**调用方的上下文档**/
	protected Object mobject;
	/**此字段用于后期的一些扩展字段**/
	protected Object mexObj;
	/**
	 *
	 * @param data   用于展示的列表数据
	 * @param context  传入的上下文
	 * @param object   引用者
	 * @param exObj    此字段用于后期的一些扩展字段，一般没有效果
	 */
	public FFBaseAdapter(List<T> data, Context context, Object object, Object exObj) {
		this.mobject=object;
		this.mContext=context;
		this.mData=data;
		this.mexObj=exObj;
	}
	
	@Override
	public int getCount() {
		return mData.size();
	}

	@Override
	public Object getItem(int position) {
		return mData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
    /**点击回调回来后的方法 **/
	public abstract void OnItemClickEvent(int position,int eventType,T model);
	
	@Override
	public abstract View getView(int position, View convertView, ViewGroup parent);
	/**向数据源里面添加数据**/
	public void addData(List<T> list)
	{
		this.mData.addAll(list);
	}

	/**
	 * @description clean the old datas and add new datas
	 * @param list
	 */
	public void setData(List<T> list)
	{
		if(this.mData!=null) {
			this.mData.clear();
		}
		this.mData=list;
	}
	/**
	 * @description remove depart datas
	 * @param list
	 */
	public void doRemoveDatas(List<T> list)
	{
        this.mData.removeAll(list);
	}
	/**
	 * @description get the all datas
	 * @return
	 */
	public List<T> getAllData()
	{
		return this.mData;
	}
}
