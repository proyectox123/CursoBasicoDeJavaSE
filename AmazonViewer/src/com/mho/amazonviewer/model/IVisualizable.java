package com.mho.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
    Date startToSee(Date initDate);
    void stopToSee(Date initDate, Date finalDate);
}
