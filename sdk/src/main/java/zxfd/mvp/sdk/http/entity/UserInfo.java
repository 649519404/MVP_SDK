package zxfd.mvp.sdk.http.entity;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Data
public class UserInfo {

    public String name;

    public String login;

    @SerializedName("avatar_url")
    public String avatarUrl;

}
