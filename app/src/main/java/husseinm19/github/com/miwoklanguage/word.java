package husseinm19.github.com.miwoklanguage;



//this class contain english translation and miwok translation for each word

import java.text.NumberFormat;

public class word {

    private String mDeafualtTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVID;

    private static final int NO_IMAGE_PROVID = -1;

    private int mAudioResourceId;

    public word (String DeafualtTranslation , String MiwokTranslation , int audioResourceId){

        mDeafualtTranslation =DeafualtTranslation;
        mMiwokTranslation =  MiwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    public word (String DeafualtTranslation , String MiwokTranslation , int ReourceId , int audioResourceId){

        mDeafualtTranslation =DeafualtTranslation;
        mMiwokTranslation =  MiwokTranslation;
        mImageResourceId = ReourceId;
        mAudioResourceId =audioResourceId;
    }

    //get dafualt translation of word
    public String getDeafualtTranslation(){
        return mDeafualtTranslation;

    }

    //get miwok translation

    public String getmMiwokTranslation(){

        return mMiwokTranslation;
    }

    public int getmImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVID;
    }

    public int getAudio(){
        return mAudioResourceId;
    }
}
