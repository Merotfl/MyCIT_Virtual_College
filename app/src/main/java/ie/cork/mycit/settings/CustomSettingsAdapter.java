package ie.cork.mycit.settings;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import java.util.List;
import ie.cork.mycit.group1.R;

public class CustomSettingsAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<String> items;

    public CustomSettingsAdapter(Activity context, List<String> names) {
        super();

        this.items = names;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        String opName = items.get(position);

        View vi = convertView;

        if(convertView == null)
            vi = inflater.inflate(R.layout.activity_custom_settings_adapter, null);

        CheckBox ckName = (CheckBox) vi.findViewById(R.id.checkBoxOption);

        ckName.setText(opName);

        return vi;
    }

}
