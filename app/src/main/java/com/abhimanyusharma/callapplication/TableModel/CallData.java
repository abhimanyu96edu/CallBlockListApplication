package com.abhimanyusharma.callapplication.TableModel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

@Table(name = "CallData")
public class CallData extends Model {

    @Column(name = "number")
    public String number;

    @Column(name = "time")
    public String time;

    public String getNumber() {
        return number;
    }

    public String getTime() {
        return time;
    }

// _________________CALLING FUNCTIONS______________________

    public static List<CallData> getCallDataValue() {

        Select select = new Select();
        List<CallData> callData = select.from(CallData.class)
                .execute();
        return callData;
    }

    public CallData() {
        super();
    }
}
