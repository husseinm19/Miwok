package husseinm19.github.com.miwoklanguage;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WordAdapter extends ArrayAdapter<word> {
    private int mColorResourceId;
    public WordAdapter(Activity context, ArrayList<word> words, int category_phrases) {

        super(context, 0, words);

    }

    @Override
    public View getView(int position, @Nullable  View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        word currentWord = getItem(position);

        TextView miwokTextView =(TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDeafualtTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()){

            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);

        }else {
            imageView.setVisibility(View.GONE);
        }



        // View textContainer = listItemView.findViewById(R.id.text_container);
        //int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //textContainer.setBackgroundColor(color);


        return listItemView;
    }
}

