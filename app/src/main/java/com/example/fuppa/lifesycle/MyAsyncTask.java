package com.example.fuppa.lifesycle;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MyAsyncTask extends AsyncTask<String, Void, String> {

    private TextView textView;

    public MyAsyncTask(Context context) {
        super();
        MainActivity mainActivity = (MainActivity) context;
        textView = (TextView) mainActivity.findViewById(R.id.ReturntextView);
    }

    @Override
    protected String doInBackground(String... params) {

        StringBuilder sb = new StringBuilder();

        InputStream inputStream = null;
        HttpsURLConnection connection = null;

        try {
            URL url = new URL(params[0]);
            connection = (HttpsURLConnection) url.openConnection();
            connection.setConnectTimeout(3000);
            connection.setReadTimeout(3000);


            connection.setRequestMethod("GET");
            connection.connect();

            int responcecode = connection.getResponseCode();
            if (responcecode != HttpsURLConnection.HTTP_OK) {
                throw new IOException("HTTP responcecode" + responcecode);
            }

            inputStream = connection.getInputStream();
            if (inputStream != null) {

                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
            }
        } catch (IOException e) {

            e.printStackTrace();
            ;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                connection.disconnect();
            }
        }
        return sb.toString();
    }

    @Override
    protected void onPostExecute(String result) {
    textView.setText(result);

    }

}