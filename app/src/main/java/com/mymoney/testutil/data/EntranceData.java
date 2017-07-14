package com.mymoney.testutil.data;

/**
 * @autor wangbinwei
 * @since 2017/7/14 下午4:35
 */

public class EntranceData {
    private final int type;
    private final String title;
    private final String content;
    private final String desc;

    public EntranceData(int type, String title, String content, String desc){
        this.type = type;
        this.title = title;
        this.content = content;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDesc() {
        return desc;
    }

    public int getType() {
        return type;
    }
}
