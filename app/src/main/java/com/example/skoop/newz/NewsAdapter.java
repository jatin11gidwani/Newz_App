package com.example.skoop.newz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each News
 * in the data source (a list of {@link News} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param newss   is the list of newss, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> newss) {
        super(context, 0, newss);
    }

    /**
     * Returns a list item view that displays information about newss at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_view, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);
        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        String title = currentNews.getTitle();
        // Display the title of the current news in that TextView
        titleView.setText(title);
        // Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById(R.id.section);
        String author = currentNews.getSection();
        // Display the author of the current news in that TextView
        authorView.setText(author);
        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
