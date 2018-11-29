package com.example.android.news_app;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends BaseAdapter {

    private Context mContext;
    private List<News> mNews;
    private LayoutInflater mInflater;

    public NewsAdapter(Context context, List<News> news) {
        mContext = context;
        mNews = news;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mNews.size();
    }

    @Override
    public Object getItem(int position) {
        return mNews.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View view;
        final ViewHolder holder;
        final News currentNews = mNews.get(position);
        if(convertView == null) {
            view = mInflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.title = (TextView) view.findViewById(R.id.title_text_view);
            holder.item = (ConstraintLayout) view.findViewById(R.id.list_item);
            holder.author = (TextView) view.findViewById(R.id.author_text_view);
            holder.date = (TextView) view.findViewById(R.id.date_text_view);
            holder.section = (TextView) view.findViewById(R.id.section_text_view);
            view.setTag(holder);
        }else{
            view = convertView;
            holder = (ViewHolder)convertView.getTag();
        }

        holder.title.setText(currentNews.getTitle());

        holder.author.setText(currentNews.getAuthor());

        holder.date.setText(currentNews.getDate());

        holder.section.setText(currentNews.getSection());

        return view;
    }

   public void addAll(List<News> newsList) {
        mNews.addAll(newsList);
        notifyDataSetChanged();
    }

    // Replace the contents of a view (invoked by the layout manager)
    public static class ViewHolder {

        TextView title;
        TextView author;
        TextView date;
        TextView section;
        ConstraintLayout item;
    }
}
