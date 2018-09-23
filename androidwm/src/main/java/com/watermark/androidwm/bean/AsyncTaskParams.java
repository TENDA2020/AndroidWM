/*
 *    Copyright 2018 Yizheng Huang
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package com.watermark.androidwm.bean;

import android.graphics.Bitmap;

/**
 * This is a simple class that can help we put multiple primitive
 * parameters into the task.
 *
 * @author huangyz0918 (huangyz0918@gmail.com)
 */
public class AsyncTaskParams {
    private Bitmap backgroundImg;
    private String watermarkText;
    private Bitmap watermarkImg;

    public AsyncTaskParams(Bitmap backgroundImg, String watermarkText, Bitmap watermarkImg) {
        this.backgroundImg = backgroundImg;
        this.watermarkText = watermarkText;
        this.watermarkImg = watermarkImg;
    }

    public AsyncTaskParams(Bitmap backgroundImg, Bitmap watermarkImg) {
        this.backgroundImg = backgroundImg;
        this.watermarkImg = watermarkImg;
    }

    public AsyncTaskParams(Bitmap backgroundImg, String watermarkText) {
        this.backgroundImg = backgroundImg;
        this.watermarkText = watermarkText;
    }

    /**
     * Getters and Setters for {@link AsyncTaskParams}.
     */
    public Bitmap getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(Bitmap backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public String getWatermarkText() {
        return watermarkText;
    }

    public void setWatermarkText(String watermarkText) {
        this.watermarkText = watermarkText;
    }

    public Bitmap getWatermarkImg() {
        return watermarkImg;
    }

    public void setWatermarkImg(Bitmap watermarkImg) {
        this.watermarkImg = watermarkImg;
    }

}