package kr.co.crescentcorp.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by GingerAebi on 2016. 4. 4..
 */
public class ContactListAdapter extends BaseAdapter {

    private Context context;
    private List<Message> messages;

    public ContactListAdapter(Context context, List<Message> messages) {
        this.context = context;
        this.messages = messages;

    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int position) {
        return messages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //row에 convertView 할당
        View row = convertView;

        //만약 convertView가 없다면 LayoutInflater를 통해서 row를 가져옴 (xml파일로 만들어놓은 것!)
        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.row_message, parent, false);
        }

        //row에서 findViewById를 통해 TextView 객체들을 가져옴
        TextView tv_phoneNum = (TextView) row.findViewById(R.id.textView);
        TextView tv_title = (TextView) row.findViewById(R.id.textView2);
        TextView tv_content = (TextView) row.findViewById(R.id.textView3);
        TextView tv_time = (TextView) row.findViewById(R.id.textView4);

        //ListView가 한줄씩 실행될 때 실행되는 행의 위치값을 통해 리스트의 값을 꺼내와서 Message객체에 저장
        Message message = messages.get(position);

        //message객체에서 하나씩 정보를 꺼내서 TextView에 세팅해줌!
        tv_phoneNum.setText(message.getPhoneNumber());
        tv_title.setText(message.getTitle());
        tv_content.setText(message.getContent());
        tv_time.setText(message.getTime());

        return row;
    }
}
