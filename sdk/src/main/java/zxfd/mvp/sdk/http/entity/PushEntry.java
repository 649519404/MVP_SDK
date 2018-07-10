package zxfd.mvp.sdk.http.entity;

/**
 * *******************************************************
 * Description:
 * Autour: 3W攻城狮
 * Date: 2018/6/27 10:41
 * Update:2018/6/27
 * Version:
 * *******************************************************
 */
public class PushEntry {
    public int type; //1 广播推送  2  特定用户 3部分用户
    public String title;
    public String content;
    public String description;
    public String clientVersion;
    public String osName;
    public String tags;
    public String osVersion;
    public String alias;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
