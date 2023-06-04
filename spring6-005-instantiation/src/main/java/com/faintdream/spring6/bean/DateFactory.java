package com.faintdream.spring6.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFactory implements FactoryBean<Date> {

    private String strDate;

    /**
     * @return date
     * @throws ParseException
     */
    @Override
    public Date getObject() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(strDate);
    }

    /**
     * @return Date.class
     */
    @Override
    public Class<?> getObjectType() {
        return Date.class;
    }

    /**
     * @return false
     */
    @Override
    public boolean isSingleton() {
        return false;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public DateFactory() {
    }

    public DateFactory(String strDate) {
        this.strDate = strDate;
    }
}
