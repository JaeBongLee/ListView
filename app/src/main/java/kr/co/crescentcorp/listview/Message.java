package kr.co.crescentcorp.listview;

/**
 * Created by GingerAebi on 2016. 4. 3..
 */
public class Message {
    public String phoneNumber;
    public String title;
    public String content;
    public String time;

    public Message(String phoneNumber, String title, String content, String time) {

        this.phoneNumber = phoneNumber;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;

    }

    public String getTime() {
        return time;
    }
}
