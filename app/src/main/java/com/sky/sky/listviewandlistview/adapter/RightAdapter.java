package com.sky.sky.listviewandlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;

import com.sky.sky.listviewandlistview.R;
import com.sky.sky.listviewandlistview.bean.Product;

import java.util.List;

/**
 * Created by BlueSky on 17/2/6.
 */

public class RightAdapter extends BaseAdapter implements SectionIndexer{
    private List<Product> list = null;
    private Context mContext;

    public RightAdapter(List<Product> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Product getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        final ViewProductHolder viewProductHolder;
        final Product mProduct = list.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.product_item, null);
            TextView tvTag = (TextView) convertView.findViewById(R.id.cate_name);
            TextView tvSalecount = (TextView) convertView.findViewById(R.id.product_salecount_view);
            TextView tvTitle = (TextView) convertView.findViewById(R.id.product_name_view);
            ImageView productImage = (ImageView) convertView.findViewById(R.id.product_imageView);
            //TextView countView = (TextView) convertView.findViewById(R.id.add_count_view);
            TextView tvPrice = (TextView) convertView.findViewById(R.id.product_price_view);
//            ImageView removeProductImage = (ImageView) convertView.findViewById(R.id.delete_product_view);
//            ImageView addProductImage = (ImageView) convertView.findViewById(R.id.add_product_view);
            viewProductHolder = new ViewProductHolder(tvPrice, tvTag,
                    tvSalecount, tvTitle,  productImage);

            convertView.setTag(viewProductHolder);
        } else {
            viewProductHolder = (ViewProductHolder) convertView.getTag();
        }
//如果有该类型，则隐藏
        int section = getSectionForPosition(position);
        if (position == getPositionForSection(section)) {
            viewProductHolder.tvTag.setVisibility(View.VISIBLE);
            viewProductHolder.tvTag.setText(mProduct.getTitle());
        } else {
            viewProductHolder.tvTag.setVisibility(View.GONE);
        }
        viewProductHolder.tvTitle.setText(mProduct.getFoodName());
        viewProductHolder.tvPrice.setText("￥" + mProduct.getFoodPrice());
        viewProductHolder.tvSalecount.setText("已售" + mProduct.getSalesCount() + "份");
        //此处可以设置商品的图片========请在使用的过程中自行替换
        String url = mProduct.getImageUrl();
        viewProductHolder.productImage.setImageResource(R.mipmap.icon_stub);

        return convertView;
    }

    @Override
    public Object[] getSections() {
        return null;
    }

    //根据可选对象数组的索引得到在adapter中的索引
    @Override
    public int getPositionForSection(int sectionIndex) {
        for (int i = 0; i < list.size(); i++) {
            int section = list.get(i).getSeleteId();
            if (section == sectionIndex) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int getSectionForPosition(int position) {
        return list.get(position).getSeleteId();
    }


    private static  class ViewProductHolder {
        TextView tvTag, tvSalecount, tvTitle;
        ImageView productImage;
        private final TextView tvPrice;

        public ViewProductHolder(TextView tvPrice, TextView tvTag, TextView tvSalecount, TextView tvTitle, ImageView productImage) {
            this.tvPrice = tvPrice;
            this.tvTag = tvTag;
            this.tvSalecount = tvSalecount;
            this.tvTitle = tvTitle;
            this.productImage = productImage;
        }
    }

}
