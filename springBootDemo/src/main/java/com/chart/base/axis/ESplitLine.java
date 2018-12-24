/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chart.base.axis;


import com.chart.base.EBase;
import com.chart.base.style.ELineStyle;

/**
 *
 * @author 小黑
 */
public class ESplitLine extends EBase {

    private String interval;
    private ELineStyle lineStyle;

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public ELineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(ELineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }
}
