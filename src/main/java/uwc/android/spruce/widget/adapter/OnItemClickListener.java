package uwc.android.spruce.widget.adapter;

/**
 * Created by steven on 17/4/27.
 */
public abstract class OnItemClickListener<T> {
    public abstract void onItemClick(ViewHolder holder, T data, int position);

    public boolean onItemLongClick(ViewHolder holder, T data, int position) {
        return false;
    }
}
