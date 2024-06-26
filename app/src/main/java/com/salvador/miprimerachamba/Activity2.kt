package com.salvador.miprimerachamba

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    var editText: EditText? = null
    var btn: Button? = null
    var downloadUrl: String? = null
    private val mainLayout: LinearLayout? = null
    private val mainProgressBar: ProgressBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        editText = findViewById(R.id.edit_text)
        btn = findViewById(R.id.button)

        /*if (savedInstanceState == null && Intent.ACTION_SEND.equals(getIntent().getAction())
                && getIntent().getType() != null && "text/plain".equals(getIntent().getType())) {

            String ytLink = getIntent().getStringExtra(Intent.EXTRA_TEXT);

            if (ytLink != null
                    && (ytLink.contains("://youtu.be/") || ytLink.contains("youtube.com/watch?v="))) {
                youtubeLink = ytLink;
                // We have a valid link
                getYoutubeDownloadUrl(youtubeLink);
            } else {
                Toast.makeText(this, R.string.error_no_yt_link, Toast.LENGTH_LONG).show();
                finish();
            }
        } else if (savedInstanceState != null && youtubeLink != null) {
            getYoutubeDownloadUrl(youtubeLink);
        } else {
            finish();
        }
        private void getYoutubeDownloadUrl(String youtubeLink) {
            new YouTubeExtractor(this) {

                @Override
                public void onExtractionComplete(SparseArray<YtFile> ytFiles, VideoMeta vMeta) {
                    mainProgressBar.setVisibility(View.GONE);

                    if (ytFiles == null) {
                        // Something went wrong we got no urls. Always check this.
                        finish();
                        return;
                    }
                    // Iterate over itags
                    for (int i = 0, itag; i < ytFiles.size(); i++) {
                        itag = ytFiles.keyAt(i);
                        // ytFile represents one file with its url and meta data
                        YtFile ytFile = ytFiles.get(itag);

                        // Just add videos in a decent format => height -1 = audio
                        if (ytFile.getFormat().getHeight() == -1 || ytFile.getFormat().getHeight() >= 360) {
                            addButtonToMainLayout(vMeta.getTitle(), ytFile);
                        }
                    }
                }
            }.extract(youtubeLink);
        }

        private void addButtonToMainLayout(final String videoTitle, final YtFile ytfile) {
            // Display some buttons and let the user choose the format
            String btnText = (ytfile.getFormat().getHeight() == -1) ? "Audio " +
                    ytfile.getFormat().getAudioBitrate() + " kbit/s" :
                    ytfile.getFormat().getHeight() + "p";
            btnText += (ytfile.getFormat().isDashContainer()) ? " dash" : "";
            Button btn = new Button(this);
            btn.setText(btnText);
            btn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String filename;
                    if (videoTitle.length() > 55) {
                        filename = videoTitle.substring(0, 55) + "." + ytfile.getFormat().getExt();
                    } else {
                        filename = videoTitle + "." + ytfile.getFormat().getExt();
                    }
                    filename = filename.replaceAll("[\\\\><\"|*?%:#/]", "");
                    downloadFromUrl(ytfile.getUrl(), videoTitle, filename);
                    finish();
                }
            });
            mainLayout.addView(btn);
        }

        private void downloadFromUrl(String youtubeDlUrl, String downloadTitle, String fileName) {
            Uri uri = Uri.parse(youtubeDlUrl);
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setTitle(downloadTitle);

            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName);

            DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            manager.enqueue(request);
        }*/
    }

    companion object {
        private val youtubeLink: String? = null
    }
}