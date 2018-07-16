package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** The Miwok translation of the word**/
    private String mMiwokTranslation;
    /** The English translation of the word**/
    private String mDefaultTranslation;
    /** The image resource ID for the word**/
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** The sound resource ID for the word**/
    private int mSoundResourceId;
    /** Constant value that represents no image was provided for this word**/
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * This is an empty constructor
     */
    public Word(){

    }

    /**
     * This is the constructor that takes two parameters
     * @param miwokTranslation represents the Miwok translation of the word
     * @param defaultTranslation represents the default translation of the word
     */
    public Word(String miwokTranslation, String defaultTranslation, int soundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * This is the constructor that takes three parameters
     * @param miwokTranslation represents the Miwok translation of the word
     * @param defaultTranslation represents the default translation of the word
     * @param imageResourceId represents the drawable resource id for the word
     */
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int soundResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    /**
     * get the Miwok translation of the word
     * @return the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * get the English translation of the word
     * @return the English translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get the image resource ID of the word
     * @return the image resource ID for that word
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * This method returns whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * get the sound resource ID of the word
     * @return the sound resource ID for that word
     */
    public int getSoundResourceId(){
        return mSoundResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }
}
