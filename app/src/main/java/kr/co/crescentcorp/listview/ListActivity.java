package kr.co.crescentcorp.listview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("메신저 따라만들기");

        contactList = (ListView) findViewById(R.id.listView_contact);

        List<Message> messages = new ArrayList<>();

        //new Message(전화번호, 제목, 내용, 요일) 순으로 String타입으로 넣어주면 됩니다.
        messages.add(new Message("010-6609-0484","사랑합니다~","졔졔를 위해서 만든 예제입니다. 이정도면 교수님도 인정할걸?? 헿","일"));
        messages.add(new Message("010-6609-0484","문자는 나한테만!","문자는 나한테서만 올거야!! 다른 남자꺼는 받지 말아요~","월"));
        messages.add(new Message("010-6609-0484","매일매일","문자를 매일매일 보내는 중이야 ㅎㅎㅎ ","화"));

        contactList.setDivider(null);
        contactList.setAdapter(new ContactListAdapter(this,messages));
    }
}
