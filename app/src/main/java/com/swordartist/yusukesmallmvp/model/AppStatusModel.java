package com.swordartist.yusukesmallmvp.model;

/**
 * Created by Yusuke Yanai on 2017-03-15.
 */

public class AppStatusModel {

    private int imageViewClickNumber = 0;

    public int getImageViewClickNumber() {
        return imageViewClickNumber;
    }

    public void setImageViewClickNumber(int imageViewClickNumber) {
        this.imageViewClickNumber = imageViewClickNumber;
    }

    public int inclimentImageViewClickNumber() {
        return imageViewClickNumber++;
    }

}
