/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.picasso;

import android.graphics.BitmapFactory;

class PicassoBitmapOptions extends BitmapFactory.Options {
  int targetWidth;
  int targetHeight;
  boolean centerCrop;
  boolean centerInside;

  float targetScaleX;
  float targetScaleY;

  float targetRotation;
  float targetPivotX;
  float targetPivotY;
  boolean hasRotationPivot;

  int exifRotation;

    @Override
    public String toString() {
        return "PicassoBitmapOptions{" +
                "targetWidth=" + targetWidth +
                ", targetHeight=" + targetHeight +
                ", centerCrop=" + centerCrop +
                ", centerInside=" + centerInside +
                ", targetScaleX=" + targetScaleX +
                ", targetScaleY=" + targetScaleY +
                ", targetRotation=" + targetRotation +
                ", targetPivotX=" + targetPivotX +
                ", targetPivotY=" + targetPivotY +
                ", hasRotationPivot=" + hasRotationPivot +
                ", exifRotation=" + exifRotation +
                '}';
    }
}
