package com.example.fuppa.lifesycle;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpAsynctask extends AsyncTask<String, Void, String> {
    private static final String TAG = "HttpAsynctask";

    private TextView textView;

    public HttpAsynctask(Context context){
        super();
        MainActivity mainActivity = (MainActivity) context;
        textView= (TextView)mainActivity.findViewById(R.id.)
    }




}


class httpokmsg{
    HttpURLConnection conn = null;
    String path;
    public URL url ;

    public int setter(String in_path){
        path = in_path;
    }

}

class send_httpmsg{
    static String path = "http://";

    public void Set_Path(String ipadd, String ipport, String ipmethod) {
        path += ipadd + ":" + ipport;
    }

    public String Connection() {
        HttpURLConnection conn = null;
        try {
// サーバとのHTTPコネクションを確立
 URL url = new URL(path);
 conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST"); // 通信方式はPOSTを指定
            conn.setDoOutput(true); conn.setDoInput(true);
// サーバへメッセージを送信 
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            bw.write(text); bw.close();

// サーバからメッセージを受信 
            final String str = InputStreamToString(conn.getInputStream());
// サーバから受信したメッセージをトーストで表示
            handler.post(new Runnable(){
                @Override
                public void run(){ Toast.makeText(context, str, Toast.LENGTH_LONG).show();
                } });
        }catch(Exception e){ try {
            if(conn != null) conn.disconnect(); }catch (Exception e2){ }
        } }
}).start(); }

    }




    }




}
