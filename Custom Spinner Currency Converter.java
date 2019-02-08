import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends ArrayAdapter<String> {

    Context context;
    String[] names;
    int[] images;
    double[] values;

    public customAdapter(Context context, String[] names, int[] images) {
        super(context, R.layout.row_trans,names);
        this.context = context;
        this.names = names;
        this.images = images;
    }


    @Override
    public View getDropDownView(int position,  View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.row_trans, null);
        TextView txt1 = (TextView) row.findViewById(R.id.txtDollar);
        ImageView img1 = (ImageView) row.findViewById(R.id.imgFlag);

        txt1.setText(names[position]);
        img1.setImageResource(images[position]);

        return row;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.row_trans,null);
        TextView txt1 = (TextView)row.findViewById(R.id.txtDollar);
        ImageView img1 = (ImageView)row.findViewById(R.id.imgFlag);

        txt1.setText(names[position]);
        img1.setImageResource(images[position]);
        
        return row;
    }
}
